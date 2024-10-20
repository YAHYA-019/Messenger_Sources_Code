package com.google.common.collect;

import X.AnonymousClass001;
import X.GOp;
import X.JR0;
import com.google.common.base.Objects;
import com.google.common.base.Preconditions;
import java.io.Serializable;
import java.util.Comparator;

/* loaded from: GeneralRange.class */
public final class GeneralRange implements Serializable {
    public final Comparator comparator;
    public final boolean hasLowerBound;
    public final boolean hasUpperBound;
    public final BoundType lowerBoundType;
    public final Object lowerEndpoint;
    public final BoundType upperBoundType;
    public final Object upperEndpoint;

    public GeneralRange(BoundType boundType, BoundType boundType2, Object obj, Object obj2, Comparator comparator, boolean z, boolean z2) {
        comparator.getClass();
        this.comparator = comparator;
        this.hasLowerBound = z;
        this.hasUpperBound = z2;
        this.lowerEndpoint = obj;
        boundType.getClass();
        this.lowerBoundType = boundType;
        this.upperEndpoint = obj2;
        boundType2.getClass();
        this.upperBoundType = boundType2;
        if (z) {
            comparator.compare(obj, obj);
        }
        if (z2) {
            comparator.compare(obj2, obj2);
        }
        if (z && z2) {
            int compare = comparator.compare(obj, obj2);
            boolean z3 = true;
            Preconditions.checkArgument(GOp.A1U(compare), "lowerEndpoint (%s) > upperEndpoint (%s)", obj, obj2);
            if (compare == 0) {
                BoundType boundType3 = BoundType.OPEN;
                if (boundType == boundType3 && boundType2 == boundType3) {
                    z3 = false;
                }
                Preconditions.checkArgument(z3);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0100, code lost:
    
        if (r302.upperBoundType == com.google.common.collect.BoundType.OPEN) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x013b, code lost:
    
        if (r302.lowerBoundType == com.google.common.collect.BoundType.OPEN) goto L5;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0058  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.google.common.collect.GeneralRange A00(com.google.common.collect.GeneralRange r302) {
        /*
            Method dump skipped, instructions count: 321
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.common.collect.GeneralRange.A00(com.google.common.collect.GeneralRange):com.google.common.collect.GeneralRange");
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0013, code lost:
    
        if (A02(r302) != false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean A01(java.lang.Object r302) {
        /*
            r301 = this;
            r0 = r301
            r1 = r302
            boolean r0 = r0.A03(r1)
            r303 = r0
            r0 = r303
            if (r0 != 0) goto L16
            r0 = r301
            r1 = r302
            boolean r0 = r0.A02(r1)
            r304 = r0
            r0 = 1
            r303 = r0
            r0 = r304
            if (r0 == 0) goto L18
        L16:
            r0 = 0
            r303 = r0
        L18:
            r0 = r303
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.common.collect.GeneralRange.A01(java.lang.Object):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0032, code lost:
    
        if (r0 != 0) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean A02(java.lang.Object r302) {
        /*
            r301 = this;
            r0 = r301
            boolean r0 = r0.hasUpperBound
            r303 = r0
            r0 = 0
            r304 = r0
            r0 = r303
            if (r0 != 0) goto Ld
            r0 = 0
            return r0
        Ld:
            r0 = r301
            java.lang.Object r0 = r0.upperEndpoint
            r305 = r0
            r0 = r301
            java.util.Comparator r0 = r0.comparator
            r306 = r0
            r0 = r306
            r1 = r302
            r2 = r305
            int r0 = r0.compare(r1, r2)
            r303 = r0
            r0 = 1
            r307 = r0
            r0 = r303
            if (r0 > 0) goto L35
            r0 = 0
            r307 = r0
            r0 = 1
            r308 = r0
            r0 = r303
            if (r0 == 0) goto L38
        L35:
            r0 = 0
            r308 = r0
        L38:
            r0 = r301
            com.google.common.collect.BoundType r0 = r0.upperBoundType
            r305 = r0
            com.google.common.collect.BoundType r0 = com.google.common.collect.BoundType.OPEN
            r306 = r0
            r0 = r305
            r1 = r306
            if (r0 != r1) goto L4c
            r0 = 1
            r304 = r0
        L4c:
            r0 = r308
            r1 = r304
            r0 = r0 & r1
            r1 = r307
            r0 = r0 | r1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.common.collect.GeneralRange.A02(java.lang.Object):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0032, code lost:
    
        if (r0 != 0) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean A03(java.lang.Object r302) {
        /*
            r301 = this;
            r0 = r301
            boolean r0 = r0.hasLowerBound
            r303 = r0
            r0 = 0
            r304 = r0
            r0 = r303
            if (r0 != 0) goto Ld
            r0 = 0
            return r0
        Ld:
            r0 = r301
            java.lang.Object r0 = r0.lowerEndpoint
            r305 = r0
            r0 = r301
            java.util.Comparator r0 = r0.comparator
            r306 = r0
            r0 = r306
            r1 = r302
            r2 = r305
            int r0 = r0.compare(r1, r2)
            r303 = r0
            r0 = 1
            r307 = r0
            r0 = r303
            if (r0 < 0) goto L35
            r0 = 0
            r307 = r0
            r0 = 1
            r308 = r0
            r0 = r303
            if (r0 == 0) goto L38
        L35:
            r0 = 0
            r308 = r0
        L38:
            r0 = r301
            com.google.common.collect.BoundType r0 = r0.lowerBoundType
            r305 = r0
            com.google.common.collect.BoundType r0 = com.google.common.collect.BoundType.OPEN
            r306 = r0
            r0 = r305
            r1 = r306
            if (r0 != r1) goto L4c
            r0 = 1
            r304 = r0
        L4c:
            r0 = r308
            r1 = r304
            r0 = r0 & r1
            r1 = r307
            r0 = r0 | r1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.common.collect.GeneralRange.A03(java.lang.Object):boolean");
    }

    public boolean equals(Object obj) {
        boolean z = false;
        if (obj instanceof GeneralRange) {
            GeneralRange generalRange = (GeneralRange) obj;
            if (this.comparator.equals(generalRange.comparator) && this.hasLowerBound == generalRange.hasLowerBound && this.hasUpperBound == generalRange.hasUpperBound && this.lowerBoundType.equals(generalRange.lowerBoundType) && this.upperBoundType.equals(generalRange.upperBoundType) && Objects.equal(this.lowerEndpoint, generalRange.lowerEndpoint) && Objects.equal(this.upperEndpoint, generalRange.upperEndpoint)) {
                z = true;
            }
        }
        return z;
    }

    public int hashCode() {
        return JR0.A0O(this.comparator, this.lowerEndpoint, this.lowerBoundType, this.upperEndpoint, this.upperBoundType);
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append(this.comparator);
        A0k.append(":");
        BoundType boundType = this.lowerBoundType;
        BoundType boundType2 = BoundType.CLOSED;
        char c = '(';
        if (boundType == boundType2) {
            c = '[';
        }
        A0k.append(c);
        A0k.append(this.hasLowerBound ? this.lowerEndpoint : "-∞");
        A0k.append(',');
        A0k.append(this.hasUpperBound ? this.upperEndpoint : "∞");
        char c2 = ')';
        if (this.upperBoundType == boundType2) {
            c2 = ']';
        }
        return AnonymousClass001.A0g(A0k, c2);
    }
}
