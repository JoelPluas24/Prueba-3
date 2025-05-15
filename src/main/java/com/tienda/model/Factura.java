package com.tienda.model;

import java.time.LocalDate;

public class Factura {
    private int id;
    private double total;
    private LocalDate fecha;

    public Factura(int id, double total, LocalDate fecha) {
        this.id = id;
        this.total = total;
        this.fecha = fecha;
    }

    public int getId() {
        return id;
    }

    public double getTotal() {
        return total;
    }

    public LocalDate getFecha() {
        return fecha;
    }
}
