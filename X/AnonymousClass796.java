package X;

import android.content.Context;
import com.facebook.xapp.messaging.gallery.model.GalleryMediaItem;
import java.util.concurrent.Executor;

/* renamed from: X.796, reason: invalid class name */
/* loaded from: 796.class */
public final class AnonymousClass796 implements AnonymousClass794 {
    public final C01i A01 = C01g.A00(C03i.A02, AnonymousClass797.A00);
    public final 1Br A00 = 1Bq.A00(16467);

    @Override // X.AnonymousClass794
    public void AEu(Context context, AZk aZk, GalleryMediaItem galleryMediaItem) {
        String str = galleryMediaItem.A09;
        if (str == null || !str.startsWith("video/")) {
            aZk.Bvl();
        } else {
            ((Executor) this.A00.A00.get()).execute(new J1v(context, this, aZk, galleryMediaItem));
        }
    }
}
