package com.ceica.modelos;

public class Vehiculo {
    private String marca, modelo;
    private int fabyear;

    public Vehiculo(String marca, String modelo, int fabyear) {
        this.marca = marca;
        this.modelo = modelo;
        this.fabyear = fabyear;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getFabyear() {
        return fabyear;
    }

    public void setFabyear(int fabyear) {
        this.fabyear = fabyear;
    }

    public String mostrarDetalles() {
        return "Vehiculo{" +
                "Marca='" + marca + '\'' +
                ", Modelo='" + modelo + '\'' +
                ", Año de fabricación='" + fabyear + "'" +
                '}';
    }
}
