package X;

import com.facebook.xapp.messaging.threadview.model.photo.Photo;

/* renamed from: X.778, reason: invalid class name */
/* loaded from: 778.class */
public final class AnonymousClass778 implements 6zD {
    public boolean BUV(5vW r302, int i) {
        11T.A0F(r302, 0);
        Photo photo = (Photo) 0QD.A0E(((C5ft) ((5vV) r302).A00).A01);
        boolean z = false;
        if (photo == null) {
            return false;
        }
        if (photo.A0H && 11T.A0O(photo.A0D, "video/mp4")) {
            z = true;
        }
        return z;
    }
}
