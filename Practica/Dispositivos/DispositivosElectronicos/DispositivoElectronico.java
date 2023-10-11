package Dispositivos.DispositivosElectronicos;

public class DispositivoElectronico{

    private int año;
    private double precio;

    public DispositivoElectronico(int año, double precio){
        this.año = año;
        this.precio = precio;
    }

    public void setPrecio(double precio){
        this.precio = precio;
    }

    protected void setAño(int año){
        this.año = año;
    }

    protected double getPrecio(){
        return precio;
    }

    protected int getAño(){
        return año;
    }

    protected String getClassName(){
        return "DispositivoElectronico";
    }

}