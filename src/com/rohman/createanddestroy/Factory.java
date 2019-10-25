package com.rohman.createanddestroy;

public class Factory {
    String title;

    public Factory(String title) {
        this.title = title;
    }

    public Factory newFactory(String title){
        return new Factory(title);
    }
}
