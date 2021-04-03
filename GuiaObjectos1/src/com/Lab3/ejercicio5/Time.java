package com.Lab3.ejercicio5;

public class Time {
    private int hour;
    private int minute;
    private int second;

    public Time() {
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        this.second = second;
    }

    public boolean verifyHourNumber(int hour){
        boolean flag = true;
        if(hour<0 || hour>23){
            flag = false;
            System.out.println("The number must be between 0 and 23");
        }
        return flag;
    }

    public boolean verifyMinuteSecondNumber(int number){
        boolean flag = true;
        if(number<0 || number>59){
            flag = false;
            System.out.println("The number must be between 0 and 59");
        }
        return flag;
    }

    public void printTimeData(){
        System.out.println("[Time] "+this.hour+":"+this.minute+":"+this.second);
    }

}
