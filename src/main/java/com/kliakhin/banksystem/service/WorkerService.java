package com.kliakhin.banksystem.service;

import com.kliakhin.banksystem.entity.Worker;

import java.util.List;

/**
 * Created by Евгений on 03/17/16.
 */
public interface WorkerService {
    Worker addWorker(Worker worker);
    void delete(long id);
    Worker getByFirstName(String firstName);
    Worker editWorker(Worker worker);
    List<Worker> getAll();
}
