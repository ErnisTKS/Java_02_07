package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Iveskite savo ugi ir svori: ");
        float ugis = sc.nextFloat();
        int svoris = sc.nextInt();
        System.out.println("KMI: " + KMI(ugis, svoris));
    }

    public static float KMI(float ugis, int svoris){
        return svoris/(ugis*ugis);
    }
}
