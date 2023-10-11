package Comprador;

import java.util.Scanner;

public class ClienteVIP extends Comprador{
    protected int puntosLealtad;
    public ClienteVIP(String nombre, String apellido, int numeroDeCuenta, int puntosLealtad){
        super(nombre,apellido,numeroDeCuenta);
        this.puntosLealtad=puntosLealtad;
    }
    public static ClienteVIP nuevo(Scanner sc){
        int numeroDeCuenta,puntosLealtad;
        String nombre;
        String apellido;
        System.out.print("Introduzca numero de cuenta: ");
        numeroDeCuenta = sc.nextInt();
        System.out.print("Introduzca nombre: ");
        nombre = sc.nextLine();
        System.out.print("Introduzca apellido: ");
        apellido = sc.nextLine();
        System.out.print("Introduzca cuantos puntosLealtad tiene: ");
        puntosLealtad = sc.nextInt();
        return new ClienteVIP(nombre,apellido,numeroDeCuenta,puntosLealtad);
    }
    public void setPuntosLealtad(int puntosLealtad){
        this.puntosLealtad=puntosLealtad;
    }
    public int getPuntosLealtad(){
        return puntosLealtad;
    }
}
