package com.facebook.push.init;

import X.04J;
import X.0fH;
import X.1BJ;
import X.1BK;
import X.1BQ;
import X.1BV;
import X.1Bi;
import X.1Bn;
import X.1EZ;
import X.1Fw;
import X.1H2;
import X.1Pt;
import X.1XS;
import X.1Zt;
import X.2yD;
import X.4CX;
import X.4rJ;
import X.5Jn;
import X.AbstractC00603o4;
import X.AnonymousClass001;
import X.AnonymousClass046;
import X.C00i;
import X.C00j;
import X.C0et;
import X.C49j;
import X.DKN;
import android.content.Context;
import android.os.SystemClock;
import com.facebook.acra.constants.ActionId;
import com.facebook.common.build.BuildConstants;
import com.facebook.inject.FbInjector;
import java.util.Set;

/* loaded from: PushInitializer.class */
public final class PushInitializer {
    public final Set A04 = 1Bi.A06(ActionId.END_START_ACTIVITY);
    public final C00i A03 = new 1BQ(16385);
    public final C00i A06 = new 1BQ(16634);
    public final C00i A05 = FbInjector.A00;
    public final C00i A07 = new 1BV(66737);
    public final C00i A02 = new 1BQ(16511);
    public final AnonymousClass046 A09 = (AnonymousClass046) 1Bn.A0A(16669);
    public final C0et A01 = (C0et) 1Bi.A03(83604);
    public final C00i A08 = new 1BQ(33032);
    public boolean A00 = false;

    public static void A00(PushInitializer pushInitializer) {
        5Jn r0 = new 5Jn(pushInitializer);
        ((1H2) pushInitializer.A08.get()).A02();
        1Fw.A04((1EZ) 1Bn.A0A(16428));
        if (1Zt.A00((Context) pushInitializer.A05.get(), (04J) pushInitializer.A06.get(), ((DKN) 1Bn.A0A(68643)).A00(), r0, pushInitializer.A09) == null) {
            0fH.A0B(PushInitializer.class, 1BJ.A00(685));
        }
    }

    public void A01() {
        0fH.A0A(PushInitializer.class, "ensureRegistered");
        C00j.A05("PushInitializer.ensureRegistered", 1304684516);
        try {
            for (C49j c49j : this.A04) {
                C00j.A05(c49j.getClass().getName(), 2123514575);
                try {
                    c49j.AEv();
                    C00j.A01(-821810851);
                } catch (Throwable th) {
                    C00j.A01(1474119560);
                    throw th;
                }
            }
            C00j.A01(-138206315);
            C00i c00i = this.A03;
            if (((2yD) c00i.get()).AZk(36310864703784356L)) {
                return;
            }
            long Auy = ((2yD) c00i.get()).Auy(36592339679380158L) * 60000;
            4rJ r0 = (4rJ) this.A07.get();
            C00i c00i2 = r0.A03;
            if (c00i2.get() == null) {
                long elapsedRealtime = SystemClock.elapsedRealtime() + Auy;
                C00i c00i3 = r0.A01;
                ((1Pt) c00i3.get()).A00(4rJ.A00(1BK.A04(r0.A02)), elapsedRealtime);
                ((1Pt) c00i3.get()).A02(4rJ.A05);
                return;
            }
            long j = Auy * 2;
            4CX r02 = new 4CX();
            r02.A00.putInt("__VERSION_CODE", BuildConstants.A01());
            if (Auy >= 0) {
                if (j < 0) {
                    throw AnonymousClass001.A0L(AbstractC00603o4.A00(ActionId.NEW_START_FOUND));
                }
                if (j <= Auy) {
                    throw AnonymousClass001.A0L("setSoftMaximumLatencyMs(long) <= setMinimumLatencyMs(long)");
                }
            }
            if (j >= 0 && Auy < 0) {
                throw AnonymousClass001.A0L("setSoftMaximumLatencyMs(long) <= setMinimumLatencyMs(long)");
            }
            1XS.A01((1XS) c00i2.get(), r02, 2131365117, 1, -1, Auy, true);
        } catch (Throwable th2) {
            C00j.A01(-1586332966);
            throw th2;
        }
    }

    public void A02() {
        0fH.A0A(PushInitializer.class, "ensureSupported");
        C00j.A05("PushInitializer.ensureSupported", 1063008105);
        try {
            for (C49j c49j : this.A04) {
                C00j.A05(c49j.getClass().getName(), 1375242406);
                try {
                    c49j.APP();
                    C00j.A01(-1084047824);
                } finally {
                }
            }
            C00j.A01(13387454);
        } catch (Throwable th) {
            C00j.A01(1475559813);
            throw th;
        }
    }

    public void A03(String str) {
        0fH.A0A(PushInitializer.class, str);
        C00j.A05(str, 1571309410);
        try {
            for (C49j c49j : this.A04) {
                C00j.A05(c49j.getClass().getName(), 341363042);
                try {
                    c49j.Ccb();
                    C00j.A01(-1428355101);
                } finally {
                }
            }
            C00j.A01(-408189306);
        } catch (Throwable th) {
            C00j.A01(-1906561461);
            throw th;
        }
    }
}
