package com.facebook.fury.context;

/* loaded from: StackExt.class */
public interface StackExt {
    int currentCapacity();

    boolean isEmpty();

    Object peek();

    Object pop();

    void push(Object obj);

    int size();
}
