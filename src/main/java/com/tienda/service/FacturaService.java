package com.tienda.service;

import com.tienda.model.Factura;

import java.util.ArrayList;
import java.util.List;

public class FacturaService {
    private List<Factura> facturas = new ArrayList<>();

    public void agregarFactura(Factura factura) {
        facturas.add(factura);
    }

    public List<Factura> listarFacturas() {
        return facturas;
    }

    public Factura buscarPorId(int id) {
        return facturas.stream()
                .filter(f -> f.getId() == id)
                .findFirst()
                .orElse(null);
    }
}
