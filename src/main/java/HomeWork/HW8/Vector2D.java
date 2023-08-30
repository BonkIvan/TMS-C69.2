package HomeWork.HW8;

import java.util.Vector;

public class Vector2D {

    int[] vectorPoint;
    Vector vector = new Vector<>();
    public Vector2D(int x, int y) {
        this.vectorPoint = new int[]{x, y};
    }

    public int[] getVectorPoint() {
        return vectorPoint;
    }

    public Vector getVector() {
        return vector;
    }

    public static int[] getVectorXY(Vector2D vectorPointA, Vector2D vectorPointB){
        return new int[]{vectorPointB.getVectorPoint()[0]-vectorPointA.getVectorPoint()[0] , vectorPointB.getVectorPoint()[1] - vectorPointA.getVectorPoint()[1]};
    }
    public static double length(Vector2D vectorPointA, Vector2D vectorPointB){
        //int [] ab = {vector2d[0] - vector.getVector2d()[0], vector2d[1] - vector.getVector2d()[1]};
        return Math.sqrt(Math.pow(getVectorXY(vectorPointA, vectorPointB)[0],2) + Math.pow(getVectorXY(vectorPointA, vectorPointB)[1],2));
    }

    public static double scalarProduct(int[] vectorXY1, int[] vectorXY2 ){
        return vectorXY1[0]*vectorXY2[0] + vectorXY2[1]*vectorXY2[1];
    }
    public static double scalarProduct(Vector2D vectorPointA, Vector2D vectorPointB, Vector2D vectorPointC, Vector2D vectorPointD ){
       return getVectorXY(vectorPointA, vectorPointB)[0]*getVectorXY(vectorPointC, vectorPointD)[0]
               + getVectorXY(vectorPointA, vectorPointB)[1]*getVectorXY(vectorPointC, vectorPointD)[1];

    }

    public static int[] sumVectors(int[] vectorXY1, int[] vectorXY2){
        return new int[] {vectorXY1[0] +vectorXY2[0],vectorXY1[1]+vectorXY2[1]};

    }

    public static int[] sumVectors(Vector2D vectorPointA, Vector2D vectorPointB, Vector2D vectorPointC, Vector2D vectorPointD ){
        return new int[] {getVectorXY(vectorPointA, vectorPointB)[0] + getVectorXY(vectorPointC, vectorPointD)[0],
                 getVectorXY(vectorPointA, vectorPointB)[1]+getVectorXY(vectorPointC, vectorPointD)[1]};
    }



//    (vector2d[0]*vector.getVector2d()[0])+(vector2d[1]*vector.getVector2d()[1])

}
