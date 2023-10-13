package Personas;
import Dispositivos.Computadoras.*;
import Dispositivos.DispositivosElectronicos.*;
import Dispositivos.DispositivosMoviles.*;
import java.util.Scanner;

public class ClienteVIP extends Comprador{
    public ClienteVIP(){
        smartphones = new LinkedList<>();
        tablets = new LinkedList<>();
        televisiones = new LinkedList<>();
        laptops = new LinkedList<>();
        pcs = new LinkedList<>();
        public LinkedList<Smartphone> smartphones;
        public LinkedList<Tablet> tablets;
        public LinkedList<Television> televisiones;
        public LinkedList<Laptop> laptops;
        public LinkedList<PC> pcs;
        Smartphone smartphone=new Smartphone(2023, 25000.0, "Apple", "Iphone", true, "T-mobile","ilimitado","Proteccion Max", "alta");
        smartphones.add(smarthpone);
        Tablet tablet=new Tablet(2023,30000.0,"Apple","Ipadpro",true,true)
        tablets.add(tablet);
        Television tele=new Television(2023, 50000.00,"pantallaPlana", 4000, "surround");
        televisiones.add(tele);
        Laptop laptop=new Laptop(2023,100000.0, "Macbook Pro", "Apple", 10, 500);
        laptops.add(laptop);
        PC pc=new PC(2023, 150000.0, "MacPro", "Apple", true);
        pcs.add(pc);
        super(smartphones,tablets,televisiones,laptops,pcs);
    }
}
