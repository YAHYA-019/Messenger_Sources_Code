package X;

import android.net.Uri;
import android.os.Environment;
import android.provider.MediaStore;

/* loaded from: Hws.class */
public final class Hws {
    public static final Uri A00 = MediaStore.Images.Media.EXTERNAL_CONTENT_URI;
    public static final Uri A01 = MediaStore.Images.Thumbnails.EXTERNAL_CONTENT_URI;
    public static final Uri A02 = Uri.parse("content://media/external/video/media");

    static {
        synchronized (0LL.class) {
        }
        Environment.getExternalStorageDirectory().toString();
    }
}
