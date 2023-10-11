package Dispositivos.DispositivosElectronicos;

public class DispositivoElectronico{

    private int año;
    private boolean bateriaInterna;

    public DispositivoElectronico(int año, boolean bateriaInterna){
        this.año = año;
        this.bateriaInterna = bateriaInterna;
    }

    public void setBateriaInterna(boolean bateriaInterna){
        this.bateriaInterna = bateriaInterna;
    }

    protected void setAño(int año){
        this.año = año;
    }

    protected boolean getBateriaInterna(){
        return bateriaInterna;
    }

    protected int getAño(){
        return año;
    }

    protected String getClassName(){
        return "DispositivoElectronico";
    }

}