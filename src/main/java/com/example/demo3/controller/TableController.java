package com.example.demo3.controller;

import com.example.demo3.model.Table;
import com.google.gson.Gson;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;
import java.util.stream.Stream;

public class TableController extends HttpServlet {


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        int ID = 0;
        Random random = new Random();

        List<Table> lst = new LinkedList<>();

        for (int i = 0; i < 10; i++) {
            lst.add(new Table(++ID, ID, random.nextInt(10), random.nextBoolean()));
        }

        List<Table> lst1 = new LinkedList<>();

        for (Table item :
                lst) {
            if(item.isBusy()==false){
                lst1.add(item);
            }
        }

        Gson gson = new Gson();
        String tableInfo = gson.toJson(lst) + "\nfilltered data\n"+ gson.toJson(lst1);

        PrintWriter writer = resp.getWriter();
        writer.println(tableInfo);


    }


    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String login = req.getParameter("login");
        String password = req.getParameter("password");
        String id = req.getParameter("id");

        Map<String, String> map = new HashMap();
        map.put("login", login);
        map.put("password", password);
        map.put("id", id);


        Gson gson = new Gson();
        PrintWriter writer = resp.getWriter();
        String s = gson.toJson(map);
        System.out.println(s);
        writer.println(s);


    }
}
