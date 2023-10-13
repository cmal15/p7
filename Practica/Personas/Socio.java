package Personas;
import java.util.Scanner;
import Dispositivos.Computadoras.*;
import Dispositivos.DispositivosElectronicos.*;
import Dispositivos.DispositivosMoviles.*;
import java.util.Scanner;
import java.util.LinkedList;
public class Socio extends Comprador{
    public Socio(Comprador comprador){
        super(comprador.getSmartphones(),comprador.getTablets(),comprador.getTelevisions(),comprador.getLaptopss(),comprador.getPcss())
    }
    public static Comprador iniciarSocio(){
        LinkedList<Smartphone> smartphones= new LinkedList<>();
        LinkedList<Tablet> tablets= new LinkedList<>();
        LinkedList<Television> televisiones= new LinkedList<>();
        LinkedList<Laptop> laptops= new LinkedList<>();
        LinkedList<PC> pcs= new LinkedList<>();
        Smartphone smartphone=new Smartphone(2020, 10000.0, "Huawei", "Mate 30", true, "Atandt","Plus","Proteccion sencilla", "media");
        smartphones.add(smartphone);
        Tablet tablet=new Tablet(2020,11000.0,"Samsung","Samsungpad",true,true);
        tablets.add(tablet);
        Television tele=new Television(2018, 9000.00,"Samsung Led", 2000, "Estereo");
        televisiones.add(tele);
        Laptop laptop=new Laptop(2018,15000.0, "Huawei notebook", "Huawei", 10, 400);
        laptops.add(laptop);
        PC pc=new PC(2019, 15000.0, "Samsung series A", "Samsung", true);
        pcs.add(pc);
        comprador=new Comprador(smartphones,tablets,televisiones,laptops,pcs);
        return comprador;
    }
}
