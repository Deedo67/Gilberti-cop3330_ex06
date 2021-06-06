package MPE6.example;

import java.util.Scanner;

/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Derek Gilberti
 */

//class begin
public class ex06 {
    //main method begin
    public static void main(String[] args) {
        //scanner
        Scanner in = new Scanner(System.in);

        //inputs
        System.out.print("What is your current age? ");
        String firAge = in.nextLine();
        System.out.print("What is your current age? ");
        String secAge = in.nextLine();

        //String convert
        int firInt =Integer.parseInt(firAge);
        int secInt =Integer.parseInt(secAge);

        //math
        int ret = secInt - firInt;

        //Output string
        String outputString = "You have " + ret + " years left until you can retire.";

        //Output
        System.out.println(outputString);
    }
    //main method end
}
//class end
