package X;

import android.graphics.Bitmap;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import com.facebook.user.model.UserKey;
import com.mapbox.mapboxsdk.R;

/* renamed from: X.8g2, reason: invalid class name */
/* loaded from: 8g2.class */
public final class C8g2 extends 1LH {
    public final AaZ A00;
    public final 8LV A01;
    public final MigColorScheme A02;
    public final InterfaceC06154g3 A03;

    public C8g2(InterfaceC06154g3 interfaceC06154g3, AaZ aaZ, 8LV r304, MigColorScheme migColorScheme) {
        11T.A0F(migColorScheme, 2);
        this.A01 = r304;
        this.A02 = migColorScheme;
        this.A00 = aaZ;
        this.A03 = interfaceC06154g3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0050, code lost:
    
        if (X.1BK.A0M(r0).AZk(36326635822798590L) == false) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final boolean A01() {
        /*
            r301 = this;
            r0 = r301
            X.8LV r0 = r0.A01
            java.lang.Integer r0 = r0.A03
            r302 = r0
            java.lang.Integer r0 = X.0S2.A00
            r303 = r0
            r0 = r302
            r1 = r303
            if (r0 != r1) goto L53
            X.1Br r0 = X.2dQ.A01
            r303 = r0
            r0 = r303
            X.00i r0 = r0.A00
            r304 = r0
            r0 = r304
            X.2yD r0 = X.1BK.A0M(r0)
            r305 = r0
            r0 = 36326635821881080(0x810ee2000c56f8, double:3.036448997154596E-306)
            r306 = r0
            r0 = r305
            r1 = r306
            boolean r0 = r0.AZk(r1)
            r308 = r0
            r0 = r308
            if (r0 == 0) goto L53
            r0 = r304
            X.2yD r0 = X.1BK.A0M(r0)
            r305 = r0
            r0 = 36326635822798590(0x810ee2001a56fe, double:3.036448997734833E-306)
            r306 = r0
            r0 = r305
            r1 = r306
            boolean r0 = r0.AZk(r1)
            r309 = r0
            r0 = 1
            r308 = r0
            r0 = r309
            if (r0 != 0) goto L58
        L53:
            r0 = 0
            r308 = r0
            r0 = 0
            r303 = r0
        L58:
            r0 = r308
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C8g2.A01():boolean");
    }

    public 1LI A0s(C2k5 c2k5) {
        C1rh A2W;
        C2q7 c2q7;
        C2px c2px;
        2K3 r307;
        1LI A2W2;
        11T.A0F(c2k5, 0);
        2yD A0L = 1BK.A0L(16387);
        C00m A00 = 4FN.A00(c2k5, AQq.A00(this, 43));
        83S r0 = (83S) 2rO.A00(c2k5, AQq.A00(A00, 44), new Object[]{A00});
        1Im r02 = (1Im) 2rO.A00(c2k5, AQq.A00(A00, 42), new Object[]{A00});
        8LV r03 = this.A01;
        if (r03.A0A) {
            String A09 = 3yH.A09(c2k5, 2131964030);
            if (A01()) {
                2lQ r04 = 2lO.A02;
                2lO A0R = 7zS.A0R((2lO) null, 0.0f);
                C2sn A0L2 = 7zR.A0L(c2k5);
                5fH A002 = 5fG.A00(A0L2.A00);
                A002.A2Z(A09);
                A002.A2Y(this.A02);
                4YU.A1N(A002, 2RH.A04);
                A002.A01.A02 = r0;
                A0L2.A00(A002.A2W());
                A2W = C2so.A0N(A0L2, c2k5, A0R);
            } else {
                SpannableString spannableString = new SpannableString(A09);
                MigColorScheme migColorScheme = this.A02;
                spannableString.setSpan(new ForegroundColorSpan(migColorScheme.Atv()), 0, spannableString.length(), 33);
                2KD A0X = 7zN.A0X(c2k5.A05, migColorScheme, 0);
                7zQ.A1T(A0X, spannableString);
                A0X.A2a();
                A0X.A1Y(2132279310);
                A0X.A0L();
                A0X.A2T(r02);
                A2W = A0X.A2W();
            }
        } else {
            A2W = null;
        }
        2lQ r05 = 2lO.A02;
        MigColorScheme migColorScheme2 = this.A02;
        int BDl = migColorScheme2.BDl();
        Integer num = 0S2.A00;
        1LI r319 = null;
        2lO A0g = 7zL.A0g((2lO) null, 7zL.A0u(num, 7zL.A0j(BDl), 1));
        Integer num2 = 0S2.A01;
        2lO A0L3 = 4YV.A0L(4YV.A0K(7zQ.A0X(A0g, num2, 1.0f), 0S2.A04, 3yH.A06(c2k5, 2132279314)), num2, true, 1);
        C2sn A0L4 = 7zR.A0L(c2k5);
        2lO A0W = 7zS.A0W(7zS.A0a((2lO) null, num, migColorScheme2.BDl()), 7zL.A0k(num2, 1.0f), num2, true, 1);
        C2sn A0K = 7zS.A0K(A0L4);
        C1rp c1rp = C1rp.SPACE_BETWEEN;
        C1ro c1ro = C1ro.CENTER;
        C2sn A0K2 = 7zS.A0K(A0K);
        if (r03.A0C) {
            C5yw A003 = C5yv.A00(A0K2.AeS());
            7zM.A1Y(A003, A0K2, 2131964028);
            A003.A2b(migColorScheme2);
            A003.A2i(false);
            A003.A2X();
            C9zj.A02(A0K2, A003, this, 89);
        }
        if (A0L.AZk(72339764799604860L)) {
            C83g A004 = C02413v4.A00(A0K2.AeS());
            A004.A2Z(2MQ.A0i);
            A004.A2Y();
            A004.A2e(migColorScheme2);
            C83g.A06(A0K2, A004, new AR2(this, 25));
        }
        A0K.A00(C2so.A0X(A0K2, A0K, null, c1rp));
        UserKey userKey = r03.A01;
        if (userKey != null) {
            2zT A005 = C2q7.A00(A0K.AeS());
            A005.A2Z(userKey);
            A005.A2Y(migColorScheme2);
            A005.A2X(C2q0.A00);
            A005.A01.A06 = C2q2.A0G;
            int i = 2132279393;
            if (A01()) {
                i = 2132279301;
            }
            A005.A1Y(i);
            A005.A1y(c1ro);
            c2q7 = A005.A2W();
        } else {
            c2q7 = null;
        }
        A0K.A00(c2q7);
        C2fr c2fr = r03.A02;
        if (c2fr != null) {
            C2pz A006 = C2px.A00(A0K.AeS());
            A006.A2Z(c2fr);
            A006.A2Y(migColorScheme2);
            A006.A2X(C2q0.A00);
            int i2 = 2132279393;
            if (A01()) {
                i2 = 2132279301;
            }
            A006.A1Y(i2);
            A006.A1y(c1ro);
            c2px = A006.A2W();
        } else {
            c2px = null;
        }
        A0K.A00(c2px);
        2KE r06 = 2KE.A07;
        1Iw AeS = A0K.AeS();
        8TQ A007 = C8o7.A00(AeS);
        A007.A2a(r03.A07);
        A007.A2X(7zN.A00(r06));
        A007.A2Y(migColorScheme2.B4i());
        A007.A2Z(7zP.A0M(AeS, 2KK.A04(r06)));
        C26z c26z = C26z.TOP;
        int i3 = 2132279306;
        A007.A2B(c26z, R.dimen.mapbox_eight_dp);
        C26z c26z2 = C26z.BOTTOM;
        String str = r03.A08;
        if (str != null && str.length() != 0 && A01()) {
            i3 = 2132279309;
        }
        A007.A2B(c26z2, i3);
        C26z c26z3 = C26z.HORIZONTAL;
        A007.A2B(c26z3, 2132279314);
        A007.A1y(c1ro);
        A0K.A00(A007.A2W());
        if (str == null || str.length() == 0) {
            r307 = null;
        } else {
            2KD A0X2 = 7zN.A0X(AeS, migColorScheme2, 0);
            7zQ.A1T(A0X2, str);
            A0X2.A2a();
            A0X2.A1y(c1ro);
            A0X2.A2B(c26z3, 2132279314);
            r307 = A0X2.A2W();
        }
        A0K.A00(r307);
        Bitmap bitmap = r03.A00;
        if (bitmap != null || r03.A09) {
            r319 = new 8Zb(bitmap, this.A03, migColorScheme2, r03.A09);
        }
        A0K.A00(r319);
        2KD A0X3 = 7zN.A0X(AeS, migColorScheme2, 0);
        7zQ.A1T(A0X3, r03.A04);
        A0X3.A2a();
        A0X3.A2B(c26z3, 2132279314);
        A0X3.A1y(c1ro);
        7zN.A1Q(A0K, A0X3);
        7zQ.A1E(A2W, A0K, A0L4, A0W);
        if (r03.A0B) {
            2lO A04 = C82m.A04(null, num, 100.0f, 0);
            C2sn A0J = 7zS.A0J(A0L4);
            1Iw r07 = A0J.A00;
            8TV A008 = C8ns.A00(r07);
            A008.A2X(2131964035);
            A008.A01.A03 = 83S.A00(this, 1);
            A008.A2Y(migColorScheme2);
            2RH r08 = 2RH.A05;
            7zO.A1M(A008, r08, c26z2);
            2RH r09 = 2RH.A04;
            7zO.A1M(A008, r09, c26z);
            A008.A0j(1.0f);
            A008.A0h(0.0f);
            A008.A0t(0.0f);
            A0J.A00(A008.A2W());
            8TZ A009 = C8nr.A00(r07);
            A009.A2Y(2131964040);
            A009.A2Z(83S.A00(this, 2));
            A009.A2a(migColorScheme2);
            7zO.A1M(A009, r08, c26z2);
            7zO.A1H(A009, r08);
            7zO.A1M(A009, r09, c26z);
            A009.A0j(1.0f);
            A009.A0h(0.0f);
            A009.A0t(0.0f);
            A2W2 = 7zN.A0R(A009.A2W(), A0J, A0L4, A04);
        } else {
            8TZ A0010 = C8nr.A00(A0L4.AeS());
            A0010.A2Y(2131964040);
            A0010.A2a(migColorScheme2);
            A0010.A2B(c26z2, 2132279369);
            A0010.A1y(c1ro);
            A0010.A2Z(83S.A00(this, 3));
            A2W2 = A0010.A2W();
        }
        return 7zM.A0l(A2W2, A0L4, c2k5, A0L3);
    }
}
