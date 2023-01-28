package day4Assignment1;

import java.util.Scanner;

public class Order {
    public static void generateInvoice(int n, String type) {
        System.out.println("Invoice generated for " + n + " " + type);
    }

    public static void main(String[] args) {
       
        Accessories a[] = new Accessories[10];
        String[] type = new String[] {  "Keyboard","Lamp", "Connector","Headphones", "Charger", "Stylus", "Mouse",
                "Pendrive", "CD", "Lamp" };
        for (int i = 0; i < 10; i++) {
            a[i] = new Accessories(i * 100, type[i]);
            a[i].setQuantity(a[i].getQuantity() + 1);
        }
        Laptops[] l = new Laptops[5];
        String company[] = new String[] { "Microsoft", "Asus" ,"Dell", "HP", "Apple"};
        for (int i = 0; i < 5; i++) {
            l[i] = new Laptops(i, company[i]);
            l[i].setQuantity(l[i].getQuantity() + 1);
        }
        Scanner sc = new Scanner(System.in);
        System.out.println("Choose your order ?\n 1. Laptops \n 2 Accessories?");
        int o = sc.nextInt();
        System.out.println("How many do you want to order?");
        int num = sc.nextInt();

        if (o == 1) {
            if (num < l[0].getLowOrderLevelQuantity()) {
                System.out.println("RFM");
            } else if (num < l[0].getQuantity()) {
                System.out.println("Not enough left in inventory");
            } else {
                generateInvoice(num, "laptops");

            }
        } else if (o == 2) {
            if (num < a[0].getLowOrderLevelQuantity()) {
                System.out.println("RFM");
            } else if (num < a[0].getQuantity()) {
                System.out.println("Not enough left in inventory");
            } else {
                generateInvoice(num, "accessories");
            }
        } else {
            System.out.println("WRONG INPUT!!!");
        }
    }
}

