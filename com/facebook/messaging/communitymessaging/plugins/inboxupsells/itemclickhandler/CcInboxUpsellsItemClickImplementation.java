package com.facebook.messaging.communitymessaging.plugins.inboxupsells.itemclickhandler;

import X.06Z;
import X.11T;
import X.1BL;
import X.2YQ;
import X.49D;
import X.C2gi;
import android.content.Context;
import androidx.lifecycle.LifecycleOwner;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.common.callercontext.CallerContext;

/* loaded from: CcInboxUpsellsItemClickImplementation.class */
public final class CcInboxUpsellsItemClickImplementation {
    public final Context A00;
    public final 06Z A01;
    public final LifecycleOwner A02;
    public final FbUserSession A03;
    public final CallerContext A04;
    public final 2YQ A05;
    public final C2gi A06;
    public final 49D A07;

    public CcInboxUpsellsItemClickImplementation(Context context, 06Z r303, LifecycleOwner lifecycleOwner, FbUserSession fbUserSession, CallerContext callerContext, 2YQ r307, C2gi c2gi, 49D r309) {
        1BL.A1H(context, r303, r307);
        11T.A0F(fbUserSession, 4);
        1BL.A1G(r309, callerContext);
        11T.A0F(lifecycleOwner, 8);
        this.A00 = context;
        this.A01 = r303;
        this.A05 = r307;
        this.A03 = fbUserSession;
        this.A07 = r309;
        this.A04 = callerContext;
        this.A06 = c2gi;
        this.A02 = lifecycleOwner;
    }
}
