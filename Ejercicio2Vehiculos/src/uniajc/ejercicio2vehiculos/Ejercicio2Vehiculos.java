package uniajc.ejercicio2vehiculos;

public class Ejercicio2Vehiculos {

    public static void main(String[] args) {
     // Crear una camioneta (Terrestre) con velocidadActual = 50, velocidadMaxima = 100
        Terrestre camioneta = new Terrestre(4, "Militar", 50, 100);
        camioneta.acelerar(25);
        camioneta.frenar(7);
        System.out.println("Camioneta:");
        camioneta.imprimir();
        System.out.println("Revoluciones: " + camioneta.calcularRevolucionesMotor(10, 5));
        System.out.println();

        // Crear una moto acuática con velocidadActual = 50, velocidadMaxima = 110
        Acuatico motoAcuatica = new Acuatico("Moto Acuatica", 2, 50, 110);
        motoAcuatica.acelerar(30);
        motoAcuatica.frenar(15);
        System.out.println("Moto Acuática:");
        motoAcuatica.imprimir();
        int velocidadViento = 90;
        System.out.println("Velocidad recomendada con viento de " + velocidadViento + " km/h: " + motoAcuatica.recomendarVelocidad(velocidadViento));
        motoAcuatica.imprimir();
    }
}
