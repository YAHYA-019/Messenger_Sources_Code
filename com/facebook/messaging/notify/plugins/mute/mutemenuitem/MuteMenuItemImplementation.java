package com.facebook.messaging.notify.plugins.mute.mutemenuitem;

import X.04R;
import X.06Z;
import X.11T;
import X.1BK;
import X.1BY;
import X.1Bn;
import X.2Ph;
import X.2oI;
import X.7zU;
import X.AVI;
import X.AbI;
import X.BLc;
import X.BOn;
import X.C1u3;
import X.C2ga;
import X.C8T;
import X.C9T;
import X.CHQ;
import X.CQE;
import X.CQo;
import X.Cit;
import android.content.Context;
import com.facebook.messaging.inbox.units.InboxTrackableItem;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.model.threads.ThreadSummary;

/* loaded from: MuteMenuItemImplementation.class */
public final class MuteMenuItemImplementation {
    public static final C9T A00(Context context) {
        11T.A0F(context, 0);
        1Bn.A0E(context, (1BY) null, 82629);
        CQE cqe = new CQE();
        cqe.A00 = 3;
        cqe.A06(C1u3.A0p);
        CQE.A02(context, cqe, 2131959553);
        return CQE.A01(cqe, "mute");
    }

    public static final void A01(Context context, 06Z r302, InboxTrackableItem inboxTrackableItem, ThreadSummary threadSummary) {
        11T.A0H(r302, threadSummary);
        11T.A0F(context, 3);
        CHQ chq = (CHQ) 1Bn.A0E(context, (1BY) null, 82629);
        ThreadKey threadKey = threadSummary.A0l;
        BLc bLc = 7zU.A0h(threadSummary.A0m) == ThreadKey.A08 ? BLc.A09 : BLc.A08;
        long j = threadSummary.A06;
        if (threadKey != null) {
            ThreadKey threadKey2 = threadSummary.A0n;
            if (threadKey2.A1A()) {
                long A0r = threadKey.A0r();
                Cit cit = new Cit(context, r302, inboxTrackableItem, threadSummary, bLc, chq, String.valueOf(A0r), j);
                1Bn.A0A(147539);
                new C8T(context, A0r).A01(new AVI(39, context, cit, threadKey2), A0r);
                return;
            }
            if (threadKey2.A1C()) {
                CHQ.A00(context, r302, inboxTrackableItem, threadSummary, bLc, chq, ((2Ph) 1Bn.A0E(context, (1BY) null, 17010)).A02(C2ga.A00(threadKey)).A02() ^ true ? 1BK.A0u(context, 2131966492) : null, 1BK.A0w(threadKey), String.valueOf(j));
                return;
            }
        }
        boolean A06 = 2oI.A06(threadSummary);
        BLc bLc2 = BLc.A08;
        if (!A06) {
            CHQ.A00(context, r302, inboxTrackableItem, threadSummary, bLc2, chq, (String) null, (String) null, (String) null);
        } else {
            CHQ.A00(context, r302, inboxTrackableItem, threadSummary, bLc2, chq, (String) null, (String) null, (String) null);
            CQo.A0H(BOn.A0F, AbI.A0b(chq.A02), (Long) null, 04R.A0G(), 14, 3, 3);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0043, code lost:
    
        if (((X.CHQ) r0.get()).A01(r301) == false) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final boolean A02(com.facebook.messaging.model.threads.ThreadSummary r301, com.facebook.xapp.messaging.capability.vector.Capabilities r302) {
        /*
            r0 = r301
            r1 = r302
            X.11T.A0H(r0, r1)
            r0 = 82629(0x142c5, float:1.15788E-40)
            r303 = r0
            android.content.Context r0 = X.7zM.A0A()
            r1 = r303
            X.1BV r0 = X.7zL.A0R(r0, r1)
            r304 = r0
            r0 = r301
            com.facebook.messaging.model.threadkey.ThreadKey r0 = r0.A0n
            r305 = r0
            r0 = r305
            boolean r0 = r0.A1H()
            r306 = r0
            r0 = r306
            if (r0 == 0) goto L4f
            r0 = r302
            r1 = 19
            boolean r0 = X.4YU.A1Y(r0, r1)
            r306 = r0
            r0 = r306
            if (r0 == 0) goto L46
            r0 = r304
            java.lang.Object r0 = r0.get()
            X.CHQ r0 = (X.CHQ) r0
            r305 = r0
            r0 = r305
            r1 = r301
            boolean r0 = r0.A01(r1)
            r303 = r0
            r0 = 1
            r306 = r0
            r0 = r303
            if (r0 != 0) goto L4c
        L46:
            r0 = 0
            r306 = r0
            r0 = 0
            r305 = r0
        L4c:
            r0 = r306
            return r0
        L4f:
            r0 = r304
            java.lang.Object r0 = r0.get()
            X.CHQ r0 = (X.CHQ) r0
            r1 = r301
            boolean r0 = r0.A01(r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.messaging.notify.plugins.mute.mutemenuitem.MuteMenuItemImplementation.A02(com.facebook.messaging.model.threads.ThreadSummary, com.facebook.xapp.messaging.capability.vector.Capabilities):boolean");
    }
}
