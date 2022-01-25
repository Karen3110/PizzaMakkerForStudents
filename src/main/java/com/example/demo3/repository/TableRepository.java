package com.example.demo3.repository;

import com.example.demo3.model.Table;

import java.util.LinkedList;
import java.util.List;

public class TableRepository {

    public Table read(int id) {
        return new Table();
    }

    public List<Table> readAll() {
        // this is or DBMS
        List<Table> objects = new LinkedList<>();
        objects.add(new Table(0,1,4,false));
        objects.add(new Table(1,2,4,false));
        objects.add(new Table(2,3,4,true));
        objects.add(new Table(3,4,4,false));
        objects.add(new Table(4,5,4,false));

        return objects;
    }

    public void create(Table table) {

    }

    public Table update(int id, Table table) {
        return null;
    }

    public void delete(int id) {

    }

}
