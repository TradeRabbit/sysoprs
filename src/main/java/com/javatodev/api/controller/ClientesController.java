package com.javatodev.api.controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.javatodev.api.model.Clientes;
import com.javatodev.api.service.ClientesService;

@RestController
public class ClientesController
{

    @Autowired
    ClientesService clientesService;

    @GetMapping("/cliente")
    private List<Clientes> getAllClientes()
    {
        return clientesService.getAllClientes();
    }

    @GetMapping("/cliente/{clienteid}")
    private Clientes getClientes(@PathVariable("clienteid") int clienteid)
    {
        return clientesService.getClientesById(clienteid);
    }

    @DeleteMapping("/cliente/{clienteid}")
    private void deleteCliente(@PathVariable("clienteid") int clienteid)
    {
        clientesService.delete(clienteid);
    }

    @PostMapping("/clientes")
    private int saveCliente(@RequestBody Clientes clientes)
    {
        clientesService.saveOrUpdate(clientes);
        return clientes.getClienteid();
    }

       @PutMapping("/clientes")
    private Clientes update(@RequestBody Clientes clientes)
    {
        clientesService.saveOrUpdate(clientes);
        return clientes;
    }
}
