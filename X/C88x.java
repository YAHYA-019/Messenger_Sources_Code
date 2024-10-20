package X;

import android.content.Context;

/* renamed from: X.88x, reason: invalid class name */
/* loaded from: 88x.class */
public final class C88x implements 6yN {
    public final 5zD A00;

    public C88x(5zD r302) {
        11T.A0F(r302, 1);
        this.A00 = r302;
    }

    public int B62(Context context) {
        return this.A00.Axg().B9O();
    }

    public int B67(Context context, Integer num, boolean z) {
        5zD r0 = this.A00;
        C5yf c5yf = C5yf.A02;
        Integer num2 = 0S2.A01;
        Integer num3 = 0S2.A00;
        int Aa2 = r0.Aa2(c5yf, num2, num3);
        if (z) {
            int i = r0.BEz().A08;
            if (i == 0) {
                i = r0.Axg().Ah8();
            }
            Aa2 = 1tG.A05(i, 77);
        } else if (r0.BFO() == Aa2) {
            return r0.Aa2(c5yf, num3, num3);
        }
        return Aa2;
    }

    public int B68(Context context) {
        return this.A00.Axg().BDl();
    }

    public int B69(Context context, Integer num, boolean z) {
        5zD r0 = this.A00;
        int i = r0.BEz().A08;
        if (i == 0) {
            i = r0.Axg().Ah8();
        }
        int A04 = 1tG.A04(1291845632, i);
        if (!z) {
            A04 = r0.Axg().B9Q();
        }
        return A04;
    }
}
