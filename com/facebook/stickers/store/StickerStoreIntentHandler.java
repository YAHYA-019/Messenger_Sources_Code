package com.facebook.stickers.store;

import X.1BK;
import X.C3o5;
import X.C6xd;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import java.util.List;

/* loaded from: StickerStoreIntentHandler.class */
public final class StickerStoreIntentHandler {
    public static Intent A00(Context context, Intent intent) {
        Intent A0D = C3o5.A0D(context, StickerStoreActivity.class);
        Uri data = intent.getData();
        data.getClass();
        List<String> pathSegments = data.getPathSegments();
        if (!pathSegments.isEmpty()) {
            A0D.putExtra("stickerId", (String) 1BK.A0r(pathSegments));
            if (pathSegments.size() > 1 && "auto".equals(pathSegments.get(1))) {
                A0D.putExtra("startDownload", true);
            }
        }
        A0D.putExtra("stickerContext", C6xd.A06);
        return A0D;
    }
}
