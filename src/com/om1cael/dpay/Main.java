package com.om1cael.dpay;

import com.om1cael.dpay.payment.PaymentHandler;

public class Main {
    public static void main(String[] args) {
        PaymentHandler paymentHandler = new PaymentHandler();
        User user = new User("wrfk2", "24kasom1");
        User user2 = new User("wrfk3", "42jdsifjo1");

        System.out.println(user.toString());
        System.out.println(user2.toString());

        paymentHandler.addFunds(user, 50.04f);
        paymentHandler.makePayment(user, user2, 10);

        System.out.println(user.toString());
        System.out.println(user2.toString());

        user.getTransactions();
        user2.getTransactions();
    }
}