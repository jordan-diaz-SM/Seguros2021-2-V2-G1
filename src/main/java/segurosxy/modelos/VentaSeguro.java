package segurosxy.modelos;

import segurosxy.modelos.interfaces.Iinspeccion;
import segurosxy.modelos.patrones.TipoInspeccion;
import segurosxy.modelos.patrones.InspeccionFinancieraDecorator;
import segurosxy.modelos.patrones.InspeccionInicialVivienda;
import segurosxy.modelos.patrones.InspeccionJudicialDecorator;
import segurosxy.modelos.patrones.InspeccionSaludDecorator;

public class VentaSeguro extends Seguro {
    private Cliente cliente;

    
    public VentaSeguro(Cliente cliente) {
        super();
        this.cliente = cliente;
    }


    public void aprobarSeguro (TipoInspeccion tipoInspeccion){
        
        boolean tipoSalud = tipoInspeccion.getInspeccionSalud();
        boolean tipoJudicial = tipoInspeccion.getInspeccionJudicial();
        boolean tipoFinanciera = tipoInspeccion.getInspeccionFinanciera();
        
        Iinspeccion inspeccion = new InspeccionInicialVivienda();
        
        if ( tipoSalud == true){
            inspeccion = new InspeccionSaludDecorator(inspeccion);
        }

        if (tipoJudicial == true ){
            inspeccion = new InspeccionJudicialDecorator(inspeccion);
        }

        if (tipoFinanciera == true){
            inspeccion = new InspeccionFinancieraDecorator(inspeccion);
        }
        
        System.out.println("Seguro Aprobado: "+ this.cliente.getNombre());
        this.cliente.verificarInspeccion(inspeccion);
    }

    @Override
    public void cacularRiesgo() {
       
        
    }

    @Override
    public String getDetalleSeguro() {
        return null;
    }


    @Override
    public String armarSalidaTexto() {
        // TODO Auto-generated method stub
        return "";
    }
}
