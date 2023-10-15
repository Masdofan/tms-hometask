package org.tms.ht.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@Data
@NoArgsConstructor
public class Pair {

    private int numberOfPair;
    private Rider rider;
    private Horse horse;
    private int result;

}
