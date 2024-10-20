package com.facebook.contacts.properties;

import X.0Pz;
import X.0fH;
import X.1BJ;
import X.1BK;
import X.1BO;
import X.1BV;
import X.1BY;
import X.1Bi;
import X.1Bn;
import X.1GS;
import X.1Ho;
import X.1JF;
import X.1Kd;
import X.1T3;
import X.2TT;
import X.4CL;
import X.4YU;
import X.AnonymousClass001;
import X.C00i;
import X.C01s;
import X.C0dp;
import X.C11614x0;
import X.C4CK;
import android.content.Context;
import android.os.Build;
import com.facebook.acra.constants.ActionId;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.common.callercontext.CallerContextable;
import com.facebook.contacts.properties.CollationChangedTracker;

/* loaded from: CollationChangedTracker.class */
public final class CollationChangedTracker implements CallerContextable {
    public 1BY A00;
    public final 2TT A02 = (2TT) 1Bn.A0E((Context) null, (1BY) null, 17026);
    public final C11614x0 A01 = (C11614x0) 1Bi.A03(49370);
    public final C00i A03 = new 1BV((1BY) null, 33031);

    public CollationChangedTracker(1BO r302) {
        this.A00 = new 1BY(r302);
    }

    public void A00() {
        String str;
        Class cls;
        String str2;
        0fH.A0A(CollationChangedTracker.class, "checking if collation algorithm changed.");
        C11614x0 c11614x0 = this.A01;
        2TT r0 = c11614x0.A03;
        long j = -1;
        long A00 = r0.A00(C4CK.A03, j);
        if (A00 == j) {
            cls = C11614x0.class;
            str2 = "No last full sync timestamp; forcing full sync.";
        } else {
            4CL r02 = C4CK.A01;
            1GS r03 = c11614x0.A01;
            String obj = r03.A05().toString();
            String A01 = r0.A01(r02);
            if (A01 == null) {
                A01 = obj;
            }
            if (1JF.A0C(r03.A05().toString(), A01)) {
                C0dp c0dp = c11614x0.A02;
                long now = c0dp.now() - A00;
                if (now < 0) {
                    C01s c01s = c11614x0.A00;
                    StringBuilder A0k = AnonymousClass001.A0k();
                    A0k.append(C11614x0.class);
                    c01s.D0w(AnonymousClass001.A0d("-lessthan0", A0k), 0Pz.A0i("Full sync Interval less than 0 - now: ", ", lastFullSyncTimestamp: ", c0dp.now(), A00), 10);
                }
                if (now < 0 || now > 1209600000) {
                    0fH.A07(C11614x0.class, Long.valueOf(now / 86400000), "Last full sync was %s days ago; forcing full sync.");
                    str = "full sync requested, skipping.";
                    0fH.A0A(CollationChangedTracker.class, str);
                }
                0fH.A07(C11614x0.class, Long.valueOf(now / 86400000), "Last full sync was %s days ago; not forcing full sync.");
                int i = -1;
                String A012 = this.A02.A01(C4CK.A00);
                if (A012 != null) {
                    try {
                        i = Integer.parseInt(A012);
                    } catch (NumberFormatException unused) {
                    }
                }
                int i2 = Build.VERSION.SDK_INT;
                if (i2 == i) {
                    str = "api version did not change, no need to reindex contacts.";
                    0fH.A0A(CollationChangedTracker.class, str);
                }
                0fH.A0V(Integer.valueOf(i), CollationChangedTracker.class, "api version changed from %d to %d, reindexing contacts,", Integer.valueOf(i2));
                C00i c00i = this.A03;
                1Ho newInstance_DEPRECATED = 4YU.A0L(c00i).newInstance_DEPRECATED(1BJ.A00(ActionId.RTMP_CONNECTION_RELEASE), 1BK.A05());
                newInstance_DEPRECATED.A0A = true;
                1Ho.A00(newInstance_DEPRECATED, true);
                1Kd.A0E(new 1T3() { // from class: X.35b
                    public void A03(Throwable th) {
                        0fH.A0N(CollationChangedTracker.class, "failed to redindex contacts db", th, AnonymousClass001.A1Z());
                    }
                }, 4YU.A0M(1BK.A05(), CallerContext.A06(getClass()), 4YU.A0L(c00i), 1BJ.A00(540), true));
                return;
            }
            cls = C11614x0.class;
            str2 = "Locale has changed from last sync; forcing full sync.";
        }
        0fH.A0A(cls, str2);
        str = "full sync requested, skipping.";
        0fH.A0A(CollationChangedTracker.class, str);
    }
}
