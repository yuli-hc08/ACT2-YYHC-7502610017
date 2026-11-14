package TALLER10.EJERCICIO3;

public class PruebaErrorSobrescritura {
    public static void main(String[] args) {
        Celular celular = new Celular();
        celular.cargar(80);

        Tablet tablet = new Tablet();
        tablet.encender();
    }
}