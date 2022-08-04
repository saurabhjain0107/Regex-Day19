package com.bridgelabz;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {
    public void isFirstName(String FirstName) {
        Pattern pattern = Pattern.compile("^[A-Z][a-z]{2,}");
        Matcher matcher = pattern.matcher(FirstName);
        if (matcher.matches()) {
            System.out.println("First name is valid : ");
        }
        else {
            System.out.println("First name is Invalid : ");

        }
    }

    public static void main(String[] args) {
        Regex obj = new Regex();
        obj.isFirstName("Saurabh");

    }

}
