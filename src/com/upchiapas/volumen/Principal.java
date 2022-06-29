package com.upchiapas.volumen;

import com.upchiapas.volumen.models.LecturaDato;

import java.util.Scanner;

public class Principal {
    private static Scanner entrada=new Scanner(System.in);
    public static void main(String[] args) {
        String opcion;
            System.out.println("Circulo en progreso");
            LecturaDato leerDato = new LecturaDato();
            leerDato.lecturaDatos();
    }
}
