package com.upchiapas.volumen.models;

import java.util.Scanner;

public class LecturaDato {
    private Scanner entrada = new Scanner(System.in);
    private double radio;
    public void lecturaDatos(){
        System.out.println("Ingrese el radio del circulo: ");
        radio=entrada.nextDouble();
        Operacion proceso =new Operacion();
        proceso.calcularVolumen(radio);
    }
}
