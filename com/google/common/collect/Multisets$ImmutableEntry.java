package com.google.common.collect;

import X.1Fg;
import X.C5ps;
import java.io.Serializable;

/* loaded from: Multisets$ImmutableEntry.class */
public class Multisets$ImmutableEntry extends C5ps implements Serializable {
    public static final long serialVersionUID = 0;
    public final int count;
    public final Object element;

    public Multisets$ImmutableEntry(Object obj, int i) {
        this.element = obj;
        this.count = i;
        1Fg.A00(i, "count");
    }
}
