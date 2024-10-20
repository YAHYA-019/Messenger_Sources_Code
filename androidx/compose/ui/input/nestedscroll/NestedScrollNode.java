package androidx.compose.ui.input.nestedscroll;

import X.L5f;
import X.LE0;
import X.LPR;
import X.MJy;
import X.MNa;

/* loaded from: NestedScrollNode.class */
public final class NestedScrollNode extends LPR implements MNa, MJy {
    public NestedScrollDispatcher A00;
    public MJy A01;
    public final Object A02 = "androidx.compose.ui.input.nestedscroll.NestedScrollNode";

    public NestedScrollNode(MJy mJy, NestedScrollDispatcher nestedScrollDispatcher) {
        this.A01 = mJy;
        this.A00 = nestedScrollDispatcher;
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x001b, code lost:
    
        if (r303 == null) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final X.2aI A00(androidx.compose.ui.input.nestedscroll.NestedScrollNode r301) {
        /*
            r0 = r301
            boolean r0 = r0.A08
            r302 = r0
            r0 = r302
            if (r0 == 0) goto L1e
            r0 = r301
            X.MNa r0 = X.L5f.A01(r0)
            androidx.compose.ui.input.nestedscroll.NestedScrollNode r0 = (androidx.compose.ui.input.nestedscroll.NestedScrollNode) r0
            r303 = r0
            r0 = r303
            if (r0 == 0) goto L1e
            r0 = r303
            X.2aI r0 = A00(r0)
            r303 = r0
            r0 = r303
            if (r0 != 0) goto L30
        L1e:
            r0 = r301
            androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher r0 = r0.A00
            X.2aI r0 = r0.A02
            r303 = r0
            r0 = r303
            if (r0 != 0) goto L30
            java.lang.String r0 = "in order to access nested coroutine scope you need to attach dispatcher to the `Modifier.nestedScroll` first."
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0N(r0)
            throw r0
        L30:
            r0 = r303
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.input.nestedscroll.NestedScrollNode.A00(androidx.compose.ui.input.nestedscroll.NestedScrollNode):X.2aI");
    }

    @Override // X.MNa
    public Object BGy() {
        return "androidx.compose.ui.input.nestedscroll.NestedScrollNode";
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x005f  */
    @Override // X.MJy
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object CCy(X.0DR r302, long r303, long r305) {
        /*
            Method dump skipped, instructions count: 386
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.input.nestedscroll.NestedScrollNode.CCy(X.0DR, long, long):java.lang.Object");
    }

    @Override // X.MJy
    public long CD2(long j, long j2, int i) {
        NestedScrollNode nestedScrollNode;
        long CD2 = this.A01.CD2(j, j2, i);
        return LE0.A04(CD2, (!((LPR) this).A08 || (nestedScrollNode = (NestedScrollNode) L5f.A01(this)) == null) ? 0L : nestedScrollNode.CD2(LE0.A04(j, CD2), LE0.A03(j2, CD2), i));
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0150, code lost:
    
        if (r310 == r0) goto L30;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00a2  */
    @Override // X.MJy
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object CD6(X.0DR r302, long r303) {
        /*
            Method dump skipped, instructions count: 366
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.input.nestedscroll.NestedScrollNode.CD6(X.0DR, long):java.lang.Object");
    }

    @Override // X.MJy
    public long CD7(long j, int i) {
        NestedScrollNode nestedScrollNode;
        long CD7 = (!((LPR) this).A08 || (nestedScrollNode = (NestedScrollNode) L5f.A01(this)) == null) ? 0L : nestedScrollNode.CD7(j, i);
        return LE0.A04(CD7, this.A01.CD7(LE0.A03(j, CD7), i));
    }
}
