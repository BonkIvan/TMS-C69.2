package lessons.lesson8Polymorph;

import lessons.lesson8Polymorph.ArrayUtils.ArrayUtils;

public class Main {
    public static void main(String[] args) {
      int [] arr = {5, 2, 5, 9, 10};
        double avr = ArrayUtils.calculateAverage(arr);
        System.out.println(avr);
        int min = ArrayUtils.getMinMax(arr,Mode.MIN);
        System.out.println(min);

    }
}
