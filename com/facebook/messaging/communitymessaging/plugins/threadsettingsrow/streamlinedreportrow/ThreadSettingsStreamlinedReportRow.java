package com.facebook.messaging.communitymessaging.plugins.threadsettingsrow.streamlinedreportrow;

import X.06Z;
import X.11T;
import X.1BK;
import X.1Bi;
import X.1Bu;
import X.1PG;
import X.7zP;
import X.AbF;
import X.C2ga;
import X.C5yl;
import X.C72;
import android.content.Context;
import androidx.fragment.app.Fragment;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.model.threads.ThreadSummary;
import java.util.List;

/* loaded from: ThreadSettingsStreamlinedReportRow.class */
public final class ThreadSettingsStreamlinedReportRow {
    public static final ThreadSettingsStreamlinedReportRow A00 = new Object();

    public static final void A00(Context context, 06Z r302, FbUserSession fbUserSession, ThreadKey threadKey, ThreadSummary threadSummary, C5yl c5yl) {
        1PG r0 = (1PG) 1Bi.A03(66265);
        C72 c72 = (C72) 1Bu.A06(context, 82502);
        boolean A05 = r0.A05();
        List A0x = 7zP.A0x(r302);
        int size = A0x.size();
        if (size > 0) {
            r302 = ((Fragment) A0x.get(size - 1)).getChildFragmentManager();
            11T.A0D(r302);
        }
        if (!A05) {
            int ordinal = threadSummary.BIz().ordinal();
            if (ordinal == 0) {
                threadKey = C2ga.A00(AbF.A0f(threadSummary));
            } else {
                if (ordinal != 1) {
                    throw 1BK.A1F();
                }
                threadKey = C2ga.A01(AbF.A0f(threadSummary));
            }
        }
        c72.A00(r302, fbUserSession, threadKey, threadSummary, c5yl);
    }
}
