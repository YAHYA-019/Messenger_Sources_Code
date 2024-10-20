package com.facebook.messaging.navigation.plugins.communities.fbcommunitiesdrawerfolder;

import X.1BL;
import X.1Br;
import X.1HG;
import X.4UM;
import X.C4Mw;
import X.C4Xo;
import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.communitymessaging.model.CommunityMessagingCommunityType;
import com.facebook.messaging.model.threadkey.ThreadKey;

/* loaded from: FbCommunitiesDrawerFolderImplementation.class */
public final class FbCommunitiesDrawerFolderImplementation {
    public final FbUserSession A00;
    public final 1Br A01;
    public final C4Xo A02;
    public final Context A03;

    public FbCommunitiesDrawerFolderImplementation(Context context, FbUserSession fbUserSession, C4Xo c4Xo) {
        1BL.A1H(context, c4Xo, fbUserSession);
        this.A03 = context;
        this.A02 = c4Xo;
        this.A00 = fbUserSession;
        1Br A00 = 1HG.A00(context, 83011);
        this.A01 = A00;
        4UM r0 = (4UM) 1Br.A0B(A00);
        CommunityMessagingCommunityType communityMessagingCommunityType = CommunityMessagingCommunityType.A02;
        ThreadKey.A07(-14);
        r0.A07.put(communityMessagingCommunityType, ((C4Mw) 1Br.A0B(r0.A01)).A01(communityMessagingCommunityType));
    }
}
