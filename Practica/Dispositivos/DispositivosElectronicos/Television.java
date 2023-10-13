package Dispositivos.DispositivosElectronicos;

import java.util.Scanner;

public class Television extends DispositivoElectronico{

    private String modelo;
    private int resolucion;
    private String audio;

    public Television(int año, double precio, String modelo, int resolucion, String audio){
        super(año, precio);
        this.modelo = modelo;
        this.resolucion = resolucion;
        this.audio = audio;
    }

    public static Television nuevo(Scanner sc){
        String modelo, audio;
        int resolucion;
        DispositivoElectronico aux = DispositivoElectronico.nuevo(sc);
        System.out.println("Introduzca el modelo:");
        modelo = sc.nextLine();
        System.out.println("Introduzca el audio:");
        audio = sc.nextLine();
        System.out.println("Introduzca la resolucion");
        resolucion = sc.nextInt();
        sc.nextLine();
        return new Television(aux.getAño(), aux.getPrecio(), modelo, resolucion, audio);
    }

    protected void setModelo(String modelo){
        this.modelo = modelo;
    }
    
    protected void setResolucion(int resolucion){
        this.resolucion = resolucion;
    }
    
    protected void setAudio(String audio){
        this.audio = audio;
    }

    protected String getModelo(){
        return modelo;
    }

    protected int getResolucion(){
        return resolucion;
    }
    
    protected String getAudio(){
        return audio;
    }

    @Override
    protected String getClassName(){
        return "Television";
    }

    public void print(){
        System.out.println("Modelo:" + modelo + " Precio: "+ this.getPrecio());
    }

}