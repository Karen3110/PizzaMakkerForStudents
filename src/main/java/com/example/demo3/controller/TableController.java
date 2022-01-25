package com.example.demo3.controller;

import com.example.demo3.model.Table;
import com.example.demo3.service.TableService;
import com.example.demo3.service.impl.TableServiceImpl;
import com.google.gson.Gson;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

public class TableController extends HttpServlet {
    private final TableService tableService = new TableServiceImpl();
    private final Gson gson = new Gson();


    @Override

    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<Table> data = new LinkedList<>();
        final String url = req.getParameter("url");

        switch (url) {
            case "get-all":
                data = tableService.readAll();
                break;
            case "get-by-id":
                int id = Integer.parseInt(req.getParameter("id"));
                data.add(tableService.read(id));
                break;
            case "get-by-busy":
                boolean isBusy = Boolean.parseBoolean(req.getParameter("is-busy"));
                data = tableService.readByBusy(isBusy);
                break;
            default:
                resp.sendError(404, "provided URL not found for analyse");
                break;
        }

        resp.getWriter().println(gson.toJson(data));
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
    }

    @Override
    protected void doPut(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPut(req, resp);
    }

    @Override
    protected void doDelete(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doDelete(req, resp);
    }


}
