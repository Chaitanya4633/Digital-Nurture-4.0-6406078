package com.cognizant.account;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/account")
public class AccountController {

    @GetMapping("/{id}")
    public Account getAccount(@PathVariable String id) {
        return new Account(id, "Chaitanya", 99999);
    }

    static class Account {
        private String id;
        private String name;
        private int balance;

        public Account(String id, String name, int balance) {
            this.id = id;
            this.name = name;
            this.balance = balance;
        }

        public String getId() { return id; }
        public String getName() { return name; }
        public int getBalance() { return balance; }
    }
}
