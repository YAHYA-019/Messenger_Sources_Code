package com.facebook.messaging.highlightstab.qp;

import X.1BL;
import X.4YU;
import android.content.Intent;
import android.net.Uri;

/* loaded from: HighlightsTabOpenIntentHandler.class */
public final class HighlightsTabOpenIntentHandler {
    public static final Intent A00;

    static {
        boolean AZk = 1BL.A0Q().AZk(2342168768863425498L);
        Uri.Builder scheme = new Uri.Builder().scheme("fb-messenger-secure");
        if (AZk) {
            scheme = scheme.authority("highlights_tab");
        }
        A00 = 4YU.A09(scheme.path("highlights_tab").build());
    }
}
