package com.om1cael.dpay.payment;

import com.om1cael.dpay.User;

public record Transaction(User from, User to, float amount) {
}
