package com.company;

import java.util.Iterator;
import java.util.Random;

public class RandomNumbers implements Iterable<Integer> {
    protected Random random;
    int min = 0;
    int max = 0;
    int r = 0;

    public RandomNumbers(int min, int max) {
        this.min = min;
        this.max = max;
        this.random = new Random();
    }

    int rand() {
        r = random.nextInt(max - min + 1) + min;
        return r;
    }

    @Override
    public Iterator<Integer> iterator() {
        return new Iterator<Integer>() {
            @Override
            public boolean hasNext() {
                return true;
            }

            @Override
            public Integer next() {
                return rand();
            }
        };
    }

}

