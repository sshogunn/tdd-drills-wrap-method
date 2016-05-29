package com.epam.engx.tdd.drills.wrapmethod;

import java.util.List;
import java.util.Set;

/**
 * @author Nurmakanov
 */
public class LegacyMethod {

    public void wrapMe(List<String> names, Set<Integer> ages) {
        boolean resultOne = untestedCodeOne();
        if (resultOne) {
            if (!untestedCodeTwo()) {
                for (int i = 0; i < 10; i++) {
                    untestedCodeThree();
                }
            }
        }
    }

    private boolean untestedCodeOne() {
        sleep();
        return true;
    }

    private boolean untestedCodeTwo() {
        sleep();
        return false;
    }

    private void untestedCodeThree() {
        sleep();
    }

    private static void sleep() {
        try {
            Thread.sleep(50000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

}
