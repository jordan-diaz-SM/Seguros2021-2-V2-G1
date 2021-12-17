package segurosxy.modelos.patrones;

import segurosxy.modelos.interfaces.Iinspeccion;

public class InspeccionDecorator implements Iinspeccion{

    public final Iinspeccion inspeccion;
    
    public InspeccionDecorator(Iinspeccion inspeccion) {
        this.inspeccion = inspeccion ;
    }

    public void inspeccionar() {
        this.inspeccion.inspeccionar();
    }
    
}
