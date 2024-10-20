package X;

import android.content.Context;
import android.os.Bundle;
import com.facebook.inject.FbInjector;
import com.facebook.prefs.shared.FbSharedPreferences;

/* loaded from: Eyp.class */
public final class Eyp {
    public final Context A00;
    public final EtB A01;
    public final FbSharedPreferences A02;
    public final Boolean A03;

    public Eyp() {
        Context A00 = FbInjector.A00();
        FbSharedPreferences A0i = AbJ.A0i();
        EtB etB = (EtB) 1Bn.A0A(98875);
        Boolean bool = (Boolean) 1Bn.A0A(99947);
        this.A00 = A00;
        this.A02 = A0i;
        this.A01 = etB;
        this.A03 = bool;
    }

    public DRq A00(06Z r302, GI3 gi3) {
        if (!A01() || !A02()) {
            return null;
        }
        Bundle A05 = 1BK.A05();
        A05.putInt("target_app", 2);
        A05.putString("sdk_dialog_reason", this.A02.BD0(EbD.A01));
        DRq dRq = new DRq();
        dRq.setArguments(A05);
        dRq.A00 = gi3;
        dRq.A0m(r302, (String) null);
        return dRq;
    }

    public boolean A01() {
        Class cls;
        String str;
        EtB etB = this.A01;
        1G2 r0 = EbD.A03;
        C00i c00i = etB.A00;
        boolean z = false;
        int ArU = 1BK.A0R(c00i).ArU(r0, 0);
        int i = 5;
        if (ArU == 5 || ArU == 2) {
            cls = Eyp.class;
            str = "Tos send accept state cached, dialog not required.";
        } else {
            z = true;
            if (ArU != 4) {
                Eu4 A00 = 3H0.A00(this.A00);
                boolean z2 = A00.A01;
                0fH.A0T(Eyp.class, "Tos send accept state queried, dialog required = %b", 4YU.A1b(z2));
                if (z2) {
                    i = 4;
                }
                String A002 = R2T.A00(A00.A00);
                1Ql A0V = 1BL.A0V(c00i);
                A0V.CaE(r0, i);
                A0V.CaL(EbD.A01, A002);
                A0V.commit();
                return z2;
            }
            cls = Eyp.class;
            str = "Tos send accept state cached, dialog required.";
        }
        0fH.A0E(cls, str);
        return z;
    }

    public boolean A02() {
        if (!this.A03.booleanValue() && !this.A02.AZn(EbD.A00, false)) {
            return false;
        }
        0fH.A0E(Eyp.class, "Tos Acceptance Dialog enabled, running checks.");
        EtB etB = this.A01;
        1G2 r0 = EbD.A02;
        C00i c00i = etB.A00;
        int A03 = 7zM.A03(1BK.A0R(c00i), r0);
        int i = 3;
        if (A03 == 3 || A03 == 2) {
            0fH.A0E(Eyp.class, "Tos Explicit dialog state cached, dialog not required.");
            return false;
        }
        if (A03 == 1) {
            0fH.A0E(Eyp.class, "Tos Explicit dialog state cached, refreshing cache.");
        }
        Eu4 A00 = 3H0.A00(this.A00);
        boolean z = A00.A02;
        0fH.A0T(Eyp.class, "Tos Explicit dialog state queried, dialog required = %b", 4YU.A1b(z));
        if (z) {
            i = 1;
        }
        String A002 = R2T.A00(A00.A00);
        1Ql A0V = 1BL.A0V(c00i);
        A0V.CaE(r0, i);
        A0V.CaL(EbD.A01, A002);
        A0V.commit();
        return z;
    }
}
