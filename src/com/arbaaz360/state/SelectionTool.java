package com.arbaaz360.state;

import java.net.SocketOption;

public class SelectionTool implements Tool {

    @Override
    public void mouseDown() {
        System.out.println("Selection icon");
    }

    @Override
    public void mouseUp() {
        System.out.println("made a section");
    }
}
