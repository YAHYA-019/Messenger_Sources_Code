package com.facebook.messaging.msys.advancedcrypto.plugins.threadsettingsrow.groupmemberaddmode;

import X.0S2;
import X.2MQ;
import X.7zR;
import X.BNV;
import X.C1u3;
import X.C1ut;
import X.CHv;
import X.CII;
import X.CQg;
import X.Cug;
import X.DHd;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import com.facebook.messaging.model.threads.ThreadSummary;

/* loaded from: ThreadSettingsGroupMemberAddModeRow.class */
public final class ThreadSettingsGroupMemberAddModeRow {
    public final DHd A00;
    public final Context A01;
    public final ThreadSummary A02;

    public ThreadSettingsGroupMemberAddModeRow(Context context, ThreadSummary threadSummary, DHd dHd) {
        7zR.A1N(context, dHd);
        this.A01 = context;
        this.A02 = threadSummary;
        this.A00 = dHd;
    }

    public final Cug A00() {
        CHv cHv = new CHv(2MQ.A1V, (C1ut) null);
        CQg A00 = CQg.A00();
        Context context = this.A01;
        CQg.A07(context, A00, 2131967123);
        CQg.A08(BNV.A16, A00);
        A00.A00 = 3370195394L;
        A00.A04 = cHv;
        A00.A05 = new CII((Drawable) null, (Uri) null, C1u3.A3J, (C1ut) null, (Boolean) null);
        ThreadSummary threadSummary = this.A02;
        int i = 2131967121;
        if ((threadSummary != null ? threadSummary.A1Y : null) == 0S2.A01) {
            i = 2131967122;
        }
        A00.A0B = context.getString(i);
        return CQg.A04(A00, this, 6);
    }
}
