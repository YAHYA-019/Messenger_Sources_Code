package com.facebook.messaging.highlightstab.xsharelibraries.creation.loader.plugins.prefetcher.htmomentcardmetadataprefetcher;

import X.1BL;
import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import java.util.List;

/* loaded from: HTMomentCardMetadataPrefetcherImplementation.class */
public final class HTMomentCardMetadataPrefetcherImplementation {
    public final Context A00;
    public final FbUserSession A01;
    public final List A02;

    public HTMomentCardMetadataPrefetcherImplementation(Context context, FbUserSession fbUserSession, List list) {
        1BL.A1H(context, list, fbUserSession);
        this.A00 = context;
        this.A02 = list;
        this.A01 = fbUserSession;
    }
}
