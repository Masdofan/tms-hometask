package org.tms.ht.service.impl;

import lombok.Data;
import org.tms.ht.domain.Pair;
import org.tms.ht.service.InputService;

import java.util.List;
import java.util.Scanner;

@Data
public class InputServiceImpl implements InputService {

    private List<Pair> pairs;

    public InputServiceImpl(List<Pair> pairs) {
        this.pairs = pairs;
    }

    @Override
    public int inputPair() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input number of pair");
        int input = scanner.nextInt();

        if (input > 0 && input < 4) {
            return input;
        } else return -1;
    }
}
