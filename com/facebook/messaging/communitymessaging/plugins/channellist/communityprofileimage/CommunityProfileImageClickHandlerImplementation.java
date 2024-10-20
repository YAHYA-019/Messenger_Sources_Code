package com.facebook.messaging.communitymessaging.plugins.channellist.communityprofileimage;

import X.1BL;
import X.1Br;
import X.1Bu;
import X.1pI;
import X.AbG;
import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.wearable.common.comms.hera.shared.host.HeraHostSharedImplKt;
import com.facebook.xapp.messaging.model.secondarydata.ParcelableSecondaryData;

/* loaded from: CommunityProfileImageClickHandlerImplementation.class */
public final class CommunityProfileImageClickHandlerImplementation {
    public final Context A00;
    public final 1pI A01;
    public final 1Br A02;
    public final 1Br A03;
    public final 1Br A04;
    public final ThreadKey A05;
    public final ParcelableSecondaryData A06;
    public final FbUserSession A07;

    public CommunityProfileImageClickHandlerImplementation(Context context, FbUserSession fbUserSession, 1pI r304, ThreadKey threadKey, ParcelableSecondaryData parcelableSecondaryData) {
        1BL.A1H(context, parcelableSecondaryData, r304);
        this.A00 = context;
        this.A06 = parcelableSecondaryData;
        this.A01 = r304;
        this.A05 = threadKey;
        this.A07 = fbUserSession;
        this.A04 = 1Bu.A00(HeraHostSharedImplKt.DEFAULT_RECV_VIDEO_INIT_WIDTH);
        this.A03 = AbG.A0d(context, fbUserSession);
        this.A02 = AbG.A0c();
    }
}
