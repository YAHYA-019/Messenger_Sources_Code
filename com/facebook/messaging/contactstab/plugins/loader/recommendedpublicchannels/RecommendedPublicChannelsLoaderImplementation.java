package com.facebook.messaging.contactstab.plugins.loader.recommendedpublicchannels;

import X.1BL;
import X.1Br;
import X.1Lm;
import X.9Wz;
import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;

/* loaded from: RecommendedPublicChannelsLoaderImplementation.class */
public final class RecommendedPublicChannelsLoaderImplementation {
    public final 1Br A00;
    public final 9Wz A01;
    public final Context A02;
    public final FbUserSession A03;

    public RecommendedPublicChannelsLoaderImplementation(Context context, FbUserSession fbUserSession, 9Wz r304) {
        1BL.A1H(context, r304, fbUserSession);
        this.A02 = context;
        this.A01 = r304;
        this.A03 = fbUserSession;
        this.A00 = 1Lm.A00(context, fbUserSession, 68469);
    }
}
