import java.util.Scanner;

import Personas.*;
import Dispositivos.Computadoras.*;
import Dispositivos.DispositivosMoviles.*;
import Dispositivos.DispositivosElectronicos.*;

public class Principal {

    public static void main(String[] args) {
        int op;
        ClienteVIP Vip = new ;
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca el tipo de cliente:");
        System.out.println("1. Socio\t2. Cliente VIP\t 3. Estudiante");
        op = sc.nextInt();
        switch (op) {
            case 1:
                System.out.println("Los productos disponibles son:");
                imprimirProductos();
                break;
            case 2:
                System.out.println("Los productos disponibles son:")
                break;
            case 3:
                System.out.println("Los productos disponibles son:")
                break;
        
            default:
                break;
        }
        sc.close();
    }

    public void imprimirProductos(Comprador comprador){
        for (Smartphone aux : comprador.smartphones) {
            aux.print();
        }
        for (Tablet aux : comprador.tablets) {
            aux.print();
        }
        for (Television aux : comprador.televisiones) {
            aux.print();
        }
        for (Laptop aux : comprador.laptops) {
            aux.print();
        }
        for (PC aux : comprador.pcs) {
            aux.print();
        }
    }

}


/*
*     public LinkedList<Smartphone> smartphones;
    public LinkedList<Tablet> tablets;
    public LinkedList<Television> televisiones;
    public LinkedList<Laptop> laptops;
    public LinkedList<PC> pcs;
 * 
 */