package X;

import android.R;
import android.content.Context;

/* loaded from: Fw5.class */
public final class Fw5 implements 1K9 {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final boolean A04;

    public Fw5(int i, Object obj, Object obj2, Object obj3, boolean z) {
        this.A00 = i;
        this.A01 = obj3;
        this.A03 = obj2;
        this.A04 = z;
        this.A02 = obj;
    }

    public void onFailure(Throwable th) {
        1G2 r0;
        ECW ecw;
        if (this.A00 != 0 || (r0 = (1G2) this.A02) == null || (ecw = (ECW) this.A03) == null) {
            return;
        }
        FId fId = (FId) this.A01;
        boolean z = this.A04;
        C2121Dea A03 = C2121Dea.A03(fId.A0F);
        A03.A06(2131952804);
        A03.A05(2131952803);
        A03.A0E(new FK7(fId, r0, ecw, 0, z), 2131952805);
        A03.A0D(new FK7(fId, r0, ecw, 1, z), R.string.cancel);
        A03.A0C(false);
        AbM.A1I(A03);
        1BK.A09(fId.A0G).softReport("AppUpdateSettings", 0Pz.A0V("Failed to persist setting:", r0), th);
    }

    public void onSuccess(Object obj) {
        Object obj2;
        C2219Dhb c2219Dhb;
        if (this.A00 != 0) {
            AbstractC08294mh abstractC08294mh = (AbstractC08294mh) obj;
            if (abstractC08294mh == null || (obj2 = abstractC08294mh.A03) == null || (c2219Dhb = (C2219Dhb) ((2JY) obj2).A0L(-823602322, C2219Dhb.class, -1114354488)) == null) {
                return;
            }
            GIs gIs = (GIs) this.A03;
            if (gIs != null) {
                gIs.C4f(this.A04);
            }
            1BK.A05().putBoolean("hide_dialtone_toggle", true);
            ((F8b) this.A01).A04.A00((Context) this.A02, c2219Dhb);
            return;
        }
        1G3 r0 = (1G3) this.A02;
        if (r0 != null) {
            String A08 = r0.A08();
            boolean z = this.A04;
            0fH.A0d(A08, Boolean.toString(z), "AppUpdateSettings", "Updated Setting %s:%s");
            FId fId = (FId) this.A01;
            String A082 = r0.A08();
            1UG A083 = 1BK.A08(1BK.A07(fId.A0I), "appmanager_firstparty_setting_changed");
            if (fId.A02 == null || !A083.isSampled()) {
                return;
            }
            A083.A5H("newValue", Boolean.valueOf(z));
            A083.A7R("package_name", fId.A02.A06);
            A083.A7R(AbE.A00(724), A082);
            A083.BZL();
        }
    }
}
