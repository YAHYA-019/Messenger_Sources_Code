package com.facebook.messaging.advancedcrypto.plugins.msgrreaction.msgrsenderfactory;

import X.1BL;
import X.1Bq;
import X.1Br;
import X.1Bu;
import X.9VX;
import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.xapp.messaging.map.HeterogeneousMap;

/* loaded from: MsgrSenderFactoryImplementation.class */
public final class MsgrSenderFactoryImplementation extends 9VX {
    public final Context A00;
    public final FbUserSession A01;
    public final 1Br A02;
    public final 1Br A03;
    public final ThreadKey A04;
    public final HeterogeneousMap A05;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MsgrSenderFactoryImplementation(Context context, FbUserSession fbUserSession, ThreadKey threadKey, HeterogeneousMap heterogeneousMap) {
        super(context, fbUserSession, threadKey, heterogeneousMap);
        1BL.A11(1, fbUserSession, context, heterogeneousMap);
        this.A01 = fbUserSession;
        this.A04 = threadKey;
        this.A00 = context;
        this.A05 = heterogeneousMap;
        this.A03 = 1Bq.A00(67773);
        this.A02 = 1Bu.A00(67168);
    }
}
