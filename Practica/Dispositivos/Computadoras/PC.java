package Dispositivos.Computadoras;

import java.util.Scanner;

public class PC extends Computadora{
        protected boolean correFriFayer;
        
    public PC(String modelo, String marca, boolean correFriFayer){
        super(modelo,marca);
        this.correFriFayer=correFriFayer;
    }   
    
    protected static PC nuevo(Scanner sc){
        String modelo;
        String marca;
        boolean correFriFayer;
        System.out.print("Introduzca el modelo: ");
        modelo = sc.nextLine();
        System.out.print("Introduzca la marca: ");
        marca = sc.nextLine();
        System.out.print("Puedes jugar FreeFire en esta compu(true/false): ");
        correFriFayer = sc.nextBoolean();
        return new PC(modelo,marca,correFriFayer);
    }
    
    protected void setcorreFriFayer(boolean correFriFayer){
        this.correFriFayer=correFriFayer;
    }
    
    protected boolean getCorreFriFayer(){
        return correFriFayer;
    }
    
    protected String getClassName(){
        return "PC";
    }
}
