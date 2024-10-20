package com.facebook.messaging.wellbeing.selfremediation.block.plugins.core.groupmemberdata;

import X.11T;
import X.1BL;
import X.1Bq;
import X.1Br;
import X.1Fj;
import X.1HG;
import X.1Lm;
import X.1PA;
import X.23F;
import X.2Gt;
import X.4YU;
import X.7zQ;
import X.7zT;
import X.9hE;
import X.AYO;
import X.AbG;
import X.AbH;
import X.AnonymousClass001;
import X.AnonymousClass544;
import X.BNT;
import X.C25;
import X.C28p;
import X.C3M;
import X.CBI;
import X.Cw3;
import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.model.threads.ThreadSummary;
import com.facebook.user.model.User;
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: ThreadSummaryGroupMemberDataProviderImplementation.class */
public final class ThreadSummaryGroupMemberDataProviderImplementation {
    public 1PA A00;
    public ThreadSummary A01;
    public final 1Br A02;
    public final 1Br A03;
    public final 1Br A04;
    public final 1Br A05;
    public final ThreadKey A06;
    public final C3M A07;
    public final Context A08;
    public final FbUserSession A09;
    public final BNT A0A;
    public final C25 A0B;
    public final AYO A0C;

    public ThreadSummaryGroupMemberDataProviderImplementation(Context context, FbUserSession fbUserSession, ThreadKey threadKey, BNT bnt, C25 c25, C3M c3m) {
        7zT.A1W(context, threadKey, c25, c3m);
        1BL.A1G(bnt, fbUserSession);
        this.A08 = context;
        this.A06 = threadKey;
        this.A0B = c25;
        this.A07 = c3m;
        this.A0A = bnt;
        this.A09 = fbUserSession;
        this.A04 = AbH.A0d(context);
        this.A05 = AbG.A0W();
        this.A03 = 1HG.A00(context, 68574);
        this.A02 = 1Bq.A00(83216);
        this.A0C = new Cw3(this);
    }

    public static final void A00(ThreadSummaryGroupMemberDataProviderImplementation threadSummaryGroupMemberDataProviderImplementation) {
        ThreadSummary threadSummary = threadSummaryGroupMemberDataProviderImplementation.A01;
        if (threadSummary != null) {
            FbUserSession fbUserSession = threadSummaryGroupMemberDataProviderImplementation.A09;
            23F r0 = (23F) 1Lm.A05(threadSummaryGroupMemberDataProviderImplementation.A08, fbUserSession, 33102);
            User A0v = 7zQ.A0v();
            ArrayList A0s = AnonymousClass001.A0s();
            Iterator<E> it = 2Gt.A03(threadSummary).iterator();
            while (it.hasNext()) {
                User A00 = r0.A00(C28p.A01(4YU.A0W(it)));
                if (A00 != null && !11T.A0O(A0v.A0k, A00.A0k)) {
                    A0s.add(A00);
                }
            }
            1Br.A0C(threadSummaryGroupMemberDataProviderImplementation.A02);
            CBI.A00(threadSummaryGroupMemberDataProviderImplementation.A0A, A0s);
            ImmutableList.Builder builder = ImmutableList.builder();
            Iterator it2 = A0s.iterator();
            while (it2.hasNext()) {
                AnonymousClass544 A01 = ((9hE) 1Br.A0B(threadSummaryGroupMemberDataProviderImplementation.A03)).A01(fbUserSession, threadSummaryGroupMemberDataProviderImplementation.A0C, AbG.A0t(it2));
                if (A01 != null) {
                    builder.add(A01);
                }
            }
            threadSummaryGroupMemberDataProviderImplementation.A0B.A00(1Fj.A01(builder));
        }
    }
}
