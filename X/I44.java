package X;

import android.app.Activity;
import android.content.Intent;
import android.os.Build;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.inject.FbInjector;
import com.facebook.rsys.screenshare.gen.ScreenShareApi;

/* loaded from: I44.class */
public final class I44 {
    public int A00;
    public Intent A01;
    public boolean A02;
    public final C1pu A03;
    public final 1Br A04;
    public final 1Br A05;
    public final 1Br A06;
    public final 1Br A07;
    public final 1Br A08;
    public final 1Br A09;
    public final 1Br A0A;
    public final 1Br A0B;
    public final 1Br A0C;
    public final 1BP A0D;
    public final 1De A0E;
    public final HVe A0F;

    public I44(FbUserSession fbUserSession, 1De r303) {
        11T.A0F(fbUserSession, 2);
        this.A0E = r303;
        this.A0D = FbInjector.A00;
        1BY r0 = r303.A00;
        this.A07 = 1Lm.A03(fbUserSession, r0, 98493);
        this.A0A = 1Bu.A03(r0, 115740);
        this.A0C = 1Bu.A03(r0, 147463);
        this.A0B = 1Bu.A03(r0, 115783);
        this.A04 = GOn.A0h(fbUserSession, r0);
        this.A09 = 1Lm.A03(fbUserSession, r0, 114911);
        this.A08 = GOn.A0i(fbUserSession, r0);
        this.A06 = 1Bq.A00(16485);
        this.A05 = 1Lm.A03(fbUserSession, r0, 84181);
        this.A00 = -1;
        this.A0F = new HVe(this);
        this.A03 = new Q5L(this);
    }

    public static final void A00(I44 i44, String str) {
        1Br.A0C(i44.A0C);
        Gy4 gy4 = ((HQ1) 1Bi.A03(115582)).A00;
        if (gy4 == null) {
            4zI.A03.A06("RsysScreenShareLauncher", "ScreenShareController is null", AnonymousClass001.A1Z());
            return;
        }
        C9lt.A00(str).A00.invoke(new C87p(true, 9));
        1Br.A0C(i44.A0B);
        gy4.A01 = new Hif(7zL.A09(), i44.A01, i44.A0F, i44.A00);
        if (Build.VERSION.SDK_INT < 34) {
            i44.A01();
        }
    }

    public void A01() {
        1Br.A0C(this.A0A);
        Ia1 A0d = GOq.A0d();
        ScreenShareApi B98 = A0d != null ? A0d.A02.B98() : null;
        4zJ r0 = 4zI.A03;
        Object[] objArr = new Object[0];
        if (B98 == null) {
            r0.A06("RsysScreenShareLauncher", "ScreenShareApi is null", objArr);
            return;
        }
        r0.A05("RsysScreenShareLauncher", "Enabling screensharing in rsys", objArr);
        4YV.A11(this.A06).execute(new Ix0(B98, true));
        IRo iRo = (JOA) 1Br.A0B(this.A09);
        iRo.A01 = 1Br.A01(iRo.A06);
        C00i c00i = iRo.A09.A00;
        ((HEp) c00i.get()).A00 = null;
        iRo.A02 = null;
        IRo.A00(iRo).A04(iRo.A04, "screen_sharing_mode_start", "SCREEN_SHARING");
        HEp hEp = (HEp) c00i.get();
        String str = hEp.A00;
        if (str == null) {
            str = 1BK.A0t();
            hEp.A00 = str;
        }
        IRo.A01(iRo, DKB.A00(529), (String) null, str, (String) null, -1);
        GOp.A0Q(this.A04).D0D(5);
    }

    public void A02(String str, Integer num) {
        ScreenShareApi B98;
        1Br.A0C(this.A0A);
        Ia1 A0d = GOq.A0d();
        if (A0d != null && (B98 = A0d.A02.B98()) != null) {
            IRo iRo = (JOA) 1Br.A0B(this.A09);
            11T.A0F(num, 0);
            iRo.A02 = num;
            4YV.A11(this.A06).execute(new Ix0(B98, false));
            C00i c00i = this.A04.A00;
            JOL jol = GOq.A0Z(c00i).A08;
            if (jol != null && jol.getType() == 5) {
                ((JOS) c00i.get()).ChU("none");
            }
            C9lt.A00(str).A00.invoke(new C87p(false, 9));
            if (!this.A02) {
                CNY.A00((Activity) null, (CNY) 1Br.A0B(this.A05), (1K9) null, "ScreenSharingLauncherControllerRsysImpl_switch_to_camera", false, false);
            }
        }
        this.A02 = false;
    }
}
