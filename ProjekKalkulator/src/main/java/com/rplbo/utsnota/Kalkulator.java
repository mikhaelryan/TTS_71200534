package com.rplbo.utsnota;

import java.lang.Math;

public class Kalkulator {
    private int bil2;
    private int bil1;
    private String op;

    public Kalkulator(BilanganString string1, BilanganString string2, Operator op) {
        this.bil2 = string2.getBilangan();
        this.bil1 = string1.getBilangan();
        this.op = op.getOperatorSimbol();
    }

    public void hitung(){
        if (op=="*"){
            int hasil = bil1 * bil2;
            System.out.println("Hasil: "+hasil);
        }else if(op=="/"){
            int hasil = bil1 / bil2;
            System.out.println("Hasil: "+hasil);
        }else if(op=="+"){
            int hasil = bil1 + bil2;
            System.out.println("Hasil: "+hasil);
        }else if(op=="-"){
            int hasil = bil1 - bil2;
            System.out.println("Hasil: "+hasil);
        }else if(op=="**"){
            double hasil = Math.pow(bil1,bil2);
            System.out.println("Hasil: "+hasil);
        }

    }
}
