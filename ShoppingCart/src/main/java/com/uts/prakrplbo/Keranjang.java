package com.uts.prakrplbo;

import java.util.ArrayList;
import java.util.List;

public class Keranjang {
    private List<Buah> daftarBuah = new ArrayList<>();

    public void tambahProduk(Buah buah){
        this.daftarBuah.add(buah);
        buah.setJumlah(buah.getJumlah()+1);
        System.out.println(buah.getNama()+" berhasil ditambahkan ke dalam keranjang!");
    }

    public void hapusProduk(Buah buah){
        this.daftarBuah.remove(buah);
        if (buah.getJumlah()!=0){
            System.out.println(buah.getNama() + " berhasil dikeluarkan dari keranjang!");
        }else if(buah.getJumlah()==0) {
            System.out.println(buah.getNama()+" sudah tidak ada di dalam keranjang!");
        }
        buah.setJumlah(buah.getJumlah()-1);
    }

    public void getKeranjang(){
        int total = 0;
        for (int i = 0; i < daftarBuah.size();i++)
        {

            System.out.println(daftarBuah.get(i).getNama()+"["+daftarBuah.get(i).getHarga()+"]"+daftarBuah.get(i).getJumlah());
            total += daftarBuah.get(i).getHarga();

        }
        System.out.println("Total : "+total);
    }
}
