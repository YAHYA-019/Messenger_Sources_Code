package X;

import com.facebook.ui.media.attachments.model.MediaResource;
import com.google.common.base.Platform;

/* loaded from: C0y.class */
public final class C0y {
    public final 5Hj A00 = (5Hj) 1Bi.A03(49651);

    public boolean A00(MediaResource mediaResource) {
        if (mediaResource.A0B == null || mediaResource.A0Q != 5HP.A0F) {
            return false;
        }
        return mediaResource.A12 || !Platform.stringIsNullOrEmpty(5Hj.A00(this.A00, 81I.A01(mediaResource)));
    }
}
