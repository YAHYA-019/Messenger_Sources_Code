package X;

import com.google.common.collect.ComparatorOrdering;
import com.google.common.collect.ImmutableList;
import java.util.Collection;
import java.util.List;

/* renamed from: X.5ng, reason: invalid class name */
/* loaded from: 5ng.class */
public final class C5ng {
    public final ImmutableList A00;
    public final ImmutableList A01;
    public final ImmutableList A02;
    public static final C1zA A04 = new ComparatorOrdering(new Object());
    public static final C1zA A03 = new ComparatorOrdering(new Object());

    public C5ng() {
        this(1BK.A0b());
    }

    public C5ng(List list) {
        ImmutableList copyOf = ImmutableList.copyOf((Collection) list);
        11T.A0A(copyOf);
        this.A00 = copyOf;
        ImmutableList sortedCopyOf = ImmutableList.sortedCopyOf(A04, list);
        11T.A0A(sortedCopyOf);
        this.A02 = sortedCopyOf;
        ImmutableList sortedCopyOf2 = ImmutableList.sortedCopyOf(A03, list);
        11T.A0A(sortedCopyOf2);
        this.A01 = sortedCopyOf2;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof C5ng)) {
                return false;
            }
            C5ng c5ng = (C5ng) obj;
            if (!11T.A0O(this.A02, c5ng.A02) || !11T.A0O(this.A01, c5ng.A01)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return 1BK.A03(this.A01, 1BL.A03(this.A02));
    }
}
