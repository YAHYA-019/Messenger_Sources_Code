package com.facebook.messaging.business.agent.plugins.biim.secondarydata;

import X.1BL;
import X.1Br;
import X.1Lm;
import X.6iB;
import X.9NG;
import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;

/* loaded from: AiAgentActiveSecondaryDataLoader.class */
public final class AiAgentActiveSecondaryDataLoader {
    public 9NG A00;
    public final Context A01;
    public final 1Br A02;
    public final 6iB A03;

    public AiAgentActiveSecondaryDataLoader(Context context, FbUserSession fbUserSession, 6iB r304) {
        1BL.A1H(context, fbUserSession, r304);
        this.A01 = context;
        this.A03 = r304;
        this.A02 = 1Lm.A00(context, fbUserSession, 68038);
    }
}
