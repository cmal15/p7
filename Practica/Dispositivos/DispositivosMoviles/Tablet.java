package Dispositivos.DispositivosMoviles;
import java.util.Scanner;
public class Tablet extends DispositivoMovil{
    //atributos
    private boolean tienePluma;
    
    public Tablet(int año, double precio, String marca, String modelo, int bateriaInterna,boolean tienePluma){
        super(año, precio, marca, modelo, bateriaInterna);
        this.protected boolean tienePluma;
    }
    //metodos
    public static Celular nuevo(Scanner sc){
        String tienePluma;
        DispositivoMovil aux = DispositivoMovil.nuevo(sc);
        System.out.print("Incluye pluma tactil? (true/false): ");
        tienePluma = sc.nextBoolean();
        return new Celular(aux.getAño(),aux.getPrecio(),aux.getMarca(),aux.getModelo(),aux.getBateriaInterna(),tienePluma);
    }

    protected void setTienePluma(boolean tienePluma){
        this.tienePluma=tienePluma;
    }
    
    protected boolean getTienePluma(){
        return tienePluma;
    }

}
