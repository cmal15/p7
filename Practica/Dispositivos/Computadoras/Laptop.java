package Dispositivos.Computadoras;

import java.util.Scanner;

public class Laptop extends Computadora{
    
    protected int peso;
    protected int duracionBateria;

    public Laptop(int año, double precio, String modelo, String marca, int peso, int duracionBateria){
        super(año, precio, modelo, marca);
        this.peso = peso;
        this.duracionBateria = duracionBateria;
    }
    
    public static Laptop nuevo(Scanner sc){
        int peso,duracionBateria;
        Computadora aux = Computadora.nuevo(sc);
        System.out.print("Introduzca el peso del modelo: ");
        peso = sc.nextInt();
        System.out.print("Introduzca la duracion de la bateria: ");
        duracionBateria = sc.nextInt();
        return new Laptop(aux.getAño(),aux.getPrecio(),aux.getModelo(),aux.getMarca(),peso,duracionBateria);
    }
    
    public void setPeso(int peso){
        this.peso=peso;
    }
    
    public int getPeso(){
        return peso;
    }
    
    public void setduracionBateria(int duracionBateria){
        this.duracionBateria=duracionBateria;
    }
    
    public int getduracionBateria(){
        return duracionBateria;
    }
    
    public String getClassName(){
        return "LapTop";
    }
}
