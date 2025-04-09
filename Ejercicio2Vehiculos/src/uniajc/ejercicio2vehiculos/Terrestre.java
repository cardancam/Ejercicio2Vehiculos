package uniajc.ejercicio2vehiculos;

public class Terrestre extends Vehiculo {

    // Constructor
    public Terrestre(int velocidadActual, int velocidadMaxima) {
        super(velocidadActual, velocidadMaxima);
    }
    
    public void acelerar(int velocidad) {
        if (velocidadActual + velocidad <= velocidadMaxima) {
            velocidadActual += velocidad;
        } else {
            velocidadActual = velocidadMaxima;
        }
    }
    
    public void frenar(int velocidad) {
        if (velocidadActual - velocidad >= 0) {
            velocidadActual -= velocidad;
        } else {
            velocidadActual = 0;
        }
    }
    
    public int calcularRevolucionesMotor(int fuerza, int radio) {
        return fuerza * radio;
    }
}

