package TALLER9.EJERCICIO3;

public class PruebaErrorSuper {
    public static void main(String[] args) {
        // Error: no se puede usar super aqui porque esta clase no hereda de Planta
        // super.tipo = "Orquídea";

        Orquidea orquidea = new Orquidea("Orquídea");
        orquidea.mostrarDetalleError();

        System.out.println("Nota: super solo funciona dentro de subclases y no permite acceder a atributos privados.");
    }
}