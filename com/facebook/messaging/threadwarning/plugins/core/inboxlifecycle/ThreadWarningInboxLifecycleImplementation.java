package com.facebook.messaging.threadwarning.plugins.core.inboxlifecycle;

import X.06Z;
import X.11T;
import X.1Bi;
import X.1Bn;
import X.1XU;
import X.2Zf;
import X.AbE;
import X.C00j;
import X.C04464b1;
import X.C9xm;
import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.model.threads.ThreadSummary;

/* loaded from: ThreadWarningInboxLifecycleImplementation.class */
public final class ThreadWarningInboxLifecycleImplementation {
    public boolean A00;
    public final Context A01;
    public final 06Z A02;
    public final FbUserSession A03;

    public ThreadWarningInboxLifecycleImplementation(Context context, 06Z r303, FbUserSession fbUserSession) {
        11T.A0F(context, 1);
        11T.A0F(r303, 2);
        11T.A0F(fbUserSession, 3);
        this.A01 = context;
        this.A02 = r303;
        this.A03 = fbUserSession;
    }

    public static final void A00(Context context, 06Z r302, ThreadWarningInboxLifecycleImplementation threadWarningInboxLifecycleImplementation) {
        C00j.A05("ThreadWarningInboxLifecycleImplementation.maybeShowWarningDialog", -1309715152);
        try {
            2Zf r0 = (2Zf) 1Bi.A03(68775);
            ThreadSummary threadSummary = r0.A00;
            Integer num = r0.A01;
            if (threadSummary != null && num != null) {
                C9xm c9xm = (C9xm) 1Bn.A0A(68776);
                int intValue = num.intValue();
                c9xm.A02(context, r302, threadWarningInboxLifecycleImplementation.A03, threadSummary, intValue);
                if (intValue == 4 && 1XU.A00(context)) {
                    C04464b1 c04464b1 = (C04464b1) 1Bi.A03(67900);
                    ThreadKey threadKey = threadSummary.A0n;
                    11T.A0A(threadKey);
                    c04464b1.A05(threadKey, AbE.A00(93));
                }
            }
            r0.A00 = null;
            r0.A01 = null;
            C00j.A01(-237799376);
        } catch (Throwable th) {
            C00j.A01(-1826451707);
            throw th;
        }
    }
}
