package com.ceica;

import com.ceica.modelos.Automovil;
import com.ceica.modelos.Motocicleta;
import com.ceica.modelos.Vehiculo;
import com.ceica.modelos.VehiculoMotorizado;

public class Main {
    public static void main(String[] args) {
        Vehiculo vehiculo = new Vehiculo("Seat", "Ibiza", 2022);
        VehiculoMotorizado vehiculoMotorizado = new VehiculoMotorizado("Seat", "Ibiza", 2022, "Gasolina");
        Automovil automovil = new Automovil("Seat", "Ibiza", 2022, "Gasolina", 4);
        Motocicleta motocicleta = new Motocicleta("Yamaha", "YZF-R6", 2023, "Gasolina", "Carreras");
        System.out.println(vehiculo.mostrarDetalles());
        System.out.println(vehiculoMotorizado.mostrarDetalles());
        System.out.println(automovil.mostrarDetalles());
        System.out.println(motocicleta.mostrarDetalles());
    }
}