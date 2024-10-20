package X;

import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.google.common.collect.ImmutableList;

/* loaded from: I9a.class */
public final class I9a {
    public Hga A00;
    public final 1CO A01;
    public final Hhp A02;
    public final Hob A03;

    public I9a() {
    }

    public I9a(Hhp hhp) {
        this.A02 = hhp;
        this.A01 = C3o5.A0F(hhp.A01);
        this.A03 = hhp.A02;
    }

    public static Hga A00(I9a i9a) {
        Hga hga = i9a.A00;
        if (hga == null) {
            hga = i9a.A03.A00();
            i9a.A00 = hga;
        }
        return hga;
    }

    public int A01() {
        return A00(this).A01;
    }

    public int A02() {
        return A00(this).A02;
    }

    public Integer A03() {
        int i = A00(this).A00;
        if (i > 0) {
            return Integer.valueOf(i);
        }
        return null;
    }

    public void A04(int i) {
        A00(this).A01 = i;
    }

    public void A05(int i) {
        A00(this).A02 = i;
    }

    public void A06(Integer num) {
        Hga A00 = A00(this);
        if (num != null) {
            A00.A00 = num.intValue();
        }
    }

    public boolean A07() {
        return 53C.A00((53C) 1Bn.A0E((Context) null, this.A02.A00, 114745));
    }

    public boolean A08() {
        return this.A01.AZk(36316813231073780L);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(6:19|(1:22)(1:21)|16|15|14|17) */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean A09() {
        /*
            Method dump skipped, instructions count: 232
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.I9a.A09():boolean");
    }

    public boolean A0A(FbUserSession fbUserSession, boolean z) {
        1BY r0 = this.A02.A00;
        boolean z2 = false;
        if (IFr.A01(AbL.A0W(1Lo.A04((Context) null, fbUserSession, r0, 33088))) <= ((2yD) ((53C) 1Bn.A0E((Context) null, r0, 114745)).A00.get()).Av9(1GD.A07, 36593074117870620L)) {
            ImmutableList Aar = ((2QU) 1Lo.A04((Context) null, fbUserSession, r0, 99981)).Aar();
            HBQ hbq = HBQ.A08;
            1Du it = Aar.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                I9O A13 = GOn.A13(it);
                if (I6L.A01(hbq, A13) && I6L.A02(A13)) {
                    z2 = ((53C) 1Bn.A0E((Context) null, r0, 114745)).A01(z);
                    break;
                }
            }
        }
        return z2;
    }
}
