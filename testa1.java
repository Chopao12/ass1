package com.chopao;

import java.util.Scanner;

public class testa1 {
    public static void main(String[] agrs) {
        double money, total1, total2, remain1, remain3, remain4;
        int money2, set1, bottles, set2, bottles2;
        int quantity, set3, bottles3, remain5, remain6, bottles4, remain7, bottles5;
        double total3, total4, total5;

        Scanner scan = new Scanner(System.in);

        System.out.print("Money (RM):");
        money = scan.nextDouble();
        System.out.print("-------------------------------------------\n");

        //Calculation
        money2 = (int)money;
        set1 = money2/12;
        bottles = set1*24;
        remain1 = money2%12;
        set2 = (int)remain1/8;
        bottles5 = set2*10;
        remain3 = remain1%8;
        total1 = (bottles*0.5)+(bottles5*0.8)+(remain3);
        bottles2 = money2/8;
        remain4 = money2%8;
        total2 = (bottles2*8)+remain4;

        //Making decision
        if (money >= 12)
        {
            System.out.printf("%d set (%d bottles) x RM12.00 -> RM%.2f",set1,bottles,bottles*0.5);
            if (bottles5 > 0) {
                System.out.printf("\n%d set (%d bottles) x RM8.00 -> RM%.2f",set2,bottles5,bottles5*0.8);
            }
            if (remain3 > 0) {
                System.out.printf("\n%d bottles x RM1.00 -> RM%.2f",(int)remain3,remain3);
            }
            System.out.printf("\nTotal: RM%.2f",total1);
            System.out.printf("\nBalance: RM%.2f",money-total1);
        }
        else if (money >= 8)
        {
            System.out.printf("%d bottles x RM8.00 -> RM%.2f",bottles2,(double)bottles2*8);
            if (remain4 > 0) {
                System.out.printf("\n%d bottles x RM1.OO -> RM%.2f",(int)remain4,remain4);
            }
            System.out.printf("\nTotal: RM%.2f",total2);
            System.out.printf("\nBalance: RM%.2f",money-total2);
        }
        else
        {
            System.out.printf("%d bottles x RM1.00 -> RM%.2f",money2,money);
            System.out.printf("\nTotal: RM%.2f",money);
            System.out.printf("\nBalance: RM%.2f",money);
        }

        System.out.print("\n-------------------------------------------\n");

        System.out.print("\nQuantity (bottles):");
        quantity = scan.nextInt();
        System.out.print("-------------------------------------------\n");

        //Calculation
        set3 = quantity/24;
        bottles3 = set3*24;
        remain5 = ((quantity%24)/10);
        remain6 = (quantity%24)%10;
        total3 = (bottles3*0.5)+(remain5*8)+remain6;
        bottles4 = (quantity/10);
        remain7 = quantity%10;
        total4 = (bottles4*8)+remain7;
        total5 = remain5*10*0.8;


        //Making decision
        if (quantity >= 24)
        {
            System.out.printf("%d set (%d bottles) -> RM%.2f",set3,bottles3,bottles3*0.5);
            if (total5 > 0) {
                System.out.printf("\n%d bottles -> RM%.2f",remain5*10,total5);
            }
            if ((double)remain6 > 0) {
                System.out.printf("\n%d bottles -> RM%.2f",remain6,(double)remain6);
            }
            System.out.printf("\nTotal: RM%.2f",total3);
        }
        else if (quantity >= 10)
        {
            System.out.printf("%d bottles -> RM%.2f",bottles4*10,(double)bottles4*8);
            if ((double)remain7 > 0) {
                System.out.printf("\n%d bottles -> RM%.2f",remain7,(double)remain7);
            }
            System.out.printf("\nTotal: RM%.2f",total4);
        }
        else
        {
            System.out.printf("%d bottles -> RM%.2f",quantity,(double)quantity);
            System.out.printf("\nTotal: RM%.2f",(double)quantity);
        }
        System.out.print("\n-------------------------------------------");


    }
}
