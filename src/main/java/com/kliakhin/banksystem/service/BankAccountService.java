package com.kliakhin.banksystem.service;

import com.kliakhin.banksystem.entity.BankAccount;

import java.util.List;

/**
 * Created by Евгений on 03/17/16.
 */
public interface BankAccountService {
    public interface BankService {
        BankAccount addBank(BankAccount bankAccount);
        void delete(long id);
        BankAccount getByCurrency(double currency);
        BankAccount editBank(BankAccount bankAccount);
        List<BankAccount> getAll();
    }
}
