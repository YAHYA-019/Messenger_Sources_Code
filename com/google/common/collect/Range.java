package com.google.common.collect;

import X.0Pz;
import X.1BK;
import X.1BL;
import X.AnonymousClass001;
import X.C1zA;
import X.GOp;
import X.JQx;
import X.JQy;
import com.google.common.base.Preconditions;
import com.google.common.base.Predicate;
import com.google.common.collect.Cut;
import java.io.Serializable;

/* loaded from: Range.class */
public final class Range extends RangeGwtSerializationDependencies implements Predicate, Serializable {
    public static final Range A00 = new Range(Cut.BelowAll.A00, Cut.AboveAll.A00);
    public static final long serialVersionUID = 0;
    public final Cut lowerBound;
    public final Cut upperBound;

    /* loaded from: Range$RangeLexOrdering.class */
    public class RangeLexOrdering extends C1zA implements Serializable {
        public static final C1zA A00 = new Object();
        public static final long serialVersionUID = 0;
    }

    public Range(Cut cut, Cut cut2) {
        cut.getClass();
        this.lowerBound = cut;
        cut2.getClass();
        this.upperBound = cut2;
        if (cut.A00(cut2) > 0 || cut == Cut.AboveAll.A00 || cut2 == Cut.BelowAll.A00) {
            StringBuilder A0l = AnonymousClass001.A0l(16);
            cut.A04(A0l);
            A0l.append("..");
            cut2.A05(A0l);
            throw 0Pz.A05("Invalid range: ", A0l.toString());
        }
    }

    public static Range A00(BoundType boundType, Comparable comparable) {
        int ordinal = boundType.ordinal();
        if (ordinal == 0) {
            comparable.getClass();
            return new Range(new Cut(comparable), Cut.AboveAll.A00);
        }
        if (ordinal != 1) {
            throw JQx.A0m();
        }
        comparable.getClass();
        return new Range(new Cut(comparable), Cut.AboveAll.A00);
    }

    public static Range A01(BoundType boundType, Comparable comparable) {
        int ordinal = boundType.ordinal();
        if (ordinal == 0) {
            Cut.BelowAll belowAll = Cut.BelowAll.A00;
            comparable.getClass();
            return new Range(belowAll, new Cut(comparable));
        }
        if (ordinal != 1) {
            throw JQx.A0m();
        }
        Cut.BelowAll belowAll2 = Cut.BelowAll.A00;
        comparable.getClass();
        return new Range(belowAll2, new Cut(comparable));
    }

    public Range A02(Range range) {
        Cut cut;
        Cut cut2;
        int A002 = this.lowerBound.A00(range.lowerBound);
        int A003 = this.upperBound.A00(range.upperBound);
        if (A002 < 0) {
            if (A003 < 0) {
                cut = range.lowerBound;
                cut2 = this.upperBound;
                Preconditions.checkArgument(GOp.A1U(cut.A00(cut2)), "intersection is undefined for disconnected ranges %s and %s", this, range);
                range = new Range(cut, cut2);
            }
            return range;
        }
        if (A003 <= 0) {
            return this;
        }
        if (A002 > 0) {
            cut = this.lowerBound;
            cut2 = range.upperBound;
            Preconditions.checkArgument(GOp.A1U(cut.A00(cut2)), "intersection is undefined for disconnected ranges %s and %s", this, range);
            range = new Range(cut, cut2);
        }
        return range;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0029, code lost:
    
        if (r301.upperBound.A06(r0) != false) goto L6;
     */
    @Override // com.google.common.base.Predicate
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* bridge */ /* synthetic */ boolean apply(java.lang.Object r302) {
        /*
            r301 = this;
            r0 = r302
            java.lang.Comparable r0 = (java.lang.Comparable) r0
            r302 = r0
            r0 = r302
            java.lang.Class r0 = r0.getClass()
            r0 = r301
            com.google.common.collect.Cut r0 = r0.lowerBound
            r303 = r0
            r0 = r303
            r1 = r302
            boolean r0 = r0.A06(r1)
            r304 = r0
            r0 = r304
            if (r0 == 0) goto L2c
            r0 = r301
            com.google.common.collect.Cut r0 = r0.upperBound
            r303 = r0
            r0 = r303
            r1 = r302
            boolean r0 = r0.A06(r1)
            r305 = r0
            r0 = 1
            r304 = r0
            r0 = r305
            if (r0 == 0) goto L30
        L2c:
            r0 = 0
            r304 = r0
            r0 = 0
            r303 = r0
        L30:
            r0 = r304
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.common.collect.Range.apply(java.lang.Object):boolean");
    }

    @Override // com.google.common.base.Predicate
    public boolean equals(Object obj) {
        boolean z = false;
        if (obj instanceof Range) {
            Range range = (Range) obj;
            if (this.lowerBound.equals(range.lowerBound)) {
                z = JQy.A1Z(this.upperBound, range.upperBound);
            }
        }
        return z;
    }

    public int hashCode() {
        return 1BK.A03(this.upperBound, 1BL.A03(this.lowerBound));
    }

    public Object readResolve() {
        Range range = A00;
        return equals(range) ? range : this;
    }

    public String toString() {
        Cut cut = this.lowerBound;
        Cut cut2 = this.upperBound;
        StringBuilder A0l = AnonymousClass001.A0l(16);
        cut.A04(A0l);
        A0l.append("..");
        cut2.A05(A0l);
        return A0l.toString();
    }
}
