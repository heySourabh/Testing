package main;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the degree of polynomial 1.");
        int degree1 = Integer.parseInt(in.nextLine());

        System.out.println("Enter the degree of polynomial 2.");
        int degree2 = Integer.parseInt(in.nextLine());

        int degree = Math.max(degree1, degree2);

        double[] coeffs1 = new double[degree + 1];
        double[] coeffs2 = new double[degree + 1];

        System.out.println("Enter the coeffs of first polynomial.");
        for (int i = 0; i < degree + 1; i++) {
            System.out.println("Enter coeff of power " + i + " of polynomial 1");
            coeffs1[i] = Double.parseDouble(in.nextLine());
        }

        System.out.println();

        System.out.println("Enter the coeffs of second polynomial.");
        for (int i = 0; i < degree + 1; i++) {
            System.out.println("Enter coeff of power " + i + " of polynomial 2");
            coeffs2[i] = Double.parseDouble(in.nextLine());
        }

        System.out.println(Arrays.toString(addPolynomials(coeffs1, coeffs2)));
    }

    static double[] addPolynomials(double[] coeff1, double[] coeffs2) {
        double[] res = new double[coeff1.length];
        for (int i = 0; i < coeff1.length; i++) {
            res[i] = coeff1[i] + coeffs2[i];
        }
        return res;
    }
}