package org.tms.ht.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@Data
@NoArgsConstructor
public class Pair {

    int numberOfPair;
    Rider rider;
    Horse horse;
    int result;

}
