
package uniajc.ejercicio2vehiculos;

public class Ejercicio2Vehiculos {

    public static void main(String[] args) {
     // Crear una camioneta (Terrestre) con velocidadActual = 50, velocidadMaxima = 100
        Terrestre camioneta = new Terrestre(50, 100);
        System.out.println("🚙 Camioneta:");
        camioneta.imprimir();
        System.out.println("Revoluciones: " + camioneta.calcularRevolucionesMotor(10, 5));
        System.out.println();

        // Crear una moto acuática con velocidadActual = 50, velocidadMaxima = 110
        Acuatico motoAcuatica = new Acuatico(50, 110);
        System.out.println("🌊 Moto Acuática:");
        motoAcuatica.imprimir();
        int velocidadViento = 90;
        System.out.println("Velocidad recomendada con viento de " + velocidadViento + " km/h: " + motoAcuatica.recomendarVelocidad(velocidadViento));
        motoAcuatica.imprimir();
    }
}
