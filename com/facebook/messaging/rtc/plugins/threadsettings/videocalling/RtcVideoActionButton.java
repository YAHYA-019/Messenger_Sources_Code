package com.facebook.messaging.rtc.plugins.threadsettings.videocalling;

import X.1BL;
import X.1Br;
import X.1Bu;
import X.2MQ;
import X.C8R;
import X.COp;
import X.CZF;
import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.model.threads.ThreadSummary;
import com.facebook.user.model.User;

/* loaded from: RtcVideoActionButton.class */
public final class RtcVideoActionButton {
    public final Context A00;
    public final FbUserSession A01;
    public final 1Br A02;
    public final 1Br A03;
    public final ThreadKey A04;
    public final ThreadSummary A05;
    public final User A06;

    public RtcVideoActionButton(Context context, FbUserSession fbUserSession, ThreadKey threadKey, ThreadSummary threadSummary, User user) {
        1BL.A1H(context, fbUserSession, threadKey);
        this.A00 = context;
        this.A01 = fbUserSession;
        this.A04 = threadKey;
        this.A05 = threadSummary;
        this.A06 = user;
        this.A02 = 1Bu.A01(context, 65938);
        this.A03 = 1Bu.A00(99984);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.COp, java.lang.Object] */
    public final C8R A00() {
        ?? obj = new Object();
        ((COp) obj).A03 = CZF.A00(this, 59);
        COp.A01(2MQ.A0f, (COp) obj);
        ((COp) obj).A01 = 2131967136;
        return COp.A00((COp) obj, 2131967135);
    }
}
