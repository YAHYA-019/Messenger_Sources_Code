package com.google.common.collect;

import X.AnonymousClass001;
import X.C1zA;
import java.io.Serializable;

/* loaded from: ReverseOrdering.class */
public final class ReverseOrdering extends C1zA implements Serializable {
    public static final long serialVersionUID = 0;
    public final C1zA forwardOrder;

    public ReverseOrdering(C1zA c1zA) {
        this.forwardOrder = c1zA;
    }

    @Override // X.C1zA
    public C1zA A03() {
        return this.forwardOrder;
    }

    @Override // java.util.Comparator
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ReverseOrdering) {
            return this.forwardOrder.equals(((ReverseOrdering) obj).forwardOrder);
        }
        return false;
    }

    public int hashCode() {
        return -this.forwardOrder.hashCode();
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append(this.forwardOrder);
        return AnonymousClass001.A0d(".reverse()", A0k);
    }
}
