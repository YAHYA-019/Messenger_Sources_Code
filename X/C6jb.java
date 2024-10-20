package X;

import com.google.common.base.MoreObjects;

/* renamed from: X.6jb, reason: invalid class name */
/* loaded from: 6jb.class */
public final class C6jb extends 62R implements AnonymousClass624 {
    public static final C6jb A03;
    public static final C6jb A04;
    public static final C6jb A05;
    public static final C6jb A06;
    public static final C6jb A07;
    public static final C6jb A08;
    public static final C6jb A09;
    public static final C6jb A0A;
    public static final C6jb A0B;
    public final long A00;
    public final C62b A01;
    public final 63V A02;

    static {
        C62b c62b = C62b.A0E;
        63V r0 = 63V.A0K;
        A06 = new C6jb(c62b, r0);
        63V r02 = 63V.A0J;
        A07 = new C6jb(c62b, r02);
        63V r03 = 63V.A0I;
        A0A = new C6jb(c62b, r03);
        A03 = new C6jb(c62b, r0);
        A04 = new C6jb(c62b, r03);
        C62b c62b2 = C62b.A0F;
        A08 = new C6jb(c62b2, r0);
        A09 = new C6jb(c62b2, r02);
        A05 = new C6jb(c62b2, r03);
        A0B = new C6jb(c62b2, r03);
    }

    public C6jb(C62b c62b, 63V r303) {
        this.A01 = c62b;
        this.A02 = r303;
        this.A00 = 0J6.A01(C6jb.class, c62b, r303);
    }

    @Override // X.AnonymousClass626
    public long AsR() {
        return this.A00;
    }

    @Override // X.AnonymousClass624
    public C62b B8O() {
        return this.A01;
    }

    @Override // X.AnonymousClass624
    public boolean BVc(AnonymousClass624 anonymousClass624) {
        boolean z = false;
        if (anonymousClass624.getClass() == C6jb.class && this.A02 == ((C6jb) anonymousClass624).A02) {
            z = true;
        }
        return z;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x002b, code lost:
    
        if (r301.A00 != r302.AsR()) goto L6;
     */
    @Override // X.AnonymousClass624
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean BVk(X.AnonymousClass624 r302) {
        /*
            r301 = this;
            r0 = r301
            X.62b r0 = r0.A01
            r303 = r0
            r0 = r302
            X.62b r0 = r0.B8O()
            r304 = r0
            r0 = r303
            r1 = r304
            if (r0 != r1) goto L2e
            r0 = r301
            long r0 = r0.A00
            r305 = r0
            r0 = r302
            long r0 = r0.AsR()
            r307 = r0
            r0 = r305
            r1 = r307
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            r309 = r0
            r0 = 1
            r310 = r0
            r0 = r309
            if (r0 == 0) goto L33
        L2e:
            r0 = 0
            r310 = r0
            r0 = 0
            r304 = r0
        L33:
            r0 = r310
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C6jb.BVk(X.624):boolean");
    }

    public String toString() {
        MoreObjects.ToStringHelper stringHelper = MoreObjects.toStringHelper(C6jb.class);
        stringHelper.add("mId", this.A00);
        stringHelper.add("mRowType", this.A01);
        return 4YV.A0s(stringHelper, this.A02, "mRowViewType");
    }
}
