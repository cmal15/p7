package Personas;

import java.util.Scanner;

public class Comprador{
    protected String nombre;
    protected String apellido;
    protected int numeroDeCuenta;

    protected Comprador(String nombre, String apellido, int numeroDeCuenta){
        this.nombre = nombre;
        this.apellido = apellido;
        this.numeroDeCuenta = numeroDeCuenta;
    }

    protected static Comprador nuevo(Scanner sc){
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

    protected int getNumeroDeCuenta(){
        return numeroDeCuenta;
    }
    protected String getNombre(){
        return nombre;
    }
    protected String getApellido(){
        return apellido;
    }
    protected void setNumeroDeCuenta(int numeroDeCuenta){
        this.numeroDeCuenta =  numeroDeCuenta;
    }
    protected void setNombre(String nombre){
        this.nombre = nombre;
    }
    protected void setApellido(String apellido){
        this.apellido = apellido;
    }
}
