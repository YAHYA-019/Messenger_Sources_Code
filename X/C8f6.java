package X;

import android.content.Context;
import com.facebook.acra.constants.ActionId;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import com.facebook.user.model.User;
import com.facebook.user.model.UserKey;
import java.util.List;

/* renamed from: X.8f6, reason: invalid class name */
/* loaded from: 8f6.class */
public final class C8f6 extends 1LH {
    public final MigColorScheme A00;
    public final AZd A01;

    public C8f6(MigColorScheme migColorScheme, AZd aZd) {
        11T.A0F(migColorScheme, 1);
        this.A00 = migColorScheme;
        this.A01 = aZd;
    }

    public static final boolean A01(Context context) {
        boolean z = false;
        if (new C4s1(context).A05() <= 160) {
            z = true;
        }
        return z;
    }

    public 1LI A0s(C2k5 c2k5) {
        int i;
        float f;
        11T.A0F(c2k5, 0);
        C2sn A0L = 7zR.A0L(c2k5);
        1Iw AeS = A0L.AeS();
        8Tn A00 = C8nn.A00(AeS);
        MigColorScheme migColorScheme = this.A00;
        A00.A2a(migColorScheme);
        8Lf r0 = new 8Lf(83S.A00(this, 52), 3yH.A09(A0L, 2131962238));
        Context A0A = 7zL.A0A(AeS);
        boolean A01 = A01(A0A);
        2qQ A0o = 7zL.A0o();
        if (A01) {
            7zM.A1V(A0o, 2132476001);
            i = 2132476000;
        } else {
            7zM.A1V(A0o, 2132346718);
            i = 2132346717;
        }
        2qR A0k = 7zQ.A0k(A0o, i);
        String A09 = 3yH.A09(A0L, 2131962240);
        Integer num = (Integer) migColorScheme.Ci4(A0k);
        float f2 = 1.6846846f;
        if (!A01(A0A)) {
            f2 = 1.0505618f;
        }
        A0L.A00(8Tn.A0A(A00, new 8NJ(r0, new C8xc(num, f2), 3yH.A09(A0L, 2131962239), (CharSequence) null, A09, (List) null, true)));
        UserKey userKey = ((User) 1Bu.A00(83430).get()).A0k;
        11T.A0A(A0A);
        if (A01(A0A)) {
            f = 86.0f;
        } else {
            f = 205.0f;
            if (new C4s1(A0A).A05() <= 320) {
                f = 165.0f;
            }
        }
        2zT A002 = C2q7.A00(AeS);
        A002.A2Z(userKey);
        A002.A2Y(migColorScheme);
        C2q1 c2q1 = A01(A0A) ? C2q0.A00 : new C4s1(A0A).A05() <= 320 ? C2q0.A01 : C2q0.A02;
        11T.A0B(c2q1);
        A002.A2X(c2q1);
        A002.A0k(0.6f);
        C1ro c1ro = C1ro.CENTER;
        A002.A1y(c1ro);
        2dP r02 = 2dP.A01;
        A002.A2H(r02);
        A002.A1F(f);
        7zN.A1P(A0L, A002);
        2qQ A0o2 = 7zL.A0o();
        7zM.A1V(A0o2, 2132476025);
        2qR A0k2 = 7zQ.A0k(A0o2, 2132476024);
        long doubleToRawLongBits = Double.doubleToRawLongBits(450.0d);
        long doubleToRawLongBits2 = Double.doubleToRawLongBits(250.0d);
        long doubleToRawLongBits3 = Double.doubleToRawLongBits(30.0d);
        if (A01(A0A)) {
            doubleToRawLongBits = Double.doubleToRawLongBits(270.0d);
            doubleToRawLongBits2 = Double.doubleToRawLongBits(144.0d);
            doubleToRawLongBits3 = Double.doubleToRawLongBits(-10.0d);
        } else if (new C4s1(A0A).A05() <= 320) {
            doubleToRawLongBits = Double.doubleToRawLongBits(360.0d);
            doubleToRawLongBits2 = Double.doubleToRawLongBits(192.0d);
        }
        Integer num2 = (Integer) migColorScheme.Ci4(A0k2);
        2lQ r03 = 2lO.A02;
        2lO A0Y = 7zQ.A0Y((2lO) null, 0S2.A0N, doubleToRawLongBits3);
        Integer num3 = 0S2.A00;
        A0L.A00(new C8io(null, null, 4YV.A0K(7zS.A0V(4YV.A0L(A0Y, num3, c1ro, 0), 7zL.A0u(0S2.A0Y, r02, 0), num3, doubleToRawLongBits), 0S2.A01, doubleToRawLongBits2), num2, null, 0, true));
        C5yw A003 = C5yv.A00(AeS);
        A003.A2b(migColorScheme);
        A003.A2X();
        A003.A2h(false);
        C9zj.A04(A003, this, ActionId.MISSED_EVENT);
        A003.A2i(false);
        A003.A2H(r02);
        7zN.A1R(A0L, A003);
        return new 2cL((C1ro) null, (C1ro) null, (C1rp) null, (EnumC00743oh) null, A0L.A01, false);
    }
}
