package org.message.model;

public class Message {
    private String text;

    private String from;
    private String to;

    public String getText() {
        return text;
    }

    public String getTo() {
        return to;
    }

    public String getFrom(){
        return from;
    }

    public void setTo(String to) {
        this.to = to;
    }
}
