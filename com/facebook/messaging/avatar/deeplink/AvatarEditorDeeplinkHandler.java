package com.facebook.messaging.avatar.deeplink;

import X.1Bn;
import X.EqJ;
import X.ExJ;
import X.FHv;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;

/* loaded from: AvatarEditorDeeplinkHandler.class */
public final class AvatarEditorDeeplinkHandler {
    public static Intent A00(Context context, Intent intent) {
        Uri data = intent.getData();
        String str = null;
        String queryParameter = data != null ? data.getQueryParameter("surface") : null;
        Uri data2 = intent.getData();
        if (data2 != null) {
            str = data2.getQueryParameter("deeplink");
        }
        FHv fHv = (FHv) 1Bn.A0A(99843);
        EqJ eqJ = new EqJ();
        eqJ.A04 = "external_deeplink";
        if (queryParameter == null) {
            queryParameter = "unknown";
        }
        eqJ.A07 = queryParameter;
        eqJ.A03 = "editor";
        eqJ.A02 = str;
        return fHv.A04(context, new ExJ(eqJ));
    }
}
