package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
            double a;
            double b;
            double c;
            Scanner sc = new Scanner(System.in);
            System.out.println("Nhap vao 3 canh cua tam giac:");
            a = sc.nextDouble();
            b = sc.nextDouble();
            c = sc.nextDouble();
            try {
                if (a + b <= c || b + c <= a || a + c <= b || a < 0 || b < 0 || c < 0) {
                    throw new IllegalTriangleException("Not a triangle");
                } else {
                    double cv = a + b + c;
                    System.out.println("chu vi tam giac:" + cv);
                }

            } catch (IllegalTriangleException e) {
                System.out.println(e.toString());
            }
        }
    }

