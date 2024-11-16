package com.om1cael.dpay.payment;

import com.om1cael.dpay.User;

public class PaymentHandler {
    public void addFunds(User user, float amount) {
        if(amount <= 0) {
            System.out.println("Invalid amount.");
            return;
        }

        Transaction transaction = new Transaction(user, user, amount);

        user.setFunds(user.getFunds() + amount);
        user.addTransaction(transaction);
        System.out.println("Added $" + amount + " to account " + user.getUsername() + ".");
    }

    public void makePayment(User sender, User recipient, float amount) {
        if(amount <= 0 || sender == null || recipient == null || sender.getFunds() <= amount ) {
            System.out.println("Invalid amount, sender, recipient or you don't have money.");
            return;
        }

        Transaction transaction = new Transaction(sender, recipient, amount);

        sender.setFunds(sender.getFunds() - amount);
        recipient.setFunds(recipient.getFunds() + amount);

        sender.addTransaction(transaction);
        recipient.addTransaction(transaction);

        System.out.println(sender.getUsername() + " sent $" + amount + " to " + recipient.getUsername() + "'s account.");
    }
}
