package segurosxy.modelos.patrones;

import segurosxy.modelos.interfaces.Iinspeccion;

public class InspeccionSaludDecorator extends InspeccionDecorator{

    public InspeccionSaludDecorator(Iinspeccion inspeccion) {
        super(inspeccion);
       
    }

    @Override
    public void inspeccionar(){
        super.inspeccionar();
        inspeccionSalud();
    }
    public void inspeccionSalud(){
        System.out.println("[Inspeccion Salud] verificado"); 
    }
    
}
