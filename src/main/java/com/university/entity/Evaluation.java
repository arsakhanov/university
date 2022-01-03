package com.university.entity;

public enum Evaluation {
    two(2),
    three(3),
    four(4),
    five(5);

    Object myItem;

    Evaluation(Object myItem) {
        this.myItem = myItem;
    }

    public static Evaluation customValueOf(Object value) {
        for(Evaluation v : values())
            if(v.myItem.equals(value)) return v;
        throw new IllegalArgumentException();
    }
}
