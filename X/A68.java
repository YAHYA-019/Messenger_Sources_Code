package X;

import android.content.Context;
import com.facebook.xapp.messaging.gallery.model.GalleryMediaItem;
import java.util.List;

/* loaded from: A68.class */
public final class A68 implements AZk {
    public final int A00;
    public final Context A01;
    public final AZk A02;
    public final GalleryMediaItem A03;
    public final /* synthetic */ AnonymousClass798 A04;

    public A68(Context context, AnonymousClass798 anonymousClass798, AZk aZk, GalleryMediaItem galleryMediaItem, int i) {
        this.A04 = anonymousClass798;
        this.A00 = i;
        this.A03 = galleryMediaItem;
        this.A01 = context;
        this.A02 = aZk;
    }

    @Override // X.AZk
    public void Bvl() {
        int i = this.A00;
        AnonymousClass798 anonymousClass798 = this.A04;
        List list = anonymousClass798.A00;
        if (i == AnonymousClass001.A04(list)) {
            this.A02.Bvl();
            return;
        }
        int i2 = i + 1;
        GalleryMediaItem galleryMediaItem = this.A03;
        Context context = this.A01;
        AZk aZk = this.A02;
        if (i2 >= list.size() || i2 < 0) {
            return;
        }
        ((AnonymousClass794) list.get(i2)).AEu(context, new A68(context, anonymousClass798, aZk, galleryMediaItem, i2), galleryMediaItem);
    }

    @Override // X.AZk
    public void CVm(GalleryMediaItem galleryMediaItem) {
        this.A02.CVm(galleryMediaItem);
    }
}
