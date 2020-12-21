package com.arbaaz360.momento;

import java.util.Stack;

public class History {
    private Stack<EditorState> states = new Stack<EditorState>();
    public void push(EditorState editorState) {
        states.push(editorState);
    }

    public EditorState pop() {
        states.pop();
        return states.peek();
    }
}
