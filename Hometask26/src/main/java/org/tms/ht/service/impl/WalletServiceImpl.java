package org.tms.ht.service.impl;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.tms.ht.domain.Bet;
import org.tms.ht.service.WalletService;

@AllArgsConstructor
@Data
public class WalletServiceImpl implements WalletService {

    private int balance;

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
