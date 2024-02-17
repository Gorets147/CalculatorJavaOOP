package org.example;

import java.util.Arrays;

public class BoxWithNumber<B extends Number> {

    private B[] numbers;

    public BoxWithNumber(B[] numbers) {
        this.numbers = numbers;
    }

    @Override
    public String toString() {
        return "BoxWithNumber{" +
                "numbers=" + Arrays.toString(numbers) +
                '}';
    }

    public double average() {
        double res = 0;
        for (B number : numbers) {
            res += number.doubleValue();
        }
        return res / numbers.length;
    }

    public boolean compare(BoxWithNumber<? extends Number> boxWithNumber) {
        if (average() > boxWithNumber.average()) {
            return true;
        } else {
            return false;
        }
    }
}
