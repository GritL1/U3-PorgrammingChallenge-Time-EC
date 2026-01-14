package com.example.project;

public class TimeRunner{
    public static void main(String[] args) {
        Time time4 = new Time(10, 14, 43);
        System.out.println(time4.info());
        

        Time time5 = new Time(8, 30, 29);
        time4.add(time5);
        System.out.println(time4.info());
    }
}