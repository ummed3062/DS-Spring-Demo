package com.mru.Abstraction;

class Ecom {
    

    String processPayment(){

        return "Payment Successfully";
    }
}


class UPI extends Ecom {
    @Override
    public String processPayment() {
        return "Payment Successfully using UPI";
    }
}


class Card extends Ecom {
    @Override
    public String processPayment() {
        return "Payment Successfully using Card";
    }
}
