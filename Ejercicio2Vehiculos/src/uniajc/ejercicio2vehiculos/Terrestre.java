package uniajc.ejercicio2vehiculos;

public class Terrestre extends Vehiculo implements Motor {
    private int cantidadLlantas;
    private String uso; // "militar" o "civil"

    public Terrestre(int cantidadLlantas, String uso) {
        this.cantidadLlantas = cantidadLlantas;
        this.uso = uso;
    }
    
    @Override
    public int acelerar(int velocidad) {
        velocidadActual = Math.min(velocidadActual + velocidad, velocidadMaxima);
        return velocidadActual;
    }

    @Override
    public int frenar(int velocidad) {
        velocidadActual = Math.max(velocidadActual - velocidad, 0);
        return velocidadActual;
    }

    @Override
    public int calcularRevolucionesMotor(int fuerza, int radio) {
        return fuerza * radio;
    }

    @Override
    public void imprimir() {
        super.imprimir();
        System.out.println("Cantidad de llantas: " + cantidadLlantas);
        System.out.println("Uso del vehículo: " + uso);
    }
}


