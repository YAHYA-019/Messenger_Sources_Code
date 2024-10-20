package com.facebook.messaging.search.nux.qp;

import X.11T;
import X.C3o5;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import java.util.List;

/* loaded from: SearchQPIntentHandler.class */
public final class SearchQPIntentHandler {
    public static Intent A00(Context context, Intent intent) {
        Uri data = intent.getData();
        Intent intent2 = null;
        if (data != null) {
            List<String> pathSegments = data.getPathSegments();
            if (pathSegments.size() == 1 && 11T.A0O(pathSegments.get(0), "searchlearnmore")) {
                intent2 = C3o5.A0D(context, SearchQPLearnMoreActivity.class);
            }
        }
        return intent2;
    }
}
