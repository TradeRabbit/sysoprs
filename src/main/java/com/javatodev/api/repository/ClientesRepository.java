package com.javatodev.api.repository;
import org.springframework.data.repository.CrudRepository;


import com.javatodev.api.model.Clientes;

public interface ClientesRepository extends CrudRepository<Clientes, Integer>
{
}