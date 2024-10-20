package X;

import android.content.Context;
import android.graphics.Typeface;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import java.util.List;

/* renamed from: X.8fm, reason: invalid class name */
/* loaded from: 8fm.class */
public final class C8fm extends 1LH {
    public static final List A03 = C0s8.A14(new 8Jd(1, 2131956910, "Not accurate"), new 8Jd(2, 2131956911, "Not relevant"), new 8Jd(3, 2131956909, "Harmful or offensive"), new 8Jd(4, 2131956915, "Something else"));
    public final 9Ks A00;
    public final int A01;
    public final MigColorScheme A02;

    public C8fm(9Ks r302, MigColorScheme migColorScheme, int i) {
        this.A02 = migColorScheme;
        this.A01 = i;
        this.A00 = r302;
    }

    public 1LI A0s(C2k5 c2k5) {
        11T.A0F(c2k5, 0);
        C2lh A00 = C2lc.A00(c2k5, ANu.A00);
        MigColorScheme migColorScheme = this.A02;
        2qQ A0o = 7zL.A0o();
        A0o.A01 = false;
        Boolean bool = (Boolean) 7zR.A0p(A0o, migColorScheme, true);
        int Abp = migColorScheme.Abp();
        2lQ r0 = 2lO.A02;
        2RH r02 = 2RH.A05;
        2lO A0I = 7zT.A0I(4YV.A0K((2lO) null, 0S2.A0G, 4YV.A06(r02)), 7zL.A00(r02));
        Integer num = 0S2.A01;
        2lO A0S = 7zR.A0S(7zQ.A0X(A0I, num, 1.0f), 3yH.A08(c2k5, this.A01), 1);
        C2sn A0L = 7zR.A0L(c2k5);
        1Iw r03 = A0L.A00;
        2KD A0X = 7zN.A0X(r03, migColorScheme, 0);
        7zM.A1X(A0X, A0L, 2131956914);
        A0X.A2g();
        A0X.A2M(true);
        A0X.A2b();
        7zN.A1Q(A0L, A0X);
        String A09 = 3yH.A09(A0L, 2131956912);
        long A08 = 7zL.A08(2KV.A06.textSizeSp);
        Context applicationContext = r03.A0D.getApplicationContext();
        11T.A0F(applicationContext, 0);
        ACa aCa = new ACa(applicationContext);
        C97i c97i = C97i.A03;
        11T.A0D(bool);
        int Chy = aCa.Chy(c97i, bool.booleanValue());
        2RH r04 = 2RH.A03;
        long A06 = 4YV.A06(r04);
        long A062 = 4YV.A06(r02);
        long A063 = 4YV.A06(r04);
        Integer num2 = 0S2.A0E;
        2lO A0K = 4YV.A0K((2lO) null, num2, A063);
        Integer num3 = 0S2.A08;
        2lO A0K2 = 4YV.A0K(A0K, num3, A06);
        Integer num4 = 0S2.A0A;
        2lO A0X2 = 7zQ.A0X(7zS.A0U(A0K2, 7zL.A0i(num4, A062), num, 1.0f), 0S2.A0C, 0.0f);
        Typeface typeface = Typeface.DEFAULT;
        long A082 = 7zP.A08();
        3yF A0v = 7zM.A0v(r03, A09, 0);
        7zS.A1Q(A0L, A0v, Chy, A08);
        A0v.A33(0);
        A0v.A34(typeface);
        7zU.A1H(A0L, A0v, 0, A082);
        A0v.A2q(1.0f);
        7zV.A11(A0v, false);
        7zS.A1B((2K8) null, A0L, A0X2, A0v);
        long A064 = 4YV.A06(r02);
        2lO A0K3 = 4YV.A0K(4YV.A0K(7zT.A0d((2lO) null, r02, num2), num3, A064), num4, 4YV.A06(r04));
        C6nh c6nh = new C6nh(r03);
        c6nh.A02(8.0f);
        C26z c26z = C26z.ALL;
        c6nh.A07(c26z, 4YU.A00(r02));
        c6nh.A08(c26z, Abp);
        2lO A0L2 = 4YV.A0L(A0K3, num, c6nh.A01(), 0);
        C2sn A0U = 7zQ.A0U(r03);
        for (8Jd r05 : A03) {
            55N A002 = 55M.A00(A0U.A00);
            CJ4 cj4 = new CJ4();
            cj4.A00 = r05.A01;
            cj4.A07 = migColorScheme;
            int i = r05.A00;
            cj4.A04(3yH.A09(A0U, i));
            cj4.A08 = 3yH.A09(A0U, i);
            String str = r05.A02;
            Object obj = A00.A02;
            cj4.A04 = new C58r(migColorScheme, 11T.A0O(str, obj), true);
            cj4.A01 = new 9yV(A00, r05, 14);
            cj4.A06 = EL0.A03;
            cj4.A02(new 55J(C2cn.A00(0.0f, Abp, migColorScheme.B9e()), new 9yV(A00, r05, 15), (C5wx) null, (CharSequence) null, "android.widget.RadioButton", migColorScheme.hashCode(), true, 11T.A0O(str, obj)));
            7zU.A1I(A0U, cj4.A01(), A002);
        }
        7zN.A1I(A0U, A0L, A0L2);
        8Ti A01 = 8oM.A01(r03);
        A01.A2Z(migColorScheme);
        A01.A2a(3yH.A09(A0L, 2131956913));
        A01.A0j(1.0f);
        A01.A0k(0.0f);
        A01.A2Y(new 9zI(A00, this, 20));
        return 7zM.A0k(A01.A2W(), A0L, c2k5, A0S);
    }
}
