package com.facebook.messaging.communitymessaging.plugins.adminactions.promotetomoderatorinvitationbanner;

import X.11T;
import X.1BL;
import X.1Br;
import X.1Lm;
import X.2Ws;
import X.2Wv;
import X.CaE;
import X.Cx8;
import android.content.Context;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.mig.scheme.interfaces.MigColorScheme;

/* loaded from: PromoteToModeratorInvitationBannerImplementation.class */
public final class PromoteToModeratorInvitationBannerImplementation {
    public LiveData A00;
    public MutableLiveData A01;
    public MigColorScheme A02;
    public boolean A03;
    public final Context A04;
    public final LifecycleOwner A05;
    public final Observer A06;
    public final 1Br A07;
    public final 2Ws A08;
    public final 2Wv A09;
    public final Cx8 A0A;
    public final FbUserSession A0B;

    public PromoteToModeratorInvitationBannerImplementation(Context context, LifecycleOwner lifecycleOwner, FbUserSession fbUserSession, 2Ws r305, 2Wv r306) {
        1BL.A1H(context, fbUserSession, r305);
        11T.A0F(lifecycleOwner, 5);
        this.A04 = context;
        this.A0B = fbUserSession;
        this.A08 = r305;
        this.A09 = r306;
        this.A05 = lifecycleOwner;
        this.A07 = 1Lm.A00(context, fbUserSession, 82391);
        this.A06 = CaE.A00(this, 54);
        this.A0A = new Cx8(this, 0);
    }
}
