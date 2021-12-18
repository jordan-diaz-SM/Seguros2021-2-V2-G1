package segurosxy.modelos.patrones;

public class TipoInspeccion {
    private boolean InspeccionVivienda = true;
    private boolean InspeccionJudicial= false;
    private boolean InspeccionSalud = false;
    private boolean InspeccionFinanciera = false;
    
    public TipoInspeccion(boolean inspeccionVivienda, boolean inspeccionJudicial, boolean inspeccionSalud,
            boolean inspeccionFinanciera) {
        InspeccionVivienda = inspeccionVivienda;
        InspeccionJudicial = inspeccionJudicial;
        InspeccionSalud = inspeccionSalud;
        InspeccionFinanciera = inspeccionFinanciera;
    }
    public boolean getInspeccionVivienda() {
        return InspeccionVivienda;
    }
    public boolean getInspeccionFinanciera() {
        return InspeccionFinanciera;
    }
    public void setInspeccionFinanciera(boolean inspeccionFinanciera) {
        this.InspeccionFinanciera = inspeccionFinanciera;
    }
    public void setInspeccionVivienda(boolean inspeccionVivienda) {
        this.InspeccionVivienda = inspeccionVivienda;
    }
    public boolean getInspeccionSalud() {
        return InspeccionSalud;
    }
    public void setInspeccionSalud(boolean inspeccionSalud) {
        this.InspeccionSalud = inspeccionSalud;
    }
    public boolean getInspeccionJudicial() {
        return InspeccionJudicial;
    }

    public void setInspeccionJudicial(boolean inspeccionJudicial) {
        this.InspeccionJudicial = inspeccionJudicial;
    }

    
}
