package uniajc.ejercicio2vehiculos;

public class Acuatico extends Vehiculo implements Vela {
    String tipoVehiculo;
    int cantidadPasajeros;

    public Acuatico(String tipoVehiculo, int cantidadPasajeros, int velocidadActual, int velocidadMaxima) {
        super(velocidadActual, velocidadMaxima);
        this.tipoVehiculo = tipoVehiculo;
        this.cantidadPasajeros = cantidadPasajeros;
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
    public String recomendarVelocidad(int velocidadViento) {
        String recomendacion="";
        
        if ((velocidadViento > 80) || (velocidadViento < 10)) {
            recomendacion = "No se recomienda navegar";
            velocidadActual = 0;
        }else{
            recomendacion = "Se puede navegar";
        }
        
        return recomendacion;
    }
    
    @Override
    public void imprimir() {
        super.imprimir();
        
        System.out.println("Tipo Vehiculo: " + tipoVehiculo);
        System.out.println("Cantidad de pasajeros: " + cantidadPasajeros);
        System.out.println("Velocidad Actual: " + velocidadActual);
        System.out.println("Velocidad Maxima: " + velocidadMaxima);
    }
    
}
