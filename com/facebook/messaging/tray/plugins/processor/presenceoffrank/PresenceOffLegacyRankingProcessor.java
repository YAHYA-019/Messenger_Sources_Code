package com.facebook.messaging.tray.plugins.processor.presenceoffrank;

import X.11T;
import X.1Br;
import X.1Lm;
import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import java.util.Map;

/* loaded from: PresenceOffLegacyRankingProcessor.class */
public final class PresenceOffLegacyRankingProcessor {
    public Map A00;
    public final 1Br A01;

    public PresenceOffLegacyRankingProcessor(Context context, FbUserSession fbUserSession) {
        11T.A0F(context, 1);
        11T.A0F(fbUserSession, 2);
        this.A01 = 1Lm.A00(context, fbUserSession, 17028);
    }
}
