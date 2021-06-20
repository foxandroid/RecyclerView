package com.example.recyclerview;

public class News {

    String heading;
    String newsBrief;
    int titleImage;
    boolean visibility;

    public News(String heading, String newsBrief, int titleImage) {
        this.heading = heading;
        this.newsBrief = newsBrief;
        this.titleImage = titleImage;
        this.visibility = false;
    }

    public boolean isVisibility() {
        return visibility;
    }

    public void setVisibility(boolean visibility) {
        this.visibility = visibility;
    }
}
