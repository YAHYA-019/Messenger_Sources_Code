package X;

import android.content.Context;

/* loaded from: Fr6.class */
public final class Fr6 implements 29I {
    public final /* synthetic */ FyG A00;
    public final /* synthetic */ DLQ A01;
    public final /* synthetic */ GJj A02;
    public final /* synthetic */ GJj A03;

    public Fr6(FyG fyG, DLQ dlq, GJj gJj, GJj gJj2) {
        this.A00 = fyG;
        this.A02 = gJj;
        this.A01 = dlq;
        this.A03 = gJj2;
    }

    public /* bridge */ /* synthetic */ Object ABr(Context context, Object obj, Object obj2, Object obj3) {
        FyG fyG = this.A00;
        GLc gLc = (GLc) FyG.A02(fyG, 2131362452);
        if (gLc == null) {
            return null;
        }
        gLc.Cra(new En5(fyG, this.A01, this.A02, this.A03));
        return null;
    }

    public /* synthetic */ String AhU() {
        return DKD.A0v(this);
    }

    public /* synthetic */ Class BHc() {
        return getClass();
    }

    public /* bridge */ /* synthetic */ boolean Cyz(Object obj, Object obj2, Object obj3, Object obj4) {
        return false;
    }

    public /* bridge */ /* synthetic */ void D5U(Context context, Object obj, Object obj2, Object obj3, Object obj4) {
        GLc gLc = (GLc) FyG.A02(this.A00, 2131362452);
        if (gLc != null) {
            gLc.Cra(null);
        }
    }
}
