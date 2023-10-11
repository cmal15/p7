package Avance;
public class PruebaEmpleado2 {
    public static void main(String[] args) {
        Gerente gerente = new Gerente();
        gerente.setNombre("Luis Aguilar");
        gerente.setNumEmpleado(8524);
        gerente.setSueldo(1600);
        gerente.setPresupuesto(50000);

        System.out.println(gerente);
    }
}
