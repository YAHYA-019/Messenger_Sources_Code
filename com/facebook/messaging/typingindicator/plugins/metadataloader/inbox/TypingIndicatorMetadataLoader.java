package com.facebook.messaging.typingindicator.plugins.metadataloader.inbox;

import X.1BL;
import X.1Br;
import X.1Lm;
import X.2V3;
import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;

/* loaded from: TypingIndicatorMetadataLoader.class */
public final class TypingIndicatorMetadataLoader {
    public final 1Br A00;
    public final 2V3 A01;
    public final Context A02;
    public final FbUserSession A03;

    public TypingIndicatorMetadataLoader(Context context, FbUserSession fbUserSession, 2V3 r304) {
        1BL.A1H(r304, fbUserSession, context);
        this.A01 = r304;
        this.A03 = fbUserSession;
        this.A02 = context;
        this.A00 = 1Lm.A00(context, fbUserSession, 115363);
    }
}
