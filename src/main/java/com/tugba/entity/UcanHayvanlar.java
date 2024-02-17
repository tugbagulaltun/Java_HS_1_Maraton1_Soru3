package com.tugba.entity;

import java.util.UUID;

public class UcanHayvanlar extends Hayvan implements OrtakOzellikler{
    private String id;
    public  int kanatUzunlugu;
    public String tuyRengi;
    public int gagaUzunlugu;
    public int bacakUzunlugu;
    private final boolean tuyuVarMi=true; //Tüysüz hayvan uçamayacağı için burada final kullanarak false olma durumunu engellemiş olduk.


    public UcanHayvanlar(){    };


    @Override
    public void ayakSayisi() {
        System.out.println(getClass().getSimpleName()+"Uçan Hayvanlarda Genellikle 4 Ayak vardır.");
    }

    @Override
    public void yemekYe() {
        System.out.println("Ucan hayvanlar gagalarını kullanır");
    }

    @Override
    public void hiz() {
        System.out.println(getClass().getSimpleName()+"Ucan hayvanların ortalama hızı 64-96 km/h ");
    }

    @Override
    public void uyan() {
        System.out.println(getClass()+" uyandı");
    }

    @Override
    public void uyu() {
        System.out.println("uyudu");
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("UcanHayvanlar{");
        sb.append("kanatUzunlugu=").append(kanatUzunlugu);
        sb.append(", tuyRengi='").append(tuyRengi).append('\'');
        sb.append(", gagaUzunlugu=").append(gagaUzunlugu);
        sb.append(", bacakUzunlugu=").append(bacakUzunlugu);
        sb.append(", tur='").append(tur).append('\'');
        sb.append(", adi='").append(adi).append('\'');
        sb.append(", yas=").append(yas);
        sb.append(", uzunluk=").append(uzunluk);
        sb.append('}');
        return sb.toString();
    }

    public UcanHayvanlar(String tur, String adi, int yas, int uzunluk, int kanatUzunlugu, String tuyRengi, int gagaUzunlugu, int bacakUzunlugu) {
        super(tur, adi, yas, uzunluk); // Super ile Hayvan sınıfında tanımladığım değişkenleri çağırdım.
        final var tuyuVarMi1 = this.tuyuVarMi;
        this.id= UUID.randomUUID().toString();
        this.kanatUzunlugu = kanatUzunlugu;
        this.tuyRengi = tuyRengi;
        this.gagaUzunlugu = gagaUzunlugu;
        this.bacakUzunlugu = bacakUzunlugu;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getKanatUzunlugu() {
        return kanatUzunlugu;
    }

    public void setKanatUzunlugu(int kanatUzunlugu) {
        this.kanatUzunlugu = kanatUzunlugu;
    }

    public String getTuyRengi() {
        return tuyRengi;
    }

    public void setTuyRengi(String tuyRengi) {
        this.tuyRengi = tuyRengi;
    }

    public int getGagaUzunlugu() {
        return gagaUzunlugu;
    }

    public void setGagaUzunlugu(int gagaUzunlugu) {
        this.gagaUzunlugu = gagaUzunlugu;
    }

    public int getBacakUzunlugu() {
        return bacakUzunlugu;
    }

    public void setBacakUzunlugu(int bacakUzunlugu) {
        this.bacakUzunlugu = bacakUzunlugu;
    }


}
