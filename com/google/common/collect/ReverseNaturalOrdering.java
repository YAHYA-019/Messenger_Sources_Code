package com.google.common.collect;

import X.C1zA;
import java.io.Serializable;

/* loaded from: ReverseNaturalOrdering.class */
public final class ReverseNaturalOrdering extends C1zA implements Serializable {
    public static final ReverseNaturalOrdering A00 = new Object();
    public static final long serialVersionUID = 0;

    private Object readResolve() {
        return A00;
    }

    @Override // X.C1zA
    public C1zA A03() {
        return NaturalOrdering.A02;
    }

    @Override // X.C1zA, java.util.Comparator
    public /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        Comparable comparable = (Comparable) obj2;
        obj.getClass();
        if (obj == comparable) {
            return 0;
        }
        return comparable.compareTo(obj);
    }

    public String toString() {
        return "Ordering.natural().reverse()";
    }
}
