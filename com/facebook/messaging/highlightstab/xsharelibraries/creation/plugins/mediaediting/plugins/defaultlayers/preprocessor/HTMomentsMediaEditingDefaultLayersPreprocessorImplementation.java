package com.facebook.messaging.highlightstab.xsharelibraries.creation.plugins.mediaediting.plugins.defaultlayers.preprocessor;

import X.1BL;
import X.C5wh;
import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import java.util.List;

/* loaded from: HTMomentsMediaEditingDefaultLayersPreprocessorImplementation.class */
public final class HTMomentsMediaEditingDefaultLayersPreprocessorImplementation {
    public final Context A00;
    public final FbUserSession A01;
    public final C5wh A02;
    public final List A03;

    public HTMomentsMediaEditingDefaultLayersPreprocessorImplementation(Context context, FbUserSession fbUserSession, C5wh c5wh, List list) {
        1BL.A1H(context, fbUserSession, list);
        this.A00 = context;
        this.A01 = fbUserSession;
        this.A03 = list;
        this.A02 = c5wh;
    }
}
