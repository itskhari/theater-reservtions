package com.pluralsight;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import java.util.regex.Pattern;

public class TheaterReservationsApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Please enter your name: ");
        String name = sc.nextLine().trim();

        System.out.print("What date will you be attending? MM/dd/yyyy: ");
        String date = sc.nextLine().trim();

        System.out.print("How many tickets?: ");
        int ticketqty = sc.nextInt();

        String[] username = name.split(Pattern.quote(" "));
        String first = username[0];
        String last = username[1];

        DateTimeFormatter format = DateTimeFormatter.ofPattern("MM/dd/yyyy");

        LocalDate today = LocalDate.parse(date,format);

        if (ticketqty == 1) {
            System.out.println(ticketqty + " ticket reserved for " + date + " under " + last + ", " + first);
        }else {
            System.out.println(ticketqty + " tickets reserved for " + date + " under " + last + ", " + first);
        }

    }
}
