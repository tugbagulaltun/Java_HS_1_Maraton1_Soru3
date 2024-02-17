package com.tugba.entity;

import java.util.UUID;

public class YuruyenHayvanlar extends Hayvan implements OrtakOzellikler{
    private String id;
    boolean kulaklariVarMi;
    int bacakUzunlugu;

    @Override
    public void yemekYe() {
        System.out.println("Yürüyen hayvanlar ağız ve dillerini kullanır");
    }

    public YuruyenHayvanlar(){};
    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("YuruyenHayvanlar{");
        sb.append("id='").append(id).append('\'');
        sb.append(", kulaklariVarMi=").append(kulaklariVarMi);
        sb.append(", bacakUzunlugu=").append(bacakUzunlugu);
        sb.append(", tur='").append(tur).append('\'');
        sb.append(", adi='").append(adi).append('\'');
        sb.append(", yas=").append(yas);
        sb.append(", uzunluk=").append(uzunluk);
        sb.append('}');
        return sb.toString();
    }

    public YuruyenHayvanlar(String tur, String adi, int yas, int uzunluk, boolean kulaklariVarMi, int bacakUzunlugu) {
        super(tur, adi, yas, uzunluk);
        this.id= UUID.randomUUID().toString();
        this.kulaklariVarMi = kulaklariVarMi;
        this.bacakUzunlugu = bacakUzunlugu;
    }
    @Override
    public void ayakSayisi() {
        System.out.println(getClass().getSimpleName()+"Yürüyen Hayvanlarda Genellikle 4 ya da 2 Ayak vardır.");
    }

    @Override
    public void uyan() {
        System.out.println(" Yürüyen hayvan uyandı");
    }

    @Override
    public void uyu() {
        System.out.println("Yürüyen hayvan uyudu");
    }

    @Override
    public void hiz() {
        System.out.println(getClass().getSimpleName()+"Yuruyen hayvanların ortalama hızı 55-60 km/h ");
    }

    public int getBacakUzunlugu() {
        return bacakUzunlugu;
    }

    public void setBacakUzunlugu(int bacakUzunlugu) {
        this.bacakUzunlugu = bacakUzunlugu;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public boolean isKulaklariVarMi() {
        return kulaklariVarMi;
    }

    public void setKulaklariVarMi(boolean kulaklariVarMi) {
        this.kulaklariVarMi = kulaklariVarMi;
    }
}
