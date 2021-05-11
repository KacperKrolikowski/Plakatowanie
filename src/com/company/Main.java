package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int buildingQuantity = scanner.nextInt();
        int[][] buildings = new int[buildingQuantity][2];

        boolean isBetween = false;

        int neededPosters = 1;

        int [] heightPlan = new int[buildingQuantity];

        for(int i = 0; i < buildingQuantity; i++){

            buildings[i][0] = scanner.nextInt();
            buildings[i][1] = scanner.nextInt();
            heightPlan[i] = buildings[i][1];
        }

        for (int i = 1; i < buildingQuantity; i++){
            if(heightPlan[i] != heightPlan [i - 1]){
                for(int j = 0; j < i; j++){
                    if (heightPlan[j] < heightPlan[i]){
                        isBetween = true;
                    }
                }
            }
            if(isBetween == true){
                neededPosters++;
                isBetween = false;
            }
        }

        System.out.println(neededPosters);

    }
}
