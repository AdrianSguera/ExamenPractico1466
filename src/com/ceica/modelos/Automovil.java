package com.ceica.modelos;

public class Automovil extends VehiculoMotorizado {
    private int numpuertas;

    public Automovil(String marca, String modelo, int fabyear, String tipocombustible, int numpuertas) {
        super(marca, modelo, fabyear, tipocombustible);
        this.numpuertas = numpuertas;
    }

    public int getNumpuertas() {
        return numpuertas;
    }

    public void setNumpuertas(int numpuertas) {
        this.numpuertas = numpuertas;
    }

    @Override
    public String mostrarDetalles() {
        return "Automóvil{" +
                "Marca='" + getMarca() + '\'' +
                ", Modelo='" + getModelo() + '\'' +
                ", Año de fabricación='" + getFabyear() + '\'' +
                ", Tipo de combustible='" + getTipocombustible() + '\'' +
                ", Número de puertas='" + numpuertas + "'" +
                '}';
    }
}
