package com.example.demo3.controller;

import com.example.demo3.model.Table;
import com.google.gson.Gson;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class TableController extends HttpServlet {

    private List<Table> lst = new LinkedList<>();
    private static Random random = new Random();


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.getWriter().println("this is GET method in general");

        if (lst.size() == 0) {
            for (int i = 0; i < 10; i++) {
                lst.add(new Table(i, i + 1, random.nextInt(10) + 1, random.nextBoolean()));
            }
            System.out.println(lst);

        }

        resp.getWriter().println(new Gson().toJson(lst));


    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.getWriter().println("this is POST method in general");


        int number = Integer.parseInt(req.getParameter("number"));
        int seats = Integer.parseInt(req.getParameter("seats"));
        boolean busy = Boolean.parseBoolean(req.getParameter("busy"));

        int id = lst.get(lst.size() - 1).getId() + 1;
//
        Table data = new Table(id, number, seats, busy);
        lst.add(data);
        System.out.println(lst);

        resp.getWriter().println(lst);


    }

    @Override
    protected void doPut(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.getWriter().println("this is PUT method in general");
    }

    @Override
    protected void doDelete(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.getWriter().println("this is DELETE method in general");

        int delId = Integer.parseInt(req.getParameter("idToDelete"));
        List<Table> collect = lst.stream().filter(item -> item.getId() == delId).collect(Collectors.toList());

        lst.removeAll(collect);

        resp.getWriter().println(lst);

    }


}
