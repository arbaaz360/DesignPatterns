package com.arbaaz360;

import com.arbaaz360.momento.Editor;
import com.arbaaz360.momento.History;
import com.arbaaz360.state.Brush;
import com.arbaaz360.state.Canvas;

import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        var canvas = new Canvas();
        canvas.setCurrentTool(new Brush());
        canvas.mouseDown();
        canvas.mouseUp();
    }
}


//        Editor editor = new Editor();
//        History history = new History();
//        editor.setContent("a");
//        history.push(editor.createState());
//        editor.setContent("b");
//        history.push(editor.createState());
//        editor.setContent("c");
//        history.push(editor.createState());
//        editor.restore(history.pop());
//        System.out.println(editor.getContent());