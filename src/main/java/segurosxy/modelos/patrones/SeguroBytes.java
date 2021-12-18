package segurosxy.modelos.patrones;

import segurosxy.modelos.Seguro;
import segurosxy.modelos.interfaces.IImprimible;


public class SeguroBytes implements IImprimible {

    private Seguro seguro;

    public SeguroBytes(Seguro seguro) {
        this.seguro = seguro;
    }
    public String aBytes() {
        StringBuffer salida = new StringBuffer();
        StringBuffer salida2 = new StringBuffer();

        salida.append("Imprimiendo Seguro Formato Bytes\n");
        salida.append("-----------------------------------\n");
        salida.append(this.seguro.getDetalleSeguro());
        salida.append(this.seguro.getPoliza());
        salida.append(this.seguro.getNivelRiesgo());
        salida.append(this.seguro.getNumero());
        salida.append(this.seguro.getCertificado());
        salida.append("-----------------------------------\n");

        String s = salida.toString();
        byte b[] = s.getBytes(); 
        
        salida2.append(b);

        return salida2.toString();  
    }

    public String armarSalidaTexto() {
        
       return aBytes();
    }
    
}
