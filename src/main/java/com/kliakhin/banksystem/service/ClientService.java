package com.kliakhin.banksystem.service;

import com.kliakhin.banksystem.entity.Client;

import java.util.List;

/**
 * Created by Евгений on 03/17/16.
 */
public interface ClientService {
    Client addClient(Client client);
    void delete(long id);
    Client getByFirstName(String firstName);
    Client editClient(Client client);
    List<Client> getAll();
}
