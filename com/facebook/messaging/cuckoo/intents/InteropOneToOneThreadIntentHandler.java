package com.facebook.messaging.cuckoo.intents;

import X.11T;
import X.1BK;
import android.content.Intent;
import android.net.Uri;
import com.facebook.messaging.model.threadkey.ThreadKey;
import java.util.List;

/* loaded from: InteropOneToOneThreadIntentHandler.class */
public final class InteropOneToOneThreadIntentHandler {
    public static final ThreadKey A00(Intent intent) {
        Uri data = intent.getData();
        if (data == null) {
            throw 1BK.A0h();
        }
        List<String> pathSegments = data.getPathSegments();
        if (pathSegments.size() != 1) {
            return null;
        }
        Object A0r = 1BK.A0r(pathSegments);
        11T.A0A(A0r);
        return ThreadKey.A09(Long.parseLong((String) A0r));
    }
}
