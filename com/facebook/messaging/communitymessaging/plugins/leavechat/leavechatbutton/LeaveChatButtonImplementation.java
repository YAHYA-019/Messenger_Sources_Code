package com.facebook.messaging.communitymessaging.plugins.leavechat.leavechatbutton;

import X.06Z;
import X.11T;
import X.1BL;
import X.1Br;
import X.1Bu;
import X.DHc;
import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.model.threads.ThreadSummary;

/* loaded from: LeaveChatButtonImplementation.class */
public final class LeaveChatButtonImplementation {
    public final Context A00;
    public final 06Z A01;
    public final FbUserSession A02;
    public final 1Br A03;
    public final 1Br A04;
    public final 1Br A05;
    public final ThreadSummary A06;
    public final DHc A07;

    public LeaveChatButtonImplementation(Context context, 06Z r303, FbUserSession fbUserSession, ThreadSummary threadSummary, DHc dHc) {
        1BL.A11(1, context, dHc, r303);
        11T.A0F(fbUserSession, 5);
        this.A00 = context;
        this.A06 = threadSummary;
        this.A07 = dHc;
        this.A01 = r303;
        this.A02 = fbUserSession;
        this.A03 = 1Bu.A01(context, 82535);
        this.A04 = 1Bu.A01(context, 82542);
        this.A05 = 1Bu.A01(context, 17010);
    }
}
