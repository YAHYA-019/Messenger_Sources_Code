package com.facebook.messaging.groups.plugins.core.banner.joinrequest;

import X.1BL;
import X.1Bq;
import X.1Br;
import X.1Bu;
import X.1LI;
import X.1Lm;
import X.2oI;
import X.4YV;
import X.63D;
import X.6Ky;
import X.7zK;
import X.7zM;
import X.AbG;
import X.AbJ;
import X.AbK;
import X.AnonymousClass001;
import X.C00i;
import X.C3l;
import X.C60b;
import X.C9g0;
import X.CPj;
import X.CYr;
import android.content.Context;
import android.view.View;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.model.threads.ThreadSummary;
import com.google.common.collect.ImmutableList;

/* loaded from: GroupJoinRequestBanner.class */
public final class GroupJoinRequestBanner {
    public boolean A00;
    public final 1Br A01;
    public final 1Br A02;
    public final 1Br A03;
    public final Context A04;
    public final FbUserSession A05;

    public GroupJoinRequestBanner(Context context, FbUserSession fbUserSession) {
        1BL.A1F(context, fbUserSession);
        this.A04 = context;
        this.A05 = fbUserSession;
        this.A01 = AbG.A0b();
        this.A02 = 1Bu.A00(147609);
        this.A03 = 7zM.A0P();
    }

    public static final 6Ky A00(Context context, GroupJoinRequestBanner groupJoinRequestBanner, ThreadSummary threadSummary, 63D r304, int i) {
        boolean A07 = 2oI.A07(threadSummary);
        1Br A00 = 1Bq.A00(82448);
        if (threadSummary.A0n.A1A() && !groupJoinRequestBanner.A00) {
            AbJ.A0O(((CPj) 1Br.A0B(A00)).A00).A03(CPj.A01(threadSummary));
            groupJoinRequestBanner.A00 = true;
        }
        int i2 = 2131957469;
        if (A07) {
            i2 = 2131964001;
        }
        return new 6Ky(new CYr(11, r304, A00, threadSummary), (View.OnClickListener) null, (1LI) null, (C9g0) null, (C9g0) null, (C9g0) null, (ImmutableList) null, 7zK.A00(A07 ? 344 : 345), 4YV.A0o(context.getResources(), i, 2131820717), AbJ.A0y(context, i2), (Class) null, (Integer) null, 0, false);
    }

    public static final boolean A01(GroupJoinRequestBanner groupJoinRequestBanner, ThreadSummary threadSummary) {
        if (threadSummary.A0n.A1A()) {
            return ((C3l) 1Lm.A05(groupJoinRequestBanner.A04, groupJoinRequestBanner.A05, 82450)).A00(threadSummary) && !AbK.A0U().A01(threadSummary.A06);
        }
        C00i c00i = groupJoinRequestBanner.A01.A00;
        if (((C60b) c00i.get()).A06(threadSummary)) {
            return ((C60b) c00i.get()).A05(threadSummary) && ((C60b) c00i.get()).A08(threadSummary);
        }
        1Br.A0C(groupJoinRequestBanner.A02);
        return AnonymousClass001.A1U(threadSummary.AoK().A06.A00);
    }
}
