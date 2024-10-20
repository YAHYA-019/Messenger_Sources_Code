package X;

import android.content.Context;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.1dr, reason: invalid class name */
/* loaded from: 1dr.class */
public final class C1dr extends C1ds implements C1dt {
    public C1e9 A00;
    public 1eB A01;
    public int[] A02;
    public final Context A03;
    public final C00i A04;
    public final C00i A05;
    public final 1Br A06;
    public final 1Br A07;
    public final 1Br A08;
    public final 1Br A09;
    public final 1Br A0A;
    public final 1Br A0B;
    public final 1Br A0C;
    public final 1Br A0D;
    public final 1Br A0E;
    public final 1Br A0F;
    public final 1Br A0G;
    public final C1eT A0H;
    public final C1dy A0I;
    public final C1dv A0J;
    public final C1dw A0K;
    public final List A0L;
    public final C01i A0M;
    public final C01i A0N;
    public final C01i A0O;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public C1dr() {
        /*
            Method dump skipped, instructions count: 420
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1dr.<init>():void");
    }

    public static final void A00(C1dr c1dr, List list, int i, boolean z, boolean z2) {
        if (list != null) {
            if (z) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    c1dr.A04(((Number) it.next()).intValue(), i);
                }
            } else if (z2) {
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    c1dr.A04(((Number) it2.next()).intValue(), i);
                }
            }
        }
    }

    public C1e9 A05(int i) {
        C1e9 c1e9 = (C1e9) super.A01.get(i);
        if (c1e9 == null) {
            c1e9 = this.A00;
            if (c1e9 == null) {
                C1dy c1dy = this.A0I;
                1hU r0 = (1hU) c1dy.A02.get();
                int i2 = (-1) << (-1);
                C1e5 A01 = c1dy.A01();
                C1dz A00 = C1dz.A00();
                C1f7 c1f7 = C1f7.A01;
                if (c1f7 == null) {
                    c1f7 = new C1f7(A00);
                    C1f7.A01 = c1f7;
                }
                c1e9 = new C1e9(c1dy, r0 != null ? r0.A01 : null, c1f7, A01, i2);
                this.A00 = c1e9;
            }
        }
        return c1e9;
    }

    @Override // X.C1dt
    public void A8U() {
        C1e9.A09 = false;
    }

    @Override // X.C1dt
    public void A8V() {
        C1e9.A09 = true;
    }
}
