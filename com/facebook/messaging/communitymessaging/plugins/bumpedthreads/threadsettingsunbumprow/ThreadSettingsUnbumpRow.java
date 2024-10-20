package com.facebook.messaging.communitymessaging.plugins.bumpedthreads.threadsettingsunbumprow;

import X.11T;
import X.1BK;
import X.1BL;
import X.1BQ;
import X.1Bi;
import X.1Bq;
import X.1Br;
import X.1F9;
import X.1Lm;
import X.1Lo;
import X.1MV;
import X.1WY;
import X.1Wl;
import X.2MQ;
import X.2oI;
import X.4YU;
import X.7zM;
import X.7zU;
import X.AbG;
import X.AbH;
import X.AbI;
import X.AbL;
import X.BNV;
import X.BV9;
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

/* loaded from: ThreadSettingsUnbumpRow.class */
public final class ThreadSettingsUnbumpRow {
    public final Context A00;
    public final 1Br A01;
    public final 1Br A02;
    public final 1Br A03;
    public final 1Br A04;
    public final 1Br A05;
    public final 1Br A06;
    public final ThreadSummary A07;
    public final FbUserSession A08;

    public ThreadSettingsUnbumpRow(Context context, FbUserSession fbUserSession, ThreadSummary threadSummary) {
        1BL.A1F(context, fbUserSession);
        this.A00 = context;
        this.A08 = fbUserSession;
        this.A07 = threadSummary;
        this.A04 = 1Lm.A00(context, fbUserSession, 33183);
        this.A02 = 7zM.A0O();
        this.A03 = AbG.A0c();
        this.A06 = AbG.A0U();
        this.A05 = 1Bq.A00(68669);
        this.A01 = AbG.A0X();
    }

    public static final boolean A00(Context context, FbUserSession fbUserSession, ThreadSummary threadSummary, Capabilities capabilities) {
        1F9 r0;
        11T.A0H(context, fbUserSession);
        11T.A0F(capabilities, 3);
        boolean z = false;
        if (threadSummary != null) {
            ThreadKey threadKey = threadSummary.A0n;
            if (ThreadKey.A0a(threadKey)) {
                1BQ A0W = AbH.A0W();
                1MV A00 = 1Lo.A00(context, fbUserSession, 82486);
                ThreadKey threadKey2 = threadSummary.A0l;
                z = true;
                if (threadKey2 == null || !threadKey2.A1E()) {
                    return false;
                }
                if ((!11T.A0O(7zU.A0h(threadSummary.A0m), ThreadKey.A08) && !((C3j) A00.get()).A00(threadKey.A04)) || (r0 = threadSummary.A0g) == null || r0 != 1F9.A0B) {
                    return false;
                }
                A0W.get();
                if (((1WY) A0W.get()).A05()) {
                    return false;
                }
            } else if (2oI.A05(threadSummary)) {
                1Wl r02 = (1Wl) 1Bi.A03(68669);
                if (!r02.A05() || !BV9.A00(threadSummary) || !4YU.A1Y(capabilities, ActionId.APP_DID_BECOME_ACTIVE)) {
                    return false;
                }
                z = true;
                if (r02.A02()) {
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
            i = 2131967221;
            if (AbI.A1Y()) {
                i = 2131967223;
            }
        } else {
            i = 2131967222;
            if (AbL.A1C()) {
                i = 2131967220;
            }
        }
        A00.A0B(1BK.A0u(context, i));
        CQg.A08(BNV.A2R, A00);
        CQg.A09(A00, ThreadSettingsUnbumpRow.class);
        C00i c00i = this.A05.A00;
        CHv.A00(((1Wl) c00i.get()).A06() ? 2MQ.A23 : 2MQ.A2B, A00, (C1ut) null);
        A00.A05 = new CII((Drawable) null, (Uri) null, ((1Wl) c00i.get()).A06() ? C1u3.A4K : C1u3.A4R, (C1ut) null, (Boolean) null);
        return CQg.A03(A00, this, 64);
    }
}
