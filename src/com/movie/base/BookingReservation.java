package com.movie.base;

import com.movie.base.initialization.*;
//import com.movie.base.initialization.Payment.Payment;
import com.movie.base.initialization.Payment.Payment;
import com.movie.base.initialization.Payment.PaymentMode;

import java.math.BigDecimal;
import java.time.LocalTime;
import java.util.Date;
import java.util.Arrays;
import java.util.Scanner;

public class BookingReservation {
    static Movie movie = new Movie("TENET","2hours 30 mins","2020");
    static ScreenCapacity screenCapacity = new ScreenCapacity();
    static ShowTimings showtimings = new ShowTimings();
    static TicketPrices ticketprices = new TicketPrices();

    static PaymentMode paymentMode = new PaymentMode();


    public static void main(String[] args) {
        /*
        CAPACITY =100,
        SHOW TIMINGS,
        NOW PLAYING,
        TICKET PRICES,
        PAYMENT METHODS
         */
        //initialize the screen capacity to 100.
        initBookingCounter();
        Scanner s= new Scanner(System.in);
        System.out.println("---WELCOME TO MOVIEBUFF.COM---");
        String movieName = s.nextLine();
        System.out.println("Your Movieis:"+movie.getMovieName());
        LocalTime[] movieTimingsAvaliable = showtimings.getMovieTime();
        System.out.println("Avaliable Showtimes are:"+Arrays.toString(movieTimingsAvaliable));
        System.out.println("Select your time");

        System.out.println(Arrays.deepToString(screenCapacity.getScreenRows()));

        System.out.println("Select number Of Seats");
        String noOfSeats = s.nextLine();


        System.out.println("Each Ticket Price:"+ticketprices.getTickePrice());
        System.out.println("Enter your payment mode: CASH/CARD");
        System.out.println("Accepted payment type:"+paymentMode.getPaymentType().toString());
        String payment = s.nextLine();
        boolean paymentSuccess=false;
        for(int i=0;i<2;i++) {
            if (payment.equalsIgnoreCase(paymentMode.getPaymentType()[i].toString())) {
                System.out.println("Payment is Succesfull");
                paymentSuccess = true;
                break;
            }
        }
        System.out.println("your ticket confiemed");

    }
    public static void initBookingCounter() {

        screenCapacity.setScreenRows(initScreenCapacity(screenCapacity));

        showtimings.setMovieTime(new LocalTime[]{ LocalTime.parse("10:00"),LocalTime.parse("11:00"), LocalTime.parse("12:00"),LocalTime.parse("13:00")});




        ticketprices.setTickePrice(BigDecimal.valueOf(6.50));
        Payment[] payment= new Payment[2];
        payment[0]= Payment.Cash;
        payment[1] =Payment.Card;
        paymentMode.setPaymentType(payment);

    }
    public static ScreenRow[][]initScreenCapacity(ScreenCapacity screencapacity) {
        ScreenRow[][] screenRows = new ScreenRow[10][10];
        char c='A';
        for(int i=0;i<10;i++) {
            for(int j=0;j<10;j++) {
                screenRows[i][j] = new ScreenRow(c,""+j);

            }
            c++;
        }
        return screenRows;
    }
}
/*
//Solid Principles.
1. has to be single responsibility principle( Class should do only one thing.)
 */
