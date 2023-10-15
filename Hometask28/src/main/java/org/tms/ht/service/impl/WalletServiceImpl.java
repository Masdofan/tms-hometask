package org.tms.ht.service.impl;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.tms.ht.service.WalletService;


@Data
@Service
public class WalletServiceImpl implements WalletService {

    private int balance = 10000;

    @Override
    public void inc(int cost) {
        balance += cost;
    }

    @Override
    public void dec(int cost) {
        balance -= cost;
    }

    @Override
    public int getBalance() {
        return balance;
    }
}