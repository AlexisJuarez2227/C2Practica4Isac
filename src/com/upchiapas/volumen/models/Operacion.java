package com.upchiapas.volumen.models;

public class Operacion {
    public void calcularVolumen(double radio){
        double volumen;
        volumen=(4.0/3)*Math.PI*Math.pow(radio,3);
        Impresion imprime =new Impresion();
        imprime.mostrarVolumen(volumen);
    }
}
