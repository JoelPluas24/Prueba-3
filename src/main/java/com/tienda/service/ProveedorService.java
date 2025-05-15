package com.tienda.service;

import com.tienda.model.Proveedor;
import java.util.ArrayList;
import java.util.List;

public class ProveedorService {
    private List<Proveedor> proveedores = new ArrayList<>();

    public void agregarProveedor(Proveedor proveedor) {
        proveedores.add(proveedor);
    }

    public List<Proveedor> listarProveedores() {
        return proveedores;
    }

    public Proveedor buscarPorNombre(String nombre) {
        return proveedores.stream()
                .filter(p -> p.getNombre().equalsIgnoreCase(nombre))
                .findFirst()
                .orElse(null);
    }
}
