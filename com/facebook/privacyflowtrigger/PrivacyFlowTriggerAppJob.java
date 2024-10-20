package com.facebook.privacyflowtrigger;

import X.1BQ;
import X.1Bi;
import X.1Fv;
import X.1G1;
import X.1G2;
import X.1Lo;
import X.2yD;
import X.AbstractC06454gx;
import X.AbstractC06534h6;
import X.C00i;
import X.C0dp;
import com.facebook.prefs.shared.FbSharedPreferences;

/* loaded from: PrivacyFlowTriggerAppJob.class */
public final class PrivacyFlowTriggerAppJob {
    public final C00i A00 = new 1BQ(99390);
    public final C00i A01 = new 1BQ(33013);

    public static void A00(PrivacyFlowTriggerAppJob privacyFlowTriggerAppJob) {
        1G1 A04 = ((1Fv) 1Bi.A03(66351)).A04();
        1G1 r0 = A04;
        if (r0.A07) {
            return;
        }
        String str = r0.A02;
        if (!((2yD) 1Bi.A03(16385)).AZk(36315597755262151L)) {
            1G2 A0D = AbstractC06454gx.A02.A0D(str);
            1G2 A0D2 = AbstractC06454gx.A01.A0D(str);
            long now = ((C0dp) privacyFlowTriggerAppJob.A00.get()).now();
            long Av1 = ((FbSharedPreferences) privacyFlowTriggerAppJob.A01.get()).Av1(A0D2, 0L);
            if (now >= Av1 && now < Av1 + ((FbSharedPreferences) r0.get()).ArU(A0D, 0)) {
                return;
            }
        }
        ((AbstractC06534h6) 1Lo.A06(A04, 49201)).A02();
    }
}
