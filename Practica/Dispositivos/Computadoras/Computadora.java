package Dispositivos.Computadoras;

import Dispositivos.DispositivosElectronicos.DispositivoElectronico;

public class Computadora extends DispositivoElectronico{   
    protected String modelo;
    protected String marca;

    protected Computadora(String modelo, String marca){
        this.modelo = modelo;
        this.marca = marca;
    }

    protected static Computadora nuevo(Scanner sc){
        String modelo;
        String marca;
        float precio;
        System.out.print("Introduzca el modelo: ");
        modelo = sc.nextLine();
        System.out.print("Introduzca la marca: ");
        marca = sc.nextLine();
        return new Computadora(modelo,marca);
    }

    protected String getModelo(){
        return modelo;
    }
    protected String getMarca(){
        return marca;
    }
    protected void setModelo(String modelo){
        this.modelo = modelo;
    }
    protected void setMarca(String modelo){
        this.marca = marca;
    }
    protected String getClassName(){
        return "Computadora";
    }
  }
