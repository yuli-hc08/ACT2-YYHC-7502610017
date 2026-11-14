package TALLER10.EJERCICIO3;

public class Celular extends Dispositivo {

    // Da error porque el metodo en Dispositivo recibe un int
    /*
    @Override
    public void cargar() {
        System.out.println("El celular está cargando.");
    }
    */

    @Override
    public void cargar(int porcentaje) {
        System.out.println("El celular está cargando al " + porcentaje + "%.");
    }
}