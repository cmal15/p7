package Dispositivos.DispositivosMoviles;

import Dispositivos.DispositivosElectronicos.DispositivoElectronico;

public class DispositivoMovil extends DispositivoElectronico{

    private int bateriaInterna;
    private String modelo;
    private String marca;
    
    public DispositivoMovil(int año, double precio, String marca, String modelo, int bateriaInterna){
        super(año, precio);
        this.marca = marca;
        this.modelo = modelo;
        this.bateriaInterna = bateriaInterna;
    }

    protected void setMarca(String marca){
        this.marca = marca;
    }

    protected void setModelo(String modelo){
        this.modelo = modelo;
    }

    protected void setBateriaInterna(int bateriaInterna){
        this.bateriaInterna = bateriaInterna;
    }

    protected String getMarca(){
        return marca;
    }

    protected String getModelo(){
        return modelo;
    }

    protected int getBateriaInterna(){
        return bateriaInterna;
    }

    @Override
    protected String getClassName(){
        return "DispositivoMovil";
    }
}