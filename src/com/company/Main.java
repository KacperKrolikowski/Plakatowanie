package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int buildingQuantity = scanner.nextInt();
        int[][] buildings = new int[buildingQuantity][2];



        int widthOfAllBuilding = 0;
        int minHeight = 1000000001;
        int maxHeight = 0;

        int neededPosters = 1;

        int [] heightPlan = new int[buildingQuantity];

        for(int i = 0; i < buildingQuantity; i++){

            buildings[i][0] = scanner.nextInt();
            widthOfAllBuilding += buildings[i][0];
            buildings[i][1] = scanner.nextInt();
            if (buildings[i][1] < minHeight){
                minHeight = buildings[i][1];
            }
            if (buildings[i][1] > maxHeight){
                maxHeight = buildings[i][1];
            }
            heightPlan[i] = buildings[i][1];
        }

        int actualHeight = heightPlan[0];

        /*for(int i = 1; i<buildingQuantity; i++){
            if(actualHeight < heightPlan[i]){
                neededPosters += 2;
                if(heightPlan[i+1] != actualHeight){
                    actualHeight = heightPlan[i];
                }
            } else if (actualHeight > heightPlan[i]){
                neededPosters++;
                if(heightPlan[i+1] != actualHeight){
                    actualHeight = heightPlan[i];
                }
            }

        }*/

        for (int i = 1; i < buildingQuantity - 1; i++){
            if(heightPlan[i] != heightPlan [i - 1] && heightPlan[i] != heightPlan[i + 1]){
                neededPosters++;
            }
        }

        System.out.println(neededPosters);

    }
}
