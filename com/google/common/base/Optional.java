package com.google.common.base;

import java.io.Serializable;

/* loaded from: Optional.class */
public abstract class Optional implements Serializable {
    public static final long serialVersionUID = 0;

    public static Optional absent() {
        return Absent.INSTANCE;
    }

    public static Optional fromNullable(Object obj) {
        return obj == null ? Absent.INSTANCE : new Present(obj);
    }

    public static Optional of(Object obj) {
        obj.getClass();
        return new Present(obj);
    }

    public abstract boolean equals(Object obj);

    public abstract Object get();

    public abstract int hashCode();

    public abstract boolean isPresent();

    public abstract Object or(Object obj);

    public abstract Object orNull();

    public abstract String toString();
}
