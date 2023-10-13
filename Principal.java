import java.util.LinkedList;
import java.util.Scanner;

import Personas.*;
import Dispositivos.Computadoras.*;
import Dispositivos.DispositivosMoviles.*;
import Dispositivos.DispositivosElectronicos.*;

public class Principal {

    public static void main(String[] args) {
        int op;
        Carrito carrito = new Carrito();
        ClienteVIP vip = null;
        Socio socio = null;
        Estudiante estudiante = null;
        Comprador comprador = null;
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca el tipo de cliente:");
        System.out.println("1. Socio\t2. Cliente VIP\t 3. Estudiante");
        op = sc.nextInt();
        switch (op) {
            case 1:
                if(vip == null){
                    vip = ClienteVIP.nuevo(sc);
                }
                comprador = vip;
                System.out.println("Los productos disponibles son:");
                imprimirProductos(vip);
                
                break;
            case 2:
                if(socio == null){
                    socio = Socio.nuevo(sc);
                }            
                comprador = socio;
                System.out.println("Los productos disponibles son:");
                imprimirProductos(socio);
                break;
            case 3:
                if(estudiante == null){
                    estudiante = Estudiante.nuevo(sc);
                }
                comprador = socio;
                System.out.println("Los productos disponibles son:");
                imprimirProductos(estudiante);
                break;
        
            default:
            return;
                break;
        }
        do{
            System.out.println("1.Agregar al carrito\t2.Ver productos\t3.Pagar\t4.Finalizar compra");
            op = sc.nextInt();
            int aux;
            switch (op) {
                case 1:
                    int op2;
                    System.out.println("1.Smatphones");
                    System.out.println("2.Tablets");
                    System.out.println("3.Televisiones");
                    System.out.println("4.Laptops");
                    System.out.println("5.Pc");
                    op2 = sc.nextInt();
                    switch (op2) {
                        case 1:
                            System.out.println("Introduzca el indice de la lista del producto deseado");
                            aux = sc.nextInt();
                            if(aux < comprador.tablets.size()){
                                carrito.getTablets().add(comprador.tablets.get(aux));
                                System.out.println("Añadido al carrito");
                            }
                            break;
                        case 2:
                            System.out.println("Introduzca el indice de la lista del producto deseado");
                            aux = sc.nextInt();
                            if(aux < comprador.televisiones.size()){
                                carrito.getTelevisiones().add(comprador.televisiones.get(aux));
                                System.out.println("Añadido al carrito");
                            }                            
                            break;
                            case 3:
                            System.out.println("Introduzca el indice de la lista del producto deseado");
                            aux = sc.nextInt();
                            if(aux < comprador.smartphones.size()){
                                carrito.getSmartphones().add(comprador.smartphones.get(aux));
                                System.out.println("Añadido al carrito");
                            }                            
                            
                            break;
                            case 4:
                            System.out.println("Introduzca el indice de la lista del producto deseado");
                            aux = sc.nextInt();
                            if(aux < comprador.laptops.size()){
                                carrito.getLaptops().add(comprador.laptops.get(aux));
                                System.out.println("Añadido al carrito");
                            }                            
                            
                            break;
                            case 5:
                            System.out.println("Introduzca el indice de la lista del producto deseado");
                            aux = sc.nextInt();
                            if(aux < comprador.pcs.size()){
                                carrito.getPcs().add(comprador.pcs.get(aux));
                                System.out.println("Añadido al carrito");
                            }                            
                            
                            break;
                    
                        default:
                            break;
                    }
                    break;
                case 2:
                    imprimirProductos(comprador);
                    break;
                case 3:
                    
                    break;
            
                default:
                    break;
            }
        }while(op != 3);
        sc.close();
    }

    public static void imprimirProductos(Comprador comprador){
        int i = 0;
        for (Smartphone aux : comprador.smartphones) {
            System.out.println("Producto "+ i++);
            aux.print();
        }
        i = 0;
        for (Tablet aux : comprador.tablets) {
            System.out.println("Producto "+ i++);
            aux.print();
        }
        i = 0;
        for (Television aux : comprador.televisiones) {
            System.out.println("Producto "+ i++);
            aux.print();
        }
        i = 0;
        for (Laptop aux : comprador.laptops) {
            System.out.println("Producto "+ i++);
            aux.print();
        }
        i = 0;
        for (PC aux : comprador.pcs) {
            System.out.println("Producto "+ i++);
            aux.print();
        }
    }

    public void imprimirProducto(LinkedList<DispositivoElectronico> list){
        int i = 0;
        for (DispositivoElectronico aux : list) {
            System.out.println("Producto "+ i++);
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