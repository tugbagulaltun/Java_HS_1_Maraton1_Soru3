package com.tugba.entity;

import javax.swing.text.html.ObjectView;
import java.util.UUID;

public class SurunenHayvanlar extends Hayvan{

    private String id;
    int deriKalinligi;
    boolean zehirliMi;

    @Override
    public void yemekYe() {
        System.out.println("Sürünen hayvanlar ağız ve dillerini kullanır");
    }

    @Override
    public void uyu() {
        System.out.println(" uyudu.");
    }

    @Override
    public void uyan() {
        System.out.println("uyandı");
    }

    public static void ortalamaHiz(){
        System.out.println("Sürünen hayvanların ortalama hizi 20 km/h");
    }
    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("SurunenHayvanlar{");
        this.id= UUID.randomUUID().toString();
        sb.append("id='").append(id).append('\'');
        sb.append(", deriKalinligi=").append(deriKalinligi);
        sb.append(", zehirliMi=").append(zehirliMi);
        sb.append(", tur='").append(tur).append('\'');
        sb.append(", adi='").append(adi).append('\'');
        sb.append(", yas=").append(yas);
        sb.append(", uzunluk=").append(uzunluk);

        sb.append('}');
        return sb.toString();
    }
public SurunenHayvanlar(){

};
    public SurunenHayvanlar(String tur, String adi, int yas, int uzunluk, int deriKalinligi, boolean zehirliMi) {
        super(tur, adi, yas, uzunluk);
        this.id= UUID.randomUUID().toString();
        this.deriKalinligi = deriKalinligi;
        this.zehirliMi = zehirliMi;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getDeriKalinligi() {
        return deriKalinligi;
    }

    public void setDeriKalinligi(int deriKalinligi) {
        this.deriKalinligi = deriKalinligi;
    }

    public boolean isZehirliMi() {
        return zehirliMi;
    }

    public void setZehirliMi(boolean zehirliMi) {
        this.zehirliMi = zehirliMi;
    }
}
