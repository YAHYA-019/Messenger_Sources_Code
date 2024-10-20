package com.google.common.collect;

import X.0Pz;
import X.C1zA;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Comparator;

/* loaded from: CompoundOrdering.class */
public final class CompoundOrdering extends C1zA implements Serializable {
    public static final long serialVersionUID = 0;
    public final Comparator[] comparators;

    public CompoundOrdering(Comparator comparator, Comparator comparator2) {
        this.comparators = new Comparator[]{comparator, comparator2};
    }

    @Override // X.C1zA, java.util.Comparator
    public int compare(Object obj, Object obj2) {
        int i = 0;
        while (true) {
            int i2 = i;
            Comparator[] comparatorArr = this.comparators;
            if (i2 >= comparatorArr.length) {
                return 0;
            }
            int compare = comparatorArr[i2].compare(obj, obj2);
            if (compare != 0) {
                return compare;
            }
            i = i2 + 1;
        }
    }

    @Override // java.util.Comparator
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof CompoundOrdering) {
            return Arrays.equals(this.comparators, ((CompoundOrdering) obj).comparators);
        }
        return false;
    }

    public int hashCode() {
        return Arrays.hashCode(this.comparators);
    }

    public String toString() {
        return 0Pz.A0j("Ordering.compound(", Arrays.toString(this.comparators), ")");
    }
}
