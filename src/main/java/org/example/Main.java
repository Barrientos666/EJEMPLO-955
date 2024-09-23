package org.example;

import org.example.ayudas.Licor;
import org.example.modelo.Cliente;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Licor licorUno = new Licor();
        Licor licorDos = new Licor("Aguardiante Antioqueño tapa verde","Aguardiente", "FLA", LocalDate.of(2028,10,31),29.0);
        Cliente clienteUno = new Cliente();
        Cliente clienteDos = new Cliente("JUAN","10000000",35,"calle 45 sur # 33-21 apto 305","gmail@gmail.com");


        // accediendo a los atributos
        //

        System.out.println(licorUno.getMarca());
        System.out.println(licorDos.getNombre());

    }



}