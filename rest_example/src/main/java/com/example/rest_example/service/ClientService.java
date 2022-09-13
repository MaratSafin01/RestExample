package com.example.rest_example.service;

import com.example.rest_example.model.Client;

import java.util.List;

public interface ClientService {

    public void create(Client client);

    public List<Client> readAll();

    public Client read(int id);

    public boolean update(Client client, int id);

    public boolean delete(int id);
}
