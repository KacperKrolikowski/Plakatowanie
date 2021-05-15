package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int buildingQuantity = scanner.nextInt();
        int width = 0;
        int height;

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
                heightPlan[pointer += 1] = height;
            }
        }

        neededPosters += pointer;

        System.out.println(neededPosters);

    }
}
