package com.rplbo.utstokosedia;

public class Invoice {
    private int jumlah;
    private long tagihan;
    private Produk produk;
    private Member member;

    public Invoice() {

    }

    public void printInvoice(){
        System.out.println("-----INVOICE-----");
        System.out.println("Kepada: Yth. "+member.getNama());
        System.out.println("Di "+member.getAlamat());
        System.out.println(jumlah+produk.getNamaProduk()+produk.getHarga());
        System.out.println(jumlah* produk.getHarga());
    }

    public long getTagihan(){
        return this.tagihan;
    }

    public void buatInvoice(Produk a, int b, Member c){
        jumlah=b;
        produk= a;
        member=c;
    }
}
