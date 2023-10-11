package Dispositivos.DispositivosElectronicos;

public class Television extends DispositivoElectronico{

    private String modelo;
    private int resolucion;
    private String audio;

    public Television(int año, boolean bateriaInterna, String modelo, int resolucion, String audio){
        super(año, bateriaInterna);
        this.modelo = modelo;
        this.resolucion = resolucion;
        this.audio = audio;
    }

    protected void setModelo(String modelo){
        this.modelo = modelo;
    }
    
    protected void setResolucion(int resolucion){
        this.resolucion = resolucion;
    }
    
    protected void setAudio(String audio){
        this.audio = audio;
    }

    protected String getModelo(){
        return modelo;
    }

    protected int getResolucion(){
        return resolucion;
    }
    
    protected String getAudio(){
        return audio;
    }

    protected String getClassName(){
        return "Television";
    }

}