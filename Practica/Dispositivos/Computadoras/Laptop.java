package Dispositivos.Computadoras;

import java.util.Scanner;

public class Laptop extends Computadora{
    
    protected int peso;
    protected int duracionBateria;
    
    public Laptop(String modelo, String marca, double precio, int peso, int duracionBateria){
        super(modelo,marca,precio);
        this.peso=peso;
        this.duracionBateria=duracionBateria;
    }
    
    public static Laptop nuevo(Scanner sc){
        String modelo;
        String marca;
        float precio;
        int peso,duracionBateria;
        System.out.print("Introduzca el modelo: ");
        modelo = sc.nextLine();
        System.out.print("Introduzca la marca: ");
        marca = sc.nextLine();
        System.out.print("Introduzca el precio: ");
        precio = sc.nextFloat();
        System.out.print("Introduzca el peso del modelo: ");
        peso = sc.nextInt();
        System.out.print("Introduzca la duracion de la bateria: ");
        duracionBateria = sc.nextInt();
        return new Laptop(modelo,marca,precio,peso,duracionBateria);
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
