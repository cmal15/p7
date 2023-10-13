package Dispositivos.DispositivosMoviles;

import java.util.Scanner;
import Dispositivos.DispositivosElectronicos.DispositivoElectronico;

public class DispositivoMovil extends DispositivoElectronico{

    private int bateriaInterna;
    private String modelo;
    private String marca;
    
    public DispositivoMovil(int año, double precio, String marca, String modelo, int bateriaInterna){
        super(año, precio);
        this.marca = marca;
        this.modelo = modelo;
        this.bateriaInterna = bateriaInterna;
    }

    public static DispositivoMovil nuevo(Scanner sc){
        String marca, modelo;
        DispositivoElectronico aux = DispositivoElectronico.nuevo(sc);
        System.out.println("Introduzca la marca");
        marca = sc.nextLine();
        System.out.println("Introduzca la modelo");
        modelo = sc.nextLine();
        System.out.println("Tiene bateria interna? (true/false)");
        int bateriaInterna = sc.nextInt();
        return new DispositivoMovil(aux.getAño(), aux.getPrecio(), marca, modelo, bateriaInterna);
    }

    protected void setMarca(String marca){
        this.marca = marca;
    }

    protected void setModelo(String modelo){
        this.modelo = modelo;
    }

    protected void setBateriaInterna(int bateriaInterna){
        this.bateriaInterna = bateriaInterna;
    }

    protected String getMarca(){
        return marca;
    }

    protected String getModelo(){
        return modelo;
    }

    protected int getBateriaInterna(){
        return bateriaInterna;
    }

    @Override
    protected String getClassName(){
        return "DispositivoMovil";
    }
}