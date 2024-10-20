package com.facebook.messaging.groups.plugins.core.threadsettingsmenuitem.changegroupname;

import X.06Z;
import X.1BK;
import X.2Gt;
import X.2Ov;
import X.7zR;
import X.C0D1;
import android.os.Bundle;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.messaging.customthreads.name.dialog.ThreadNameSettingDialogFragment;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.model.threads.ThreadSummary;

/* loaded from: ChangeGroupNameMenuItem.class */
public final class ChangeGroupNameMenuItem {
    public static final void A00(06Z r301, ThreadKey threadKey, ThreadSummary threadSummary) {
        7zR.A1O(r301, threadKey);
        if (C0D1.A01(r301)) {
            if (threadSummary == null) {
                throw 1BK.A0h();
            }
            CallerContext A0C = CallerContext.A0C("ChangeGroupNameMenuItem", "messenger_thread_settings_set_group_name");
            if (2Gt.A0D(threadSummary) || threadSummary.A2i) {
                2Ov threadNameSettingDialogFragment = new ThreadNameSettingDialogFragment();
                Bundle A0E = 7zR.A0E(threadKey);
                A0E.putParcelable("caller_context", A0C);
                A0E.putString("current_thread_name", threadSummary.A20);
                threadNameSettingDialogFragment.setArguments(A0E);
                threadNameSettingDialogFragment.A0m(r301, "threadNameDialog");
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0030, code lost:
    
        if (X.AbL.A1L(r301) != false) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final boolean A01(com.facebook.messaging.model.threads.ThreadSummary r301, com.facebook.xapp.messaging.capability.vector.Capabilities r302) {
        /*
            r0 = 1
            r303 = r0
            r0 = r302
            r1 = r303
            X.11T.A0F(r0, r1)
            r0 = r301
            if (r0 == 0) goto L33
            r0 = r302
            java.util.BitSet r0 = r0.A00
            r304 = r0
            r0 = r304
            r1 = 60
            boolean r0 = r0.get(r1)
            r303 = r0
            r0 = r303
            if (r0 == 0) goto L33
            r0 = r304
            r1 = 81
            boolean r0 = r0.get(r1)
            r303 = r0
            r0 = r303
            if (r0 != 0) goto L33
            r0 = r301
            boolean r0 = X.AbL.A1L(r0)
            r305 = r0
            r0 = 1
            r303 = r0
            r0 = r305
            if (r0 == 0) goto L35
        L33:
            r0 = 0
            r303 = r0
        L35:
            r0 = r303
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.messaging.groups.plugins.core.threadsettingsmenuitem.changegroupname.ChangeGroupNameMenuItem.A01(com.facebook.messaging.model.threads.ThreadSummary, com.facebook.xapp.messaging.capability.vector.Capabilities):boolean");
    }
}
