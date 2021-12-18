package segurosxy.modelos.patrones;

import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;
import segurosxy.config.Connection;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


public class PaisFactory {

    private static HashMap<String, List<String>> megaCache = new HashMap<String, List<String>>();
    private static HashMap<String, PaisFlyWeight> paises = new HashMap<String, PaisFlyWeight>();

    
    private static PaisFactory paisFactory = null;

    public static synchronized PaisFactory getInstance()  {

        if (paisFactory == null)  {

            paisFactory = new PaisFactory();
        }
        return paisFactory;
    }

    private PaisFactory()  {

        if(megaCache.isEmpty()){
            System.out.println("[PaisFactory] Cargando data desde mongo");
            // get data from db
            MongoDatabase db = new Connection().getDatabase();
            MongoCollection<Document> paises = db.getCollection("pais");
            MongoCursor<Document> cursor = paises.find().iterator();
            try {
                while(cursor.hasNext()) {
                    Document pai = cursor.next();
                    String codPais = (String) pai.get("cod_pais");
                    String descPais = (String) pai.get("desc_pais");

                    if (megaCache.get(codPais) == null){
                        List<String> list = new ArrayList<String>();
                        list.add(descPais);
                        megaCache.put(codPais,list);
                    }
                    //System.out.println(codDep+","+codProv+","+codUbi);
                }
            } finally {
                cursor.close();
            }

        }
        System.out.println("[PaisFactory] Data obtenida de la cache");
    }

    
    public PaisFlyWeight getPais( String codigoPais)  {

        PaisFlyWeight flyweight = null;

        if ( paises.get( codigoPais )== null  )   {

            List<String> datos = (megaCache.get(codigoPais));
            flyweight = new PaisFlyWeight( datos.get(0));
            paises.put( codigoPais , flyweight);
            System.out.println("[PaisFactory] Creando y recuperando los datos de PaisFlyweight");
        }
        else{
            flyweight = (PaisFlyWeight)paises.get( codigoPais);
            //System.out.println( flyweight.getDepartamento() + flyweight.getProvincia() + flyweight.getDistrito());
        }
        return flyweight;
    }

}
