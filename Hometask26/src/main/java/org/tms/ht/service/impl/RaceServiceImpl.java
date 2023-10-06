package org.tms.ht.service.impl;

import org.tms.ht.domain.Pair;
import org.tms.ht.service.InputService;
import org.tms.ht.service.RaceService;
import org.tms.ht.service.WalletService;

import java.util.List;

public class RaceServiceImpl implements RaceService {

    private InputService inputService;
    private WalletService walletService;
    private List<Pair> pairs;

    @Override
    public void checkResult(int numberOfPair) {

    }

    @Override
    public void runRace() {

        inputService.inputPair()

    }
}
