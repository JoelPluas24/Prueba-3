package com.tienda.service;

import com.tienda.model.Categoria;

import java.util.ArrayList;
import java.util.List;

public class CategoriaService {
    private List<Categoria> categorias = new ArrayList<>();

    public void agregarCategoria(Categoria categoria) {
        categorias.add(categoria);
    }

    public List<Categoria> listarCategorias() {
        return categorias;
    }

    public Categoria buscarPorNombre(String nombre) {
        return categorias.stream()
                .filter(c -> c.getNombre().equalsIgnoreCase(nombre))
                .findFirst()
                .orElse(null);
    }
}
