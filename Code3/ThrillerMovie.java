package com.assignment5;

public class ThrillerMovie extends Movie{
    //3. Create hierarchy from Movie class with Child classes of different genre movies like
    // RomComMovie, ThrillerMovie, etc. Demonstrate polymorphism using them.
    String title;
    double hours;
    ThrillerMovie(String title,double hours){
        super(title,hours);
    }

    @Override
    public String describe() {
        return super.describe()+" It is a Thriller Movie.";
    }
}
