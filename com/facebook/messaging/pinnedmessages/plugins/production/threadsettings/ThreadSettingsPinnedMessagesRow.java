package com.facebook.messaging.pinnedmessages.plugins.production.threadsettings;

import X.0BY;
import X.0S2;
import X.1BQ;
import X.1Bn;
import X.1WY;
import X.2MQ;
import X.4YU;
import X.4YV;
import X.5lP;
import X.6EX;
import X.7zR;
import X.AbF;
import X.AbH;
import X.BNV;
import X.C0Bx;
import X.C1u3;
import X.C1ut;
import X.C5yj;
import X.CHv;
import X.CII;
import X.CQg;
import X.Cug;
import X.DHd;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import com.facebook.acra.constants.ActionId;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.model.threads.ThreadSummary;
import com.facebook.xapp.messaging.capability.vector.Capabilities;
import java.util.Map;

/* loaded from: ThreadSettingsPinnedMessagesRow.class */
public final class ThreadSettingsPinnedMessagesRow {
    public static final long A00;

    static {
        int i = 0;
        Map map = 0BY.A03;
        String A01 = C0Bx.A01(ThreadSettingsPinnedMessagesRow.class);
        if (A01 != null) {
            i = A01.hashCode();
        }
        A00 = i;
    }

    public static final Cug A00(Context context, ThreadSummary threadSummary, DHd dHd) {
        4YV.A1N(context, dHd);
        if (threadSummary == null) {
            return null;
        }
        CQg A002 = CQg.A00();
        CQg.A07(context, A002, 2131967178);
        CQg.A08(BNV.A1o, A002);
        A002.A00 = A00;
        CHv.A00(2MQ.A2d, A002, (C1ut) null);
        A002.A05 = new CII((Drawable) null, (Uri) null, C1u3.A5E, (C1ut) null, (Boolean) null);
        return CQg.A04(A002, dHd, 30);
    }

    public static final boolean A01(ThreadSummary threadSummary, C5yj c5yj, Capabilities capabilities) {
        7zR.A1O(capabilities, c5yj);
        if (threadSummary == null) {
            return false;
        }
        ThreadKey A0f = AbF.A0f(threadSummary);
        if (((5lP) 1Bn.A0A(67731)).A00(A0f) == 0S2.A0C) {
            return false;
        }
        1BQ A0W = AbH.A0W();
        if ((!ThreadKey.A0T(A0f) || AbF.A0q(A0W.get()).AZk(36324617186594667L)) && 4YU.A1Y(capabilities, ActionId.QUERY_READY)) {
            return (!ThreadKey.A0a(A0f) && c5yj.A00()) || 6EX.A00.A04(threadSummary.A06) || ((1WY) A0W.get()).A0D();
        }
        return false;
    }
}
