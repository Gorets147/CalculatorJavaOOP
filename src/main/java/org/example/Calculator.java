package org.example;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class Calculator{

    public double sum(List<? extends Number> numbers){
        double res = 0;
        for (Number number : numbers) {
            res += number.doubleValue();
        }
        return res;
    }

}
