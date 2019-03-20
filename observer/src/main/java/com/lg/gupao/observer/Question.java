package com.lg.gupao.observer;

/**
 * Created by Tom on 2019/3/17.
 */
public class Question {

    public Question() {

    }

    public Question(String userName, String content) {
        this.userName = userName;
        this.content = content;
    }

    private String userName;

    private String content;

    private String gperName;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getGperName() { return gperName; }

    public void setGperName(String gperName) { this.gperName = gperName; }

}
