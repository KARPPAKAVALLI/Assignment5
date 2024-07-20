package com.assignment5;

public class RomComMovie extends Movie{
    //3. Create hierarchy from Movie class with Child classes of different genre movies like
    // RomComMovie, ThrillerMovie, etc. Demonstrate polymorphism using them.
    String title;
    double hours;
    RomComMovie(String title,double hours){
        super(title,hours);
    }

    public String describe() {
        return super.describe()+" It is a RomCom movie.";
    }
}
