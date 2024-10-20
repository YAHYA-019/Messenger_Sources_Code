package com.facebook.analytics;

import X.07S;
import X.0CP;
import X.0Pz;
import X.0S2;
import X.0V0;
import X.0V1;
import X.0fH;
import X.1BQ;
import X.1JE;
import X.1RX;
import X.1Rd;
import X.1Rf;
import X.2DM;
import X.2Jy;
import X.2wC;
import X.2yD;
import X.AbstractC02063tu;
import X.AnonymousClass001;
import X.C00i;
import X.C03353xs;
import com.facebook.inject.FbInjector;

/* loaded from: DeprecatedAnalyticsLogger.class */
public final class DeprecatedAnalyticsLogger {
    public final C00i A00 = new 1BQ(99936);
    public final C00i A03 = FbInjector.A00;
    public final C00i A02 = new 1BQ(67199);
    public final C00i A01 = new 1BQ(16385);

    public static void A00(2Jy r301, 1Rf r302) {
        0V0.A00("buildAndDispatch");
        try {
            String str = r301.A05;
            if (str != "AUTO_SET" && !(r302 instanceof 1Rd)) {
                1Rf.A02(r302);
                if (str == null) {
                    IllegalArgumentException illegalArgumentException = AnonymousClass001.A0L("processName cannot be null if specified explicitly");
                    throw illegalArgumentException;
                }
                r302.A0E = str;
            }
            long j = r301.A01;
            long j2 = -1;
            if (j != j2) {
                r302.A05(j);
            }
            07S A09 = r302.A09();
            2DM r0 = r301.A03;
            if (r0 != null) {
                try {
                    2wC.A02(A09, r0);
                } catch (IllegalArgumentException e) {
                    new IllegalArgumentException(0Pz.A0v("name=", r301.A04, " extra=", ""), e);
                }
            }
            long j3 = r301.A00;
            if (j3 != j2) {
                r302.A02 = j3;
                r302.A0H = true;
            }
            C03353xs c03353xs = r301.A02;
            if (c03353xs != null) {
                int size = c03353xs._children.size();
                0CP A0C = r302.A09().A0C("enabled_features");
                for (int i = 0; i < size; i++) {
                    0CP.A00(A0C, c03353xs.A0B(i).A0H());
                }
            }
            r302.A0B();
        } finally {
            0V1.A00();
        }
    }

    public static boolean A01(DeprecatedAnalyticsLogger deprecatedAnalyticsLogger, String str) {
        boolean contains;
        if (!((2yD) deprecatedAnalyticsLogger.A01.get()).AZk(36326408188941868L)) {
            contains = true;
        } else {
            if (((1JE) deprecatedAnalyticsLogger.A00.get()).A01(str).A00 == 0) {
                return false;
            }
            contains = AbstractC02063tu.A00.contains(str);
            if (!contains) {
                0fH.A0n("com.facebook.analytics.DeprecatedAnalyticsLogger", 0Pz.A0W(str, " is not allowed to log through legacy framework (https://fburl.com/69wk2eki). Please use USL fburl.com/usl."));
                return contains;
            }
        }
        return contains;
    }

    public void A02(2Jy r302) {
        String str = r302.A04;
        if (A01(this, str)) {
            1Rf A01 = 1RX.A01((1RX) this.A02.get(), 0S2.A00, (String) null, str, true);
            if (A01.A0D()) {
                A00(r302, A01);
            }
        }
    }

    public void A03(2Jy r302) {
        if (r302 != null) {
            String str = r302.A04;
            if (A01(this, str)) {
                1Rf A01 = 1RX.A01((1RX) this.A02.get(), 0S2.A00, (String) null, str, r302.A0G());
                if (A01.A0D()) {
                    A00(r302, A01);
                }
            }
        }
    }
}
