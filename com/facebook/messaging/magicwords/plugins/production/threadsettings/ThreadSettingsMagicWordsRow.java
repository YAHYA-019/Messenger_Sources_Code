package com.facebook.messaging.magicwords.plugins.production.threadsettings;

import X.0BY;
import X.11T;
import X.1BK;
import X.1BV;
import X.1SI;
import X.2Gt;
import X.2MQ;
import X.4YU;
import X.4YV;
import X.5VV;
import X.5VW;
import X.AbH;
import X.AbI;
import X.AcY;
import X.BNV;
import X.C0Bx;
import X.C1u3;
import X.C1ut;
import X.CHv;
import X.CII;
import X.CQg;
import X.Cug;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.model.threads.ThreadSummary;
import com.facebook.xapp.messaging.capability.vector.Capabilities;
import com.google.common.collect.ImmutableList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* loaded from: ThreadSettingsMagicWordsRow.class */
public final class ThreadSettingsMagicWordsRow {
    public static final long A00;

    static {
        int i = 0;
        Map map = 0BY.A03;
        String A01 = C0Bx.A01(ThreadSettingsMagicWordsRow.class);
        if (A01 != null) {
            i = A01.hashCode();
        }
        A00 = i;
    }

    public static final Cug A00(Context context, AcY acY, ThreadSummary threadSummary) {
        4YV.A1N(context, acY);
        if (threadSummary == null) {
            throw 1BK.A0e();
        }
        FbUserSession A0E = 4YV.A0E(context);
        CQg A002 = CQg.A00();
        CQg.A07(context, A002, 2131967150);
        CQg.A08(BNV.A1I, A002);
        A002.A00 = A00;
        CHv.A00(2MQ.A1w, A002, (C1ut) null);
        A002.A05 = new CII((Drawable) null, (Uri) null, C1u3.A4C, (C1ut) null, (Boolean) null);
        return CQg.A06(A002, A0E, acY, threadSummary, 12);
    }

    public static final boolean A01(ThreadSummary threadSummary, Capabilities capabilities) {
        11T.A0F(capabilities, 2);
        if ((threadSummary != null && 2Gt.A0E(threadSummary)) || 4YV.A1S()) {
            return false;
        }
        if (threadSummary != null) {
            ImmutableList immutableList = threadSummary.A1L;
            if (!(immutableList instanceof Collection) || !immutableList.isEmpty()) {
                Iterator it = immutableList.iterator();
                while (it.hasNext()) {
                    if (AbH.A0j(it).A0L) {
                        return false;
                    }
                }
            }
        }
        1BV A0K = AbI.A0K();
        if (threadSummary != null && threadSummary.A0n.A0z() && 1BK.A0N(((1SI) A0K.get()).A00).AZk(36316439577438358L)) {
            return true;
        }
        return (threadSummary == null || !4YU.A1Y(capabilities, 80) || ((5VV) 1BV.A00(98321).get()).A01(threadSummary).contains(5VW.A0E)) ? false : true;
    }
}
