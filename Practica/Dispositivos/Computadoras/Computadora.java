package Dispositivos.Computadoras;

import Dispositivos.DispositivosElectronicos.DispositivoElectronico;
import java.util.Scanner;

public class Computadora extends DispositivoElectronico{   
    protected String modelo;
    protected String marca;

    protected Computadora(int año, double precio, String modelo, String marca){
        super(año, precio);
        this.modelo = modelo;
        this.marca = marca;
    }

    public static Computadora nuevo(Scanner sc){
        String modelo;
        String marca;
        DispositivoElectronico aux = DispositivoElectronico.nuevo(sc);
        System.out.print("Introduzca el modelo: ");
        modelo = sc.nextLine();
        System.out.print("Introduzca la marca: ");
        marca = sc.nextLine();
        return new Computadora(aux.getAño(), aux.getPrecio(), modelo, marca);
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
    protected void setMarca(String marca){
        this.marca = marca;
    }
    protected String getClassName(){
        return "Computadora";
    }
  }
