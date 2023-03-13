package com.movie.base.initialization;

public class ScreenCapacity {
    static int initialCapacity = 100 ;
    int numberOfSeatsBookes;
    int numberOfSeatsAvaliable;
    ScreenRow[][] screenRows;

    public ScreenRow[][] getScreenRows() {
        return screenRows;
    }

    public void setScreenRows(ScreenRow[][] screenRows) {
        this.screenRows = screenRows;
    }

}
/*
What if screenCapacity(initialCapacity) is some random number lyk let's say 2 x 2 or 3 x 3 or 4 x 4 ......(assume its a perfect square).
 */
