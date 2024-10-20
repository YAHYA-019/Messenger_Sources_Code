package com.facebook.messaging.linkhandling.plugins.facebookvideolinkhandler.implementation;

import X.1BK;
import X.1Bq;
import X.1Br;
import X.1Bu;
import X.1UG;

/* loaded from: FacebookVideosLinkHandler.class */
public final class FacebookVideosLinkHandler {
    public final 1Br A01 = 1Bu.A00(68730);
    public final 1Br A04 = 1Bq.A00(6);
    public final 1Br A05 = 1Bq.A00(66393);
    public final 1Br A02 = 1Bq.A00(49965);
    public final 1Br A03 = 1BK.A0D();
    public final 1Br A00 = 1Bq.A00(16477);

    public static final void A00(FacebookVideosLinkHandler facebookVideosLinkHandler, String str) {
        1UG A08 = 1BK.A08(1Br.A02(facebookVideosLinkHandler.A03), "video_share_event");
        if (A08.isSampled()) {
            A08.A7R("event_type", str);
            A08.BZL();
        }
    }
}
