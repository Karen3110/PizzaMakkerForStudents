package com.example.demo3;

import com.example.demo3.model.Table;
import com.example.demo3.repository.TableRepository;
import com.example.demo3.util.SQLConnector;
import com.google.gson.Gson;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        TableRepository tableRepository = new TableRepository();

        System.out.println(tableRepository.readAll());

    }




}
