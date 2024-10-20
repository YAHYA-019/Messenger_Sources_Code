package com.facebook.messaging.wellbeing.selfremediation.ignore.plugins.core.threadsettingsrow;

import X.06Z;
import X.11T;
import X.1BK;
import X.1BL;
import X.1Br;
import X.2MQ;
import X.4YU;
import X.7zM;
import X.7zT;
import X.AbI;
import X.BNV;
import X.C1u3;
import X.C1ut;
import X.CHv;
import X.CII;
import X.CQg;
import X.Cug;
import X.DHc;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.model.threads.ThreadSummary;
import com.facebook.xapp.messaging.capability.vector.Capabilities;

/* loaded from: IgnoreMessagesThreadSettingsRow.class */
public final class IgnoreMessagesThreadSettingsRow {
    public final 06Z A00;
    public final 1Br A01;
    public final 1Br A02;
    public final ThreadSummary A03;
    public final DHc A04;
    public final Context A05;
    public final ThreadKey A06;

    public IgnoreMessagesThreadSettingsRow(Context context, 06Z r303, ThreadKey threadKey, ThreadSummary threadSummary, DHc dHc) {
        7zT.A1T(context, threadKey, r303);
        11T.A0F(dHc, 5);
        this.A05 = context;
        this.A06 = threadKey;
        this.A03 = threadSummary;
        this.A00 = r303;
        this.A04 = dHc;
        this.A01 = 1BK.A0C();
        this.A02 = 7zM.A0T();
    }

    public static final boolean A00(ThreadSummary threadSummary, Capabilities capabilities) {
        11T.A0F(capabilities, 0);
        if (1BL.A0Q().AZk(36323337286273520L) || !4YU.A1Y(capabilities, 32) || threadSummary == null) {
            return false;
        }
        if (!ThreadKey.A0d(threadSummary.A0n)) {
            return true;
        }
        String str = threadSummary.A21;
        return (str == null || str.length() == 0) ? false : true;
    }

    public final Cug A01() {
        int i;
        CQg A00 = CQg.A00();
        Context context = this.A05;
        ThreadKey threadKey = this.A06;
        if (AbI.A1b(1Br.A07(this.A01))) {
            i = 2131968164;
        } else {
            i = 2131967140;
            if (threadKey.A1F()) {
                i = 2131957781;
            }
        }
        A00.A0B(1BK.A0u(context, i));
        CQg.A08(BNV.A1A, A00);
        A00.A00 = 1285442930L;
        CHv.A00(2MQ.A25, A00, (C1ut) null);
        A00.A05 = new CII((Drawable) null, (Uri) null, C1u3.A4L, (C1ut) null, (Boolean) null);
        return CQg.A04(A00, this, 80);
    }
}
