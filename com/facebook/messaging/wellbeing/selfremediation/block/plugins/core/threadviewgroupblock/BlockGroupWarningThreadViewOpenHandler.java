package com.facebook.messaging.wellbeing.selfremediation.block.plugins.core.threadviewgroupblock;

import X.06Z;
import X.11T;
import X.1BK;
import X.1Br;
import X.1Bu;
import X.2oI;
import X.5PC;
import X.6Fz;
import X.6hQ;
import X.7Tx;
import X.AbR;
import X.Cu5;
import X.EAX;
import X.RoE;
import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.model.threads.ThreadSummary;

/* loaded from: BlockGroupWarningThreadViewOpenHandler.class */
public final class BlockGroupWarningThreadViewOpenHandler {
    public ThreadSummary A00;
    public boolean A01;
    public final 6Fz A02;
    public final Context A03;
    public final FbUserSession A04;

    public BlockGroupWarningThreadViewOpenHandler(Context context, FbUserSession fbUserSession, 6Fz r304) {
        11T.A0F(context, 1);
        11T.A0F(fbUserSession, 2);
        11T.A0F(r304, 3);
        this.A03 = context;
        this.A04 = fbUserSession;
        this.A02 = r304;
    }

    public static final void A00(06Z r301, 6hQ r302, BlockGroupWarningThreadViewOpenHandler blockGroupWarningThreadViewOpenHandler) {
        ThreadSummary threadSummary;
        ThreadKey threadKey;
        ThreadSummary threadSummary2;
        Context context = blockGroupWarningThreadViewOpenHandler.A03;
        1Br A01 = 1Bu.A01(context, 50205);
        1Br A00 = 1Bu.A00(82526);
        ThreadSummary threadSummary3 = blockGroupWarningThreadViewOpenHandler.A00;
        if ((!(ThreadKey.A0a(threadSummary3 != null ? threadSummary3.A0n : null) && 5PC.A00((5PC) 1Br.A0B(A00)).AZk(36315224093565512L)) && (((threadSummary = blockGroupWarningThreadViewOpenHandler.A00) == null || (threadKey = threadSummary.A0n) == null || !threadKey.A1D()) && !2oI.A06(threadSummary))) || (threadSummary2 = blockGroupWarningThreadViewOpenHandler.A00) == null || threadSummary2.A0n == null || blockGroupWarningThreadViewOpenHandler.A01) {
            return;
        }
        7Tx r0 = (7Tx) 1Br.A0B(A01);
        FbUserSession fbUserSession = blockGroupWarningThreadViewOpenHandler.A04;
        if (r0.A01(fbUserSession, threadSummary2)) {
            AbR abR = (AbR) 1Bu.A06(context, 679);
            blockGroupWarningThreadViewOpenHandler.A01 = true;
            Cu5 A0z = abR.A0z(context, r301, fbUserSession, threadSummary2, r302);
            A0z.A01(false);
            EAX eax = A0z.A00;
            if (eax == null) {
                throw 1BK.A0h();
            }
            eax.A07 = new RoE(blockGroupWarningThreadViewOpenHandler);
        }
    }
}
