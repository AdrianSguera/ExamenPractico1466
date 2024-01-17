package com.ceica.modelos;

public class VehiculoMotorizado extends Vehiculo {
    private String tipocombustible;

    public VehiculoMotorizado(String marca, String modelo, int fabyear, String tipocombustible) {
        super(marca, modelo, fabyear);
        this.tipocombustible = tipocombustible;
    }

    public String getTipocombustible() {
        return tipocombustible;
    }

    public void setTipocombustible(String tipocombustible) {
        this.tipocombustible = tipocombustible;
    }

    @Override
    public String mostrarDetalles() {
        return "VehiculoMotorizado{" +
                "Marca='" + getMarca() + '\'' +
                ", Modelo='" + getModelo() + '\'' +
                ", Año de fabricación='" + getFabyear() + '\'' +
                ", Tipo de combustible='" + tipocombustible + "'" +
                '}';
    }
}
