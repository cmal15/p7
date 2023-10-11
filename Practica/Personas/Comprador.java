package Personas;

import java.util.Scanner;

public class Comprador{
    private String nombre;
    private String apellido;
    private int numeroDeCuenta;

    public Comprador(String nombre, String apellido, int numeroDeCuenta){
        this.nombre = nombre;
        this.apellido = apellido;
        this.numeroDeCuenta = numeroDeCuenta;
    }

    public static Comprador nuevo(Scanner sc){
        int numeroDeCuenta;
        String nombre;
        String apellido;
        System.out.print("Introduzca numero de cuenta: ");
        numeroDeCuenta = sc.nextInt();
        System.out.print("Introduzca nombre: ");
        nombre = sc.nextLine();
        System.out.print("Introduzca apellido: ");
        apellido = sc.nextLine();
        return new Comprador(nombre,apellido,numeroDeCuenta);
    }

    public int getNumeroDeCuenta(){
        return numeroDeCuenta;
    }
    public String getNombre(){
        return nombre;
    }
    public String getApellido(){
        return apellido;
    }
    public void setNumeroDeCuenta(int numeroDeCuenta){
        this.numeroDeCuenta =  numeroDeCuenta;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public void setApellido(String apellido){
        this.apellido = apellido;
    }
}
