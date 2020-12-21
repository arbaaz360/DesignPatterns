package com.arbaaz360.momento;

import java.util.List;
import java.util.Stack;

public class Editor {
    private String content;

    public EditorState createState() {
        return new EditorState(content);
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void restore(EditorState editorState) {
        this.content = editorState.getContent();
    }
}
