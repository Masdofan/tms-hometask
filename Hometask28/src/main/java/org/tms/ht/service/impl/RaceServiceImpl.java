package org.tms.ht.service.impl;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.tms.ht.domain.Bet;
import org.tms.ht.domain.Pair;
import org.tms.ht.service.InputService;
import org.tms.ht.service.RaceService;
import org.tms.ht.service.WalletService;

import java.util.List;
import java.util.Random;

@Data
@AllArgsConstructor
@NoArgsConstructor

@Service
public class RaceServiceImpl implements RaceService {

    private InputService inputService;
    private WalletService walletService;
    private List<Pair> pairs;
    private int inputPair;

    @Autowired
    public RaceServiceImpl(InputService inputService, WalletService walletService, List<Pair> pairs) {
        this.inputService = inputService;
        this.walletService = walletService;
        this.pairs = pairs;
    }

    @Override
    public void runRace() {

        Bet inputPair = inputService.inputPair();

        System.out.println("Run race");

        doRace();

        System.out.println("Pair 1 result: " + pairs.get(0).getResult() + " minutes");
        System.out.println("Pair 2 result: " + pairs.get(1).getResult() + " minutes");
        System.out.println("Pair 3 result: " + pairs.get(2).getResult() + " minutes");

        int winnerTime = pairs.get(0).getResult();
        int winnerPair = pairs.get(0).getNumberOfPair();

        if (winnerTime > pairs.get(1).getResult()) {
            winnerTime = pairs.get(1).getResult();
            winnerPair = pairs.get(1).getNumberOfPair();
        }
        if (winnerTime > pairs.get(2).getResult()) {
            winnerTime = pairs.get(2).getResult();
            winnerPair = pairs.get(2).getNumberOfPair();
        }

        System.out.println("Winner:" + winnerPair);

        if (winnerPair == inputPair.getNumberOfPair()) {
            walletService.inc(inputPair.getCost());
            System.out.println("Win: +" + inputPair.getCost());
        }else {
            walletService.dec(inputPair.getCost());
            System.out.println("Lose: -" + inputPair.getCost());
        }


    }

    public void doRace() {
        for (int i = 0; i < 3; i++) {
            int result = 0;
            for (int f = 1; f <= 5; f++) {
                result += new Random().nextInt(3);
            }
            pairs.get(i).setResult(result);
        }
    }
}