package com.rplbo.utsnota;

import java.util.Locale;

public class BilanganString {
    private String bilanganstring;
    private int bilangan;

    public BilanganString(String bilanganstring) {
        if (bilanganstring.equalsIgnoreCase("satu")) {
            this.bilangan = 1;
        } else if (bilanganstring.equalsIgnoreCase("dua")) {
            this.bilangan = 2;
        } else if (bilanganstring.equalsIgnoreCase("tiga")){
            this.bilangan = 3;
        } else if (bilanganstring.equalsIgnoreCase("empat")){
            this.bilangan = 4;
        } else if (bilanganstring.equalsIgnoreCase("lima")){
            this.bilangan = 5;
        } else if (bilanganstring.equalsIgnoreCase("enam")){
            this.bilangan = 6;
        } else if (bilanganstring.equalsIgnoreCase("tujuh")){
            this.bilangan = 7;
        } else if (bilanganstring.equalsIgnoreCase("delapan")){
            this.bilangan = 8;
        } else if (bilanganstring.equalsIgnoreCase("sembilan")){
            this.bilangan = 9;
        } else if (bilanganstring.equalsIgnoreCase("sepuluh")){
            this.bilangan = 10;
        } else if (bilanganstring.equalsIgnoreCase("sebelas")){
            this.bilangan = 11;
        } else if (bilanganstring.equalsIgnoreCase("dua belas")){
            this.bilangan = 12;
        } else if (bilanganstring.equalsIgnoreCase("tiga belas")){
            this.bilangan = 13;
        } else if (bilanganstring.equalsIgnoreCase("empat belas")){
            this.bilangan = 14;
        } else if (bilanganstring.equalsIgnoreCase("lima belas")){
            this.bilangan = 15;
        } else if (bilanganstring.equalsIgnoreCase("enam belas")){
            this.bilangan = 16;
        } else if (bilanganstring.equalsIgnoreCase("tujuh belas")){
            this.bilangan = 17;
        } else if (bilanganstring.equalsIgnoreCase("delapan belas")){
            this.bilangan = 18;
        } else if (bilanganstring.equalsIgnoreCase("sembilan belas")){
            this.bilangan = 19;
        } else if (bilanganstring.equalsIgnoreCase("dua puluh")) {
            this.bilangan = 20;
        }
    }

    public int getBilangan() {
        return bilangan;
    }

    public boolean apakahDuaDigit(){
        if (this.bilangan>=10){
            return true;
        }else{
            return false;
        }
    }

    public boolean apakahLebihDari10(){
        if (this.bilangan>10){
            return true;
        }else{
            return false;
        }
    }
}
