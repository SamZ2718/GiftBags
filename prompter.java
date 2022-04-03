package com.company;

import java.util.Scanner;

public class prompter {
    int iterations;
    private DataSet[] data;
    Scanner input;


    public prompter() {
        input = new Scanner(System.in);
        promptData();
        data = new DataSet[iterations];
        for(int i = 0; i < iterations; i++) {
            data[i] = new DataSet(promptItemsAmount(), promptItemsList(), promptWeight());
        }
        input.close();
    }

    /**
     * This function checks user input by repeatedly prompting the user till it
     * meets its requirements
     * In this case the requirement is that it must be an input
     * @return
     */
    private int checkIntInput() {
        int numb;

        while(!input.hasNextInt()) {
            input.next();
            System.out.println("please input an integer");
        }
        numb = input.nextInt();

        return(numb);
    }

    private void promptData() {
        System.out.println("How many gift baskets are you making");
        iterations = checkIntInput();
    }

    private int promptItemsAmount() {
        System.out.println("How many items do you want");

            return(checkIntInput());
        }

    private int[] promptItemsList() {
        System.out.println("How many items do you want");
        int[] listLength = new int[checkIntInput()];

        System.out.println("List your Items");
        for(int i = 0; i < listLength.length; i++) {
            System.out.print("Item " + (i + 1) + ": ");
            listLength[i] = checkIntInput();

        }
        for(int element : listLength) {
            System.out.print(element + " ");
        }
        System.out.println();
        return(listLength);
    }

    private int promptWeight() {
        System.out.println("Please enter the maximum weight");
        return(checkIntInput());
    }



    }

