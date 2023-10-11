package Dispositivos.Computadoras;

import java.util.Scanner;

public class PC extends Computadora{
        protected boolean correFriFayer;
        
    public PC(int año, double precio, String modelo, String marca, boolean correFriFayer){
        super(año, precio, modelo, marca);
        this.correFriFayer=correFriFayer;
    }   
    
    protected static PC nuevo(Scanner sc){
        boolean correFriFayer;
        Computadora aux = Computadora.nuevo(sc);
        System.out.print("Puedes jugar FreeFire en esta compu(true/false): ");
        correFriFayer = sc.nextBoolean();
        return new PC(aux.getAño(), aux.getPrecio(), aux.getModelo(), aux.getMarca(),correFriFayer);
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
