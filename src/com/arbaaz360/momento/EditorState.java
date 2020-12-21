package com.arbaaz360.momento;

import java.time.LocalDateTime;
import java.util.Date;

public class EditorState {
    private final String content;
    private final Date createdOn;

    public EditorState(String content) {
        this.content = content;
        this.createdOn = new Date();
    }

    public String getContent() {
        return content;
    }
}
