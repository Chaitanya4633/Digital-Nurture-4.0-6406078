package com.cognizant.loan;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/loans")
public class LoanController {

    @GetMapping("/{number}")
    public Loan getLoanDetails(@PathVariable String number) {
        return new Loan(number, "car", 450000.0);
    }

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
