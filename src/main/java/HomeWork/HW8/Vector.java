package HomeWork.HW8;

public class Vector {

    int[] vectorPoint;


    static final int x = 0;
    static final int y = 1;
    static final int z = 2;


    public Vector(int x, int y) {
        this.vectorPoint = new int[]{x, y};
    }

    public Vector(int x, int y, int z) {
        this.vectorPoint = new int[]{x, y, z};
    }

    public int[] getVectorPoint() {
        return vectorPoint;
    }

    public boolean sizeVectorThreeOrTwoPoint(Vector vectorPointA, Vector vectorPointB) {
        boolean sizeThreePoint;
        if(vectorPointA.getVectorPoint().length == 3 && vectorPointB.getVectorPoint().length == 3) {
            sizeThreePoint = true;
        } else {
            sizeThreePoint = false;
        }
        return sizeThreePoint;
    }


    public int[] getVectorXY(Vector vectorPointA, Vector vectorPointB) {
        if (vectorPointA.sizeVectorThreeOrTwoPoint(vectorPointA, vectorPointB)) {
            return new int[]{vectorPointB.getVectorPoint()[x] - vectorPointA.getVectorPoint()[x],
                    vectorPointB.getVectorPoint()[y] - vectorPointA.getVectorPoint()[y],
                    vectorPointB.getVectorPoint()[z] - vectorPointA.getVectorPoint()[z]};
        } else {
            return new int[]{vectorPointB.getVectorPoint()[x] - vectorPointA.getVectorPoint()[x],
                    vectorPointB.getVectorPoint()[y] - vectorPointA.getVectorPoint()[y]};
        }

    }


    public  double length(Vector vectorPointA, Vector vectorPointB) {
        if (vectorPointA.sizeVectorThreeOrTwoPoint(vectorPointA, vectorPointB)) {
            return Math.sqrt(Math.pow(getVectorXY(vectorPointA, vectorPointB)[x], 2)
                    + Math.pow(getVectorXY(vectorPointA, vectorPointB)[y], 2)
                    + Math.pow(getVectorXY(vectorPointA, vectorPointB)[z], 2));
        } else {
            return Math.sqrt(Math.pow(getVectorXY(vectorPointA, vectorPointB)[x], 2)
                    + Math.pow(getVectorXY(vectorPointA, vectorPointB)[y], 2));
        }
    }

    public double scalarProduct(int[] vectorXY1, int[] vectorXY2) {
        if(vectorXY1.length==3&&vectorXY2.length==3){
            return vectorXY1[x] * vectorXY2[x]
                   + vectorXY2[y] * vectorXY2[y]
                   + vectorXY2[z] * vectorXY2[z];
        }else {
            return vectorXY1[x] * vectorXY2[x]
                    + vectorXY2[y] * vectorXY2[y];
        }
    }

    public double scalarProduct(Vector vectorPointA, Vector vectorPointB, Vector vectorPointC, Vector vectorPointD) {

        int[] vectorAB = getVectorXY(vectorPointA, vectorPointB);
        int[] vectorCD = getVectorXY(vectorPointC, vectorPointD);
        if(vectorAB.length==3&&vectorCD.length==3){
            return vectorAB[x] * vectorCD[x]
                 + vectorAB[y] * vectorCD[y]
                 + vectorAB[z] * vectorCD[z];
        }else {
            return vectorAB[x] * vectorCD[x]
                 + vectorAB[z] * vectorCD[z];
        }
    }



    public int[] sumVectors(int[] vectorXY1, int[] vectorXY2, VectorOperation operation) {
        int sumX;
        int sumY;
        if (operation == VectorOperation.ADD) {
            sumX = vectorXY1[x] + vectorXY2[x];
            sumY = vectorXY1[y] + vectorXY2[y];
        } else {
            sumX = vectorXY1[x] - vectorXY2[x];
            sumY = vectorXY1[y] - vectorXY2[y];
        }
        return new int[]{sumX, sumY};
    }

    public int[] sumVectors(Vector vectorPointA,
                            Vector vectorPointB,
                            Vector vectorPointC,
                            Vector vectorPointD, VectorOperation operation) {
        int[] vectorAB = getVectorXY(vectorPointA, vectorPointB);
        int[] vectorCD = getVectorXY(vectorPointC, vectorPointD);
        int sumX;
        int sumY;
        if (operation == VectorOperation.ADD) {
            sumX = vectorAB[x] + vectorCD[x];
            sumY = vectorAB[y] + vectorCD[y];
        } else {
            sumX = vectorAB[x] - vectorCD[x];
            sumY = vectorAB[y] - vectorCD[y];
        }
        return new int[]{sumX, sumY};
    }


//    (vector2d[0]*vector.getVector2d()[0])+(vector2d[1]*vector.getVector2d()[1])

}
