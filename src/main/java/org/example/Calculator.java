package org.example;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;



public class Calculator {

    public double sum(List<? extends Number> numbers) {
        double res = 0;
        for (Number number : numbers) {
            res += number.doubleValue();
        }
        return res;
    }

    public double multi(GenBox<? extends Number> number1, GenBox<? extends Number> number2){
        return number1.getObj().doubleValue() * number2.getObj().doubleValue();
    }

    public double div(GenBox<? extends Number> number1, GenBox<? extends Number> number2){
        return number1.getObj().doubleValue() / number2.getObj().doubleValue();
    }


    @Override
    public String toString() {
        return "Calculator{}";
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }
}
