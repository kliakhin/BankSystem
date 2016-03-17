package com.kliakhin.banksystem;

import com.kliakhin.banksystem.config.DataConfig;
import com.kliakhin.banksystem.entity.Bank;
import com.kliakhin.banksystem.service.BankService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by Евгений on 03/17/16.
 */

public class Application {
    @SuppressWarnings("resources")
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DataConfig.class);
        BankService bankService = context.getBean(BankService.class);
        Bank b = new Bank("TestBank");
        bankService.addBank(b);
        System.out.println("List of banks!!!!!");
        System.out.println(bankService.getAll().toString());

    }
}
