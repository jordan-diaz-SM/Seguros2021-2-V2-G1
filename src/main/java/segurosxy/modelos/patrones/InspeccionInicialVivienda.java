package segurosxy.modelos.patrones;

import segurosxy.modelos.interfaces.Iinspeccion;

public class InspeccionInicialVivienda implements Iinspeccion {
    
    public void inspeccionar() {
        System.out.println("La inspeccio inicial : ");
        inspeccionarVivienda();
    }

    private void inspeccionarVivienda(){
        System.out.println("[Inspeccion Vivienda] Verificado");
    }
    
}
