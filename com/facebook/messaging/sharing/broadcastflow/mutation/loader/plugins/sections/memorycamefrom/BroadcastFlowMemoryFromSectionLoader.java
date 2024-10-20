package com.facebook.messaging.sharing.broadcastflow.mutation.loader.plugins.sections.memorycamefrom;

import X.1BL;
import X.7zR;
import X.C6r;
import X.DHX;
import X.DJZ;
import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.google.common.collect.ImmutableList;
import java.util.Set;

/* loaded from: BroadcastFlowMemoryFromSectionLoader.class */
public final class BroadcastFlowMemoryFromSectionLoader {
    public final Context A00;
    public final FbUserSession A01;
    public final DJZ A02;
    public final C6r A03;
    public final ImmutableList.Builder A04;
    public final Set A05;
    public final DHX A06;

    public BroadcastFlowMemoryFromSectionLoader(Context context, FbUserSession fbUserSession, DHX dhx, DJZ djz, C6r c6r, ImmutableList.Builder builder, Set set) {
        1BL.A1H(dhx, djz, set);
        1BL.A1G(builder, c6r);
        7zR.A1P(context, fbUserSession);
        this.A06 = dhx;
        this.A02 = djz;
        this.A05 = set;
        this.A04 = builder;
        this.A03 = c6r;
        this.A00 = context;
        this.A01 = fbUserSession;
    }
}
