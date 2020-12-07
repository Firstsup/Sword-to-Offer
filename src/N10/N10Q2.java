package N10;

import cern.colt.matrix.DoubleMatrix2D;
import cern.colt.matrix.impl.DenseDoubleMatrix2D;

public class N10Q2 {
    public static void main(String[] args) {
        System.out.println(function(10));
        System.out.println(function(11));
    }

    public static double function(int n) {
        double[][] mat0Data = new double[][]{{1, 1}, {1, 0}};
        double[][] matData = new double[][]{{1, 0}, {0, 1}};
        DoubleMatrix2D mat0 = new DenseDoubleMatrix2D(mat0Data);
        DoubleMatrix2D mat = new DenseDoubleMatrix2D(matData);
        if (n % 2 == 0) {
            for (int i = 0; i < (n - 2) / 2; i++) {
                mat = mat.zMult(mat0, null);
            }
            mat = mat.zMult(mat, null);
        } else {
            for (int i = 0; i < (n - 3) / 2; i++) {
                mat = mat.zMult(mat0, null);
            }
            mat = mat.zMult(mat, null);
            mat = mat.zMult(mat0, null);
        }
        return mat.get(0, 0);
    }
}
