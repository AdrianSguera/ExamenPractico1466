package com.ceica.modelos;

public class Motocicleta extends VehiculoMotorizado {
    private String tipomotocicleta;

    public Motocicleta(String marca, String modelo, int fabyear, String tipocombustible, String tipomotocicleta) {
        super(marca, modelo, fabyear, tipocombustible);
        this.tipomotocicleta = tipomotocicleta;
    }

    public String getTipomotocicleta() {
        return tipomotocicleta;
    }

    public void setTipomotocicleta(String tipomotocicleta) {
        this.tipomotocicleta = tipomotocicleta;
    }

    @Override
    public String mostrarDetalles() {
        return "Motocicleta{" +
                "Marca='" + getMarca() + '\'' +
                ", Modelo='" + getModelo() + '\'' +
                ", Año de fabricación='" + getFabyear() + '\'' +
                ", Tipo de combustible='" + getTipocombustible() + '\'' +
                ", Tipo de motocicleta='" + tipomotocicleta + "'" +
                '}';
    }
}
