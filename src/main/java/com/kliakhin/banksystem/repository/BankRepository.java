package com.kliakhin.banksystem.repository;

import com.kliakhin.banksystem.entity.Bank;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

/**
 * Created by ������� on 03/17/16.
 */

public interface BankRepository extends JpaRepository<Bank, Long> {
    @Query("select b from Bank b where b.name = :name")
    Bank findByName(@Param("name") String name);
}
