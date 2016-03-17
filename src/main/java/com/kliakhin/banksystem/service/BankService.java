package com.kliakhin.banksystem.service;

import com.kliakhin.banksystem.entity.Bank;

import java.util.List;

/**
 * Created by Евгений on 03/17/16.
 */
public interface BankService {
    Bank addBank(Bank bank);
    void delete(long id);
    Bank getByName(String name);
    Bank editBank(Bank bank);
    List<Bank> getAll();

}
