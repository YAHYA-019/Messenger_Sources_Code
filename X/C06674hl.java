package X;

import java.io.Closeable;

/* renamed from: X.4hl, reason: invalid class name and case insensitive filesystem */
/* loaded from: 4hl.class */
public final class C06674hl extends C06684hm implements Closeable, 2Ib, InterfaceC06694hn {
    public 4hQ A00;
    public final 4hQ A01;
    public final C06664hk A02;
    public final 4hY A03;
    public final InterfaceC06604he A04;
    public final boolean A05;
    public final boolean A06;

    public C06674hl(4hQ r302, C06664hk c06664hk, 4hY r304) {
        11T.A0F(r304, 1);
        11T.A0F(r302, 3);
        this.A02 = c06664hk;
        this.A06 = true;
        this.A03 = r304;
        this.A04 = r304;
        this.A05 = c06664hk.A0Z != 0S2.A00;
        this.A01 = r302;
    }

    public static final void A00(C06664hk c06664hk, C06674hl c06674hl, Integer num) {
        11T.A0F(num, 0);
        c06674hl.A01.Bgh(c06664hk, num);
        4hQ r0 = c06674hl.A00;
        if (r0 != null) {
            r0.Bgh(c06664hk, num);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0164  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void A01(X.C06674hl r301) {
        /*
            Method dump skipped, instructions count: 385
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C06674hl.A01(X.4hl):void");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.A02.A01();
    }
}
