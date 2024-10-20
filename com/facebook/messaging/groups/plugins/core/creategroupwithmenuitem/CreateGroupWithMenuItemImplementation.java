package com.facebook.messaging.groups.plugins.core.creategroupwithmenuitem;

import X.11T;
import X.1BK;
import X.1BL;
import X.1BY;
import X.1Bi;
import X.1Br;
import X.1Lo;
import X.4YU;
import X.7zT;
import X.BLj;
import X.BO3;
import X.BOP;
import X.BUw;
import X.BjP;
import X.Bpf;
import X.Bzc;
import X.C4Ni;
import X.C9T;
import X.CAv;
import X.CG9;
import X.CIr;
import X.CQE;
import android.content.Context;
import android.content.Intent;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.model.threads.ThreadSummary;
import com.facebook.messaging.omnipicker.datamodel.M4OmnipickerParam;
import com.facebook.user.model.User;
import com.facebook.xapp.messaging.capability.vector.Capabilities;
import com.google.common.collect.ImmutableList;

/* loaded from: CreateGroupWithMenuItemImplementation.class */
public final class CreateGroupWithMenuItemImplementation {
    public static final C9T A00(Context context, FbUserSession fbUserSession, ThreadSummary threadSummary, CG9 cg9, User user) {
        11T.A0F(context, 0);
        7zT.A1U(threadSummary, fbUserSession, cg9);
        if (user == null) {
            throw 1BK.A0h();
        }
        String str = user.A0D() ? user.A0X.displayName : user.A0X.firstName;
        String string = (str == null || str.length() == 0) ? context.getString(2131967097) : 1BK.A0v(context, str, 2131967098);
        11T.A0D(string);
        CQE cqe = new CQE();
        cqe.A00 = 38;
        cqe.A06(CAv.A01());
        cqe.A07(string);
        cqe.A08(string);
        cqe.A04 = "create_group_with";
        cqe.A02 = new Bpf(fbUserSession, threadSummary, cg9);
        return new C9T(cqe);
    }

    public static final void A01(Context context, FbUserSession fbUserSession, ThreadSummary threadSummary, Bzc bzc, CG9 cg9, User user) {
        11T.A0F(context, 0);
        7zT.A1U(threadSummary, fbUserSession, bzc);
        11T.A0F(cg9, 5);
        if (user == null) {
            throw 1BK.A0h();
        }
        boolean A0x = threadSummary.A0n.A0x();
        CIr A00 = CG9.A00(BLj.A0G);
        A00.A0M = true;
        if (A0x) {
            A00.A0P = true;
        }
        M4OmnipickerParam m4OmnipickerParam = new M4OmnipickerParam(A00);
        Intent A002 = bzc.A00(context, m4OmnipickerParam, ImmutableList.of((Object) user));
        C4Ni c4Ni = (C4Ni) 1Lo.A04((Context) null, fbUserSession, (1BY) null, 68275);
        BO3 bo3 = BO3.A02;
        BOP bop = BOP.A01;
        BLj bLj = m4OmnipickerParam.A01;
        11T.A0A(bLj);
        c4Ni.A06(BUw.A00(bLj), bop, bo3, null, null);
        1BK.A0W().A0A(context, A002);
    }

    public static final boolean A02(ThreadSummary threadSummary, User user, Capabilities capabilities) {
        1BL.A1F(capabilities, threadSummary);
        if (user == null) {
            return false;
        }
        return threadSummary.A0n.A0x() ? 1Br.A07(((BjP) 1Bi.A03(82485)).A00).AZk(72341306692735559L) : 4YU.A1Y(capabilities, 35);
    }
}
