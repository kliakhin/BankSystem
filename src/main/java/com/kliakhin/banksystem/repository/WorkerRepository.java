package com.kliakhin.banksystem.repository;

import com.kliakhin.banksystem.entity.Client;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Евгений on 03/17/16.
 */
public interface WorkerRepository extends JpaRepository<Client, Long> {
}
