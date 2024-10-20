package X;

import android.content.Context;

/* renamed from: X.1a4, reason: invalid class name and case insensitive filesystem */
/* loaded from: 1a4.class */
public final class C00091a4 {
    public final Context A00;
    public final 04J A01;
    public final 1Ve A02;
    public final C1Z5 A03;
    public final C15h A04;
    public final C15h A05;
    public final C15h A06;
    public final C01i A07;
    public final C01i A08;
    public final C01i A09;

    public C00091a4(1Zx r302) {
        C15h c15h = r302.A00;
        if (c15h == null) {
            throw AnonymousClass001.A0L("Required value was null.");
        }
        C15h c15h2 = r302.A01;
        if (c15h2 == null) {
            throw AnonymousClass001.A0L("Required value was null.");
        }
        C15h c15h3 = r302.A02;
        if (c15h3 == null) {
            throw AnonymousClass001.A0L("Required value was null.");
        }
        04J r0 = r302.A04;
        C1Z5 c1z5 = r302.A06;
        Context context = r302.A03;
        1Ve r02 = r302.A05;
        11T.A0F(context, 7);
        this.A04 = c15h;
        this.A05 = c15h2;
        this.A06 = c15h3;
        this.A01 = r0;
        this.A03 = c1z5;
        this.A00 = context;
        this.A02 = r02;
        C03i c03i = C03i.A04;
        this.A07 = C01g.A00(c03i, new C2xm(this, 2));
        this.A08 = C01g.A00(c03i, new C2xm(this, 3));
        this.A09 = C01g.A00(c03i, new C2xm(this, 4));
    }
}
