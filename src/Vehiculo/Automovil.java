package Vehiculo;

import Cliente.Reserva;

public class Automovil {

    //Atributos

    private Garage garage;
    private Double precio;
    private Boolean entregado;
    private Reserva reserva;

    //Constructor

    public Automovil (Double pre, Boolean ent){
        this.precio = pre;
        this.entregado = ent;
    }

    //Getter & Setter


    public Garage getGarage() {
        return garage;
    }

    public void setGarage(Garage garage) {
        this.garage = garage;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public Boolean getEntregado() {
        return entregado;
    }

    public void setEntregado(Boolean entregado) {
        this.entregado = entregado;
    }

    public Reserva getReserva() {
        return reserva;
    }

    public void setReserva(Reserva reserva) {
        this.reserva = reserva;
    }

}
