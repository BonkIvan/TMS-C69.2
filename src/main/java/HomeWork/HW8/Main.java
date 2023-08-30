package HomeWork.HW8;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        Vector2D vectorPointA = new Vector2D(2,3);
        Vector2D vectorPointB = new Vector2D(5,9);
        Vector2D vectorPointC = new Vector2D(7,2);
        Vector2D vectorPointD = new Vector2D(2,2);
        System.out.println(Arrays.toString(Vector2D.getVectorXY(vectorPointA, vectorPointB)));
        System.out.println(Vector2D.length(vectorPointA, vectorPointB));
        System.out.println(Vector2D.scalarProduct(vectorPointA,vectorPointB, vectorPointC,vectorPointD));
        System.out.println(Arrays.toString(Vector2D.sumVectors(vectorPointA, vectorPointB, vectorPointC, vectorPointD)));


        Vector2D.scalarProduct(vectorPointA,vectorPointB, vectorPointC,vectorPointD);
        Vector2D.length(vectorPointA, vectorPointB);
        Vector2D.getVectorXY(vectorPointA, vectorPointB);
        Vector2D.sumVectors(vectorPointA, vectorPointB, vectorPointC, vectorPointD);

       /* System.out.println(vectorPointA.length(vectorPointB));
        vectorPointA.length(vectorPointB);
        int [] vectorAB = vectorPointA.getVectorXY(vectorPointB);
        int [] vectorCD = vectorPointC.getVectorXY(vectorPointD);
        System.out.println(vectorPointA.scalarProduct(vectorAB,vectorCD));
        vectorPointA.scalarProduct(vectorAB,vectorCD);*/



    }
}
