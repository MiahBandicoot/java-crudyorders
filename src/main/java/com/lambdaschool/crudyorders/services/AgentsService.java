package com.lambdaschool.javaorders.services;
import com.lambdaschool.javaorders.models.Agent;

public interface AgentsService {
    Agent findAgentById(long id);
    void deleteUnassigned(long agentid);
}
