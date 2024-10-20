package com.facebook.messaging.events.plugins.qp.publicchats;

import X.11T;
import X.1BK;
import X.1Bq;
import X.1Br;
import X.4YV;
import X.7zM;
import X.7zR;
import X.7zS;
import X.AdG;
import X.AnonymousClass001;
import X.C00i;
import X.C0dp;
import X.C0ty;
import X.C1769As3;
import android.content.Context;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.Observer;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.model.threads.ThreadSummary;

/* loaded from: EventBanner.class */
public final class EventBanner {
    public LiveData A00;
    public Observer A01;
    public ThreadSummary A02;
    public final Context A03;
    public final FbUserSession A04;
    public final 1Br A05;
    public final 1Br A06;
    public final 1Br A07;
    public final ThreadKey A08;

    public EventBanner(Context context, FbUserSession fbUserSession, ThreadKey threadKey) {
        11T.A0F(fbUserSession, 3);
        this.A03 = context;
        this.A08 = threadKey;
        this.A04 = fbUserSession;
        this.A07 = 1BK.A0E();
        this.A06 = 1Bq.A00(82310);
        this.A05 = 7zM.A0d();
        this.A00 = new LiveData(C0ty.A00);
        this.A01 = AdG.A00;
    }

    public static final int A00(C1769As3 c1769As3, EventBanner eventBanner) {
        int i;
        C00i c00i = eventBanner.A05.A00;
        long A05 = 4YV.A05(c00i);
        Long l = c1769As3.A05;
        long j = 0;
        if (A05 < 7zS.A08(l) - 86400000) {
            i = 1;
        } else {
            long A052 = 4YV.A05(c00i);
            if (l != null) {
                j = l.longValue();
            }
            if (A052 < j) {
                return 2;
            }
            Long l2 = c1769As3.A04;
            C0dp A0G = 7zR.A0G();
            long j2 = 0;
            long A08 = 7zS.A08(l);
            if (l2 != null) {
                j2 = l2.longValue();
            }
            i = 0;
            if (AnonymousClass001.A1P((Math.max(A08, j2) > A0G.now() ? 1 : (Math.max(A08, j2) == A0G.now() ? 0 : -1)))) {
                return 3;
            }
        }
        return i;
    }
}
