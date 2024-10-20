package com.facebook.messaging.presence.plugins.core.threadsubtitledata;

import X.11T;
import X.1BL;
import X.1Bq;
import X.1Br;
import X.1Bu;
import X.1Lm;
import X.5Cz;
import X.6NG;
import X.6iB;
import X.Cvz;
import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.model.threadkey.ThreadKey;

/* loaded from: ThreadSubtitleData.class */
public final class ThreadSubtitleData {
    public 5Cz A00;
    public final 1Br A01;
    public final 1Br A02;
    public final 1Br A03;
    public final ThreadKey A04;
    public final 6iB A05;
    public final Context A06;

    public ThreadSubtitleData(Context context, FbUserSession fbUserSession, ThreadKey threadKey, 6iB r305) {
        1BL.A1F(context, fbUserSession);
        11T.A0F(r305, 4);
        this.A06 = context;
        this.A04 = threadKey;
        this.A05 = r305;
        this.A03 = 1Bu.A01(context, 82799);
        this.A02 = 1Lm.A00(context, fbUserSession, 49772);
        this.A01 = 1Bq.A00(16713);
        this.A00 = 5Cz.A08;
        ((6NG) 1Br.A0B(this.A03)).A00 = new Cvz(this, 4);
    }
}
