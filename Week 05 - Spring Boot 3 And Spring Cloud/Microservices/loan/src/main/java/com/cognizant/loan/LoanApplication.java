package com.cognizant.loan;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

@SpringBootApplication
@RestController
@RequestMapping("/loans")
public class LoanApplication {

    public static void main(String[] args) {
        SpringApplication.run(LoanApplication.class, args);
    }

    // @GetMapping("/{number}")
    // public Loan getLoanDetails(@PathVariable String number) {
    //     return new Loan(number, "home", 800000.0);
    // }

    static class Loan {
        private String number;
        private String type;
        private double amount;

        public Loan(String number, String type, double amount) {
            this.number = number;
            this.type = type;
            this.amount = amount;
        }

        public String getNumber() { return number; }
        public String getType() { return type; }
        public double getAmount() { return amount; }
    }
}
