package com.facebook.messaging.followup.plugins.metadataloader.followup;

import X.1BK;
import X.1BL;
import X.1Bq;
import X.1Br;
import X.1Lm;
import X.2V3;
import X.36V;
import X.AnonymousClass207;
import X.C3d6;
import android.content.Context;
import android.os.Parcelable;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.xapp.messaging.map.HeterogeneousMap;
import java.util.Map;

/* loaded from: InboxFollowupsMetadataLoader.class */
public final class InboxFollowupsMetadataLoader {
    public static final AnonymousClass207 A07;
    public final 1Br A00;
    public final 1Br A01;
    public final 2V3 A02;
    public final C3d6 A03;
    public final Map A04;
    public final Context A05;
    public final FbUserSession A06;

    static {
        Parcelable.Creator creator = HeterogeneousMap.CREATOR;
        A07 = new AnonymousClass207(36V.class, "InboxFollowupsMetadataLoader");
    }

    public InboxFollowupsMetadataLoader(Context context, FbUserSession fbUserSession, 2V3 r304) {
        1BL.A1H(r304, fbUserSession, context);
        this.A02 = r304;
        this.A06 = fbUserSession;
        this.A05 = context;
        this.A01 = 1Lm.A00(context, fbUserSession, 33229);
        this.A00 = 1Bq.A00(67155);
        this.A04 = 1BK.A1C();
        this.A03 = new C3d6(this, 1);
    }
}
