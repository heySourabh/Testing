package main;

import java.util.*;

public class Main {
    static double[] addPolynomials(double[] coeff1, double[] coeffs2) {
        double[] res = new double[coeff1.length];
        for (int i = 0; i < coeff1.length; i++) {
            res[i] = coeff1[i] + coeffs2[i];
        }
        return res;
    }
}
