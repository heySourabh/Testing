package main;

import java.util.*;
public class Main {
    public static void main(String... args){
        addPolynomials(new double[]{1,2,3}, new double[]{1,4,5});
    }

    static double[] addPolynomials(double[] coeff1, double[] coeffs2) {
        double[] res = new double[coeff1.length];
        for (int i = 0; i < coeff1.length; i++) {
            res[i] = coeff1[i] + coeffs2[i];
        }
        // Little java 9
        List<String> strs = List.of("string1", "string2");
        System.out.println(strs);
        
        return res;
    }
}
