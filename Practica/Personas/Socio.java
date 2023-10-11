package Personas;
import java.util.Scanner;
public class Socio extends Comprador{
    protected String codigoDeConvenio;
    public Socio(String nombre, String apellido, int numeroDeCuenta, String codigoDeConvenio){
        super(nombre,apellido,numeroDeCuenta);
        this.codigoDeConvenio=codigoDeConvenio;
    }
    public static Socio nuevo(Scanner sc){
        int numeroDeCuenta;
        String nombre;
        String apellido;
        String codigoDeConvenio;
        System.out.print("Introduzca numero de cuenta: ");
        numeroDeCuenta = sc.nextInt();
        System.out.print("Introduzca nombre: ");
        nombre = sc.nextLine();
        System.out.print("Introduzca apellido: ");
        apellido = sc.nextLine();
        System.out.print("Introduzca cual es el codigo de convenio: ");
        codigoDeConvenio = sc.nextLine();
        return new Socio(nombre,apellido,numeroDeCuenta,codigoDeConvenio);
    }
    public void setCodigoDeConvenio(String codigoDeConvenio){
        this.codigoDeConvenio=codigoDeConvenio;
    }
    public String getCodigoDeConvenio(){
        return codigoDeConvenio;
    }
}
