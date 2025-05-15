package com.tienda.service;

import com.tienda.model.Categoria;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class CategoriaServiceTest {

    private CategoriaService categoriaService;

    @Before
    public void setUp() {
        categoriaService = new CategoriaService();
        categoriaService.agregarCategoria(new Categoria("Libros", "Todo tipo de libros"));
    }

    @Test
    public void testAgregarCategoria() {
        categoriaService.agregarCategoria(new Categoria("Juguetes", "Juguetes para niños"));
        assertEquals(2, categoriaService.listarCategorias().size());
    }

    @Test
    public void testBuscarPorNombreExistente() {
        Categoria cat = categoriaService.buscarPorNombre("libros");
        assertNotNull(cat);
        assertEquals("Libros", cat.getNombre());
    }

    @Test
    public void testBuscarPorNombreInexistente() {
        Categoria cat = categoriaService.buscarPorNombre("Electrónica");
        assertNull(cat);
    }
}
