package com.assignment5;

public class Movie {
    //3. Create hierarchy from Movie class with Child classes of different genre movies like
    // RomComMovie, ThrillerMovie, etc. Demonstrate polymorphism using them.
    String title;
    double hours;
    Movie(String title,double hours){
        this.title=title;
        this.hours=hours;
    }
    public String describe(){
        return "The movie " + title + " is " + hours + " hours long.";
    }
}
