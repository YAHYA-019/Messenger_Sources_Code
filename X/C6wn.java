package X;

import com.facebook.xapp.messaging.gallery.model.GalleryMediaItem;
import kotlin.jvm.functions.Function1;

/* renamed from: X.6wn, reason: invalid class name */
/* loaded from: 6wn.class */
public final class C6wn extends C00q implements Function1 {
    public static final C6wn A00 = new C6wn();

    public C6wn() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        11T.A0F((GalleryMediaItem) obj, 0);
        return Boolean.valueOf(!C6wm.A00.matcher(r0.A09).matches());
    }
}
