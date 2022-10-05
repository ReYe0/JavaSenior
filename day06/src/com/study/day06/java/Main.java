package com.study.day06.java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        for (int i = 0; i < n; i++) {
            int flag = scanner.nextInt();
            if (!arrayList.contains(flag)) {
                arrayList.add(flag);
            }

        }
        Collections.sort(arrayList);
        System.out.println(arrayList.size());
        for (Integer a :
                arrayList) {
            System.out.print(a+" ");
        }
    }
}
