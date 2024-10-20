package com.facebook.graphql.executor;

import X.0Pz;
import X.0S2;
import X.0fH;
import X.1BQ;
import X.1Bi;
import X.1Du;
import X.1Fv;
import X.1GP;
import X.1Hv;
import X.1I7;
import X.1P9;
import X.1X1;
import X.1XD;
import X.1XO;
import X.1XS;
import X.1Xn;
import X.3cJ;
import X.4CX;
import X.5Dn;
import X.5Do;
import X.5Dp;
import X.5Du;
import X.AbstractC00603o4;
import X.AnonymousClass001;
import X.C00i;
import X.C01s;
import android.content.Context;
import com.facebook.acra.constants.ActionId;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.common.build.BuildConstants;
import com.facebook.common.network.FbNetworkManager;
import com.facebook.inject.FbInjector;
import com.google.common.collect.ImmutableList;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: OfflineMutationsManager.class */
public final class OfflineMutationsManager {
    public Context A00;
    public final 1I7 A01;
    public final 1Xn A02;
    public final 1XS A03;
    public final C00i A07;
    public final Map A09;
    public final AtomicBoolean A0A;
    public volatile boolean A0E;
    public final 1X1 A05 = (1X1) 1Bi.A03(16696);
    public final C00i A08 = new 1BQ(49597);
    public final C00i A0C = new 1BQ(16511);
    public final 1GP A0B = (1GP) 1Bi.A03(16503);
    public final FbNetworkManager A04 = (FbNetworkManager) 1Bi.A03(16687);
    public final 1XD A06 = (1XD) 1Bi.A03(16699);
    public final 1XO A0D = (1XO) 1Bi.A03(16701);

    public OfflineMutationsManager() {
        Context A00 = FbInjector.A00();
        this.A00 = A00;
        this.A01 = (1I7) 1Hv.A02(A00, 65728);
        this.A07 = new 1BQ(16449);
        this.A03 = (1XS) 1Bi.A03(67208);
        this.A02 = new 1Xn(100);
        this.A0E = false;
        this.A0A = new AtomicBoolean(false);
        this.A09 = new HashMap();
    }

    public static void A00(OfflineMutationsManager offlineMutationsManager, boolean z) {
        1XS r0 = offlineMutationsManager.A03;
        if (r0 == null || offlineMutationsManager.A0A.get()) {
            return;
        }
        0fH.A0A(OfflineMutationsManager.class, "Scheduling retry using JS");
        long millis = TimeUnit.MINUTES.toMillis(15);
        4CX r02 = new 4CX();
        r02.A00.putInt("__VERSION_CODE", BuildConstants.A01());
        String A00 = AbstractC00603o4.A00(631);
        if (millis < 0) {
            throw AnonymousClass001.A0L(AbstractC00603o4.A00(ActionId.NEW_START_FOUND));
        }
        if (millis <= 0) {
            throw AnonymousClass001.A0L(A00);
        }
        1XS.A01(r0, r02, 2131365112, 1, -1, 0L, z);
    }

    public void A01() {
        FbUserSession A04 = ((1Fv) 1Bi.A03(66351)).A04();
        0fH.A0C(OfflineMutationsManager.class, "Initializing OfflineMutationsManager");
        if (this.A0E) {
            return;
        }
        if (this.A0B.BWu()) {
            ((C01s) this.A0C.get()).D0v("offline", 0Pz.A0W(OfflineMutationsManager.class.getSimpleName(), " used on UI thread before initialized"));
            return;
        }
        synchronized (this) {
            if (!this.A0E) {
                Context A00 = FbInjector.A00();
                if (((5Dp) this.A08.get()).A02.A05()) {
                    1XD r0 = this.A06;
                    ImmutableList A02 = r0.A02();
                    1Du it = A02.iterator();
                    while (it.hasNext()) {
                        5Dn r02 = (5Dn) it.next();
                        if (r02 instanceof 5Do) {
                            Map map = this.A09;
                            if (!map.containsKey(r02)) {
                                5Du r03 = new 5Du(this.A05);
                                map.put(r02, r03);
                                r03.A00();
                            }
                        }
                    }
                    if (this.A03 == null) {
                        1P9.A01(new 1P9(this.A01), new 3cJ(A04, this, 0), "com.facebook.orca.ACTION_NETWORK_CONNECTIVITY_CHANGED").A00();
                        if (this.A04.A0M()) {
                            r0.A03(A00, A04, 0S2.A00);
                        }
                    } else if (!A02.isEmpty()) {
                        A00(this, false);
                    }
                }
                this.A0E = true;
            }
        }
    }
}
