package X;

import android.graphics.drawable.Drawable;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.8d1, reason: invalid class name */
/* loaded from: 8d1.class */
public final class C8d1 extends 1LH {
    public final MigColorScheme A00;
    public final AnonymousClass970 A01;
    public final C5xv A02;
    public final CharSequence A03;
    public final CharSequence A04;
    public final List A05;
    public final boolean A06;

    public C8d1(MigColorScheme migColorScheme, AnonymousClass970 anonymousClass970, C5xv c5xv, CharSequence charSequence, CharSequence charSequence2, List list, boolean z) {
        11T.A0F(migColorScheme, 1);
        this.A00 = migColorScheme;
        this.A01 = anonymousClass970;
        this.A02 = c5xv;
        this.A04 = charSequence;
        this.A03 = charSequence2;
        this.A06 = z;
        this.A05 = list;
    }

    public 1LI A0s(C2k5 c2k5) {
        C2cp c2cp;
        2cL r304;
        2K3 r3042;
        C1u2 A0G = 7zS.A0G(c2k5, 0);
        C1ro c1ro = C1ro.CENTER;
        2lQ r0 = 2lO.A02;
        Integer num = 0S2.A0C;
        2dA r309 = null;
        2lO A0g = 7zL.A0g((2lO) null, 7zL.A0k(num, 0.0f));
        long doubleToRawLongBits = Double.doubleToRawLongBits(56.0d);
        Integer num2 = 0S2.A01;
        2lO A0K = 4YV.A0K(A0g, num2, doubleToRawLongBits);
        2RH r02 = 2RH.A04;
        long A06 = 4YV.A06(r02);
        long doubleToRawLongBits2 = Double.doubleToRawLongBits(3.0d);
        AnonymousClass970 anonymousClass970 = this.A01;
        List list = this.A05;
        if (list != null && !list.isEmpty()) {
            list.get(list.size() - 1);
            throw AnonymousClass001.A0Q("getEdgePaddingDp");
        }
        long A08 = 7zL.A08(anonymousClass970 != null ? anonymousClass970.iconSizeDp : r02.A00());
        2lO A0a = 7zT.A0a(A0K, 7zL.A0i(0S2.A0u, A06), doubleToRawLongBits2);
        Integer num3 = 0S2.A1G;
        2lO A0Y = 7zT.A0Y(A0a, 7zL.A0i(num3, A08), doubleToRawLongBits2);
        C2sn A0L = 7zR.A0L(c2k5);
        2lO A0P = 7zS.A0P(7zQ.A0X((2lO) null, num, 0.0f), 1.0d);
        1Iw r03 = A0L.A00;
        C2sn A0U = 7zQ.A0U(r03);
        C5xv c5xv = this.A02;
        if (anonymousClass970 == null || c5xv == null) {
            c2cp = null;
        } else {
            long A082 = 7zL.A08(anonymousClass970.iconSizeDp);
            Integer num4 = 0S2.A00;
            2lO A0d = 7zS.A0d(7zR.A0Q(4YV.A0L(4YV.A0L(7zT.A0k((2lO) null, num4, num2, A082), num4, c1ro, 0), num3, new AVE(c5xv, 30), 1), num2, "android.widget.ImageView"), 3yH.A09(A0U, anonymousClass970.contentDescriptionResId));
            Drawable A09 = A0G.A09(anonymousClass970.iconName, anonymousClass970.iconSize, this.A00.B4h());
            11T.A0D(A09);
            c2cp = 7zT.A0m(A09, A0U.AeS(), A0d);
        }
        A0U.A00(c2cp);
        A0L.A00(C2so.A0H(A0U, A0L, A0P));
        2lO A0J = 7zT.A0J(7zS.A0Y((2lO) null, num2), 7zM.A01());
        C2sn A0U2 = 7zQ.A0U(r03);
        CharSequence charSequence = this.A04;
        CharSequence charSequence2 = this.A03;
        boolean z = this.A06;
        if (charSequence == null || charSequence.length() == 0) {
            r304 = null;
        } else {
            C2sn A0J2 = 7zS.A0J(A0U2);
            C2cl c2cl = null;
            2lO A0K2 = 4YV.A0K((2lO) null, num3, 7zO.A09());
            int i = 0;
            if (z) {
                i = -1;
            }
            2lO A0L2 = 7zT.A0L(A0K2, i);
            1Iw AeS = A0J2.AeS();
            C2sn A0U3 = 7zQ.A0U(AeS);
            if (z) {
                C2cm A0M = 7zO.A0M(A0U3);
                A0M.A2a(A0G.A04(C1u3.A48, 9FO.A00));
                7zU.A1B(A0M);
                7zM.A1H(A0M, this.A00);
                7zO.A1L(A0M, 2RH.A07);
                c2cl = 7zN.A09(A0M);
            }
            A0U3.A00(c2cl);
            2KD A0a2 = 7zO.A0a(A0U3, 0);
            A0a2.A2z(charSequence);
            A0a2.A2q(1);
            MigColorScheme migColorScheme = this.A00;
            7zU.A1T(migColorScheme, A0a2);
            A0a2.A31(false);
            A0a2.A2Z();
            7zN.A1Q(A0U3, A0a2);
            A0J2.A00(C2so.A0K(A0U3, A0J2, A0L2));
            if (charSequence2 == null || charSequence2.length() == 0) {
                r3042 = null;
            } else {
                2KD A13 = 7zM.A13(AeS, charSequence2, 0);
                A13.A2q(1);
                7zQ.A1M(migColorScheme, A13);
                A13.A31(false);
                A13.A2Z();
                r3042 = A13.A2W();
            }
            A0J2.A00(r3042);
            r304 = C2so.A01(A0J2);
        }
        A0U2.A00(r304);
        7zU.A1G(A0U2, A0L, A0J);
        if (list != null && !list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                it.next();
            }
            C2yw A00 = 2dA.A00(A0L.AeS());
            ArrayList A0s = AnonymousClass001.A0s();
            Iterator it2 = list.iterator();
            if (it2.hasNext()) {
                it2.next();
                throw AnonymousClass001.A0Q("createComponent");
            }
            A00.A2Y(A0s);
            A00.A0S();
            A00.A0J();
            r309 = A00.A01;
        }
        return 7zM.A0n(r309, A0L, c2k5, A0Y);
    }
}
