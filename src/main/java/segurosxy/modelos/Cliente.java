package segurosxy.modelos;

import java.util.ArrayList;
import java.util.List;

import segurosxy.modelos.interfaces.Iinspeccion;
import segurosxy.modelos.patrones.PaisContext;
import segurosxy.modelos.patrones.TipoInspeccion;
import segurosxy.modelos.patrones.UbigeoContext;

public class Cliente {

    private String nombre;
    private UbigeoContext ubigeoCasa;
    private UbigeoContext ubigeoTrabajo;
    private List<Seguro> seguros;
    private UbigeoContext ubigeoLugarNac;
    private UbigeoContext ubigeoDNI;
    private TipoInspeccion inspeccionEstado;

    private PaisContext paisNacimiento;
    private PaisContext paisDomicilio;
    
    

    public Cliente(String nombre)   {

        this.nombre = nombre;
        this.seguros = new ArrayList<Seguro>();
    }

    public PaisContext getPaisDomicilio() {
        return paisDomicilio;
    }

    public void setPaisDomicilio(PaisContext paisDomicilio) {
        this.paisDomicilio = paisDomicilio;
    }

    public PaisContext getPaisNacimiento() {
        return paisNacimiento;
    }

    public void setPaisNacimiento(PaisContext paisNacimiento) {
        this.paisNacimiento = paisNacimiento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCompraSeguro(Seguro seguro) {

        this.seguros.add( seguro );
    }

    public void getListaSeguroCliente()    {

        System.out.println("Nombre: " + this.nombre );
        for (Seguro seguro : seguros )  {

            System.out.println( "Seguro: " + seguro.getDetalleSeguro());
        }

    }

    public UbigeoContext getUbigeoCasa() {
        return ubigeoCasa;
    }

    public void setUbigeoCasa(UbigeoContext ubigeoCasa) {
        this.ubigeoCasa = ubigeoCasa;
    }

    public UbigeoContext getUbigeoTrabajo() {
        return ubigeoTrabajo;
    }

    public void setUbigeoTrabajo(UbigeoContext ubigeoTrabajo) {
        this.ubigeoTrabajo = ubigeoTrabajo;
    }

    public UbigeoContext ubigeoLugarNac() {
        return ubigeoLugarNac;
    }

    public void setUbigeoLugarNac(UbigeoContext ubigeoLugarNac) {
        this.ubigeoLugarNac = ubigeoLugarNac;
    }

    public UbigeoContext ubigeoDNI() {
        return ubigeoLugarNac;
    }

    public void setUbigeoDNI(UbigeoContext ubigeoDNI) {
        this.ubigeoDNI = ubigeoDNI;
    }


    public void printUbigeos(){
        if (ubigeoCasa!=null)
            System.out.println("[Ubigeo] Casa: "+ ubigeoCasa.getDepartamento() +", "+ ubigeoCasa.getProvincia() +", "+ ubigeoCasa.getDistrito());
         if (ubigeoTrabajo!=null)
            System.out.println("[Ubigeo] Trabajo: "+ ubigeoTrabajo.getDepartamento() +", "+ ubigeoTrabajo.getProvincia() +", "+ ubigeoTrabajo.getDistrito());
        if (ubigeoLugarNac!=null)
            System.out.println("[Ubigeo] Lugar Nacimiento: "+ ubigeoLugarNac.getDepartamento() +", "+ ubigeoLugarNac.getProvincia() +", "+ ubigeoLugarNac.getDistrito());
        if (ubigeoDNI!=null)
            System.out.println("[Ubigeo] DNI: "+ ubigeoDNI.getDepartamento() +", "+ ubigeoDNI.getProvincia() +", "+ ubigeoDNI.getDistrito());    
    }

    public void verificarInspeccion(Iinspeccion inspeccion){
        inspeccion.inspeccionar();
        System.out.println();
    }

    public void printPaises(){
        if (paisNacimiento!=null)
            System.out.println("[Pais] Nacimiento: "+ paisNacimiento.getPais());
        if (paisDomicilio!=null)
            System.out.println("[Pais] Domicilio: "+ paisDomicilio.getPais() ); 
    }

}
