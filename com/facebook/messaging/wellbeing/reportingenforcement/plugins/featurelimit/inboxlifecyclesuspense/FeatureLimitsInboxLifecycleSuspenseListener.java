package com.facebook.messaging.wellbeing.reportingenforcement.plugins.featurelimit.inboxlifecyclesuspense;

import X.11T;
import X.1Br;
import X.1Bu;
import X.C01g;
import X.C01i;
import X.C82y;
import android.content.Context;
import androidx.lifecycle.LifecycleOwner;
import com.facebook.auth.usersession.FbUserSession;

/* loaded from: FeatureLimitsInboxLifecycleSuspenseListener.class */
public final class FeatureLimitsInboxLifecycleSuspenseListener {
    public final Context A00;
    public final LifecycleOwner A01;
    public final FbUserSession A02;
    public final 1Br A03;
    public final C01i A04;

    public FeatureLimitsInboxLifecycleSuspenseListener(Context context, LifecycleOwner lifecycleOwner, FbUserSession fbUserSession) {
        11T.A0F(context, 1);
        11T.A0F(lifecycleOwner, 2);
        11T.A0F(fbUserSession, 3);
        this.A00 = context;
        this.A01 = lifecycleOwner;
        this.A02 = fbUserSession;
        this.A03 = 1Bu.A00(68199);
        this.A04 = C01g.A01(new C82y(this, 30));
    }
}
