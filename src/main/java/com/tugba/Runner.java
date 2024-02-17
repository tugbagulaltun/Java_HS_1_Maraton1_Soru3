package com.tugba;

import com.tugba.entity.Hayvan;
import com.tugba.entity.SurunenHayvanlar;
import com.tugba.entity.UcanHayvanlar;
import com.tugba.entity.YuruyenHayvanlar;
import com.tugba.repository.Repository;

import java.util.ArrayList;
import java.util.List;

public class Runner {
    public static void main(String[] args) {


        List<SurunenHayvanlar> surunenHayvanlar= new ArrayList<>();
        SurunenHayvanlar sHayvan1 = new SurunenHayvanlar("Yılan","Cıngıraklı Yılan",1,3,1,true);
        surunenHayvanlar.add(sHayvan1);
        System.out.println(surunenHayvanlar);

        List<YuruyenHayvanlar> yuruyenHayvanlar= new ArrayList<>();
        YuruyenHayvanlar yHayvan1= new YuruyenHayvanlar("Kedigiller","Kedi",1,1,true,1);
        System.out.println(yHayvan1);
        System.out.println(yuruyenHayvanlar);


        List<UcanHayvanlar> ucanHayvanlar= new ArrayList<>();
        UcanHayvanlar uHayvan1 = new UcanHayvanlar("Kuş", "Papağan", 3, 1, 2, "Kahve", 1, 1);
        ucanHayvanlar.add(uHayvan1);
        System.out.println(ucanHayvanlar);

        Hayvan hayvan1= new YuruyenHayvanlar();
        hayvan1.yemekYe();
        hayvan1.uyu();
        hayvan1.uyan();

        Hayvan hayvan2= new UcanHayvanlar();
        hayvan1.yemekYe();
        hayvan1.uyu();
        hayvan1.uyan();

        Hayvan hayvan3= new SurunenHayvanlar();
        hayvan1.yemekYe();
        hayvan1.uyu();
        hayvan1.uyan();





    }
}
