package com.facebook.messaging.sharing.broadcastflow.mutation.loader.plugins.sections.broadcastflowremainingblendedsectionloader;

import X.11T;
import X.1BL;
import X.7zT;
import X.C6r;
import X.DJZ;
import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.google.common.collect.ImmutableList;
import java.util.Set;

/* loaded from: BroadcastFlowRemainingBlendedSectionLoader.class */
public final class BroadcastFlowRemainingBlendedSectionLoader {
    public final Context A00;
    public final FbUserSession A01;
    public final DJZ A02;
    public final C6r A03;
    public final ImmutableList.Builder A04;
    public final ImmutableList.Builder A05;
    public final Set A06;

    public BroadcastFlowRemainingBlendedSectionLoader(Context context, FbUserSession fbUserSession, DJZ djz, C6r c6r, ImmutableList.Builder builder, ImmutableList.Builder builder2, Set set) {
        7zT.A1W(djz, fbUserSession, set, builder);
        1BL.A1G(builder2, c6r);
        11T.A0F(context, 7);
        this.A02 = djz;
        this.A01 = fbUserSession;
        this.A06 = set;
        this.A05 = builder;
        this.A04 = builder2;
        this.A03 = c6r;
        this.A00 = context;
    }
}
