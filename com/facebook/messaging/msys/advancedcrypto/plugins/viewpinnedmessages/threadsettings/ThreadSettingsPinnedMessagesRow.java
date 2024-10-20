package com.facebook.messaging.msys.advancedcrypto.plugins.viewpinnedmessages.threadsettings;

import X.0BY;
import X.2MQ;
import X.7zS;
import X.BNV;
import X.C0Bx;
import X.C1u3;
import X.C1ut;
import X.CHv;
import X.CII;
import X.CQg;
import X.Cug;
import X.DHb;
import X.DHd;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import com.facebook.messaging.model.threads.ThreadSummary;
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

    public static final Cug A00(Context context, ThreadSummary threadSummary, DHb dHb, DHd dHd) {
        7zS.A16(0, context, dHb, dHd);
        if (threadSummary == null) {
            return null;
        }
        CQg A002 = CQg.A00();
        CQg.A07(context, A002, 2131967179);
        CQg.A08(BNV.A1o, A002);
        A002.A00 = A00;
        CHv.A00(2MQ.A2d, A002, (C1ut) null);
        A002.A05 = new CII((Drawable) null, (Uri) null, C1u3.A5E, (C1ut) null, (Boolean) null);
        return CQg.A06(A002, dHd, dHb, threadSummary, 15);
    }
}
