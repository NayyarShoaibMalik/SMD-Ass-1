package com.example.myapplication;

public class Model {
    int idu;
    char name;

    public Model(int idu, char name) {
        this.idu = idu;
        this.name = name;
    }

    public int getId() {
        return idu;
    }

    public void setId(int idu) {
        this.idu = idu;
    }

    public char getName() {
        return name;
    }

    public void setName(char name) {
        this.name = name;
    }
}
