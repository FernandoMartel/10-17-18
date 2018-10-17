package Cliente;

import java.util.Date;
import java.util.List;

public class Cliente {

    //Atributos

    private String DNI;
    private String Nombre;
    private String Direccion;
    private String Telefono;
    private Cliente Avalado;
    private List<Reserva> listaReserva;

    //Constructor

    public Cliente(String dni, String nombre, String direccion, String telefono){
        this.DNI = dni;
        this.Nombre = nombre;
        this.Direccion = direccion;
        this.Telefono = telefono;
    }

    //Getter & Setter & Add

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String direccion) {
        Direccion = direccion;
    }

    public String getTelefono() {
        return Telefono;
    }

    public void setTelefono(String telefono) {
        Telefono = telefono;
    }

    public Cliente getAvalado() {
        return Avalado;
    }

    public void setAvalado(Cliente avalado) {
        Avalado = avalado;
    }

    public List<Reserva> getListaReserva() {
        return listaReserva;
    }

    public void setListaReserva(List<Reserva> listaReserva) {
        this.listaReserva = listaReserva;
    }

    public void addReserva(Reserva reserva){
        listaReserva.add(reserva);
    }

    //Metodos

    /*public void hacerReserva(){
        boolean cont = true;
        LocalDate ini;
        LocalDate fin;
        Agencia agen;
        Cliente cli = this;



        while (cont) {
            new Reserva(ini,fin,cli,agen);
            //continuar? Y/N
            //if ...
                cont = false;
        }
    }*/

    //Metodo Avalar
}
