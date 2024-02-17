package com.tugba.entity;

import java.util.UUID;

public class Hayvan implements HayvanInterface {
    private String id;
    public String tur;
    public String adi;
    public   int yas;
    public int uzunluk;



    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Hayvan{");
        sb.append("id='").append(id).append('\'');
        sb.append(", tur='").append(tur).append('\'');
        sb.append(", adi='").append(adi).append('\'');
        sb.append(", yas=").append(yas);
        sb.append(", uzunluk=").append(uzunluk);
        sb.append('}');
        return sb.toString();
    }

    public Hayvan(String tur, String adi, int yas, int uzunluk) {
        this.id= UUID.randomUUID().toString();
        this.tur = tur;
        this.adi = adi;
        this.yas = yas;
        this.uzunluk = uzunluk;

    }

    public Hayvan() {
    }

    public String getTur() {
        return tur;
    }

    public void setTur(String tur) {
        this.tur = tur;
    }

    public String getAdi() {
        return adi;
    }

    public void setAdi(String adi) {
        this.adi = adi;
    }

    public int getYas() {
        return yas;
    }

    public void setYas(int yas) {
        this.yas = yas;
    }

    public int getUzunluk() {
        return uzunluk;
    }

    public void setUzunluk(int uzunluk) {
        this.uzunluk = uzunluk;
    }


    @Override
    public void yemekYe() {
        System.out.println("Hayvanlar Yemek Yer.");
    }

    @Override
    public void uyu() {
        System.out.println(getClass()+"uyuyor");
    }

    @Override
    public void uyan() {
        System.out.println(getClass()+" uyandı");
    }
}
