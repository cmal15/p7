import java.util.LinkedList;

import Dispositivos.Computadoras.Laptop;
import Dispositivos.Computadoras.PC;
import Dispositivos.DispositivosElectronicos.Television;
import Dispositivos.DispositivosMoviles.Smartphone;
import Dispositivos.DispositivosMoviles.Tablet;

public class Carrito {
    public LinkedList<Smartphone> smartphones;
    public LinkedList<Tablet> tablets;
    public LinkedList<Television> televisiones;
    public LinkedList<Laptop> laptops;
    public LinkedList<PC> pcs;

    public Carrito(){
        smartphones = new LinkedList<>();
        tablets = new LinkedList<>();
        televisiones = new LinkedList<>();
        laptops = new LinkedList<>();
        pcs = new LinkedList<>();
    }

    public LinkedList<Smartphone> getSmartphones(){
        return smartphones;
    }

    public LinkedList<Tablet> getTablets(){
        return tablets;
    }
    
    public LinkedList<Television> getTelevisiones(){
        return televisiones;
    }
    
    public LinkedList<Laptop> getLaptops(){
        return laptops;
    }

    public LinkedList<PC> getPcs(){
        return pcs;
    }
}
