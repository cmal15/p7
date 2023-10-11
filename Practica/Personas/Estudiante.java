package Personas;

import java.util.Scanner;

public class Estudiante extends Comprador{
    protected String nivelDeEstudios;
    protected Estudiante(String nombre, String apellido, int numeroDeCuenta, String nivelDeEstudios){
        super(nombre,apellido,numeroDeCuenta);
        this.nivelDeEstudios=nivelDeEstudios;
    }
    protected static Estudiante nuevo(Scanner sc){
        int numeroDeCuenta;
        String nombre;
        String apellido;
        String nivelDeEstudios;
        System.out.print("Introduzca numero de cuenta: ");
        numeroDeCuenta = sc.nextInt();
        System.out.print("Introduzca nombre: ");
        nombre = sc.nextLine();
        System.out.print("Introduzca apellido: ");
        apellido = sc.nextLine();
        System.out.print("Introduzca cual es el nivel de estudios del estudiante: ");
        nivelDeEstudios = sc.nextLine();
        return new Estudiante(nombre,apellido,numeroDeCuenta,nivelDeEstudios);
    }
    protected void setNivelDeEstudios(String nivelDeEstudios){
        this.nivelDeEstudios=nivelDeEstudios;
    }
    protected String getNivelDeEstudios(){
        return nivelDeEstudios;
    }
}
