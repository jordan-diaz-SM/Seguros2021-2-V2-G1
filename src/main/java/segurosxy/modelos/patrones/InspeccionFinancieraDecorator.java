package segurosxy.modelos.patrones;

import segurosxy.modelos.interfaces.Iinspeccion;

public class InspeccionFinancieraDecorator extends InspeccionDecorator {

    public InspeccionFinancieraDecorator(Iinspeccion inspeccion) {
        super(inspeccion);
    }

    @Override
    public void inspeccionar() {
        super.inspeccionar();
        inspeccionFinanciera();
    }
    
    private void inspeccionFinanciera(){
        System.out.println("[Inspeccion Financiera] Verificado");
    }
    
}
