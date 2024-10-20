package X;

import com.facebook.xapp.messaging.gallery.model.GalleryMediaItem;
import java.util.Iterator;
import kotlin.jvm.functions.Function1;

/* renamed from: X.6wl, reason: invalid class name */
/* loaded from: 6wl.class */
public class C6wl {
    public final Iterable A00;

    public C6wl(Function1... function1Arr) {
        11T.A0F(function1Arr, 1);
        this.A00 = 02L.A09(function1Arr);
    }

    public final boolean A00(GalleryMediaItem galleryMediaItem) {
        11T.A0F(galleryMediaItem, 0);
        Iterator it = this.A00.iterator();
        while (it.hasNext()) {
            if (!((Boolean) ((Function1) it.next()).invoke(galleryMediaItem)).booleanValue()) {
                return false;
            }
        }
        return true;
    }
}
