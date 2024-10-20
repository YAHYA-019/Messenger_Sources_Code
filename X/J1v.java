package X;

import android.content.Context;
import com.facebook.ui.media.attachments.model.MediaResource;
import com.facebook.xapp.messaging.gallery.model.GalleryMediaItem;

/* loaded from: J1v.class */
public final class J1v implements Runnable {
    public static final String __redex_internal_original_name = "VideoSizeGalleryItemSelectionEligibilityDecider$checkItemEligibility$1";
    public final /* synthetic */ Context A00;
    public final /* synthetic */ AnonymousClass796 A01;
    public final /* synthetic */ AZk A02;
    public final /* synthetic */ GalleryMediaItem A03;

    public J1v(Context context, AnonymousClass796 anonymousClass796, AZk aZk, GalleryMediaItem galleryMediaItem) {
        this.A03 = galleryMediaItem;
        this.A01 = anonymousClass796;
        this.A00 = context;
        this.A02 = aZk;
    }

    @Override // java.lang.Runnable
    public final void run() {
        GalleryMediaItem galleryMediaItem = this.A03;
        MediaResource A00 = C7m4.A00(galleryMediaItem, false);
        AnonymousClass796 anonymousClass796 = this.A01;
        ((Hsg) anonymousClass796.A01.getValue()).A01(new IVb(this.A00, anonymousClass796, this.A02, galleryMediaItem), A00);
    }
}
