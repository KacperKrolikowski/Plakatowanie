package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int buildingQuantity = scanner.nextInt();
        int width = 0;
        int height = 0;

        int pointer = 0;

        int neededPosters = 1;

        int [] heightPlan = new int[buildingQuantity];

        width = scanner.nextInt();
        heightPlan[0] = scanner.nextInt();

        for(int i = 1; i < buildingQuantity; i++){

            width = scanner.nextInt();
            height = scanner.nextInt();
            while (height < heightPlan[pointer]){
                neededPosters++;
                pointer--;
                if (pointer == -1){
                    heightPlan[pointer+=1] = height;
                }
            }
            if(height > heightPlan[pointer]){
                heightPlan[pointer+=1] = height;
            }
        }

        neededPosters += pointer;


        /*for(int i = 1; i < buildingQuantity; i++){
            if(heightPlan[i] != heightPlan[i - 1]){
                if (heightPlan[i] > heightPlan[i - 1]){
                    neededPosters++;
                }else if (heightPlan[i] < heightPlan[i - 1]){
                    for(int j = 1; j <= i; j++){
                        if (heightPlan[i - j] == heightPlan[i]){
                            break;
                        }else if (heightPlan[i - j] < heightPlan[i]){
                            neededPosters++;
                            break;
                        }
                    }
                }
            }
        } */

        System.out.println(neededPosters);

    }
}
