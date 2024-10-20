package com.google.common.collect;

import X.2Ix;
import java.io.Serializable;

/* loaded from: ImmutableEntry.class */
public class ImmutableEntry extends 2Ix implements Serializable {
    public static final long serialVersionUID = 0;
    public final Object key;
    public final Object value;

    public ImmutableEntry(Object obj, Object obj2) {
        this.key = obj;
        this.value = obj2;
    }

    public final Object getValue() {
        return this.value;
    }
}
