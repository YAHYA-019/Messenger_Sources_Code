package com.facebook.messaging.communitymessaging.plugins.communitycontainers.communitychannellistupclickhandler;

import X.11T;
import X.1BK;
import X.1Br;
import X.1Lm;
import X.2MX;
import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.xapp.messaging.model.secondarydata.ParcelableSecondaryData;

/* loaded from: CommunityChannelListUpClickHandlerImplementation.class */
public final class CommunityChannelListUpClickHandlerImplementation {
    public final Context A00;
    public final 1Br A01;
    public final 2MX A02;
    public final ParcelableSecondaryData A03;

    public CommunityChannelListUpClickHandlerImplementation(Context context, FbUserSession fbUserSession, 2MX r304, ParcelableSecondaryData parcelableSecondaryData) {
        11T.A0F(context, 3);
        this.A03 = parcelableSecondaryData;
        this.A02 = r304;
        this.A00 = context;
        if (fbUserSession == null) {
            throw 1BK.A0h();
        }
        this.A01 = 1Lm.A00(context, fbUserSession, 33183);
    }
}
