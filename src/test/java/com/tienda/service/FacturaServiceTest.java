package com.tienda.service;

import com.tienda.model.Factura;
import org.junit.Before;
import org.junit.Test;

import java.time.LocalDate;

import static org.junit.Assert.*;

public class FacturaServiceTest {
    //Nuevo textooooooos
    private FacturaService facturaService;

    @Before
    public void setUp() {
        facturaService = new FacturaService();
        facturaService.agregarFactura(new Factura(1, 100.50, LocalDate.now()));
    }

    @Test
    public void testAgregarFactura() {
        facturaService.agregarFactura(new Factura(2, 200.00, LocalDate.now()));
        assertEquals(2, facturaService.listarFacturas().size());
    }

    @Test
    public void testBuscarPorIdExistente() {
        Factura factura = facturaService.buscarPorId(1);
        assertNotNull(factura);
        assertEquals(1, factura.getId());
    }

    @Test
    public void testBuscarPorIdInexistente() {
        assertNull(facturaService.buscarPorId(999));
    }
    
    @Test
    public void BuscarporanioAC() {
        assertNull(facturaService.buscarPorId(999));
    }
}
