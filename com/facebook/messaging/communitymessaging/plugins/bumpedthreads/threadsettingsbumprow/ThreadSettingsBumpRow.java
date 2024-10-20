package com.facebook.messaging.communitymessaging.plugins.bumpedthreads.threadsettingsbumprow;

import X.11T;
import X.1BK;
import X.1BL;
import X.1BQ;
import X.1Bi;
import X.1Bq;
import X.1Br;
import X.1F9;
import X.1Lo;
import X.1MV;
import X.1WY;
import X.1Wl;
import X.2MQ;
import X.2oI;
import X.4YU;
import X.7zM;
import X.AbF;
import X.AbG;
import X.AbH;
import X.AbI;
import X.AbL;
import X.BNV;
import X.C00i;
import X.C1u3;
import X.C1ut;
import X.C3j;
import X.CHv;
import X.CII;
import X.CQg;
import X.Cug;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import com.facebook.acra.constants.ActionId;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.model.threads.ThreadSummary;
import com.facebook.xapp.messaging.capability.vector.Capabilities;

/* loaded from: ThreadSettingsBumpRow.class */
public final class ThreadSettingsBumpRow {
    public final Context A00;
    public final FbUserSession A01;
    public final 1Br A02;
    public final 1Br A03;
    public final 1Br A04;
    public final 1Br A05;
    public final ThreadSummary A06;

    public ThreadSettingsBumpRow(Context context, FbUserSession fbUserSession, ThreadSummary threadSummary) {
        1BL.A1F(context, fbUserSession);
        this.A00 = context;
        this.A01 = fbUserSession;
        this.A06 = threadSummary;
        this.A03 = 7zM.A0O();
        this.A04 = AbG.A0c();
        this.A05 = 1Bq.A00(68669);
        this.A02 = AbG.A0X();
    }

    public static final boolean A00(Context context, FbUserSession fbUserSession, ThreadSummary threadSummary, Capabilities capabilities) {
        ThreadKey threadKey;
        1F9 r0;
        11T.A0H(context, fbUserSession);
        11T.A0F(capabilities, 3);
        boolean z = false;
        if (threadSummary != null) {
            ThreadKey threadKey2 = threadSummary.A0n;
            if (ThreadKey.A0a(threadKey2)) {
                1BQ A0W = AbH.A0W();
                1MV A00 = 1Lo.A00(context, fbUserSession, 82486);
                z = true;
                if (threadSummary.A0m != null || ((C3j) A00.get()).A00(threadKey2.A04) || (threadKey = threadSummary.A0l) == null || !threadKey.A1E() || (r0 = threadSummary.A0g) == null || r0 != 1F9.A0B) {
                    return false;
                }
                A0W.get();
                if (((1WY) A0W.get()).A05()) {
                    return false;
                }
            } else if (2oI.A05(threadSummary)) {
                if (!((1Wl) 1Bi.A03(68669)).A05()) {
                    return false;
                }
                ThreadKey threadKey3 = threadSummary.A0l;
                Long l = null;
                if (threadKey3 != null) {
                    l = AbF.A14(threadKey3);
                }
                if (!11T.A0O(l, ThreadKey.A07)) {
                    return false;
                }
                ThreadKey threadKey4 = threadSummary.A0m;
                if (threadKey4 != null && AbF.A14(threadKey4) != null) {
                    return false;
                }
                z = true;
                if (!4YU.A1Y(capabilities, ActionId.APP_DID_BECOME_ACTIVE)) {
                    return false;
                }
            }
        }
        return z;
    }

    public final Cug A01() {
        int i;
        CQg A00 = CQg.A00();
        Context context = this.A00;
        if (AbI.A1Z()) {
            i = 2131967090;
            if (AbI.A1Y()) {
                i = 2131967092;
            }
        } else {
            i = 2131967089;
            if (AbL.A1C()) {
                i = 2131967091;
            }
        }
        A00.A0B(1BK.A0u(context, i));
        CQg.A08(BNV.A0P, A00);
        CQg.A09(A00, ThreadSettingsBumpRow.class);
        C00i c00i = this.A05.A00;
        CHv.A00(((1Wl) c00i.get()).A06() ? 2MQ.A23 : 2MQ.A2X, A00, (C1ut) null);
        A00.A05 = new CII((Drawable) null, (Uri) null, ((1Wl) c00i.get()).A06() ? C1u3.A4K : C1u3.A52, (C1ut) null, (Boolean) null);
        return CQg.A03(A00, this, 63);
    }
}
