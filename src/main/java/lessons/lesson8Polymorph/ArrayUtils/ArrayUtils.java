package lessons.lesson8Polymorph.ArrayUtils;

import lessons.lesson8Polymorph.Mode;

public final class ArrayUtils {

    public static double calculateAverage(int[] arr){
        double sum = 0;
        for (int element : arr) {
            sum = sum + element;
        }
        return sum/ arr.length;
    }



    public static int getMax(int[] arr){
            int temp = arr[0];
        for (int i = 0; i<arr.length; i++){
            if (temp<arr[i]){
                temp=arr[i];
            }

        }
        return  temp;
    }
    public static int getMin(int[] arr){
        int temp = arr[0];
        for (int i = 0; i<arr.length; i++){
            if (temp>arr[i]){
                temp=arr[i];
            }

        }
        return  temp;
    }

    public static int getMinMax(int[] arr, Mode mode){
        int temp = arr[0];
        boolean flag;
        for (int element:arr
             ) {
            flag = (mode == Mode.MIN)
                    ? element<temp:element>temp;
                temp=element;
        }
        return  temp;

    }



}
