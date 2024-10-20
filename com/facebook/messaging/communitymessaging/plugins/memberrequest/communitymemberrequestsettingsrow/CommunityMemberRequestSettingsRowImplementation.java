package com.facebook.messaging.communitymessaging.plugins.memberrequest.communitymemberrequestsettingsrow;

import X.11T;
import X.1BK;
import X.1Bq;
import X.1Br;
import X.1Lm;
import X.2Sh;
import X.7zU;
import X.AbG;
import X.AbH;
import X.AbJ;
import X.C3l;
import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.communitymessaging.model.Community;
import com.facebook.messaging.model.threadkey.ThreadKey;

/* loaded from: CommunityMemberRequestSettingsRowImplementation.class */
public final class CommunityMemberRequestSettingsRowImplementation {
    public final Context A00;
    public final 1Br A01;
    public final 1Br A02;
    public final ThreadKey A03;
    public final 2Sh A04;
    public final FbUserSession A05;

    public CommunityMemberRequestSettingsRowImplementation(Context context, FbUserSession fbUserSession, ThreadKey threadKey, 2Sh r305) {
        11T.A0F(threadKey, 2);
        this.A00 = context;
        this.A03 = threadKey;
        this.A04 = r305;
        this.A05 = fbUserSession;
        this.A01 = AbG.A0c();
        this.A02 = 1Bq.A00(82449);
    }

    public static final int A00(CommunityMemberRequestSettingsRowImplementation communityMemberRequestSettingsRowImplementation) {
        Object A14 = AbH.A14(communityMemberRequestSettingsRowImplementation.A04, Community.class);
        if (A14 == null) {
            throw 1BK.A0h();
        }
        Community community = (Community) A14;
        return (int) ((AbJ.A0P(((C3l) 1Lm.A05(communityMemberRequestSettingsRowImplementation.A00, communityMemberRequestSettingsRowImplementation.A05, 82450)).A00).A00(1, 7zU.A07(community)) ? community.A0H : community.A0I) + community.A0B);
    }
}
