package X;

import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.2mZ, reason: invalid class name */
/* loaded from: 2mZ.class */
public abstract class C2mZ {
    public static final C2m7 A00(2Z6 r301) {
        C2m7 c2m7;
        RecyclerView recyclerView = r301.A04;
        if (!(recyclerView instanceof C2m7) || (c2m7 = (C2m7) recyclerView) == null) {
            throw AnonymousClass001.A0N("RecyclerView not found, it should not be removed from SwipeRefreshLayout");
        }
        return c2m7;
    }

    public static final void A01(2N3 r301, 2NI r302, C2k6 c2k6, 2Z6 r304, Integer num, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10) {
        C2m7 A00 = A00(r304);
        A00.setContentDescription(null);
        A00.A0T = z;
        A00.setClipToPadding(z2);
        r304.setClipToPadding(z2);
        A00.setPaddingRelative(i, i2, i3, i4);
        A00.setClipChildren(z3);
        r304.setClipChildren(z3);
        A00.setNestedScrollingEnabled(z4);
        r304.setNestedScrollingEnabled(z4);
        A00.setScrollBarStyle(0);
        A00.setHorizontalFadingEdgeEnabled(z5);
        A00.setVerticalFadingEdgeEnabled(z6);
        A00.A02 = z7;
        A00.A03 = z8;
        A00.A04 = z9;
        A00.A01 = z10;
        A00.setFadingEdgeLength(C2lu.A01(c2k6.B7k(), Double.doubleToRawLongBits(i5)));
        A00.setId(i6);
        A00.setOverScrollMode(i7);
        if (r301 != null) {
            A00.A18(r301);
        }
        if (num != null) {
            r304.A0A.setBackgroundColor(num.intValue());
        }
        r304.A09(i8);
        RecyclerView recyclerView = r304.A04;
        r304.A00 = recyclerView.A0E;
        recyclerView.A1A(r302);
    }

    public static final void A02(2N3 r301, 3wX r302, 2Z6 r303, Integer num) {
        C2m7 A00 = A00(r303);
        A00.setId(-1);
        if (num != null) {
            r303.A0A.setBackgroundColor(-328966);
        }
        if (r301 != null) {
            A00.A18(r303.A03);
        }
        if (r302 != null) {
            r302.A05((RecyclerView) null);
        }
        r303.A04.A1A(r303.A00);
        r303.A00 = null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0024, code lost:
    
        if (r308 == null) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void A03(X.2Nv r301, X.3wX r302, X.3xS r303, X.C2ky r304, X.2Z6 r305, X.3xT r306, java.util.List r307, final X.C00m r308, boolean r309) {
        /*
            Method dump skipped, instructions count: 255
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2mZ.A03(X.2Nv, X.3wX, X.3xS, X.2ky, X.2Z6, X.3xT, java.util.List, X.00m, boolean):void");
    }
}
