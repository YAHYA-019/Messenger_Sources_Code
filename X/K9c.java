package X;

import com.google.common.collect.Range;
import com.google.common.collect.RegularContiguousSet;

/* loaded from: K9c.class */
public final class K9c extends 3Co {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public K9c(RegularContiguousSet regularContiguousSet, Comparable comparable, int i) {
        Comparable A0k;
        this.A00 = i;
        this.A02 = regularContiguousSet;
        ((3Co) this).A00 = comparable;
        if (i != 0) {
            A0k = regularContiguousSet.range.lowerBound.A03();
            A0k.getClass();
        } else {
            A0k = JR1.A0k(regularContiguousSet);
        }
        this.A01 = A0k;
    }

    public /* bridge */ /* synthetic */ Object A00(Object obj) {
        int i;
        int i2 = this.A00;
        Comparable comparable = (Comparable) obj;
        Object obj2 = this.A01;
        if (i2 != 0) {
            if (obj2 != null) {
                Range range = Range.A00;
                if (comparable.compareTo(obj2) == 0) {
                    return null;
                }
            }
            int A03 = AnonymousClass001.A03(comparable);
            if (A03 == ((-1) << (-1))) {
                return null;
            }
            i = A03 - 1;
        } else {
            if (obj2 != null) {
                Range range2 = Range.A00;
                if (comparable.compareTo(obj2) == 0) {
                    return null;
                }
            }
            int A032 = AnonymousClass001.A03(comparable);
            if (A032 == ((-1) >>> 1)) {
                return null;
            }
            i = A032 + 1;
        }
        return Integer.valueOf(i);
    }
}
