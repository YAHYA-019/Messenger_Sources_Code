package com.facebook.common.dextricksdi;

import X.0dF;
import X.1BQ;
import X.1Bi;
import X.1CQ;
import X.1Nq;
import X.2yD;
import X.C00i;
import X.C09184pa;
import X.C0k1;
import X.C0k2;
import android.content.Context;
import android.os.SystemClock;
import com.facebook.common.dextricks.Experiments;
import com.facebook.inject.FbInjector;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: ColdstartExperimentsController.class */
public final class ColdstartExperimentsController implements 1Nq {
    public static final AtomicLong A07 = new AtomicLong(Long.MAX_VALUE);
    public static final Object A06 = new Object();
    public final Context A00 = FbInjector.A00();
    public final C00i A04 = new 1BQ(131252);
    public final C00i A05 = new 1BQ(16385);
    public final C00i A02 = new 1BQ(16387);
    public final C00i A03 = new 1BQ(16511);
    public final C09184pa A01 = (C09184pa) 1Bi.A03(66851);

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0054, code lost:
    
        if (((X.2yD) r0.get()).AZk(36312127422861437L) != false) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void A00() {
        /*
            Method dump skipped, instructions count: 745
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.common.dextricksdi.ColdstartExperimentsController.A00():void");
    }

    private void A01(int i, String str) {
        C0k1.A02(this.A00, str, ((1CQ) this.A04.get()).A09(i, false));
    }

    /* JADX WARN: Type inference failed for: r0v55, types: [X.0dF, java.lang.Object] */
    public void A02() {
        A07.set(SystemClock.elapsedRealtime());
        A01(78, Experiments.MDCLAN_BLACKLIST_GK_ENABLED_FILENAME);
        A01(0, Experiments.ANDROID_ABORTHOOKS_ENABLED);
        A01(4, Experiments.ANDROID_ENABLE_OXYGEN_CRASH_REPORTER);
        A00();
        boolean A09 = ((1CQ) this.A04.get()).A09(62, false);
        Context context = this.A00;
        C0k1.A02(context, Experiments.ENABLE_IO_LOGGING_ACROSS_ADD_DEXES, A09);
        C00i c00i = this.A05;
        C0k1.A02(context, Experiments.DISABLE_DEX_VERIFIER, ((2yD) c00i.get()).AZk(36314030092524995L));
        C0k1.A02(context, Experiments.DISABLE_DEX_COLLISION_CHECK, ((2yD) c00i.get()).AZk(36314030092590532L));
        C0k1.A02(context, Experiments.MDCLJ_USE_DUMMY_EXCEPTION, false);
        C0k1.A02(context, Experiments.USE_REFLECTION_CLASSLOADER, ((2yD) c00i.get()).AZk(36314030093376966L));
        C0k1.A02(context, Experiments.SKIP_MANIFEST, ((2yD) c00i.get()).AZk(36324995143782651L));
        C0k1.A02(context, Experiments.USE_MDCLL, ((2yD) c00i.get()).AZk(36324995143848188L));
        C0k1.A02(context, Experiments.DISABLE_DEX_ISUPTODATE_CHECK, ((2yD) c00i.get()).AZk(36311354328156930L));
        C0k1.A02(context, Experiments.ENABLED_MPROTECT_CODE_BACKGROUND, ((2yD) c00i.get()).AZk(36312556918477531L));
        ?? obj = new Object();
        ((0dF) obj).A00 = context;
        C0k2.A02(obj, Experiments.DISABLE_ARTDEBUGFIX);
        if (((2yD) this.A02.get()).AZk(72339906533329340L)) {
            C0k1.A02(context, Experiments.DISABLE_ARTDEBUGFIX, true);
        }
        C0k1.A02(context, Experiments.MDCLJ_LRU_DISABLE, ((2yD) c00i.get()).AZk(36324995143913725L));
    }

    public int Adi() {
        return -1;
    }

    public void BqJ(int i) {
        if (SystemClock.elapsedRealtime() - A07.get() > 10000) {
            A02();
        } else if (i == 14373) {
            A00();
        }
    }
}
