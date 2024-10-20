package com.facebook.messaging.threadview.message.detail.plugins.core.secondarydataload;

import X.11T;
import X.1Bq;
import X.1Br;
import X.1Bu;
import X.2S4;
import X.5Sc;
import X.6Fv;
import X.6iB;
import X.7P4;
import X.7P5;
import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.model.threadkey.ThreadKey;

/* loaded from: MessageDetailThreadViewDataManager.class */
public final class MessageDetailThreadViewDataManager {
    public 5Sc A00;
    public final Context A01;
    public final FbUserSession A02;
    public final 1Br A03;
    public final 1Br A04;
    public final 1Br A05;
    public final ThreadKey A06;
    public final 6iB A07;
    public final 7P4 A08;
    public final 7P5 A09;
    public final 6Fv A0A;
    public final 2S4 A0B;

    public MessageDetailThreadViewDataManager(Context context, FbUserSession fbUserSession, 2S4 r304, ThreadKey threadKey, 6iB r306) {
        11T.A0F(context, 1);
        11T.A0F(fbUserSession, 2);
        11T.A0F(r306, 3);
        11T.A0F(r304, 4);
        11T.A0F(threadKey, 5);
        this.A01 = context;
        this.A02 = fbUserSession;
        this.A07 = r306;
        this.A0B = r304;
        this.A06 = threadKey;
        this.A0A = (6Fv) r304.A00(50009);
        this.A04 = 1Bq.A00(66481);
        this.A05 = 1Bq.A00(68470);
        this.A03 = 1Bu.A00(83118);
        this.A08 = new 7P4(this);
        this.A09 = new 7P5(this);
    }
}
