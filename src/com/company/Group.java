package com.company;

public enum Group {
    WORK("Работа"),
    FRIENDS("Друзья"),
    FAMILY("Семья");

    private String value;

    Group(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }
}
