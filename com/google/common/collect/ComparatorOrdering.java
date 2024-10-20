package com.google.common.collect;

import X.C1zA;
import java.io.Serializable;
import java.util.Comparator;

/* loaded from: ComparatorOrdering.class */
public final class ComparatorOrdering extends C1zA implements Serializable {
    public static final long serialVersionUID = 0;
    public final Comparator comparator;

    public ComparatorOrdering(Comparator comparator) {
        comparator.getClass();
        this.comparator = comparator;
    }

    @Override // java.util.Comparator
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ComparatorOrdering) {
            return this.comparator.equals(((ComparatorOrdering) obj).comparator);
        }
        return false;
    }

    public int hashCode() {
        return this.comparator.hashCode();
    }

    public String toString() {
        return this.comparator.toString();
    }
}
