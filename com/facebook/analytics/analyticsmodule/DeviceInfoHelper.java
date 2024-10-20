package com.facebook.analytics.analyticsmodule;

import X.1BQ;
import X.1Bi;
import X.1Bn;
import X.1GS;
import X.1HH;
import X.1Hv;
import X.C00i;
import android.content.Context;
import android.telephony.TelephonyManager;
import com.facebook.inject.FbInjector;

/* loaded from: DeviceInfoHelper.class */
public final class DeviceInfoHelper {
    public final TelephonyManager A00;
    public final C00i A01;
    public final C00i A02;
    public final C00i A03;
    public final Context A04;
    public final Context A05;
    public final 1GS A06;
    public final Boolean A07;

    public DeviceInfoHelper() {
        Context A00 = FbInjector.A00();
        this.A05 = A00;
        Context context = (Context) 1Bn.A0A(83719);
        this.A04 = context;
        this.A00 = (TelephonyManager) 1Hv.A02(context, 100178);
        this.A06 = (1GS) 1Bi.A03(16504);
        this.A07 = (Boolean) 1Hv.A02(A00, 49246);
        this.A01 = new 1BQ(49239);
        this.A03 = new 1BQ(16385);
        this.A02 = new 1HH(A00, 49160);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x00ac, code lost:
    
        if (r319 == (-1)) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x020e, code lost:
    
        if (X.4Yk.A03(r0).A02 != false) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public X.2Jy A00(java.lang.String r302, long r303) {
        /*
            Method dump skipped, instructions count: 2432
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.analytics.analyticsmodule.DeviceInfoHelper.A00(java.lang.String, long):X.2Jy");
    }
}
