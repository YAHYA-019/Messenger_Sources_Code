package X;

import android.content.Context;
import com.google.common.base.Platform;
import com.google.common.collect.ImmutableList;

/* loaded from: F8O.class */
public final class F8O {
    public 1BY A00;
    public final C00i A02;
    public final C00i A03;
    public final FAX A04;
    public final C00i A05;
    public final C15h A07;
    public final C00i A01 = 1BV.A01((1BY) null, 98375);
    public final C00i A06 = 1BQ.A02(98346);

    public F8O(1BO r302) {
        this.A00 = 7zL.A0Q(r302);
        Context A03 = AbI.A03((1BY) null);
        1HH A0Q = AbF.A0Q(A03, 82751);
        this.A05 = A0Q;
        this.A03 = AbF.A0Q(A03, 98307);
        this.A02 = DKG.A0R(A03);
        this.A07 = new G7H(A03, this, 11);
        this.A04 = ((F6C) A0Q.get()).A00;
    }

    public static void A00(F8O f8o) {
        DMV dmv = ((EtP) f8o.A01.get()).A00;
        if (dmv != null) {
            dmv.dismiss();
        }
        C00i c00i = f8o.A06;
        if (DKF.A0f(c00i).A0F) {
            DKF.A0f(c00i).A07();
        }
    }

    /* JADX WARN: Type inference failed for: r0v25, types: [java.lang.Object, X.Eq7] */
    public Eq7 A01(Context context, GKb gKb, String str) {
        FpI fpI = new FpI(4YV.A0D(context), this, (C3W) 1Hv.A02(AbF.A04(this.A00), 82750), gKb, str);
        Er6 er6 = this.A04.A03;
        D1i d1i = null;
        String str2 = er6 == null ? null : er6.A0j;
        if (!Platform.stringIsNullOrEmpty(str2)) {
            d1i = ((C2E) this.A07.get()).A00(C0A2.A03(str2), ImmutableList.builder().build());
        }
        String str3 = er6 == null ? "" : er6.A0h;
        ?? obj = new Object();
        obj.A00 = context;
        obj.A02 = d1i;
        obj.A06 = 1BK.A0v(context, str3, 2131964066);
        obj.A03 = 1BK.A0v(context, str3, 2131964063);
        obj.A05 = context.getString(2131964065);
        obj.A04 = context.getString(2131964064);
        obj.A01 = fpI;
        return obj;
    }
}
