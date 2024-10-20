package com.facebook.messaging.communitymessaging.plugins.adminactions.mutedmemberbanner;

import X.1BL;
import X.1Br;
import X.1Lm;
import X.2Ws;
import X.2Wv;
import X.C9qq;
import X.C9za;
import android.content.Context;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.Observer;
import com.facebook.auth.usersession.FbUserSession;

/* loaded from: MutedMemberBannerImplementation.class */
public final class MutedMemberBannerImplementation {
    public LiveData A00;
    public boolean A01;
    public final Context A02;
    public final Observer A03;
    public final 1Br A04;
    public final 2Ws A05;
    public final 2Wv A06;
    public final C9za A07;
    public final FbUserSession A08;

    public MutedMemberBannerImplementation(Context context, FbUserSession fbUserSession, 2Ws r304, 2Wv r305) {
        1BL.A1H(context, fbUserSession, r304);
        this.A02 = context;
        this.A08 = fbUserSession;
        this.A05 = r304;
        this.A06 = r305;
        this.A07 = new C9za(this, 0);
        this.A04 = 1Lm.A00(context, fbUserSession, 82391);
        this.A03 = new C9qq(this, 7);
    }
}
