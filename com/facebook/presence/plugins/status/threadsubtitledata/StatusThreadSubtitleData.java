package com.facebook.presence.plugins.status.threadsubtitledata;

import X.11T;
import X.1BL;
import X.1Bq;
import X.1Br;
import X.2Ti;
import X.6iB;
import X.A21;
import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.model.threadkey.ThreadKey;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: StatusThreadSubtitleData.class */
public final class StatusThreadSubtitleData {
    public final Context A00;
    public final FbUserSession A01;
    public final 1Br A02;
    public final ThreadKey A03;
    public final 6iB A04;
    public final 2Ti A05;
    public final AtomicBoolean A06;

    public StatusThreadSubtitleData(Context context, FbUserSession fbUserSession, ThreadKey threadKey, 6iB r305) {
        1BL.A1F(context, fbUserSession);
        11T.A0F(r305, 4);
        this.A00 = context;
        this.A01 = fbUserSession;
        this.A03 = threadKey;
        this.A04 = r305;
        this.A02 = 1Bq.A00(16460);
        this.A06 = new AtomicBoolean();
        this.A05 = new A21(this, 5);
    }
}
