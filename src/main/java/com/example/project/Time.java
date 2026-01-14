package com.example.project;

public class Time{
    //PRIVATE INSTANCE VARIABLES HERE
    private int hour;
    private int minute;
    private int seconds;
    

    //CONSTRUCTOR HERE 
    //constructure should take in 3 parameters (int hour, int minute, int seconds)

    public Time(int hour, int minute, int seconds){
        this.hour =  hour;
        this.minute =  minute;
        this.seconds =   seconds;
      
    }

    //GETTERS 
 

    public String info(){
        String hr;
        String mt;
        String sn;

        if (hour < 10){
            hr = "0" + hour;
        } else {
            hr = "" + hour;
        }
        if (minute < 10){
            mt = "0" + minute;
        } else {
            mt = "" + minute;
        }
        if (seconds < 10){
            sn = "0" + seconds;
        } else {
            sn = "" + seconds;
        }



        return hr + ":" + mt + ":" + sn;
    }


    public void tick(){
       seconds += 1;
      if (seconds == 60){
        seconds = 0;
        minute += 1;
        if (minute == 60){
            minute = 0;
            hour += 1;
            if (hour == 24){
                hour = 0;
            }
        }
      }
            
        
      
    }


    public void add(Time time2){
       hour += time2.hour;
       minute += time2.minute;
       seconds += time2.seconds;
        
       if (seconds >= 60){
        minute += seconds / 60;
        seconds %= 60;
       }
       if (minute >= 60) {
        hour += minute / 60;
        minute %= 60;
       }


       if (hour >= 24){
        hour %= 24;
       }
    }
}

