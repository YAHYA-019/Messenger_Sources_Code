package com.facebook.messaging.sharedcontent.plugins.core.threadsettingsrow;

import X.0S2;
import X.11T;
import X.1BK;
import X.1Bi;
import X.1Bn;
import X.1Br;
import X.1Ew;
import X.2Gt;
import X.2MQ;
import X.4YU;
import X.7zP;
import X.7zR;
import X.9DL;
import X.9WW;
import X.BNV;
import X.C1u3;
import X.C1ut;
import X.C66Z;
import X.C9fe;
import X.C9pc;
import X.CHv;
import X.CII;
import X.CQg;
import X.Cug;
import X.DHd;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import com.facebook.inject.FbInjector;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.model.threads.ThreadSummary;
import com.facebook.user.model.User;
import com.facebook.xapp.messaging.capability.vector.Capabilities;
import java.util.ArrayList;

/* loaded from: ThreadSettingsSharedContentRow.class */
public final class ThreadSettingsSharedContentRow {
    public static final Cug A00(Context context, ThreadSummary threadSummary, DHd dHd, User user) {
        int i;
        int A06 = 7zP.A06(context, dHd, 0);
        9WW r0 = (9WW) 1Bn.A0A(68189);
        CQg A00 = CQg.A00();
        ArrayList A002 = r0.A00(threadSummary, false);
        11T.A0F(A002, 0);
        int intValue = 9DL.A00(A002).intValue();
        if (intValue != 0) {
            if (intValue == 1) {
                i = 2131965878;
            } else if (intValue != 4) {
                i = 2131965880;
                if (intValue != 2) {
                    i = 2131965879;
                }
            }
            CQg.A07(context, A00, i);
            C9fe c9fe = (C9fe) 1Bn.A0A(68435);
            CQg.A08((!C9fe.A00(c9fe).AZk(36316323604735881L) && C9fe.A00(c9fe).AZk(36316323604604808L) && C9fe.A00(c9fe).AZk(36316323604801418L)) ? BNV.A2U : BNV.A2Y, A00);
            A00.A00 = 2966009715L;
            A00.A0E = true;
            CHv.A00(2MQ.A2S, A00, (C1ut) null);
            A00.A05 = new CII((Drawable) null, (Uri) null, C1u3.A4t, (C1ut) null, (Boolean) null);
            return CQg.A02(new C9pc(A06, context, threadSummary, dHd, user), A00);
        }
        i = 2131965881;
        CQg.A07(context, A00, i);
        C9fe c9fe2 = (C9fe) 1Bn.A0A(68435);
        CQg.A08((!C9fe.A00(c9fe2).AZk(36316323604735881L) && C9fe.A00(c9fe2).AZk(36316323604604808L) && C9fe.A00(c9fe2).AZk(36316323604801418L)) ? BNV.A2U : BNV.A2Y, A00);
        A00.A00 = 2966009715L;
        A00.A0E = true;
        CHv.A00(2MQ.A2S, A00, (C1ut) null);
        A00.A05 = new CII((Drawable) null, (Uri) null, C1u3.A4t, (C1ut) null, (Boolean) null);
        return CQg.A02(new C9pc(A06, context, threadSummary, dHd, user), A00);
    }

    public static final boolean A01(ThreadSummary threadSummary, Capabilities capabilities) {
        11T.A0F(capabilities, 2);
        1Bn.A0A(115032);
        if (threadSummary == null) {
            return false;
        }
        ThreadKey threadKey = threadSummary.A0n;
        if (threadKey.A0y()) {
            return 11T.A0O(1BK.A0w(threadKey), 7zR.A0U().A06());
        }
        if (!threadKey.A12()) {
            1Ew r0 = (1Ew) 1Bi.A03(65755);
            if (r0.AXy() != 0S2.A0C && r0.AXy() != 0S2.A01) {
                11T.A0A(FbInjector.A03);
                return (2Gt.A0E(threadSummary) && 1Br.A07(((C66Z) 1Bn.A0A(82479)).A01).AZk(2342155304139821257L)) ? false : true;
            }
        }
        return 4YU.A1Y(capabilities, 96);
    }
}
