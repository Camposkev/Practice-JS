package com.company;

public class Main {

    public static void main(String[] args) {
        //exercise plus
        int sumar;
        sumar = suma(10, 30, 40);
        System.out.println(sumar);
        //exercise car
        coche miCoche = new coche();
        miCoche.Aumentar();
        System.out.println(miCoche.puerta);
    }

    public static int suma(int a, int b, int c) {
        return a + b + c;
    }
}
class coche {
        public int puerta = 4;
        public void Aumentar(){
            this.puerta++;
        }
}

