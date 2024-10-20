package com.facebook.messaging.avatar.plugins.dataload.thread;

import X.11T;
import X.1Bq;
import X.1Br;
import X.1Lm;
import X.61Y;
import X.6iB;
import X.7Na;
import X.7Nb;
import X.C2a2;
import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.model.threadkey.ThreadKey;

/* loaded from: AvatarInThreadDataLoad.class */
public final class AvatarInThreadDataLoad {
    public 61Y A00;
    public C2a2 A01;
    public boolean A02;
    public final 1Br A03;
    public final 1Br A04;
    public final 1Br A05;
    public final 1Br A06;
    public final 7Nb A07;
    public final ThreadKey A08;
    public final 6iB A09;
    public final Context A0A;
    public final FbUserSession A0B;

    public AvatarInThreadDataLoad(Context context, FbUserSession fbUserSession, ThreadKey threadKey, 6iB r305) {
        11T.A0F(context, 1);
        11T.A0F(r305, 2);
        11T.A0F(fbUserSession, 3);
        11T.A0F(threadKey, 4);
        this.A0A = context;
        this.A09 = r305;
        this.A0B = fbUserSession;
        this.A08 = threadKey;
        this.A05 = 1Lm.A00(context, fbUserSession, 66451);
        this.A04 = 1Lm.A00(context, fbUserSession, 66197);
        this.A06 = 1Lm.A00(context, fbUserSession, 66452);
        this.A03 = 1Bq.A00(66227);
        this.A00 = new 61Y((Boolean) null, false, false, false, false, false, false, false, false, false, false);
        this.A07 = new 7Nb(new 7Na(this));
    }
}
