package Dispositivos.DispositivosMoviles;

public class Celular extends DispositivoMovil{    
    private String companiaTelefonica;
    private String planDeDatos;
    //atributos

    public Celular(int año, double precio, String marca, String modelo, int bateriaInterna,String companiaTelefonica,String planDeDatos){
        super(año, precio, marca, modelo, bateriaInterna);
        this.companiaTelefonica=companiaTelefonica;
        this.planDeDatos=planDeDatos;
    }

    public static Celular nuevo(Scanner sc){
        String companiaTelefonica;
        String PlandeDatos;
        DispositivoMovil aux = DispositivoMovil.nuevo(sc);
        System.out.println("Introduzca el compania telefonica del dispositivo");
        companiaTelefonica = sc.nextLine();
        System.out.println("Introduce el plan de datos del producto");
        PlandeDatos = sc.nextLine();
        return new Celular(aux.getAño(),aux.getPrecio(),aux.getMarca(),aux.getModelo(),aux.getBateriaInterna(),companiaTelefonica,planDeDatos);
    }
    protected void setCompaniaTelefonica(String marca){
        this.companiaTelefonica = companiaTelefonica;
    }

    protected void setPlanDeDatos(String modelo){
        this.planDeDatos = planDeDatos;
    }

    protected String getCompaniaTelefonica(){
        return companiaTelefonica;
    }

    protected String getPlanDeDatos(){
        return planDeDatos;
    }
}
