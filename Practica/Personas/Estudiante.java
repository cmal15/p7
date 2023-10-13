package Personas;

import java.util.Scanner;

public class Estudiante extends Comprador{
    public int descuento;
    public Estudiante(Comprador comprador){
        super(comprador.getSmartphones(),comprador.getTablets(),comprador.getTelevisions(),comprador.getLaptopss(),comprador.getPcss())
        descuento=10;
    }
    public static Comprador iniciarEstudiante(){
        LinkedList<Smartphone> smartphones= new LinkedList<>();
        LinkedList<Tablet> tablets= new LinkedList<>();
        LinkedList<Television> televisiones= new LinkedList<>();
        LinkedList<Laptop> laptops= new LinkedList<>();
        LinkedList<PC> pcs= new LinkedList<>();
        Smartphone smartphone=new Smartphone(2015, 8000.0, "Xiomi", "Plus 30", true, "telcel","Basico","Sin proteccion", "media");
        smartphones.add(smartphone);
        Tablet tablet=new Tablet(2014,7000.0,"Xiaomi","Tablet z",true,true);
        tablets.add(tablet);
        Television tele=new Television(2015, 5000.00,"Samsung TV", 1080, "Estereo");
        televisiones.add(tele);
        Laptop laptop=new Laptop(2018,7000.0, "Notebook a", "Xiaomi", 10, 400);
        laptops.add(laptop);
        PC pc=new PC(2016, 8000.0, "Pc armada", "sin marca", true);
        pcs.add(pc);
        comprador=new Comprador(smartphones,tablets,televisiones,laptops,pcs);
        return comprador;
    }
}
