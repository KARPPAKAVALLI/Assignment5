package com.assignment5;

public class MovieDemo {
    //3. Create hierarchy from Movie class with Child classes of different genre movies like
    // RomComMovie, ThrillerMovie, etc. Demonstrate polymorphism using them.
    public static void main(String[] args) {
        Movie m=new Movie("Spider-Man",3);
        ThrillerMovie t=new ThrillerMovie("Haunted Mansion",2.5);
        RomComMovie r=new RomComMovie("The Holiday",2.45);

        System.out.println(m.describe());
        System.out.println(t.describe());
        System.out.println(r.describe());

        m=new ThrillerMovie("Haunted Mansion",2.5);
        System.out.println(m.describe());

        m=new RomComMovie("The Holiday",2.45);
        System.out.println(m.describe());
    }
}
