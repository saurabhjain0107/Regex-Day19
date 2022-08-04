package com.bridgelabz;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {
    public void isFirstName() {
        Pattern pattern = Pattern.compile("^[A-Z][a-z]{2,}");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first name :");
        String FirstName = sc.nextLine();
        Matcher matcher = pattern.matcher(FirstName);
        if (matcher.matches()) {
            System.out.println("First name is valid : ");
        }
        else {
            System.out.println("First name is Invalid : ");

        }
    }
    public  void IsLastName(){
        Pattern pattern = Pattern.compile("^[A-Z][a-z]{2,}");
        Scanner sc = new Scanner(System.in);
        System.out.println("enter last name :");
        String lastname = sc.nextLine();
        Matcher matcher = pattern.matcher(lastname);
        if(matcher.matches()){
            System.out.println("last name in valid : ");
        }
        else{
            System.out.println("last name is Invalid : ");
        }
    }
    public void ValidEmailId(){
        Pattern pattern = Pattern.compile("^[a-z]*.[a-z 0-9]+@[a-z 0-9]+.[a-z]{2,3}(.[a-z]{2,3})*$");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Email id :");
        String email = sc.nextLine();
        Matcher matcher = pattern.matcher(email);
        if(matcher.matches()){
            System.out.println("Valid Email Id");
        }
        else {
            System.out.println("Invalid Email Id");
        }
    }
    public  void isMobileNumber(){
        Pattern pattern = Pattern.compile("^[9][1]\s[6-9][0-9]{9}$");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Mobile number with country code :");
        String phoneNumber = sc.nextLine();
        Matcher matcher = pattern.matcher(phoneNumber);
        if(matcher.matches()){
            System.out.println("phone number is valid :");
        }
        else{
            System.out.println("phone number is Invalid :");
        }
    }
    public void isUserPassword(){
        Pattern pattern = Pattern.compile("^(?=.*[A-Z])(?=.*[a-z])(?=.*[0-9])(?=.*[@#$%^&+=]).{8,}$");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter User Password :");
        String userPassword = sc.nextLine();
        Matcher matcher = pattern.matcher(userPassword);
        if(matcher.matches()){
            System.out.println("User Password is valid :");
        }
        else{
            System.out.println("User Password is Invalid :");
        }
    }

    public static void main(String[] args) {
        Regex obj = new Regex();
        obj.isFirstName();
        obj.IsLastName();
        obj.ValidEmailId();
        obj.isMobileNumber();
        obj.isUserPassword();

    }

}
