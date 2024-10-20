package com.facebook.messaging.customthreads.plugins.core.nicknames.threadsettingsrow;

import X.11T;
import X.1Bq;
import X.1Br;
import X.2MQ;
import X.BNV;
import X.C1u3;
import X.C1ut;
import X.CHv;
import X.CII;
import X.CQg;
import X.Cug;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import com.facebook.messaging.model.threads.ThreadSummary;

/* loaded from: ThreadSettingsNicknamesRow.class */
public final class ThreadSettingsNicknamesRow {
    public static final long A02 = ThreadSettingsNicknamesRow.class.hashCode();
    public final ThreadSummary A00;
    public final Context A01;

    public ThreadSettingsNicknamesRow(Context context, ThreadSummary threadSummary) {
        11T.A0F(context, 1);
        this.A01 = context;
        this.A00 = threadSummary;
    }

    public final Cug A00() {
        if (this.A00 == null) {
            return null;
        }
        1Br A00 = 1Bq.A00(50079);
        CQg A002 = CQg.A00();
        CQg.A07(this.A01, A002, 2131967165);
        CQg.A08(BNV.A2J, A002);
        A002.A00 = A02;
        CHv.A00(2MQ.A38, A002, (C1ut) null);
        A002.A05 = new CII((Drawable) null, (Uri) null, C1u3.A6P, (C1ut) null, (Boolean) null);
        return CQg.A05(A002, A00, this, 27);
    }
}
