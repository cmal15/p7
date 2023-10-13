package Personas;
import Dispositivos.Computadoras.*;
import Dispositivos.DispositivosElectronicos.*;
import Dispositivos.DispositivosMoviles.*;
import java.util.Scanner;

public class Comprador{
    public LinkedList<Smartphone> smartphones;
    public LinkedList<Tablet> tablets;
    public LinkedList<Television> televisiones;
    public LinkedList<Laptop> laptops;
    public LinkedList<PC> pcs;
    
    protected Comprador(LinkedList<Smartphone> smartphones,LinkedList<Tablet> tablets,LinkedList<Television> televisiones,LinkedList<Laptop> laptops,LinkedList<PC> pcs){
        this.smartphones=smartphones;
        this.tablets=tablets;
        this.televisiones=televisiones;
        this.laptos=laptops;
        this.pcs=pcs;
    }

    protected Smartphone getSmartphone(int x){
        return smartphones.get(x);
    }

    protected Tablet getTablet(int x){
        return tablets.get(x);
    }

    protected Television getTelevision(int x){
        return televisiones.get(x);
    }

    protected Laptop getLaptops(int x){
        return laptops.get(x);
    }

    protected void addSmarthpone(Smartphone smart){
        smartphones.add(smart);
    }

    protected void addTablet(Tablet tablet){
        tablets.add(tablet);
    }

    protected void addTelevision(Television tele){
        televisiones.add(tele);
    }

    protected void addLaptop(Laptop lap ){
        laptops.add(lap);
    }

    protected void addPC(PC pc ){
        pcs.add(pc);
    }
}
