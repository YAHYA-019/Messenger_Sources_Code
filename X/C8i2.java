package X;

import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.highlightstab.immersivecolorschemes.HTImmersiveFixedColorScheme;
import com.facebook.messaging.highlightstab.model.HighlightsFeedContent;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import com.mapbox.mapboxsdk.R;
import java.util.LinkedHashSet;
import kotlin.jvm.functions.Function1;

/* renamed from: X.8i2, reason: invalid class name */
/* loaded from: 8i2.class */
public final class C8i2 extends 1LH {
    public final View A00;
    public final 06Z A01;
    public final FbUserSession A02;
    public final 9cG A03;
    public final C9ty A04;
    public final C9cn A05;
    public final 9bF A06;
    public final 9Tf A07;
    public final C9yk A08;
    public final AZg A09;
    public final boolean A0A;
    public final boolean A0B;
    public final 08D A0C;
    public static final long A0E = 7zP.A08();
    public static final long A0D = 7zP.A0F();

    public C8i2(View view, 08D r303, 06Z r304, FbUserSession fbUserSession, 9cG r306, C9ty c9ty, C9cn c9cn, 9bF r309, 9Tf r310, C9yk c9yk, AZg aZg, boolean z, boolean z2) {
        11T.A0F(c9yk, 2);
        7zT.A11(3, fbUserSession, r304, r309, c9ty);
        7zS.A18(7, r310, r306, aZg);
        11T.A0F(view, 12);
        this.A05 = c9cn;
        this.A08 = c9yk;
        this.A02 = fbUserSession;
        this.A01 = r304;
        this.A06 = r309;
        this.A04 = c9ty;
        this.A07 = r310;
        this.A03 = r306;
        this.A09 = aZg;
        this.A0C = r303;
        this.A0B = z;
        this.A00 = view;
        this.A0A = z2;
        r310.A00 = this;
    }

    public static final void A01(RecyclerView recyclerView, C1rn[] c1rnArr, C1rn[] c1rnArr2, float f, float f2) {
        LinearLayoutManager linearLayoutManager;
        2XA r0 = recyclerView.A0F;
        if (!(r0 instanceof LinearLayoutManager) || (linearLayoutManager = (LinearLayoutManager) r0) == null) {
            return;
        }
        07E r02 = new 07E(linearLayoutManager.A1h(), linearLayoutManager.A1j());
        LinkedHashSet A15 = 7zL.A15();
        int i = ((07F) r02).A00;
        int i2 = ((07F) r02).A01;
        if (i <= i2) {
            while (true) {
                if (linearLayoutManager.A0c(i) != null) {
                    float max = Math.max(-1.0f, Math.min(1.0f, r0.getTop() / f2));
                    int i3 = i % 20;
                    A15.add(Integer.valueOf(i3));
                    7zN.A1G(c1rnArr[i3], 1.0f - (Math.abs(max) * 0.7f));
                    7zN.A1G(c1rnArr2[i3], Math.max(0.0f, max) * (-1.0f) * f);
                }
                if (i == i2) {
                    break;
                } else {
                    i++;
                }
            }
        }
        int i4 = 0;
        do {
            if (!A15.contains(Integer.valueOf(i4))) {
                7zN.A1G(c1rnArr[i4], 1.0f);
            }
            i4++;
        } while (i4 < 20);
    }

    public 1LI A0s(C2k5 c2k5) {
        0ES A0C;
        11T.A0F(c2k5, 0);
        MigColorScheme migColorScheme = (MigColorScheme) 1Bn.A0A(67718);
        FbUserSession fbUserSession = this.A02;
        1Br A00 = 1Lm.A00(3vP.A00(c2k5), fbUserSession, 68108);
        0fH.A0j("HTImmersiveLazyListView", "Calling render on HTImmersiveLazyListView");
        float A002 = 7zQ.A00(c2k5, AQl.A01(c2k5, 3), new Object[0]);
        C1rn[] c1rnArr = new C1rn[20];
        int i = 0;
        do {
            c1rnArr[i] = 4NN.A01(c2k5, 7zN.A0g());
            i++;
        } while (i < 20);
        08D r0 = this.A0C;
        float f = (r0 == null || (A0C = r0.A00.A0C(7)) == null) ? 0.0f : A0C.A03;
        C1rn[] c1rnArr2 = new C1rn[20];
        int i2 = 0;
        do {
            c1rnArr2[i2] = 4NN.A01(c2k5, Float.valueOf(f));
            i2++;
        } while (i2 < 20);
        4NU A003 = 4NT.A00(c2k5, AMM.A00);
        Jtz jtz = (Jtz) 2rO.A00(c2k5, AMP.A00, new Object[0]);
        1Br A004 = 1Bq.A00(68561);
        1Br A0S = 7zM.A0S();
        C5it c5it = (C5it) 2rO.A00(c2k5, AQg.A00(c2k5, A0S, 32), new Object[0]);
        C2lh A005 = C2lc.A00(c2k5, AML.A00);
        04S r02 = 04S.A00;
        4FL.A00(c2k5, new AKy(c5it, A0S, c2k5, A003, A005, jtz, this, c1rnArr, c1rnArr2, f), new Object[]{r02});
        Function1 A01 = 4FN.A01(c2k5, new ARP(c2k5, A003, this, c1rnArr, c1rnArr2, f));
        Function1 A012 = 4FN.A01(c2k5, AVC.A01(c5it, 39));
        C2lh A006 = C2lc.A00(c2k5, AMO.A00);
        4FL.A00(c2k5, AQg.A00(this, A006, 28), new Object[]{r02});
        C2lh A007 = C2lc.A00(c2k5, AMN.A00);
        4FL.A00(c2k5, AQg.A00(this, A007, 30), new Object[]{r02});
        C00m A008 = 4FN.A00(c2k5, AQl.A01(this, 7));
        9N0 r03 = (9N0) 2rO.A00(c2k5, AQl.A01(4FN.A00(c2k5, AQl.A01(this, 6)), 5), new Object[0]);
        HTImmersiveFixedColorScheme A0U = 7zN.A0C(966).A0U(migColorScheme);
        int AZN = migColorScheme.AZN();
        C9cn c9cn = this.A05;
        8LH A009 = c9cn.A00();
        HighlightsFeedContent A0010 = A009.A00();
        C5c2 A0011 = 9CQ.A00(A0010 != null ? A0010.A01 : null);
        9cG r04 = this.A03;
        8Dm A013 = C9d1.A01(c2k5, null, 7zL.A0w(3yH.A02(c2k5)), 7zL.A0w(A0E), 7zL.A0w(A0D));
        2lQ r05 = 2lO.A02;
        Integer num = 0S2.A00;
        2lO A0Z = 7zQ.A0Z(7zS.A0a((2lO) null, num, AZN), num, A01);
        Integer num2 = 0S2.A01;
        2lO A0Z2 = 7zQ.A0Z(A0Z, num2, A012);
        AWF awf = new AWF(A00, this, 2);
        AQg A0012 = AQg.A00(this, A0011, 31);
        AWH awh = new AWH(0, A006, A004, A007, this, A0011);
        long A08 = 7zP.A08();
        2NI r06 = C8nc.A0O;
        1Iw r07 = c2k5.A05;
        C02A c02a = r07.A03.A01;
        C1J8 c1j8 = c02a.A02;
        boolean z = c02a.A0X;
        C9sn A0013 = C9sn.A00(r07);
        C9sn.A04(A0013, A009.A01, ASW.A00, new AVh(c2k5, A005, this, A0U, c1rnArr, c1rnArr2, f, AZN));
        if (!this.A0A) {
            if (1BK.A1X(c9cn.A01().A00, false)) {
                0fH.A0l("HTImmersiveLazyListView", "No more pages left, Show EOF");
                2lO A0K = 4YV.A0K(7zS.A0X((2lO) null, A0013, num2, R.dimen.mapbox_locationComponentTrackingMultiFingerMoveThreshold), 0S2.A05, 3yH.A02(A0013));
                C2sn A0U2 = 7zQ.A0U(A0013.A00);
                2KD A0r = 7zL.A0r(A0U2, 0);
                7zQ.A1T(A0r, 3yH.A09(A0U2, 2131957818));
                11T.A0I(A0U, DKB.A00(474));
                A0r.A2x(A0U);
                A0r.A32(true);
                A0r.A01.A0A = 2K5.A03;
                7zN.A1Q(A0U2, A0r);
                C9sn.A01(C9dF.A00(C2so.A0N(A0U2, A0013, A0K), A0013, new 8Ke(C95j.A02, 0, 0, -1, false), this.A09), A0013, null);
            } else {
                0fH.A0l("HTImmersiveLazyListView", "Has more pages, Show loading indicator");
                2lO A04 = C82m.A04(7zS.A0Z((2lO) null, num2, A002), num, 100.0f, 0);
                C2sn A0U3 = 7zQ.A0U(A0013.A00);
                A0U3.A00(new 8VY(fbUserSession, migColorScheme));
                8O3 A0014 = 8nD.A00(A0U3.A00);
                A0014.A0l(A002);
                A0014.A10(100.0f);
                A0014.A0c();
                A0014.A01.A01 = AZN;
                A0014.A0J();
                C9sn.A01(7zM.A0l(A0014.A01, A0U3, A0013, A04), A0013, null);
            }
        }
        return new C8ej(r06, A013, null, A0Z2, null, C9mj.A02(r07, c1j8, 7zN.A03(c2k5, A08), z), A0013.A01, r04, r03, null, null, null, null, null, null, null, null, null, null, A0012, A008, awf, awh, true);
    }
}
