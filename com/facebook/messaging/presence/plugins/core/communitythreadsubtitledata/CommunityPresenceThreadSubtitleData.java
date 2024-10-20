package com.facebook.messaging.presence.plugins.core.communitythreadsubtitledata;

import X.1Bq;
import X.1Br;
import X.1Lm;
import X.6iB;
import X.7zM;
import X.7zT;
import X.AnonymousClass224;
import X.BDK;
import X.Gs9;
import X.LXB;
import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.model.threadkey.ThreadKey;

/* loaded from: CommunityPresenceThreadSubtitleData.class */
public final class CommunityPresenceThreadSubtitleData {
    public boolean A00;
    public final 1Br A01;
    public final 1Br A02;
    public final 1Br A03;
    public final 1Br A04;
    public final 1Br A05;
    public final ThreadKey A06;
    public final 6iB A07;
    public final Gs9 A08;
    public final Context A09;

    public CommunityPresenceThreadSubtitleData(Context context, FbUserSession fbUserSession, ThreadKey threadKey, 6iB r305) {
        7zT.A1T(context, fbUserSession, r305);
        this.A09 = context;
        this.A06 = threadKey;
        this.A07 = r305;
        this.A03 = 1Lm.A00(context, fbUserSession, 84156);
        this.A04 = 1Lm.A00(context, fbUserSession, 16686);
        this.A02 = 7zM.A0d();
        this.A05 = 1Bq.A00(66774);
        this.A01 = 1Bq.A00(16458);
        this.A08 = new Gs9(this);
    }

    public static final void A00(ThreadKey threadKey, CommunityPresenceThreadSubtitleData communityPresenceThreadSubtitleData) {
        BDK bdk = (BDK) 1Br.A0B(communityPresenceThreadSubtitleData.A03);
        Long valueOf = Long.valueOf(threadKey.A04);
        bdk.A00(new LXB(communityPresenceThreadSubtitleData, 9), ((AnonymousClass224) 1Br.A0B(communityPresenceThreadSubtitleData.A05)).A00("681066249448173"), valueOf);
    }
}
