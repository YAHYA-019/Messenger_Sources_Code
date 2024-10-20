package com.facebook.messaging.wellbeing.selfremediation.ignore.plugins.core.ignoregroupmenuitem;

import X.06Z;
import X.11T;
import X.1BK;
import X.1BL;
import X.1Bi;
import X.1F9;
import X.2yD;
import X.4YU;
import X.AbF;
import X.AbI;
import X.AnonymousClass001;
import X.BNT;
import X.BU2;
import X.C0D1;
import X.C1u3;
import X.C9T;
import X.CQE;
import android.content.Context;
import com.facebook.messaging.ignore.IgnoreMessagesDialogFragment;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.model.threads.ThreadSummary;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import com.facebook.quicklog.reliability.UserFlowLogger;
import com.facebook.xapp.messaging.capability.vector.Capabilities;

/* loaded from: IgnoreGroupMenuItemImplementation.class */
public final class IgnoreGroupMenuItemImplementation {
    public static final C9T A00(Context context) {
        11T.A0F(context, 0);
        2yD A0Q = 1BL.A0Q();
        CQE cqe = new CQE();
        cqe.A00 = 22;
        cqe.A06(C1u3.A4L);
        int i = 2131966897;
        if (A0Q.AZk(36311311377828581L)) {
            i = 2131968164;
        }
        CQE.A04(context, cqe, i);
        int i2 = 2131966909;
        if (A0Q.AZk(36311311377828581L)) {
            i2 = 2131968163;
        }
        CQE.A03(context, cqe, i2);
        return CQE.A01(cqe, "ignore group thread shortcut");
    }

    public static final void A01(06Z r301, BU2 bu2, ThreadSummary threadSummary) {
        11T.A0F(threadSummary, 0);
        1BL.A1F(r301, bu2);
        UserFlowLogger userFlowLogger = (UserFlowLogger) 1Bi.A03(16705);
        long generateNewFlowId = userFlowLogger.generateNewFlowId(57147395);
        AbI.A1U(userFlowLogger, "inbox_thread_actions", generateNewFlowId, false);
        BNT bnt = BNT.A0H;
        if (C0D1.A01(r301)) {
            IgnoreMessagesDialogFragment.A0C.A00(threadSummary, bnt, (MigColorScheme) null).A1C(r301, generateNewFlowId);
        }
    }

    public static final boolean A02(ThreadSummary threadSummary, Capabilities capabilities) {
        1BK.A1M(capabilities, threadSummary);
        boolean z = false;
        if (1BL.A0Q().AZk(36323337286273520L)) {
            return false;
        }
        ThreadKey A0f = AbF.A0f(threadSummary);
        1F9 r0 = threadSummary.A0g;
        boolean A1W = r0 != null ? AnonymousClass001.A1W(r0, 1F9.A06) : false;
        if ((ThreadKey.A0f(A0f) || ThreadKey.A0h(A0f)) && threadSummary.A2i && 4YU.A1Y(capabilities, 32) && !A1W) {
            z = true;
        }
        return z;
    }
}
