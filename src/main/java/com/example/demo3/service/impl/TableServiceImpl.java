package com.example.demo3.service.impl;

import com.example.demo3.model.Table;
import com.example.demo3.repository.TableRepository;
import com.example.demo3.service.TableService;

import java.util.List;
import java.util.stream.Collectors;

public class TableServiceImpl implements TableService {

    private final TableRepository tableRepository = new TableRepository();


    @Override
    public Table read(int id) {
        return tableRepository.read(id);
    }

    @Override
    public List<Table> readAll() {
        return tableRepository.readAll();
    }

    @Override
    public List<Table> readByBusy(boolean isBusy) {
        return readAll().stream().filter(item -> item.isBusy() == isBusy).collect(Collectors.toList());
    }

    @Override
    public List<Table> readBySeatCount(int seatCount) {
        return readAll().stream().filter(item -> item.getSeats() == seatCount).collect(Collectors.toList());
    }

    @Override
    public void create(Table table) {
        if (table == null) {
            return;
        }
        tableRepository.create(table);
    }


    @Override
    public Table update(int id, Table table) {

        Table read = read(id);
        if (read != null) {
            return tableRepository.update(id, table);
        }
        return null;

    }

    @Override
    public void delete(int id) {
        tableRepository.delete(id);

    }
}
