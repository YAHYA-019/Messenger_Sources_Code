package X;

import android.content.Context;
import com.facebook.auth.viewercontext.ViewerContext;
import com.facebook.common.dextricks.Constants;
import com.facebook.common.stringformat.StringFormatUtil;
import com.facebook.mobileconfig.init.MobileConfigInit;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/* renamed from: X.4rk, reason: invalid class name and case insensitive filesystem */
/* loaded from: 4rk.class */
public final class C09804rk implements InterfaceC04003zj {
    public 1BY A00;
    public final C15h A09 = new DBP(this, 49);
    public final C15h A08 = new DBP(this, 50);
    public final C15h A02 = new DBP(this, 51);
    public final 1R7 A03 = (1R7) 1Bi.A03(33053);
    public final C00i A06 = new 1BQ(16420);
    public final C00i A05 = new 1BV((1BY) null, Constants.LOAD_RESULT_DEX2OAT_CLASSPATH_SET);
    public final Set A01 = (Set) 1Bn.A0E((Context) null, (1BY) null, 213);
    public final C00i A04 = new 1BQ(99721);
    public final C00i A07 = new 1BQ(16385);

    public C09804rk(1BO r302) {
        this.A00 = new 1BY(r302);
    }

    public static void A00(1CL r301, C09804rk c09804rk) {
        C15h c15h = c09804rk.A02;
        if (c15h.get() != null) {
            C00i c00i = c09804rk.A05;
            1Bv r0 = (1Bv) c00i.get();
            ViewerContext viewerContext = (ViewerContext) c15h.get();
            synchronized (r0) {
                if (viewerContext != null) {
                    if (r0.A05.get() != null && 1Bv.A01(r0, viewerContext.mUserId)) {
                        1Cd A00 = AbstractC09394pz.A00((1CO) ((1C3) r0.A02.get()).A00.get());
                        if (A00 != null) {
                            A00.A0I();
                        }
                    }
                }
            }
            ((1Bv) c00i.get()).A02(r301);
        }
    }

    public static void A01(1CL r301, C09804rk c09804rk) {
        C15h c15h = c09804rk.A02;
        if (c15h.get() != null) {
            C00i c00i = c09804rk.A06;
            ((MobileConfigInit) c00i.get()).updateMobileConfigManagerHolderIfNecessary((ViewerContext) c15h.get());
            ((MobileConfigInit) c00i.get()).initNetwork(r301);
        }
    }

    public void A02(1CL r302, int i) {
        if (i == 0) {
            throw new IllegalArgumentException(StringFormatUtil.formatStrLocaleSafe("%d is unexpected unitType for setUpManagerForUpdate", Integer.valueOf(i)));
        }
        if (i == 1 || i == 2 || i == 3) {
            A01(r302, this);
        } else if (i == 4) {
            A00(r302, this);
        } else {
            throw new IllegalArgumentException(StringFormatUtil.formatStrLocaleSafe(1BJ.A00(598), Integer.valueOf(i)));
        }
    }

    public boolean A03(1CL r302, int i) {
        A01(r302, this);
        0fH.A0D(C09804rk.class, "Force updating configs synchronously with default updater");
        C05924fb c05924fb = new C05924fb();
        c05924fb.A03 = true;
        c05924fb.A00 = i;
        boolean updateConfigs = r302.updateConfigs(c05924fb);
        0fH.A09(C09804rk.class, Boolean.valueOf(updateConfigs), "Updated config result: %s");
        return updateConfigs;
    }

    @Override // X.InterfaceC04003zj
    public 4qU AZ3() {
        1CL r0 = (1CL) this.A09.get();
        1CL r02 = (1CL) this.A08.get();
        if (r0 == null && r02 == null) {
            return null;
        }
        1EK.A09("MobileConfigConfigurationComponent", 357833938572702L);
        try {
            this.A03.execute(C0jy.A02(new D9Y(r0, r02, this), "MobileConfigConfigurationComponent", 0));
            return null;
        } finally {
            1EK.A03();
        }
    }

    @Override // X.InterfaceC04003zj
    public long Axo() {
        C00i c00i = this.A07;
        if (!((2yD) c00i.get()).AZk(36325836957242390L) || !FEO.A01((FEO) this.A04.get())) {
            return 14400000L;
        }
        return Math.min(Math.max(TimeUnit.HOURS.toMillis(((2yD) c00i.get()).Auy(36607311933873850L)), 14400000L), 86400000L);
    }
}
