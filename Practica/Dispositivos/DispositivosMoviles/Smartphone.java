package Dispositivos.DispositivosMoviles;

public class Smartphone extends Celular{

    private String proteccion;
    private String gama;

    public Smartphone(int año, double precio, String marca, String modelo, int bateriaInterna, String proteccion, String gama){
        super(año, precio, marca, modelo, bateriaInterna);
        this.proteccion = proteccion;
        this.gama = gama;
    }

    
    //metodos

}