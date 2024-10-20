package X;

import android.content.Context;
import android.os.Bundle;
import com.facebook.acra.constants.ActionId;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.graphql.query.GraphQlQueryParamSet;
import com.facebook.messaging.sync.delta.PrefetchedSyncData;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.RegularImmutableSet;

/* loaded from: Grj.class */
public final class Grj extends D0d {
    public 1BY A00;
    public final FbUserSession A01;
    public volatile 3Je A02 = null;
    public volatile boolean A03 = false;

    public Grj(1BO r302, FbUserSession fbUserSession) {
        this.A00 = 7zL.A0Q(r302);
        this.A01 = fbUserSession;
        GraphQlQueryParamSet A0M = 7zL.A0M();
        A0M.A05("pageID", ((1G1) fbUserSession).A02);
        ((DKN) 1Bn.A0E((Context) null, this.A00, 68643)).A01().A0B(7zM.A0L(A0M, new 2Jf(2JX.class, (Class) null, "HighMessagesPerSecondStatusQuery", (String) null, "fbandroid", 2048520134, 0, 568240717L, 568240717L, false, true)), Ini.A01(this, 45));
    }

    @Override // X.D0d
    public Bundle A0H(PrefetchedSyncData prefetchedSyncData, C7a c7a) {
        return 1BK.A05();
    }

    @Override // X.D0d
    public /* bridge */ /* synthetic */ ImmutableSet A0K(Object obj) {
        return RegularImmutableSet.A05;
    }

    @Override // X.D0d
    public /* bridge */ /* synthetic */ ImmutableSet A0L(Object obj) {
        return RegularImmutableSet.A05;
    }

    @Override // X.DHp
    public void BLv(Bundle bundle, C7a c7a) {
        this.A03 = AnonymousClass001.A1W(((RxW) BI7.A00((BI7) c7a.A02, ActionId.RTMP_CONNECTION_CONNECTED)).pageHMPSState, QvL.A02);
        if (this.A02 != null) {
            3Je r0 = this.A02;
            r0.A00.A03(this.A03, true);
        }
    }
}
