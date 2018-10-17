package Cliente;

import Vehiculo.Automovil;

import java.time.LocalDate;
import java.util.List;

public class Reserva {

    //Atributos

    private LocalDate fechaInicio;
    private LocalDate fechaFin;
    private Double precioTotal;
    private Cliente cliente;
    private Agencia agencia;
    private List<Automovil> listaAutos;

    //Constructor

    public Reserva (LocalDate ini, LocalDate fin, Cliente cli, Agencia age){
        this.fechaInicio = ini;
        this.fechaFin = fin;
        this.cliente = cli;
        this.agencia = age;
    }

    //Getter & Setter & Add


    public LocalDate getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(LocalDate fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public LocalDate getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(LocalDate fechaFin) {
        this.fechaFin = fechaFin;
    }

    public Double getPrecioTotal() {
        return precioTotal;
    }

    public void setPrecioTotal(Double precioTotal) {
        this.precioTotal = precioTotal;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Agencia getAgencia() {
        return agencia;
    }

    public void setAgencia(Agencia agencia) {
        this.agencia = agencia;
    }

    public List<Automovil> getListaAutos() {
        return listaAutos;
    }

    public void setListaAutos(List<Automovil> listaAutos) {
        this.listaAutos = listaAutos;
    }

    public void addAuto(Automovil automovil){
        listaAutos.add(automovil);
    }

    //Metodos

    //metod calcularPrecioTotal

    //metodo detallesTotales
}
