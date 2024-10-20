package com.google.common.collect;

import X.C1zA;
import java.io.Serializable;

/* loaded from: NaturalOrdering.class */
public final class NaturalOrdering extends C1zA implements Serializable {
    public static final NaturalOrdering A02 = new Object();
    public static final long serialVersionUID = 0;
    public transient C1zA A00;
    public transient C1zA A01;

    private Object readResolve() {
        return A02;
    }

    @Override // X.C1zA
    public C1zA A01() {
        C1zA c1zA = this.A00;
        if (c1zA == null) {
            c1zA = new NullsFirstOrdering(this);
            this.A00 = c1zA;
        }
        return c1zA;
    }

    @Override // X.C1zA
    public C1zA A02() {
        C1zA c1zA = this.A01;
        if (c1zA == null) {
            c1zA = new NullsLastOrdering(this);
            this.A01 = c1zA;
        }
        return c1zA;
    }

    @Override // X.C1zA
    public C1zA A03() {
        return ReverseNaturalOrdering.A00;
    }

    @Override // X.C1zA, java.util.Comparator
    public /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        Comparable comparable = (Comparable) obj;
        comparable.getClass();
        obj2.getClass();
        return comparable.compareTo(obj2);
    }

    public String toString() {
        return "Ordering.natural()";
    }
}
