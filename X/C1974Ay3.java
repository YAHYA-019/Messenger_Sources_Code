package X;

import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import com.facebook.advancedcryptotransport.model.PeerDevice;
import com.facebook.advancedcryptotransport.model.SecurityAlert;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import com.facebook.mig.scheme.schemes.LightColorScheme;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.Ay3, reason: case insensitive filesystem */
/* loaded from: Ay3.class */
public final class C1974Ay3 extends 1LH {
    public final BfB A00;
    public final MigColorScheme A01;
    public final String A02;
    public final int A03;
    public final List A04;
    public final List A05;
    public final boolean A06;

    public C1974Ay3(BfB bfB, MigColorScheme migColorScheme, String str, List list, List list2, int i, boolean z) {
        1BK.A1K(list, 2, list2);
        4YV.A1M(bfB, 6, str);
        this.A01 = migColorScheme;
        this.A05 = list;
        this.A03 = i;
        this.A04 = list2;
        this.A06 = z;
        this.A00 = bfB;
        this.A02 = str;
    }

    public static void A01(CQY cqy, AnonymousClass557 anonymousClass557, C2k7 c2k7, int i) {
        anonymousClass557.A03(C5z6.A00(3yH.A09(c2k7, i)));
        anonymousClass557.A01();
        AnonymousClass544 A00 = anonymousClass557.A00();
        11T.A0A(A00);
        cqy.A0L(A00);
    }

    public 1LI A0s(C2k5 c2k5) {
        PeerDevice peerDevice;
        int i;
        String A0W;
        11T.A0F(c2k5, 0);
        SpannableString spannableString = (SpannableString) 2rO.A00(c2k5, new AQd(c2k5, this, 32), new Object[0]);
        C1i A0T = 7zU.A0T();
        1BV A00 = 1BV.A00(83585);
        1BV A002 = 1BV.A00(83586);
        1Iw r0 = c2k5.A05;
        MigColorScheme migColorScheme = this.A01;
        CQY A003 = A0T.A00(r0, migColorScheme);
        int i2 = 9GF.A00;
        int i3 = 9GF.A01;
        LightColorScheme.A00();
        2KE r02 = 2KE.A02;
        C1u7 c1u7 = C1u7.A0A;
        long j = -1;
        A003.A0L(new C55g(c1u7, migColorScheme, r02, spannableString, 7zL.A03(), 2RH.A09.A00(), 7zL.A02(), j, true));
        AnonymousClass557 A0p = 7zL.A0p();
        Cvn.A03(A0p, this, 85);
        A0p.A05(migColorScheme);
        A01(A003, A0p, c2k5, 2131963500);
        AnonymousClass557 A0p2 = 7zL.A0p();
        Cvn.A03(A0p2, this, 84);
        A0p2.A05(migColorScheme);
        A01(A003, A0p2, c2k5, 2131963509);
        List<SecurityAlert> list = this.A05;
        if (!list.isEmpty()) {
            A003.A0A();
            A003.A0C(2131963501);
            for (SecurityAlert securityAlert : list) {
                List list2 = this.A04;
                Integer num = securityAlert.A00;
                11T.A0A(num);
                int intValue = num.intValue();
                Iterator it = list2.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        peerDevice = null;
                        break;
                    }
                    peerDevice = (PeerDevice) it.next();
                    String str = peerDevice.A05;
                    if (str != null) {
                        try {
                            int parseInt = Integer.parseInt(str);
                            if (Integer.valueOf(parseInt) != null && parseInt == intValue) {
                                break;
                            }
                        } catch (NumberFormatException e) {
                            0fH.A0z("SecurityAlertsAndLoginsLayout", "Failed to parse peer device deviceId: %s", e, new Object[]{str});
                        }
                    }
                }
                C0z c0z = (C0z) A002.get();
                C10 c10 = (C10) A00.get();
                boolean A1T = AnonymousClass001.A1T(peerDevice);
                C58x A004 = c0z.A00(migColorScheme, securityAlert.A01(), A1T);
                AnonymousClass557 A0V = 7zU.A0V(migColorScheme);
                A0V.A05 = A004;
                String str2 = securityAlert.A03;
                if (str2 == null && securityAlert.A00() == 0S2.A00) {
                    A0W = 3yH.A09(c2k5, 2131952903);
                } else {
                    StringBuilder A0k = AnonymousClass001.A0k();
                    if (str2 != null) {
                        A0k.append(" · ");
                    } else {
                        A0k.append(" · ");
                        str2 = 3yH.A09(c2k5, 2131952902);
                    }
                    String A0d = AnonymousClass001.A0d(str2, A0k);
                    Integer A005 = securityAlert.A00();
                    11T.A0A(A005);
                    int intValue2 = A005.intValue();
                    if (intValue2 == 1) {
                        i = 2131952899;
                    } else if (intValue2 == 2) {
                        i = 2131952898;
                    } else {
                        if (intValue2 != 3 && intValue2 != 0) {
                            throw 1BK.A1F();
                        }
                        i = 2131952900;
                    }
                    A0W = 0Pz.A0W(3yH.A09(c2k5, i), A0d);
                }
                A0V.A08(A0W);
                A0V.A01();
                1BV A006 = 1BV.A00(66576);
                String str3 = securityAlert.A02;
                String A0W2 = (str3 == null || ((20U) A006.get()).A02()) ? "" : 0Pz.A0W(" · ", str3);
                StringBuilder A0k2 = AnonymousClass001.A0k();
                1Iw AeS = c2k5.AeS();
                Long l = securityAlert.A01;
                11T.A0A(l);
                A0k2.append((Object) c10.A00(AeS, l.longValue()));
                A0V.A07(AnonymousClass001.A0d(A0W2, A0k2));
                A0V.A0C = A1T;
                if (A1T) {
                    A0V.A02(new 55J((Drawable) null, new CvX(5, peerDevice, c2k5, securityAlert, this), (C5wx) null, (CharSequence) null, "android.widget.Button", 0, false, false));
                }
                A003.A0L(AbG.A0q(A0V));
            }
            if (!this.A06 && this.A03 > list.size()) {
                C0z c0z2 = (C0z) A002.get();
                AnonymousClass557 A0V2 = 7zU.A0V(migColorScheme);
                Cvn.A03(A0V2, this, 86);
                11T.A0F(migColorScheme, 0);
                A0V2.A05 = new C58x(new 9bM((Drawable) null, Integer.valueOf(7zP.A0S(c0z2.A00).A03(C1u3.A2Q)), -1), migColorScheme.B9O());
                A01(A003, A0V2, c2k5, 2131963504);
            }
            LightColorScheme.A00();
            A003.A0L(new C55g(c1u7, migColorScheme, 2KE.A04, 3yH.A09(c2k5, 2131963502), i2, i3, i3, j, false));
        }
        return CQY.A00(A003);
    }
}
