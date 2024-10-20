package com.google.common.collect;

import X.AnonymousClass001;
import X.C1zA;
import java.io.Serializable;

/* loaded from: NullsLastOrdering.class */
public final class NullsLastOrdering extends C1zA implements Serializable {
    public static final long serialVersionUID = 0;
    public final C1zA ordering;

    public NullsLastOrdering(C1zA c1zA) {
        this.ordering = c1zA;
    }

    @Override // X.C1zA
    public C1zA A02() {
        return this;
    }

    @Override // X.C1zA
    public C1zA A03() {
        return this.ordering.A03().A01();
    }

    @Override // java.util.Comparator
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof NullsLastOrdering) {
            return this.ordering.equals(((NullsLastOrdering) obj).ordering);
        }
        return false;
    }

    public int hashCode() {
        return this.ordering.hashCode() ^ (-921210296);
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append(this.ordering);
        return AnonymousClass001.A0d(".nullsLast()", A0k);
    }
}
