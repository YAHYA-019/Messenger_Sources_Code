package X;

import com.facebook.ui.media.attachments.model.MediaResource;
import com.facebook.xapp.messaging.gallery.model.GalleryMediaItem;

/* renamed from: X.7m4, reason: invalid class name */
/* loaded from: 7m4.class */
public abstract class C7m4 {
    public static final MediaResource A00(GalleryMediaItem galleryMediaItem, boolean z) {
        5HP r307;
        11T.A0F(galleryMediaItem, 0);
        String str = galleryMediaItem.A09;
        11T.A0A(str);
        if (0CU.A0T(str, "gif", false)) {
            r307 = 5HP.A02;
        } else {
            11T.A0F("image/", 1);
            r307 = str.startsWith("image/") ? 5HP.A0F : 5HP.A0H;
        }
        C5en A00 = C5en.A00();
        A00.A05 = galleryMediaItem.A03;
        A00.A07 = galleryMediaItem.A05;
        A00.A00 = galleryMediaItem.A00;
        A00.A08 = galleryMediaItem.A04;
        A00.A0q = str;
        A00.A0P = r307;
        A00.A0E = galleryMediaItem.A06;
        A00.A16 = true;
        A00.A0O = z ? C5ew.HD : C5ew.DEFAULT;
        A00.A04 = galleryMediaItem.A02;
        return 4YU.A0Y(A00);
    }
}
