package X;

import android.graphics.Bitmap;
import android.net.Uri;
import com.facebook.xapp.messaging.gallery.model.GalleryMediaItem;

/* loaded from: A53.class */
public final class A53 implements JJQ {
    public final /* synthetic */ GalleryMediaItem A00;
    public final /* synthetic */ java.util.Map A01;

    public A53(GalleryMediaItem galleryMediaItem, java.util.Map map) {
        this.A01 = map;
        this.A00 = galleryMediaItem;
    }

    public void BM3(Throwable th) {
    }

    public void BMj(Bitmap bitmap, 2EU r303, String str) {
        Uri fromFile = Uri.fromFile(C9kq.A00.A01(bitmap, "", str, "GalleryPreFetchPlugin"));
        if (fromFile != null) {
            this.A01.put(11T.A02(this.A00.A06), fromFile);
        }
    }
}
