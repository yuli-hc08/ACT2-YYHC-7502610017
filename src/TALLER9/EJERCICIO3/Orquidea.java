package TALLER9.EJERCICIO3;

public class Orquidea extends Planta {

    public Orquidea(String tipo) {
        super(tipo);
    }

    public void mostrarDetalleError() {
        // Error: no deja acceder porque tipo es private en Planta
        // System.out.println(super.tipo);

        System.out.println("Tipo de planta: " + super.getTipo());
    }
}