package com.example;

public class BankServiceRuntimeExecution implements BankService{

    @Override
    public void pay(String nej,double tack){
        throw new RuntimeException();
    }

}
