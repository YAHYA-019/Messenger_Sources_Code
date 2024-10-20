package X;

import android.content.Context;

/* renamed from: X.Db5, reason: case insensitive filesystem */
/* loaded from: Db5.class */
public final class C2080Db5 extends 1RM {
    public final /* synthetic */ GIV A00;
    public final /* synthetic */ GGE A01;
    public final /* synthetic */ F8P A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ boolean A05;

    public C2080Db5(GIV giv, GGE gge, F8P f8p, String str, String str2, boolean z) {
        this.A00 = giv;
        this.A03 = str;
        this.A04 = str2;
        this.A02 = f8p;
        this.A05 = z;
        this.A01 = gge;
    }

    public /* bridge */ /* synthetic */ void A02(Object obj) {
        EzW ezW = (EzW) obj;
        GIV giv = this.A00;
        if (giv != null) {
            if (ezW == null) {
                giv.C06(this.A03, AbF.A1D("fetch result is null"));
            } else {
                giv.C04(ezW, this.A04);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v54, types: [java.lang.Object, X.R3I] */
    public void A03(Throwable th) {
        11T.A0F(th, 0);
        GIV giv = this.A00;
        if (giv != null) {
            F8P f8p = this.A02;
            RK1 rk1 = f8p.A00;
            if (rk1 == null) {
                ?? obj = new Object();
                1Bn.A0E((Context) null, f8p.A03.A00, 98333);
                rk1 = new RK1((R3I) obj);
                f8p.A00 = rk1;
            }
            if (rk1.A00 > 3) {
                giv.C06(this.A03, th);
                return;
            }
            1GU A0N = 7zP.A0N(f8p.A04);
            G5y g5y = new G5y(giv, this.A01, f8p, this.A03, this.A04, this.A05);
            RK1 rk12 = f8p.A00;
            11T.A0D(rk12);
            int i = rk12.A00;
            if (i > 3) {
                throw AnonymousClass001.A0N("Cannot retry anymore");
            }
            rk12.A00 = i + 1;
            A0N.CY4(g5y, 300 * ((long) Math.pow(2.0d, i - 1)));
        }
    }
}
