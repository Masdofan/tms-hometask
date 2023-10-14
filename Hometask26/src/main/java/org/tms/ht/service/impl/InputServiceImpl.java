package org.tms.ht.service.impl;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.tms.ht.domain.Bet;
import org.tms.ht.domain.Pair;
import org.tms.ht.service.InputService;

import java.util.List;
import java.util.Scanner;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class InputServiceImpl implements InputService {

    private List<Pair> pairs;

    @Override
    public Bet inputPair() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input number of pair");
        int input = scanner.nextInt();

        System.out.println("Input cost");
        int cost = scanner.nextInt();

        if (input > 0 && input < 4) {
            return new Bet(input, cost);
        } else {
            System.out.println("This pair not exist");
            return new Bet(-1, cost);
        }
    }
}
