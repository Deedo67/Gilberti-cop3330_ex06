package MPE6.example;

import java.util.Scanner;
import java.util.Calendar;

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

        //date
        int year = Calendar.getInstance().get(Calendar.YEAR);

        //Inputs
        System.out.print("What is your current age? ");
        String firAge = in.nextLine();
        System.out.print("At what age would you like to retire? ");
        String secAge = in.nextLine();

        //String convert
        int firInt =Integer.parseInt(firAge);
        int secInt =Integer.parseInt(secAge);

        //math
        int ret = secInt - firInt;
        int retYear = year + ret;

        //Output string
        String outputString = "You have " + ret + " years left until you can retire.\nIt's " + year + ", so you can retire in " + retYear + ".";

        //Output
        System.out.println(outputString);
    }
    //main method end
}
//class end
