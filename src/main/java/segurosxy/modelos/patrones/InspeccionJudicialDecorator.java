package segurosxy.modelos.patrones;

import segurosxy.modelos.interfaces.Iinspeccion;

public class InspeccionJudicialDecorator extends InspeccionDecorator{

    public InspeccionJudicialDecorator(Iinspeccion inspeccion) {
        super(inspeccion);
    }
    
    @Override
    public void inspeccionar(){
        super.inspeccionar();
        inspeccionJudicial();
    }

    private void inspeccionJudicial(){
        System.out.println("[Inspeccion Judicial] Verificado");  
    }
}
