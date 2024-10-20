package X;

import android.net.Uri;
import com.facebook.messaging.attachments.ImageAttachmentUris;

/* renamed from: X.7kf, reason: invalid class name */
/* loaded from: 7kf.class */
public abstract class C7kf {
    public static Uri A00(ImageAttachmentUris imageAttachmentUris, int i) {
        if (imageAttachmentUris == null) {
            return null;
        }
        return i == 1 ? imageAttachmentUris.A01 : (i == 2 || i == 4) ? imageAttachmentUris.A03 : imageAttachmentUris.A04;
    }
}
