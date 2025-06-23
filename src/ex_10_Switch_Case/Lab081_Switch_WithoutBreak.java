package ex_10_Switch_Case;

import java.util.Scanner;

public class Lab081_Switch_WithoutBreak {
    public static void main(String[] args) {
            //int day = Integer.parseInt(args[0]);
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter the day 1 to 7");
            int day = scanner.nextInt();

            switch (day) {

                case 1:
                    System.out.println("Mon");

                case 2:
                    System.out.println("Tue");

                case 3:
                    System.out.println("Wed");

                case 4:
                    System.out.println("Thur");

                case 5:
                    System.out.println("Fri");

                case 6:
                    System.out.println("Sat");

                case 7:
                    System.out.println("Sun");

                default:
                    System.out.println("Not Allowed");


            }
        }
    }


