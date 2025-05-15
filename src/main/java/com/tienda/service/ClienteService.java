package com.tienda.service;

import com.tienda.model.Cliente;
import java.util.ArrayList;
import java.util.List;

public class ClienteService {
    private List<Cliente> clientes = new ArrayList<>();

    public void agregarCliente(Cliente cliente) {
        clientes.add(cliente);
    }

    public List<Cliente> listarClientes() {
        return clientes;
    }

    public Cliente buscarPorCorreo(String correo) {
        return clientes.stream()
                       .filter(c -> c.getCorreo().equalsIgnoreCase(correo))
                       .findFirst()
                       .orElse(null);
    }
}
