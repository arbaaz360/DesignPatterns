package com.arbaaz360.state;


public class Brush implements Tool {
    @Override
    public void mouseDown() {
        System.out.println("brush clicked down");
    }

    @Override
    public void mouseUp() {
        System.out.println("painted a brush stroke");
    }
}
