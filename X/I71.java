package X;

import android.util.SparseArray;
import android.webkit.MimeTypeMap;
import com.facebook.acra.constants.ActionId;
import com.google.common.base.Platform;
import com.google.common.base.Preconditions;

/* loaded from: I71.class */
public final class I71 {
    public final Hrl A00 = (Hrl) 1Bi.A03(116158);

    public static String A00(I71 i71, String str, String str2) {
        String replaceAll;
        Preconditions.checkArgument(AnonymousClass001.A1N(str2.endsWith("/") ? 1 : 0));
        String fileExtensionFromUrl = MimeTypeMap.getFileExtensionFromUrl(str);
        if (Platform.stringIsNullOrEmpty(fileExtensionFromUrl)) {
            return null;
        }
        String A01 = i71.A00.A01(fileExtensionFromUrl);
        if (A01 == null) {
            return null;
        }
        if (!A01.startsWith(str2) && (replaceAll = A01.replaceAll("^.*/", str2)) != null && GPO.A00.contains(replaceAll)) {
            A01 = replaceAll;
        }
        if (GPO.A00.contains(A01)) {
            return A01;
        }
        return null;
    }

    public static void A01(I4f i4f, String str) {
        byte[] bytes = str.getBytes();
        if (bytes == null) {
            throw AnonymousClass001.A0Q("null content-id");
        }
        SparseArray sparseArray = i4f.A01;
        sparseArray.put(ActionId.POPULATE_CONSISTENCY_MEMORY_CACHE, bytes);
        sparseArray.put(ActionId.PREV_ACTIVITY_PAUSE, bytes);
        i4f.A01(bytes);
    }
}
