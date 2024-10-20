package com.facebook.messaging.sharing.broadcastflow.mutation.loader.plugins.sections.igconnections;

import X.1BL;
import X.7zT;
import X.C6r;
import X.DJZ;
import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.google.common.collect.ImmutableList;
import java.util.Set;

/* loaded from: BroadcastFlowInstagramConnectionsLoader.class */
public final class BroadcastFlowInstagramConnectionsLoader {
    public final Context A00;
    public final DJZ A01;
    public final Set A02;
    public final FbUserSession A03;
    public final C6r A04;
    public final ImmutableList.Builder A05;

    public BroadcastFlowInstagramConnectionsLoader(Context context, FbUserSession fbUserSession, DJZ djz, C6r c6r, ImmutableList.Builder builder, Set set) {
        7zT.A1W(djz, set, builder, c6r);
        1BL.A1G(context, fbUserSession);
        this.A01 = djz;
        this.A02 = set;
        this.A05 = builder;
        this.A04 = c6r;
        this.A00 = context;
        this.A03 = fbUserSession;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0096, code lost:
    
        if (r0.isEmpty() != false) goto L15;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r306v10 */
    /* JADX WARN: Type inference failed for: r306v11 */
    /* JADX WARN: Type inference failed for: r306v6 */
    /* JADX WARN: Type inference failed for: r306v8 */
    /* JADX WARN: Type inference failed for: r306v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void A00() {
        /*
            Method dump skipped, instructions count: 400
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.messaging.sharing.broadcastflow.mutation.loader.plugins.sections.igconnections.BroadcastFlowInstagramConnectionsLoader.A00():void");
    }
}
