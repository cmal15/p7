package Dispositivos.DispositivosElectronicos;

import java.util.Scanner;

public class DispositivoElectronico{

    private int año;
    private double precio;

    public DispositivoElectronico(int año, double precio){
        this.año = año;
        this.precio = precio;
    }

    protected static DispositivoElectronico nuevo(Scanner sc){
        int año;
        double precio;
        System.out.println("Introduzca el año del dispositivo");
        año = sc.nextInt();
        System.out.println("Introduce el precio del producto");
        precio = sc.nextDouble();
        sc.nextLine();
        return new DispositivoElectronico(año, precio);
    }

    public void setPrecio(double precio){
        this.precio = precio;
    }

    protected void setAño(int año){
        this.año = año;
    }

    public double getPrecio(){
        return precio;
    }

    public int getAño(){
        return año;
    }

    protected String getClassName(){
        return "DispositivoElectronico";
    }

}