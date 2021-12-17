package segurosxy.modelos;

import segurosxy.modelos.interfaces.ICobertura;
import segurosxy.modelos.patrones.TipoInspeccion;

public class SeguroVehicular extends Seguro {

    private ICobertura cobertura;

    public SeguroVehicular(String marca, String modelo)    {

        super();
        this.marca = marca;
        this.modelo = modelo;
    }

    @Override
    public void cacularRiesgo()   {

        if (this.marca.equals("Toyota") && this.modelo.equals("Yaris")) {
            this.nivelRiesgo = "ALTO";
        }
        else {
            this.nivelRiesgo = "BAJO";
        }
    }

    @Override
    public String getDetalleSeguro()    {

        return "Seg. Vehicular Numero: " + this.numero + " con riesgo: " + this.nivelRiesgo;
    }

    public void calcularCobeturaVehicular( ICobertura cobertura )  {

        cobertura.calculaCobertura();
        
        System.out.println();
    }

    @Override
    public void aprobarSeguro(TipoInspeccion inspeccionEstado){
        
    }
}
