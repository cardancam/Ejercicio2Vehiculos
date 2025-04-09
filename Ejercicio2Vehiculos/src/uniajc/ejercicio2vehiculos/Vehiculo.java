package uniajc.ejercicio2vehiculos;

public class Vehiculo {
    int velocidadActual, velocidadMaxima;

    public Vehiculo(int velocidadActual, int velocidadMaxima) {
        this.velocidadActual = velocidadActual;
        this.velocidadMaxima = velocidadMaxima;
    }

    public void imprimir(){
        
    }
    public int acelerar (int velocidad){
        return velocidad;
    }
    public int frenar (int velocidad){
        return velocidad;
    }
}
