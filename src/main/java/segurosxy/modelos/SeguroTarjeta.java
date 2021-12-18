package segurosxy.modelos;

import segurosxy.modelos.patrones.TipoInspeccion;

public class SeguroTarjeta extends Seguro {


    public SeguroTarjeta(String bancoTarjeta)    {

        super();
        this.bancoTarjeta = bancoTarjeta;
    }

    @Override
    public void cacularRiesgo()   {

        if (this.bancoTarjeta.equals("AZTECA")) {
            this.nivelRiesgo = "ALTO";
        }
        else {
            this.nivelRiesgo = "BAJO";
        }
    }

    @Override
    public String getDetalleSeguro() {

        return "Seg. Tarjeta Numero: " + this.numero + " con riesgo: " + this.nivelRiesgo;
    }

    @Override
    public String armarSalidaTexto() {
        StringBuffer salida = new StringBuffer();
        salida.append("Imprimiendo Seguro Formato CSV\n");
        salida.append("-----------------------------------\n");
        salida.append("Banco Tarjeta,Marca,Modelo,Nivel Riesgo,Numero");
        salida.append(this.bancoTarjeta+","+marca+","+modelo+","+nivelRiesgo+","+numero);
        salida.append("-----------------------------------\n");

        return salida.toString();
    }
    

}
