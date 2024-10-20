package com.facebook.messaging.composer.plugins.liveupdatedmentions;

import X.1BK;
import X.1BL;
import X.1Bq;
import X.1Br;
import X.2S4;
import X.AQb;
import X.C01g;
import X.C01i;
import X.ILT;
import android.content.Context;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.Observer;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.model.threadkey.ThreadKey;

/* loaded from: LiveUpdatedMentionsComposerLifecycle.class */
public final class LiveUpdatedMentionsComposerLifecycle {
    public LiveData A00;
    public ThreadKey A01;
    public final Context A02;
    public final LifecycleOwner A03;
    public final Observer A04;
    public final FbUserSession A05;
    public final 2S4 A06;
    public final 1Br A07;
    public final C01i A08;

    public LiveUpdatedMentionsComposerLifecycle(Context context, LifecycleOwner lifecycleOwner, FbUserSession fbUserSession, 2S4 r305) {
        1BL.A1F(context, lifecycleOwner);
        1BK.A1K(r305, 3, fbUserSession);
        this.A02 = context;
        this.A03 = lifecycleOwner;
        this.A06 = r305;
        this.A05 = fbUserSession;
        this.A07 = 1Bq.A00(67528);
        this.A04 = new ILT(this, 1);
        this.A08 = C01g.A01(new AQb(this, 3));
    }
}
