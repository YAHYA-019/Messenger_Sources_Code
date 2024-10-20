package X;

import android.content.Context;

/* loaded from: Fr0.class */
public final class Fr0 implements 29I {
    public final /* synthetic */ FyG A00;
    public final /* synthetic */ DLQ A01;

    public Fr0(FyG fyG, DLQ dlq) {
        this.A00 = fyG;
        this.A01 = dlq;
    }

    public /* bridge */ /* synthetic */ Object ABr(Context context, Object obj, Object obj2, Object obj3) {
        return null;
    }

    public /* synthetic */ String AhU() {
        return DKD.A0v(this);
    }

    public /* synthetic */ Class BHc() {
        return getClass();
    }

    public /* bridge */ /* synthetic */ boolean Cyz(Object obj, Object obj2, Object obj3, Object obj4) {
        return 1BK.A1V(obj3, obj4);
    }

    public /* bridge */ /* synthetic */ void D5U(Context context, Object obj, Object obj2, Object obj3, Object obj4) {
        H2X h2x;
        Eh1 eh1 = (Eh1) FJ6.A06(this.A01, this.A00);
        if (eh1 == null || (h2x = eh1.A00) == null || h2x.A02 == null) {
            return;
        }
        GRS A04 = ((6Tb) h2x.A01.get()).A08(h2x.A05).A04();
        if (A04 != null) {
            Hmx hmx = h2x.A02;
            11T.A0F(hmx, 0);
            A04.A1Y.remove(hmx);
        }
        h2x.A02 = null;
    }
}
