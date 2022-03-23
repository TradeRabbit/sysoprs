package com.javatodev.api.service;

import com.javatodev.api.model.Clientes;
import com.javatodev.api.repository.ClientesRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;


import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClientesService 
{
    @Autowired
    ClientesRepository clientesRepository;
    public List<Clientes> getAllClientes() 
    {
    List<Clientes> clientes = new ArrayList<Clientes>();
        clientesRepository.findAll().forEach(clientes1 -> clientes.add(clientes1));
        return clientes;
    }
    public Clientes getClientesById(int id) 
    {
        return clientesRepository.findById(id).get();
    }
    public void saveOrUpdate(Clientes clientes) 
    {
        clientesRepository.save(clientes);
    }
    public void delete(int id) 
    {
        clientesRepository.deleteById(id);
    }
    public void update(Clientes clientes, int clienteid) 
    {
        clientesRepository.save(clientes);
    }
}