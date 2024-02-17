package com.tugba.repository;

import com.tugba.entity.Hayvan;

import java.util.ArrayList;

public interface Repository {
    void save(Hayvan hayvan);
    void delete(Hayvan hayvan);
    ArrayList<Hayvan> findAll();
}
