package com.mycompany.app;

public class Vehiculo {

    private String marca;
    private String tipoMedioTransporte;
    private int autonomia;
    private int pasajeros;

    public Vehiculo(String marca, String tipoMedioTransporte, int autonomia, int pasajeros) {
        this.marca = marca;
        this.tipoMedioTransporte = tipoMedioTransporte;
        this.autonomia = autonomia;
        this.pasajeros = pasajeros;
    }
    public Vehiculo() {
    }
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public String getTipoMedioTransporte() {
        return tipoMedioTransporte;
    }
    public void setTipoMedioTransporte(String tipoMedioTransporte) {
        this.tipoMedioTransporte = tipoMedioTransporte;
    }
    public int getAutonomia() {
        return autonomia;
    }
    public void setAutonomia(int autonomia) {
        this.autonomia = autonomia;
    }
    public int getPasajeros() {
        return pasajeros;
    }
    public void setPasajeros(int pasajeros) {
        this.pasajeros = pasajeros;
    }

    
    

}
