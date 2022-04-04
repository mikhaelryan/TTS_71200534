package com.rplbo.utstokosedia;

public class Member {

    private String alamat;
    private String nama;
    private Dompet dompet;

    public Member(String a, String b){
        this.alamat=b;
        this.nama=a;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public Dompet getDompet() {
        return dompet;
    }

    public String getNama() {
        return nama;
    }

    public void cekSaldo(){
        System.out.println("Nama"+nama+"-----> Saldo anda Rp.: "+this.dompet.getSaldo());
    }
    public void bayar(long a){
        if (this.dompet.getSaldo()>=a){
            System.out.println("Pembayaran sukses!");
        }else if(this.dompet.getSaldo()<a){
            System.out.println("Pembayaran gagal saldo anda tidak cukup!");
        }
        this.dompet.setSaldo(dompet.getSaldo()-a);
    }

    public void topUp(long a){
        if (a>0){
            System.out.println("Top-up sukses!");
        }else if(a<=0){
            System.out.println("Top up gagal! Jumlah nominal top up haru slebih dari 0!");
        }
        this.dompet.setSaldo(dompet.getSaldo()+a);
    }
}
