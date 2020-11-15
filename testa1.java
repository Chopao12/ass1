package com.chopao;

import java.util.Scanner;

public class testa1 {
    public static void main(String[] agrs) {
        int money, set, bottles, total1, remain, remains, remains1, bottles2, remain2, total2;
        int quantity, set2, bottles3, remain3, remain4, total3, bottles4, remain5, total4;

        Scanner scan = new Scanner(System.in);

        System.out.print("Money (RM):");
        money = scan.nextInt();

        //Calculation
        set = money/12;
        bottles = set*24;
        remain = money%12;
        remains = remain/8;
        remains1 = (money%12)%8;
        total1 = (set*12)+(remains*8)+(remains1);
        bottles2 = money/8;
        remain2 = money%8;
        total2 = (bottles2*8)+remain2;

        //Making decision
        if (money >= 12)
        {
            System.out.printf("%d set (%d bottles) x RM12.00 -> RM%d",set,bottles,set*12);
            System.out.printf("\n%d set (%d bottles) x RM8.00 -> RM%d",remains, remains*10, remains*8);
            System.out.printf("\n%d bottles x RM1.00 -> RM%d",remains1,remains1);
            System.out.printf("\nTotal: RM%d",total1);
            System.out.printf("\nBalance: RM%d",money-total1);
        }
        else if (money >= 8)
        {
            System.out.printf("%d bottles x RM8.00 -> RM%d",bottles2,bottles2*8);
            System.out.printf("\n%d bottles x RM1.OO -> RM%d",remain2,remain2);
            System.out.printf("\nTotal: RM%d",total2);
            System.out.printf("\nBalance: RM%d",money-total2);
        }
        else
        {
            System.out.printf("%d bottles x RM1.00 -> RM%d",money,money);
            System.out.printf("\nTotal: RM%d",money);
            System.out.printf("\nBalance: RM0.00");
        }

        System.out.print("\nQuantity (bottles):");
        quantity = scan.nextInt();

        //Calculation
        set2 = quantity/24;
        bottles3 = set2*24;
        remain3 = ((quantity%24)/10);
        remain4 = (quantity%24)%10;
        total3 = (set2*12)+(remain3*8)+remain4;
        bottles4 = (quantity/10);
        remain5 = quantity%10;
        total4 = (bottles4*8)+remain5;

        //Making decision
        if (quantity >= 24)
        {
            System.out.printf("%d set (%d bottles) -> RM%d",set2,bottles3,set2*12);
            System.out.printf("\n%d bottles -> RM%d",remain3*10,remain3*8);
            System.out.printf("\n%d bottles -> RM%d",remain4,remain4);
            System.out.printf("\nTotal: RM%d",total3);
        }
        else if (money >= 10)
        {
            System.out.printf("%d bottles -> RM%d",bottles4*10, bottles4*8);
            System.out.printf("\n%d bottles -> RM%d",remain5,remain5);
            System.out.printf("\nTotal: RM%d",total4);
        }
        else
        {
            System.out.printf("%d bottles -> RM%d",quantity,quantity);
            System.out.printf("\nTotal: RM%d",quantity);
        }


    }
}
