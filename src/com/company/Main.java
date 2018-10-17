package com.company;

import Cliente.*;
import Vehiculo.*;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

        LocalDate dateIni = LocalDate.of(2018,05, 31);
        LocalDate dateFin = LocalDate.of(2018, 06, 01);

        Cliente Albedo = new Cliente("41.235.687", "Albedo", "calle falsa 123", "0800-555-123");

        Agencia Argenzia = new Agencia("Argenzia");

        Reserva AlbedoRe = new Reserva(dateIni,dateFin,Albedo,Argenzia);

        Automovil batmovil = new Automovil (20000.50, false);

        Garage batigarage = new Garage("Batigarage");

        Utilitario algoAlgo = new Utilitario(3434.2,false,"no se uwu");

        System.out.println(Albedo.getNombre());
    }
}
