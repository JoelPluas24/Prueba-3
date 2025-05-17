package com.tienda.service;

import com.tienda.model.Proveedor;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class ProveedorServiceTest {

    private ProveedorService proveedorService;

    @Before
    public void setUp() {
        proveedorService = new ProveedorService();
        proveedorService.agregarProveedor(new Proveedor("TechCorp", "tech@corp.com"));
    }

    @Test
    public void testAgregarProveedor() {
        proveedorService.agregarProveedor(new Proveedor("Papelería XYZ", "info@xyz.com"));
        assertEquals(2, proveedorService.listarProveedores().size());
    }

    @Test
    public void testBuscarPorNombreExistente() {
        Proveedor proveedor = proveedorService.buscarPorNombre("techcorp");
        assertNotNull(proveedor);
        assertEquals("TechCorp", proveedor.getNombre());
    }

    @Test
    public void testBuscarPorNombreInexistente() {
        assertNull(proveedorService.buscarPorNombre("NoExiste"));
    }
    
     @Test
    public void testBuscarPorCedulaiexistente() {
        assertNull(proveedorService.buscarPorNombre("Cedula No Existe"));
    }
}
