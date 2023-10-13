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
                    vip = new ClienteVIP(ClienteVIP.iniciarVIP());
                }
                comprador = vip;
                System.out.println("Los productos disponibles son:");
                imprimirProductos(vip);
                
                break;
            case 2:
                if(socio == null){
                    socio = new Socio(Socio.iniciarSocio());
                }            
                comprador = socio;
                System.out.println("Los productos disponibles son:");
                imprimirProductos(socio);
                break;
            case 3:
                if(estudiante == null){
                    estudiante = new Estudiante(Estudiante.iniciarEstudiante());
                }
                comprador = socio;
                System.out.println("Los productos disponibles son:");
                imprimirProductos(estudiante);
                break;
        
            default:
            sc.close();
            return;
                
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
                            if(aux < comprador.smartphones.size()){
                                carrito.addSmartphone(comprador.smartphones.get(aux));
                                System.out.println("Añadido al carrito");
                            }
                            break;
                        case 2:
                            System.out.println("Introduzca el indice de la lista del producto deseado");
                            aux = sc.nextInt();
                            if(aux < comprador.tablets.size()){
                                carrito.addTablet(comprador.tablets.get(aux));
                                System.out.println("Añadido al carrito");
                            }                            
                            break;
                            case 3:
                            System.out.println("Introduzca el indice de la lista del producto deseado");
                            aux = sc.nextInt();
                            if(aux < comprador.televisiones.size()){
                                carrito.addTelevision(comprador.televisiones.get(aux));
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
                    carrito.print();
                    System.out.println("1.Confirmar pago\t2. Cancelar compra");
                    op = sc.nextInt();
                    if(op == 2){
                        System.out.println("Hasta pronto");
                        return;
                    }
                    System.out.println("Compra confirmada");
                    break;
            
                default:
                    break;
            }
        }while(op != 4);
        sc.close();
    }

    public static void imprimirProductos(Comprador comprador){
        int i = 0;
        for (Smartphone aux : comprador.smartphones) {
            System.out.println("Producto "+ i++);
            i++;
            aux.print();
        }
        i = 0;
        for (Tablet aux : comprador.tablets) {
            System.out.println("Producto "+ i);
            i++;
            aux.print();
        }
        i = 0;
        for (Television aux : comprador.televisiones) {
            System.out.println("Producto "+ i++);
            i++;
            aux.print();
        }
        i = 0;
        for (Laptop aux : comprador.laptops) {
            System.out.println("Producto "+ i++);
            i++;
            aux.print();
        }
        i = 0;
        for (PC aux : comprador.pcs) {
            System.out.println("Producto "+ i++);
            i++;
            aux.print();
        }
    }
}
