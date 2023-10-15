package org.tms.ht.service;

public interface WalletService {

    void inc(int cost);

    void dec(int cost);

    int getBalance();
}
