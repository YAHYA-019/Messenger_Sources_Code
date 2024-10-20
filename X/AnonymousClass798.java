package X;

import android.content.Context;
import com.facebook.xapp.messaging.gallery.model.GalleryMediaItem;
import java.util.List;

/* renamed from: X.798, reason: invalid class name */
/* loaded from: 798.class */
public final class AnonymousClass798 implements AnonymousClass794 {
    public final List A00;

    public AnonymousClass798(List list) {
        this.A00 = list;
    }

    @Override // X.AnonymousClass794
    public void AEu(Context context, AZk aZk, GalleryMediaItem galleryMediaItem) {
        List list = this.A00;
        if (0 < list.size()) {
            ((AnonymousClass794) list.get(0)).AEu(context, new A68(context, this, aZk, galleryMediaItem, 0), galleryMediaItem);
        }
    }
}
