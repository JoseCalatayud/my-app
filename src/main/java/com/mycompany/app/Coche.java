package com.mycompany.app;

public class Coche extends Vehiculo {

    private String matricula;
    private String tipoDeCambio;
    private int numeroMarcha;

    public Coche(String marca, int autonomia, int pasajeros, String matricula,
            String tipoDeCambio) {
        super(marca, "Terrestre", autonomia, pasajeros);
        this.matricula = matricula;
        this.tipoDeCambio = tipoDeCambio;
        this.numeroMarcha = 1;
    }
    

    public String getMatricula() {
        return matricula;
    }


    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }


    public String getTipoDeCambio() {
        return tipoDeCambio;
    }


    public void setTipoDeCambio(String tipoDeCambio) {
        this.tipoDeCambio = tipoDeCambio;
    }


    public int getNumeroMarcha() {
        return numeroMarcha;
    }


    public void setNumeroMarcha(int numeroMarcha) {
        this.numeroMarcha = numeroMarcha;
    }


    public void subirMarcha(){
        if(this.numeroMarcha <=7){
            this.numeroMarcha ++;
        }
    }
    public void subbajarMarcha(){
        if(this.numeroMarcha >=1){
            this.numeroMarcha --;
        }
    }
    

    

}
