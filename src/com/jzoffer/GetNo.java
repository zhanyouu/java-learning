package com.jzoffer;

public class GetNo {
    private static int sno = 0;
    static int getSno(){
        sno++;
        return sno;
    }
}
