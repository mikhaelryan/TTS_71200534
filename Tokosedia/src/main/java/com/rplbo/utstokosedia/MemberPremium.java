package com.rplbo.utstokosedia;

public class MemberPremium extends Member{
    public double POTONGAN;
    private String KodeVoucher;

    public MemberPremium(String a, String b ){
        super.setAlamat(b);
        super.setNama(a);
        POTONGAN=0.1;
        KodeVoucher="TOKOSEDIA25";
    }

    public void bayar(long a, String b){
        super.getDompet().setSaldo(super.getDompet().getSaldo()-a);
    }

    public void bayar(long a){
        super.getDompet().setSaldo(super.getDompet().getSaldo()-(a));
    }
}
