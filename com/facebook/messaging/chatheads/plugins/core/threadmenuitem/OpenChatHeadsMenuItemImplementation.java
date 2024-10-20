package com.facebook.messaging.chatheads.plugins.core.threadmenuitem;

import X.06Z;
import X.1BK;
import X.1BL;
import X.1BY;
import X.1Bi;
import X.1Bn;
import X.1Br;
import X.1Bu;
import X.1F9;
import X.1SI;
import X.1XU;
import X.2Gt;
import X.2oI;
import X.4YU;
import X.4bM;
import X.7Tx;
import X.7U8;
import X.7zQ;
import X.AbF;
import X.AbG;
import X.AbR;
import X.AnonymousClass001;
import X.BBg;
import X.BOp;
import X.C1254Abw;
import X.C2j4;
import X.C2j5;
import X.C2rw;
import X.C5nn;
import X.C5py;
import X.C9xm;
import X.Cu4;
import X.CwH;
import android.content.Context;
import android.os.Build;
import com.facebook.acra.constants.ActionId;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.model.threads.ThreadSummary;
import com.facebook.xapp.messaging.capability.vector.Capabilities;
import java.util.List;

/* loaded from: OpenChatHeadsMenuItemImplementation.class */
public final class OpenChatHeadsMenuItemImplementation {
    public static final OpenChatHeadsMenuItemImplementation A00 = new Object();

    public static final void A00(06Z r301, ThreadSummary threadSummary) {
        ((C2j4) 1Bi.A03(66459)).A04(r301, threadSummary);
    }

    public static final boolean A01(Context context, 06Z r302, FbUserSession fbUserSession, ThreadSummary threadSummary, List list) {
        boolean z;
        if (C5nn.A00(context, fbUserSession, threadSummary)) {
            ((C9xm) 1Bn.A0A(68776)).A02(context, r302, fbUserSession, threadSummary, 4);
            z = true;
        } else {
            z = false;
        }
        boolean z2 = true;
        if (!z) {
            if (((7Tx) 1Bu.A06(context, 50205)).A01(fbUserSession, threadSummary)) {
                ((AbR) 1Bu.A06(context, 679)).A0z(context, r302, fbUserSession, threadSummary, new BBg(context, r302, threadSummary)).A01(true);
                return true;
            }
            if (((7U8) 1Bn.A0A(83218)).A03(fbUserSession, threadSummary, list)) {
                ((Cu4) 1Bu.A06(context, 82652)).A00(context, r302, BOp.A0E, threadSummary, new CwH(context, r302, threadSummary), list);
                return true;
            }
            z2 = false;
        }
        return z2;
    }

    private final boolean A02(Context context, ThreadSummary threadSummary) {
        ThreadKey A0f = AbF.A0f(threadSummary);
        1F9 r0 = threadSummary.A0g;
        if (r0 == null) {
            throw 1BK.A0h();
        }
        Capabilities capabilities = threadSummary.A1C;
        Boolean valueOf = capabilities != null ? Boolean.valueOf(4YU.A1Y(capabilities, ActionId.ABORTED)) : null;
        boolean A002 = ((C5py) 1Bi.A03(82523)).A00(threadSummary);
        if (ThreadKey.A0l(A0f) || r0 == 1F9.A06) {
            return false;
        }
        1Br A01 = 1Bu.A01(context, 82110);
        if ((ThreadKey.A0a(A0f) && !1Br.A07(((4bM) 1Br.A0B(A01)).A02).AZk(36324947898945761L)) || ThreadKey.A0c(A0f) || 1BK.A1X(valueOf, true)) {
            return false;
        }
        if (2oI.A03(threadSummary)) {
            if (!2oI.A06(threadSummary)) {
                return false;
            }
            4bM r02 = (4bM) 1Bn.A0E(context, (1BY) null, 82110);
            if (!r02.A00(threadSummary) && !1Br.A07(r02.A02).AZk(36325751058027459L)) {
                return false;
            }
        }
        return !A002;
    }

    public static final boolean A03(Context context, ThreadSummary threadSummary) {
        ThreadKey A002;
        boolean A1X = 1BL.A1X(context, threadSummary);
        1Bn.A0A(82533);
        boolean z = false;
        ThreadKey threadKey = threadSummary.A0n;
        if (threadKey.A1E()) {
            return false;
        }
        C2j5 c2j5 = (C2j5) 1Bn.A0E(context, (1BY) null, 33230);
        if (c2j5.A01() && Build.VERSION.SDK_INT >= 30) {
            1SI r0 = (1SI) 1Bn.A0A(16671);
            C1254Abw c1254Abw = (C1254Abw) 1Bn.A0E(context, (1BY) null, 82531);
            if (!C2rw.A00(context) && r0.A0B(threadKey) && A00.A02(context, threadSummary)) {
                if (c1254Abw.A0C(threadKey)) {
                    return A1X;
                }
                if (c2j5.A02() && threadSummary.A2X && threadSummary.A1f != null && (A002 = 2Gt.A00(threadSummary, AbG.A03(7zQ.A0O(context).Aue().mUserId))) != null) {
                    return c1254Abw.A0C(A002);
                }
            }
        } else if (AnonymousClass001.A1V(1Bn.A0E(context, (1BY) null, 99943)) && !1XU.A00(context) && A00.A02(context, threadSummary)) {
            z = true;
        }
        return z;
    }
}
