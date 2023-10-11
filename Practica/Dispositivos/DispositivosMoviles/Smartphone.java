package Dispositivos.DispositivosMoviles;

import java.util.Scanner;

public class Smartphone extends Celular{

    private String proteccion;
    private String gama;

    public Smartphone(int año, double precio, String marca, String modelo, int bateriaInterna, String proteccion, String gama){
        super(año, precio, marca, modelo, bateriaInterna);
        this.proteccion = proteccion;
        this.gama = gama;
    }

    public static Smartphone nuevo(Scanner sc){
        String protccion, gama;
        Celular aux = Celular.nuevo(sc);
        System.out.println("Introduce el grado de proteccion");
        protccion = sc.getLine();
        System.out.println("Introduce la gama");
        gama = sc.nextLine();
        return new Smartphone(aux.getAño(),aux.getPrecio(),aux.getMarca(),aux.getModelo(), aux.getBateriaInterna(), proteccion, gama);
    }

    protected String getProteccion(){
        return proteccion;
    }

    protected String getGama(){
        return gama;
    }

    protected void setProteccion(String proteccion){
        this.proteccion = proteccion;
    }

    protected void setGama(String gama){
        this.gama = gama;
    }
    
    //metodos

}