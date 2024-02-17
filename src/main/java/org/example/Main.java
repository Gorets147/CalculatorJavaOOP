package org.example;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
    // 1) Создать класс - коробку (SimpleBox), которая может хранить любые объекты.
    // Посмотреть с какими ошибками можно столкнуться и исправить данное решение на более подходящее(GenBox).
        SimpleBox intBox1 = new SimpleBox(10);
        SimpleBox intBox2 = new SimpleBox(20);

        int sum = (Integer) intBox1.getObj() + (Integer) intBox2.getObj();
        System.out.println("sum = " + sum);

        intBox1.setObj("java");
        int sum2 = 0;
        if (intBox1.getObj() instanceof Integer && intBox2.getObj() instanceof Integer) {
            sum2 = (Integer) intBox1.getObj() + (Integer) intBox2.getObj();
        }
        System.out.println("sum2 = " + sum2);

        GenBox<Integer> genIntBox1 = new GenBox<>(10);
        GenBox<Integer> genIntBox2 = new GenBox<>(20);
        int sum3 = genIntBox1.getObj() + genIntBox2.getObj();

        Double [] array1 = {1.0, 4.0, 6.0, 10.0};
        BoxWithNumber<Double> boxWithNumber = new BoxWithNumber<>(array1);
        System.out.println("boxWithNumber = " + boxWithNumber.average());

        Integer [] array2 = {1,2,3,4};
        BoxWithNumber<Integer> boxWithNumber1 = new BoxWithNumber<>(array2);
        System.out.println("boxWithNumber1 = " + boxWithNumber1.average());

        System.out.println("boxWithNumber = " + boxWithNumber.compare(boxWithNumber1));


        GenBox<Double> genDoubleBox1 = new GenBox<>(2.0);
        GenBox<Double> genDoubleBox2 = new GenBox<>(4.0);

        Calculator calculator = new Calculator();
        Double resMulti = calculator.multi(genDoubleBox1, genDoubleBox2);
        System.out.println("res = " + resMulti);

        Double resDiv = calculator.div(genDoubleBox1, genDoubleBox2);
        System.out.println("res = " + resDiv);


    }
}