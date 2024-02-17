package com.tugba.repository;

import com.tugba.entity.Hayvan;

import java.util.ArrayList;

public class HayvanRepository implements Repository{
    @Override
    public void save(Hayvan hayvan) {
        System.out.println("Hayvan kayıt edildi.");
    }

    @Override
    public void delete(Hayvan hayvan) {
        System.out.println("Hayvan silindi");
    }

    @Override
    public ArrayList<Hayvan> findAll() {
        System.out.println("Kayıtlı veriler getirildi.");
        return null;
    }
}
