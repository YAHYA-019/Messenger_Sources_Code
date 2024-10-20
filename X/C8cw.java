package X;

import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import com.facebook.messaging.sharedalbum.viewstate.SharedAlbumViewState;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import java.util.List;
import kotlin.jvm.functions.Function2;

/* renamed from: X.8cw, reason: invalid class name */
/* loaded from: 8cw.class */
public final class C8cw extends 1LH {
    public final int A00;
    public final SharedAlbumViewState A01;
    public final MigColorScheme A02;
    public final Function2 A03;
    public final 1LI A04;
    public final 2lO A05;
    public final boolean A06;

    public C8cw(1LI r302, 2lO r303, SharedAlbumViewState sharedAlbumViewState, MigColorScheme migColorScheme, Function2 function2, int i, boolean z) {
        7zR.A1O(migColorScheme, sharedAlbumViewState);
        11T.A0F(function2, 5);
        this.A00 = i;
        this.A02 = migColorScheme;
        this.A01 = sharedAlbumViewState;
        this.A04 = r302;
        this.A03 = function2;
        this.A05 = r303;
        this.A06 = z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v161, types: [X.1LI] */
    public 1LI A0s(C2k5 c2k5) {
        int i;
        String A00;
        11T.A0F(c2k5, 0);
        2lO r306 = this.A05;
        Integer num = 0S2.A01;
        2lT A0k = 7zL.A0k(num, 1.0f);
        if (r306 == 2lO.A02) {
            r306 = null;
        }
        2lO A0g = 7zL.A0g(r306, A0k);
        long A0B = 7zQ.A0B();
        long A08 = 7zQ.A08();
        2lO A0P = 7zS.A0P(A0g, 4.0d);
        Integer num2 = 0S2.A0u;
        2lO A0K = 4YV.A0K(A0P, num2, A0B);
        Integer num3 = 0S2.A1G;
        2lO A0L = 4YV.A0L(4YV.A0K(A0K, num3, A08), num3, AV2.A00(this, 41), 1);
        C1rp c1rp = C1rp.SPACE_BETWEEN;
        C1ro c1ro = C1ro.CENTER;
        1Iw r0 = c2k5.A05;
        C2sn A0U = 7zQ.A0U(r0);
        SharedAlbumViewState sharedAlbumViewState = this.A01;
        final List list = sharedAlbumViewState.A06;
        if (1BK.A1Y(list)) {
            final MigColorScheme migColorScheme = this.A02;
            final String valueOf = String.valueOf(sharedAlbumViewState.A02);
            final AnonymousClass889 anonymousClass889 = AnonymousClass889.A04;
            final String str = null;
            final boolean z = false;
            A0U.A00(new 1LH(migColorScheme, anonymousClass889, valueOf, str, list, z) { // from class: X.8gk
                public final AnonymousClass889 A00;
                public final String A01;
                public final String A02;
                public final List A03;
                public final MigColorScheme A04;
                public final boolean A05;

                {
                    1BL.A1H(migColorScheme, list, valueOf);
                    this.A04 = migColorScheme;
                    this.A03 = list;
                    this.A01 = valueOf;
                    this.A00 = anonymousClass889;
                    this.A05 = z;
                    this.A02 = str;
                }

                private final AnonymousClass888 A01(C2k6 c2k6, String str2, String str3, String str4, boolean z2) {
                    C6ni c6ni;
                    List A12 = C0s8.A12(7zQ.A0v().A07());
                    AnonymousClass889 anonymousClass8892 = this.A00;
                    if (anonymousClass8892.hasDefaultBorder && (str3 == null || str3.length() == 0)) {
                        C6nh A0R = 7zO.A0R(c2k6.AeS(), 0);
                        C26z c26z = C26z.ALL;
                        A0R.A08(c26z, this.A04.Ami());
                        A0R.A07(c26z, 1.0f);
                        A0R.A0C(new float[]{10.0f, 10.0f});
                        A0R.A02(6.0f);
                        c6ni = A0R.A01();
                    } else {
                        c6ni = null;
                    }
                    return new AnonymousClass888(c6ni, null, null, null, 88A.A04, C1ro.CENTER, z2 ? C1rp.SPACE_EVENLY : C1rp.SPACE_BETWEEN, false, Integer.valueOf(z2 ? this.A04.Abp() : anonymousClass8892.hasDefaultBorder ? this.A04.Amg() : 0), null, null, str2, str3, str4, null, c2k6.AeS().A0D(2131952173), null, "", A12, C0ty.A00, null, 15.0f, 3, AnonymousClass001.A1T(str4), this.A05, false, false);
                }

                /* JADX WARN: Code restructure failed: missing block: B:4:0x004f, code lost:
                
                    if (((X.C6jQ) X.1Br.A0B(r0)).A04 == false) goto L6;
                 */
                /* JADX WARN: Type inference failed for: r0v37, types: [X.70t, java.lang.Object] */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public X.1LI A0s(X.C2k5 r302) {
                    /*
                        Method dump skipped, instructions count: 361
                        To view this dump change 'Code comments level' option to 'DEBUG'
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C8gk.A0s(X.2k5):X.1LI");
                }
            });
        }
        C1ro c1ro2 = C1ro.STRETCH;
        2lO A0L2 = 4YV.A0L(7zT.A0M(C82m.A00(7zQ.A0X((2lO) null, num, 1.0f), 0), 24.0d), num2, true, 1);
        C2sn A0K2 = 7zS.A0K(A0U);
        String str2 = sharedAlbumViewState.A05;
        long doubleToRawLongBits = Double.doubleToRawLongBits(17.0d);
        MigColorScheme migColorScheme2 = this.A02;
        int B4i = migColorScheme2.B4i();
        Typeface typeface = Typeface.DEFAULT;
        long A082 = 7zP.A08();
        1Iw r02 = A0K2.A00;
        3yF A0v = 7zM.A0v(r02, str2, 0);
        7zS.A1Q(A0K2, A0v, B4i, doubleToRawLongBits);
        A0v.A33(0);
        A0v.A34(typeface);
        7zU.A1H(A0K2, A0v, 0, A082);
        7zU.A1K(A0v, true);
        A0v.A2i(0.0f);
        7zO.A1R(A0v, true, false);
        A0v.A2a();
        A0v.A1w(null);
        7zR.A13((2K8) null, A0K2, A0v);
        long j = sharedAlbumViewState.A01;
        long j2 = sharedAlbumViewState.A03;
        if (j2 > j) {
            i = 2131952734;
            A00 = L1M.A00.A00(3vP.A00(A0K2), j2);
        } else {
            i = 2131952733;
            A00 = L1M.A00.A00(3vP.A00(A0K2), j);
        }
        String A0A = 3yH.A0A(A0K2, A00 != null ? A00 : "", i);
        long doubleToRawLongBits2 = Double.doubleToRawLongBits(13.0d);
        int B9Q = migColorScheme2.B9Q();
        3yF A0v2 = 7zM.A0v(r02, A0A, 0);
        7zS.A1Q(A0K2, A0v2, B9Q, doubleToRawLongBits2);
        A0v2.A33(0);
        A0v2.A34(typeface);
        7zU.A1H(A0K2, A0v2, 0, A082);
        A0v2.A2q(1.0f);
        7zV.A11(A0v2, false);
        7zR.A13((2K8) null, A0K2, A0v2);
        A0U.A00(C2so.A09(A0K2, A0U, A0L2, c1ro2));
        1LI r304 = this.A04;
        if (r304 == null) {
            int i2 = sharedAlbumViewState.A00;
            C1u2 A0I = 4YV.A0I();
            String A09 = i2 > 999 ? 3yH.A09(A0U, 2131952732) : String.valueOf(i2);
            Drawable A083 = A0I.A08(C1u3.A1a, migColorScheme2.B9Q());
            2lO A0W = 7zS.A0W((2lO) null, 7zL.A0k(0S2.A0C, 0.0f), num2, true, 1);
            C2sn A0J = 7zS.A0J(A0U);
            int B9Q2 = migColorScheme2.B9Q();
            1Iw r03 = A0J.A00;
            3yF A0v3 = 7zM.A0v(r03, A09, 0);
            7zS.A1Q(A0J, A0v3, B9Q2, doubleToRawLongBits);
            A0v3.A33(0);
            A0v3.A34(typeface);
            7zU.A1H(A0J, A0v3, 0, A082);
            7zU.A1K(A0v3, true);
            A0v3.A2i(0.0f);
            7zO.A1R(A0v3, true, false);
            A0v3.A1w(null);
            7zR.A13((2K8) null, A0J, A0v3);
            C2cq A0u = 7zM.A0u(A083, r03, 0);
            7zU.A1B(A0u);
            A0u.A1J(2131952731);
            A0u.A24(C26z.LEFT, 4.0f);
            A0u.A2Y();
            7zN.A1O(A0J, A0u);
            r304 = C2so.A0I(A0J, A0U, A0W);
        }
        A0U.A00(r304);
        C1rh A0T = C2so.A0T(A0U, c2k5, A0L, c1ro, c1ro, c1rp);
        if (this.A06) {
            AbstractC2150Dfe A0g2 = EVm.A00(r0).A0g(A0T);
            A0g2.A04 = 7zO.A0U(AV2.A00(this, 40));
            A0T = 7zV.A0D(A0g2, A0T, r0, "view-album-button");
        }
        return A0T;
    }
}
