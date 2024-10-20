package com.facebook.messaging.communitymessaging.plugins.pausechat.pausegroupchannellistitem;

import X.11T;
import X.1Br;
import X.1Lm;
import X.2Si;
import X.2Sk;
import X.AbG;
import X.AnonymousClass001;
import X.CaE;
import android.content.Context;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.Observer;
import com.facebook.auth.usersession.FbUserSession;
import java.util.List;

/* loaded from: PauseGroupChannelListItemImplementation.class */
public final class PauseGroupChannelListItemImplementation {
    public LiveData A00;
    public List A01;
    public final Observer A02;
    public final 1Br A03;
    public final 1Br A04;
    public final 1Br A05;
    public final 2Si A06;
    public final 2Sk A07;
    public final Context A08;
    public final FbUserSession A09;

    public PauseGroupChannelListItemImplementation(Context context, FbUserSession fbUserSession, 2Si r304, 2Sk r305) {
        11T.A0F(r304, 4);
        this.A08 = context;
        this.A09 = fbUserSession;
        this.A07 = r305;
        this.A06 = r304;
        this.A05 = 1Lm.A00(context, fbUserSession, 82370);
        this.A04 = AbG.A0Q();
        this.A01 = AnonymousClass001.A0s();
        this.A03 = AbG.A0d(context, fbUserSession);
        this.A02 = CaE.A00(this, 72);
    }
}
