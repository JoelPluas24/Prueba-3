package com.tienda.service;

import com.tienda.model.Cliente;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class ClienteServiceTest {

    private ClienteService clienteService;

    @Before
    public void setUp() {
        clienteService = new ClienteService();
        clienteService.agregarCliente(new Cliente("Ana", "ana@gmail.com"));
    }

    @Test
    public void testAgregarCliente() {
        clienteService.agregarCliente(new Cliente("Luis", "luis@gmail.com"));
        assertEquals(2, clienteService.listarClientes().size());
    }
    
    //Nuevo test
    @Test
    public void testAgregarCliente2() {
        clienteService.agregarCliente(new Cliente("Luis", "Joel@gmail.com"));
        assertEquals(2, clienteService.listarClientes().size());
    }
    
    //Nuevo test
    @Test
    public void testAgregarCliente3() {
        clienteService.agregarCliente(new Cliente("Luis", "Joel@gmail.com"));
        assertEquals(2, clienteService.listarClientes().size());
    }

    @Test
    public void testBuscarPorCorreoExistente() {
        Cliente cliente = clienteService.buscarPorCorreo("ana@gmail.com");
        assertNotNull(cliente);
        assertEquals("Ana", cliente.getNombre());
    }

    @Test
    public void testBuscarPorCorreoInexistente() {
        Cliente cliente = clienteService.buscarPorCorreo("noexiste@gmail.com");
        assertNull(cliente);
    }
}
