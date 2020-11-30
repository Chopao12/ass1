package com.chopao;

import java.util.Scanner;

public class testa2 {
    public static Scanner scan = new Scanner(System.in);
    public static double salary1, salary2, salary3, salary4;

    public static void main(String[] args) {
        System.out.print("Welcome MagicCopy Sdn. Bhd.");
        System.out.print("\n\nEnter pay code: ");
        int code = scan.nextInt();
        while (code>3) {
            System.out.printf("Invalid code!");
            System.out.printf("\n\nEnter pay code: ");
            code = scan.nextInt();
        }while (code>0 && code<=3){
            break;
        }
        //Selection
        if (code == 1){
            calculatePayMonthlyWorker();

            System.out.printf("\n\nEnter pay code: ");
            code = scan.nextInt();
            while (code>3) {
                System.out.printf("Invalid code!");
                System.out.printf("\n\nEnter pay code: ");
                code = scan.nextInt();
            }
        }
        if (code == 2){
            calculatePayHourlyWorker();
            System.out.printf("\n\nEnter pay code: ");
            code = scan.nextInt();
            while (code>3) {
                System.out.printf("Invalid code!");
                System.out.printf("\n\nEnter pay code: ");
                code = scan.nextInt();
            }

        }
        if (code == 3) {
            calculatePayCommWorker();
            System.out.printf("\n\nEnter pay code: ");
            code = scan.nextInt();
            while (code>3) {
                System.out.printf("Invalid code!");
                System.out.printf("\n\nEnter pay code: ");
                code = scan.nextInt();
            }
        }
        if (code == -1){
            line();
            System.out.printf("\nTotal Salaries need to be paid = RM%.2f\n",salary1+salary2+salary3+salary4);
            line();
            System.out.printf("\nThank You MagicCopy Sdn. Bhd.");
        }
    }
    public static void calculatePayMonthlyWorker(){
        System.out.print("Enter the number of workers: ");
        int number = scan.nextInt();

        //Calculation
        salary1 = number * 2000;

        System.out.printf("Salary is RM%.2f",salary1);
    }
    public static void calculatePayHourlyWorker(){
        System.out.print("Enter the number of workers: ");
        int number = scan.nextInt();
        System.out.print("Enter the number of hours worked: ");
        int hours = scan.nextInt();

        //Calculation
        salary2 = number * hours * 30;
        salary3 = (number * 1200) + (number * (hours % 40) * 45);

        if (hours > 0 && hours <= 40){
            System.out.printf("Salary is RM%.2f",salary2);
            salary3 = 0;
        }
        if (hours > 40){
            System.out.printf("Salary is RM%.2f",salary3);
            salary2 = 0;
        }
    }
    public static void calculatePayCommWorker(){
        System.out.print("Enter the number of workers: ");
        int number = scan.nextInt();
        System.out.print("Enter the amount of weekly sales: ");
        int amount = scan.nextInt();

        //Calculation
        salary4 = number * 500 + (amount * number * 0.055);

        System.out.printf("Salary is RM%.2f", salary4);
    }
    public static void line(){
        int line;
        for (line=0;line<=43;line++){
            System.out.printf("%c",45);
        }
    }
}
