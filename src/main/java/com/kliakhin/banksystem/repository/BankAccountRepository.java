package com.kliakhin.banksystem.repository;

import com.kliakhin.banksystem.entity.BankAccount;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Евгений on 03/17/16.
 */
public interface BankAccountRepository extends JpaRepository<BankAccount, Long> {
}
