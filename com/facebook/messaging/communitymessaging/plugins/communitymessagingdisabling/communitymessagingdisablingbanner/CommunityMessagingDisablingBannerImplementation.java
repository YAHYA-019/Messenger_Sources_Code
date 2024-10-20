package com.facebook.messaging.communitymessaging.plugins.communitymessagingdisabling.communitymessagingdisablingbanner;

import X.06Z;
import X.1BK;
import X.1Bq;
import X.1Br;
import X.2Ws;
import X.2Wv;
import X.7zM;
import X.7zT;
import X.AbG;
import X.CaE;
import X.Cx8;
import android.content.Context;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.Observer;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.model.threadkey.ThreadKey;

/* loaded from: CommunityMessagingDisablingBannerImplementation.class */
public final class CommunityMessagingDisablingBannerImplementation {
    public LiveData A00;
    public String A01;
    public String A02;
    public final Context A03;
    public final 06Z A04;
    public final Observer A05;
    public final FbUserSession A06;
    public final 1Br A07;
    public final 1Br A08;
    public final 1Br A09;
    public final 2Ws A0A;
    public final 2Wv A0B;
    public final Cx8 A0C;
    public final String A0D;

    public CommunityMessagingDisablingBannerImplementation(Context context, 06Z r303, FbUserSession fbUserSession, 2Ws r305, 2Wv r306) {
        7zT.A1W(context, fbUserSession, r305, r303);
        this.A03 = context;
        this.A06 = fbUserSession;
        this.A0A = r305;
        this.A04 = r303;
        this.A0B = r306;
        this.A07 = 7zM.A0d();
        this.A08 = AbG.A0c();
        this.A09 = 1Bq.A00(83273);
        ThreadKey threadKey = r306.A01;
        if (threadKey == null) {
            throw 1BK.A0e();
        }
        this.A0D = 1BK.A0w(threadKey);
        this.A01 = "";
        this.A05 = CaE.A00(this, 69);
        this.A0C = new Cx8(this, 1);
    }
}
