package X;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import com.facebook.zero.common.ZeroToken;
import com.facebook.zero.common.ZeroTrafficEnforcementConfig;
import com.google.common.collect.ImmutableSet;
import java.util.Iterator;

/* loaded from: Fw6.class */
public final class Fw6 implements 1K9 {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final String A04;

    public Fw6(Object obj, Object obj2, Object obj3, String str, int i) {
        this.A00 = i;
        this.A01 = obj2;
        this.A03 = obj3;
        this.A02 = obj;
        this.A04 = str;
    }

    public void onFailure(Throwable th) {
        switch (this.A00) {
            case 2:
                Ejo ejo = (Ejo) this.A03;
                F3V.A00.markerEnd(ejo.A01, ejo.A00, (short) 3);
                ((Ev1) this.A01).A00.set(false);
                return;
            case 3:
                Emc emc = (Emc) this.A02;
                emc.A00.ANn(new EEd(emc.A01, (3oF) null, false));
                EoG eoG = (EoG) this.A01;
                if (((1Pz) eoG.A03.get()).A02()) {
                    return;
                }
                ((2BV) eoG.A01.get()).A07((1QE) this.A03, (45G) null, this.A04, th, false);
                return;
            default:
                FEK.A01(DKM.A05(DKM.A00(), ""), (GJj) this.A02, this.A01);
                return;
        }
    }

    public /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        Object obj2;
        2JX A0L;
        View A0F;
        GJj gJj;
        DKM A00;
        switch (this.A00) {
            case 2:
                AbstractC08294mh abstractC08294mh = (AbstractC08294mh) obj;
                Ejo ejo = (Ejo) this.A03;
                F3V.A00.markerEnd(ejo.A01, ejo.A00, (short) 2);
                Ev1 ev1 = (Ev1) this.A01;
                ev1.A00.set(false);
                if (abstractC08294mh == null || (obj2 = abstractC08294mh.A03) == null || (A0L = 1BL.A0L((2JY) obj2, -8488387, -1622131370)) == null) {
                    return;
                }
                Context context = (Context) this.A02;
                Eux eux = (Eux) 1Hv.A02(context, 99540);
                1BK.A05().putBoolean("hide_dialtone_toggle", true);
                C00i c00i = ev1.A01;
                if (!DKE.A1X(c00i)) {
                    String A04 = DKF.A0i(ev1.A04).A04("zboff_auto_paid_snackbar", context.getString(2131953062));
                    Activity A05 = DKG.A05(c00i);
                    if (A05 != null && (A0F = 7zM.A0F(A05)) != null) {
                        L5Q A002 = KXg.A00(A0F, A04, -2);
                        A002.A01.A0C(FXs.A00(A002, this, 80), DKF.A0o(context));
                        A002.A02();
                    }
                }
                eux.A00(context, A0L.A22());
                4YU.A0d(ev1.A02).A01(this.A04);
                return;
            case 3:
                ZeroToken zeroToken = (ZeroToken) obj;
                Emc emc = (Emc) this.A02;
                String str = zeroToken.A0A;
                String str2 = zeroToken.A0B;
                String str3 = zeroToken.A0C;
                String str4 = zeroToken.A0D;
                String str5 = zeroToken.A0F;
                ImmutableSet immutableSet = zeroToken.A09;
                11T.A0F(immutableSet, 0);
                Fue fue = new Fue();
                Iterator it = immutableSet.iterator();
                while (it.hasNext()) {
                    fue.A01(it.next());
                }
                String str6 = zeroToken.A0G;
                String str7 = zeroToken.A0H;
                String str8 = zeroToken.A0I;
                String str9 = zeroToken.A0J;
                int i = zeroToken.A00;
                1Pr A01 = 2C8.A01(zeroToken.A06);
                1Pr A012 = 2C8.A01(zeroToken.A05);
                String str10 = zeroToken.A0M;
                String str11 = zeroToken.A0K;
                String str12 = zeroToken.A0L;
                int i2 = zeroToken.A01;
                1Pr A003 = EYD.A00(zeroToken.A07);
                ZeroTrafficEnforcementConfig zeroTrafficEnforcementConfig = zeroToken.A04;
                emc.A00.ANn(new EEd(emc.A01, new 3oF(new C4V3(), new C4VH(EYD.A00(zeroTrafficEnforcementConfig.mSubnetsWhiteList), (long) (zeroTrafficEnforcementConfig.mPassRate * 100.0d), zeroTrafficEnforcementConfig.mTorqueEnabled), A01, A012, A003, fue, str, str11, str9, str2, str4, str3, str10, str8, str7, str12, str6, str5, i, i2, 84600), true));
                EoG eoG = (EoG) this.A01;
                if (((1Pz) eoG.A03.get()).A02()) {
                    return;
                }
                ((2BV) eoG.A01.get()).A04(1Fw.A00(), zeroToken, (1QE) this.A03, (45G) null, this.A04, false);
                return;
            default:
                String str13 = (String) obj;
                if (str13 != null) {
                    ((Ezs) this.A03).A04(this.A04, str13);
                    gJj = (GJj) this.A02;
                    A00 = DKM.A00();
                } else {
                    gJj = (GJj) this.A02;
                    A00 = DKM.A00();
                    str13 = "";
                }
                FEK.A01(DKM.A05(A00, str13), gJj, this.A01);
                return;
        }
    }
}
