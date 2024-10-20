package X;

import android.graphics.Rect;

/* renamed from: X.29e, reason: invalid class name */
/* loaded from: 29e.class */
public final class C29e implements 1Ip {
    public static final C29f A08 = new Object();
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final Rect A04;
    public final C01063pm A05;
    public final Object A06;
    public final boolean A07;

    public C29e(Rect rect, C01063pm c01063pm, Object obj, int i, int i2, int i3, int i4, boolean z) {
        this.A03 = i;
        this.A01 = i2;
        this.A00 = i3;
        this.A02 = i4;
        this.A04 = rect;
        this.A06 = obj;
        this.A07 = z;
        this.A05 = c01063pm;
    }

    public /* bridge */ /* synthetic */ boolean BSF(Object obj) {
        C29e c29e = (C29e) obj;
        11T.A0F(c29e, 0);
        if (this.A07 && c29e.A07 && (this.A03 != c29e.A03 || this.A01 != c29e.A01)) {
            return false;
        }
        Object obj2 = this.A06;
        Object obj3 = c29e.A06;
        if (obj2 == obj3) {
            return true;
        }
        if (obj2 == null || obj3 == null) {
            return false;
        }
        return ((obj2 instanceof 1Ip) && (obj3 instanceof 1Ip)) ? C28q.A01((1Ip) obj2, (1Ip) obj3) : C28q.A03(obj2, obj3);
    }
}
