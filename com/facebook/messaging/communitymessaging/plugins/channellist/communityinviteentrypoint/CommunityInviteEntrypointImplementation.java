package com.facebook.messaging.communitymessaging.plugins.channellist.communityinviteentrypoint;

import X.1Br;
import X.1pI;
import X.7zM;
import X.7zR;
import android.content.Context;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.xapp.messaging.model.secondarydata.ParcelableSecondaryData;

/* loaded from: CommunityInviteEntrypointImplementation.class */
public final class CommunityInviteEntrypointImplementation {
    public final Context A00;
    public final 1pI A01;
    public final 1Br A02;
    public final ThreadKey A03;
    public final ParcelableSecondaryData A04;

    public CommunityInviteEntrypointImplementation(Context context, 1pI r303, ThreadKey threadKey, ParcelableSecondaryData parcelableSecondaryData) {
        7zR.A1N(context, r303);
        this.A00 = context;
        this.A04 = parcelableSecondaryData;
        this.A01 = r303;
        this.A03 = threadKey;
        this.A02 = 7zM.A0U();
    }
}
