package X;

import android.content.ClipData;
import android.content.ClipDescription;
import android.content.Intent;
import android.net.Uri;

/* renamed from: X.106, reason: invalid class name */
/* loaded from: 106.class */
public abstract class AnonymousClass106 {
    public static void A00(Intent intent, String str, Uri... uriArr) {
        if (uriArr == null) {
            return;
        }
        ClipData clipData = new ClipData(new ClipDescription(str, new String[]{"text/uri-list"}), new ClipData.Item(uriArr[0]));
        for (int i = 1; i < uriArr.length; i++) {
            clipData.addItem(new ClipData.Item(uriArr[i]));
        }
        intent.setClipData(clipData);
    }

    public static void A01(Intent intent, Uri[] uriArr, boolean z) {
        String action = intent.getAction();
        String str = ("android.media.action.IMAGE_CAPTURE".equals(action) || "android.media.action.VIDEO_CAPTURE".equals(action)) ? "output" : "android.intent.extra.STREAM";
        Uri uri = uriArr[0];
        if (uri != null && "file".equals(uri.getScheme())) {
            throw AnonymousClass001.A0V("Attempted to bypass content providers with file:// URI");
        }
        intent.addFlags(1);
        if (z) {
            intent.addFlags(2);
        }
        A00(intent, str, uriArr);
        intent.putExtra(str, uriArr[0]);
    }
}
