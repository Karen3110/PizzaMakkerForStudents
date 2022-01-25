package com.example.demo3.repository;

import com.example.demo3.model.Table;
import com.example.demo3.util.SQLConnector;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;

public class TableRepository {


    public Table read(int id) {

        Connection connection = SQLConnector.getConnection();
        PreparedStatement pstmt = null;
        ResultSet resultSet = null;
        try {
            pstmt = connection.prepareStatement("SELECT * from `table` WHERE id=?");
            pstmt.setInt(1, id);
            resultSet = pstmt.executeQuery();

        } catch (SQLException sqlException) {
            sqlException.printStackTrace();
        }

        Table table = null;
        try {
            while (resultSet.next()) {
                table = mapper(resultSet);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        try {
            pstmt.close();
            resultSet.close();
            connection.close();
        } catch (SQLException sqlException) {
            sqlException.printStackTrace();
        }

        return table;
    }

    public List<Table> readAll() {
        Connection connection = SQLConnector.getConnection();
        PreparedStatement pstmt = null;
        ResultSet resultSet = null;

        try {
            pstmt = connection.prepareStatement("SELECT * from `table`");
            resultSet = pstmt.executeQuery();
        } catch (SQLException sqlException) {
            sqlException.printStackTrace();
        }

        List<Table> data = mapperList(resultSet);


        try {
            pstmt.close();
            resultSet.close();
            connection.close();
        } catch (SQLException sqlException) {
            sqlException.printStackTrace();
        }

        return data;
    }

    public void create(Table table) {

    }

    public Table update(int id, Table table) {
        return null;
    }

    public void delete(int id) {

    }


    private static List<Table> mapperList(ResultSet resultSet) {
        List<Table> data = new LinkedList<>();
        try {
            while (resultSet.next()) {
                data.add(mapper(resultSet));
            }
        } catch (SQLException sqlException) {
            sqlException.printStackTrace();
        }
        return data;
    }

    private static Table mapper(ResultSet resultSet) {
        Table t = new Table();
        try {
            t.setId(resultSet.getInt("id"));
            t.setNumber(resultSet.getInt("number"));
            t.setSeats(resultSet.getInt("seats"));
            t.setBusy(resultSet.getBoolean("is_busy"));

        } catch (SQLException sqlException) {
            sqlException.printStackTrace();
        }
        return t;
    }


}
