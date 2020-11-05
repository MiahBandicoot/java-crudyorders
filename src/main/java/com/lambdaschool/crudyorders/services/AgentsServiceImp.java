package com.lambdaschool.javaorders.services;

import com.lambdaschool.javaorders.models.Agent;
import com.lambdaschool.javaorders.services.AgentsService;
import org.springframework.beans.factory.annotation.Autowired;
import com.lambdaschool.javaorders.repositories.AgentsRepository;
import com.lambdaschool.javaorders.repositories.CustomersRepository

import javax.persistence.EntityNotFoundException;

public class AgentsServiceImp implements AgentsService {
    @Autowired
    private AgentsRepository agentsrepos;
    @Autowired
    private CustomersRepository custrepos;
    @Override
    public Agent findAgentById(long id) throws EntityNotFoundException {
        return agentsrepos.findById(id).orElseThrow(() -> new EntityNotFoundException("Agent Id " + id + " Not Found"));
    }
}
