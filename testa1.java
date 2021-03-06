package com.chopao;

import java.util.Scanner;

public class testa1 {
    public static void main(String[] agrs) {
        double money, remain1, remain2, total1, remain3, total2;
        int money2, set1, bottles1, set2, bottles2, bottles3;
        int quantity, set3, bottles4, remain4, remain5, bottles5, remain6;
        double total3, total4;

        Scanner scan = new Scanner(System.in);

        System.out.print("Money (RM):");
        money = scan.nextDouble();
        System.out.print("-------------------------------------------\n");

        //Calculation
        money2 = (int)money;
        set1 = money2/12;
        bottles1 = set1*24;
        remain1 = money2%12;
        set2 = (int)remain1/8;
        bottles2 = set2*10;
        remain2 = remain1%8;
        total1 = (bottles1*0.5)+(bottles2*0.8)+(remain2);
        bottles3 = money2/8*10;
        remain3 = money2%8;
        total2 = (bottles3*0.8)+remain3;

        //Making decision
        if (money >= 12)
        {
            System.out.printf("%d set (%d bottles) x RM12.00 -> RM%.2f",set1,bottles1,bottles1*0.5);
            if (bottles2 > 0) {
                System.out.printf("\n%d set (%d bottles) x RM8.00 -> RM%.2f",set2,bottles2,bottles2*0.8);
            }
            if (remain2 > 0) {
                System.out.printf("\n%d bottles x RM1.00 -> RM%.2f",(int)remain2,remain2);
            }
            System.out.printf("\nTotal: RM%.2f",total1);
            System.out.printf("\nBalance: RM%.2f",money-total1);
        }
        else if (money >= 8)
        {
            System.out.printf("%d bottles x RM8.00 -> RM%.2f",bottles3,bottles3*0.8);
            if (remain3 > 0) {
                System.out.printf("\n%d bottles x RM1.OO -> RM%.2f",(int)remain3,remain3);
            }
            System.out.printf("\nTotal: RM%.2f",total2);
            System.out.printf("\nBalance: RM%.2f",money-total2);
        }
        else
        {
            System.out.printf("%d bottles x RM1.00 -> RM%.2f",money2,(double)money2);
            System.out.printf("\nTotal: RM%.2f",(double)money2);
            System.out.printf("\nBalance: RM%.2f",money-(double)money2);
        }

        System.out.print("\n-------------------------------------------\n");
        System.out.print("\nQuantity (bottles):");
        quantity = scan.nextInt();
        System.out.print("-------------------------------------------\n");

        //Calculation
        set3 = quantity/24;
        bottles4 = set3*24;
        remain4 = ((quantity%24)/10)*10;
        remain5 = (quantity%24)%10;
        total3 = (bottles4*0.5)+(remain4*0.8)+remain5;
        bottles5 = (quantity/10);
        remain6 = quantity%10;
        total4 = (bottles5*8)+remain6;

        //Making decision
        if (quantity >= 24)
        {
            System.out.printf("%d set (%d bottles) -> RM%.2f",set3,bottles4,bottles4*0.5);
            if (remain4 > 0) {
                System.out.printf("\n%d bottles -> RM%.2f",remain4,remain4*0.8);
            }
            if (remain5 > 0) {
                System.out.printf("\n%d bottles -> RM%.2f",remain5,(double)remain5);
            }
            System.out.printf("\nTotal: RM%.2f",total3);
        }
        else if (quantity >= 10)
        {
            System.out.printf("%d bottles -> RM%.2f",bottles5*10,(double)bottles5*8);
            if (remain6 > 0) {
                System.out.printf("\n%d bottles -> RM%.2f",remain6,(double)remain6);
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
