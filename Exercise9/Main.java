package org.Exercise9;
import java.util.Scanner;
public class Main {
    static void main() {
        Scanner s =new Scanner(System.in);

        // Absctraction

        //Test class "Book" that extend fro m Product, then assaign values to get discount based on this class
        Book b1 = new Book("Mohammed",100.0,"ahmed");
        System.out.println(b1.getDiscount());

        //Test Movie "Book" that extend from Product, then assaign values to get discount based on this class
        Movie m1=new Movie("Saad",250,"Abdulaziz");
        System.out.println(m1.getDiscount());




        //----------------------------------------------------------------------------------------------------
        // Interface

        //Create object move
        MovablePoint move = new MovablePoint(0,0,0,0);
        Scanner input = new Scanner(System.in);

        System.out.println(" ");


        // Start assigning valuse to X, then choose which side wnat to move by number 1 or 2
        int again=0;
        while (again==0) {

            System.out.print("x Moving Speed = ? ");
            int xSpeed = input.nextInt();
            move.setxSpeed(xSpeed);
            System.out.println("1. Right");
            System.out.println("2. Left");

            int choice = input.nextInt();
            switch (choice) {
                case 1:
                    move.moveRight();
                    break;
                case 2:
                    move.moveLeft();
                    break;
                default:
                    System.out.println("Invalid choice");
            }

            // Start assigning valuse to Y, then choose which side wnat to move by number 1 or 2
            System.out.print("y Moving Speed = ? ");
            int ySpeed = input.nextInt();
            move.setySpeed(ySpeed);
            System.out.println("1. Up");
            System.out.println("2. Down");

            choice = input.nextInt();
            switch (choice) {
                case 1:
                    move.moveUp();
                    break;
                case 2:
                    move.moveDown();
                    break;
                default:
                    System.out.println("Invalid choice");
            }

            System.out.println(move); // OR System.out.println(move.toString());
            System.out.print("if u want continue enter 0 or any number to exit ");
            again = input.nextInt();
        }
        System.out.println("Thank you for test my code");
    }
}
