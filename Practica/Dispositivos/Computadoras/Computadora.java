package Dispositivos.Computadoras;

import Dispositivos.DispositivosElectronicos.DispositivoElectronico;

public class Computadora extends DispositivoElectronico{    protected String modelo;
    protected String marca;
    protected float precio;

    public Computadora(String modelo, String marca, float precio){
        this.modelo = modelo;
        this.marca = marca;
        this.precio = precio;
    }

    public static Computadora nuevo(Scanner sc){
        String modelo;
        String marca;
        float precio;
        System.out.print("Introduzca el modelo: ");
        modelo = sc.nextLine();
        System.out.print("Introduzca la marca: ");
        marca = sc.nextLine();
        System.out.print("Introduzca el precio: ");
        precio = sc.nextFloat();
        return new Computadora(modelo,marca,precio);
    }

    public float getPrecio(){
        return precio;
    }
    public String getModelo(){
        return modelo;
    }
    public String getMarca(){
        return marca;
    }
    public void setPrecio(int precio){
        this.precio =  precio;
    }
    public void setModelo(String modelo){
        this.modelo = modelo;
    }
    public void setMarca(String modelo){
        this.marca = marca;
    }
    public String getClassName(){
        return "Computadora";
    }
  }
