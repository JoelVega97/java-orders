package com.work.orders.services;


import com.work.orders.models.Agents;
import com.work.orders.models.Orders;
import com.work.orders.repositories.AgentsRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import javax.transaction.Transactional;

@Transactional
@Service(value = "agentServices")
public class AgentsServiceImpl implements AgentsServices {

    @Autowired
    AgentsRepo agntrepos;

    @Transactional
    @Override
    public Agents save(Agents agents){return agntrepos.save(agents);}
}
