package com.herokuapp.models;

import java.util.List;

public class EditorOptionModel {
    private String content;
    private String size;
    private String source;
    private String color;
    private String alignment;

    public EditorOptionModel(List<String> listEditor) {
        this.content = listEditor.get(0);
        this.size = listEditor.get(1);
        this.source = listEditor.get(2);
        this.color = listEditor.get(3);
        this.alignment = listEditor.get(4);
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setAlignment(String alignment) {
        this.alignment = alignment;
    }

    public String getContent() {
        return content;
    }

    public String getSize() {
        return size;
    }

    public String getSource() {
        return source;
    }

    public String getColor() {
        return color;
    }

    public String getAlignment() {
        return alignment;
    }
}
