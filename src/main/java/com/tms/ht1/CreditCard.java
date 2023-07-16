package com.tms.ht1;

public class CreditCard {

//    Создать класс CreditCard c полями номер счета, текущая сумма на счету.
//    Добавьте метод, который позволяет начислять сумму на кредитную
//    карточку.
//    Добавьте метод, который позволяет снимать с карточки некоторую сумму.
//    Добавьте метод, который выводит текущую информацию о карточке.

    int accountNumber;

    int balance;

    public CreditCard(int cardNumber, int balance) {
        this.accountNumber = cardNumber;
        this.balance = balance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public int getBalance() {
        return balance;
    }

    public void setCardNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public void getInfo() {
        System.out.println("Account number: " + this.accountNumber);
        System.out.println("Balance: " + this.balance);
    }

    public int balancePlus(int sumPlus) {
        this.balance += sumPlus;
        return this.balance;
    }

    public int balanceMinus(int sumMinus) {
        this.balance -= sumMinus;
        return this.balance;
    }
}