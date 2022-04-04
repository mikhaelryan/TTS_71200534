package com.uts.prakrplbo;

public class Buah {
    private String nama;
    private int jumlah;
    private int harga;

    public int getJumlah() {
        return jumlah;
    }

    public void setJumlah(int jumlah) {
        this.jumlah = jumlah;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getHarga() {
        if (getNama()=="Apel"){
            return 3000;
        }
        else if (getNama()=="Mangga"){
            return 4000;
        } else {
            return harga;
        }
    }
}
