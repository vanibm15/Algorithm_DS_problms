package com.bridgelabz;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CustomMessage {
    String name ="<<name>>";
    String mobileNumber="bbbbbbbbbb";
    String fullName ="<<fullname>>";
    String date ="dd/mm/yyyy";

    String message;
    public void firstName(String input) {
        Pattern pattern = Pattern.compile(name);
        Matcher matcher = pattern.matcher(input);
        message = matcher.replaceAll("vani");
    }
    public void fullName(String input) {
        Pattern pattern = Pattern.compile(fullName);
        Matcher matcher = pattern.matcher(message);
        message = matcher.replaceAll("vanishree b");
    }
    public void mobileNumber(String input) {
        Pattern pattern = Pattern.compile(mobileNumber);
        Matcher matcher = pattern.matcher(message);
        message = matcher.replaceAll("1234567898");
    }
    public void date(String input) {
        DateTimeFormatter presentDate = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDateTime localDate = LocalDateTime.now();

        Pattern pattern = Pattern.compile(date);
        Matcher matcher = pattern.matcher(message);
        message = matcher.replaceAll(presentDate.format(localDate));
    }

    public void displayMessage() {
        System.out.println(message);
    }

    public static void main(String[] args) {
        CustomMessage customize = new CustomMessage();
        String input = "Hello <<name>>,We have Your  fullname as <<fullname>> in our system . Your mob number is 91-bbbbbbbbbb."
                +"\nPlease let us know in case of any clarification. Thankyou Bridgelabz your details ,15/05/2022.";
        customize.firstName(input);
        customize.fullName(input);
        customize.mobileNumber(input);
        customize.date(input);
        customize.displayMessage();
    }
}
