package Personas;
import Dispositivos.Computadoras.*;
import Dispositivos.DispositivosElectronicos.*;
import Dispositivos.DispositivosMoviles.*;
import java.util.Scanner;
import java.util.LinkedList;

public class ClienteVIP extends Comprador{
    public ClienteVIP(){
        LinkedList<Smartphone> smartphones= new LinkedList<>();
        LinkedList<Tablet> tablets= new LinkedList<>();
        LinkedList<Television> televisiones= new LinkedList<>();
        LinkedList<Laptop> laptops= new LinkedList<>();
        LinkedList<PC> pcs= new LinkedList<>();
        Smartphone smartphone=new Smartphone(2023, 25000.0, "Apple", "Iphone", true, "T-mobile","ilimitado","Proteccion Max", "alta");
        smartphones.add(smartphone);
        Tablet tablet=new Tablet(2023,30000.0,"Apple","Ipadpro",true,true)
        tablets.add(tablet);
        Television tele=new Television(2023, 50000.00,"pantallaPlana", 4000, "surround");
        televisiones.add(tele);
        Laptop laptop=new Laptop(2023,100000.0, "Macbook Pro", "Apple", 10, 500);
        laptops.add(laptop);
        PC pc=new PC(2023, 150000.0, "MacPro", "Apple", true);
        pcs.add(pc);
        this.smartphones=smartphones;
        this.tablets=tablets;
        this.televisiones=televisiones;
        this.laptops=laptops;
        this.pcs=pcs;
    }
}
