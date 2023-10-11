package Dispositivos.Computadoras;

import Dispositivos.DispositivosElectronicos.DispositivoElectronico;

public class Computadora extends DispositivoElectronico{   
    protected int peso;
    protected int duracionBateria;
    public Laptop(String modelo, String marca, int peso, int duracionBateria){
        super(modelo,marca);
        this.peso=peso;
        this.duracionBateria=duracionBateria;
    }
    protected static Laptop nuevo(Scanner sc){
        String modelo;
        String marca;
        int peso,duracionBateria;
        System.out.print("Introduzca el modelo: ");
        modelo = sc.nextLine();
        System.out.print("Introduzca la marca: ");
        marca = sc.nextLine();
        System.out.print("Introduzca el peso del modelo: ");
        peso = sc.nextInt();
        System.out.print("Introduzca la duracion de la bateria: ");
        duracionBateria = sc.nextInt();
        return new Laptop(modelo,marca,peso,duracionBateria);
    }
    protected void setPeso(int peso){
        this.peso=peso;
    }
    protected int getPeso(){
        return peso;
    }
    protected void setduracionBateria(int duracionBateria){
        this.duracionBateria=duracionBateria;
    }
    protected int getduracionBateria(){
        return duracionBateria;
    }
    protected String getClassName(){
        return "LapTop";
    }
  }
