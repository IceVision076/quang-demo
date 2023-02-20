package testRegularExpression;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;
import java.util.Scanner;

import java.time.LocalDate;
import java.time.Month;
import java.util.concurrent.ThreadLocalRandom;

/**
 *
 * @author quang
 */
public class RandomDates {

    public static void main(String[] args) {
        String format = "MMM dd/yyyy";
        SimpleDateFormat dateFormat = new SimpleDateFormat(format);
        String date = dateFormat.format(generateRandomDateOfBirth());
        System.out.println(generateRandomDateOfBirth());
        System.out.println(date);
    }

    public static Date generateRandomDateOfBirth() {
        Random random = new Random();
        Calendar calendar = Calendar.getInstance();

        // set the calendar to a random date between 1900 and 2003
        calendar.set(Calendar.YEAR, 1900 + random.nextInt(104));
        calendar.set(Calendar.MONTH, random.nextInt(12));
        calendar.set(Calendar.DAY_OF_MONTH, random.nextInt(31));

        return calendar.getTime();
    }


}
