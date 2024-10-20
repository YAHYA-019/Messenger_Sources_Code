package X;

import android.net.Uri;
import com.facebook.xapp.messaging.gallery.model.GalleryMediaItem;
import com.google.common.collect.ImmutableList;

/* loaded from: A69.class */
public final class A69 implements AZk {
    public final /* synthetic */ int A00;
    public final /* synthetic */ 1Iw A01;
    public final /* synthetic */ 79H A02;
    public final /* synthetic */ 9Xf A03;
    public final /* synthetic */ GalleryMediaItem A04;
    public final /* synthetic */ 6wJ A05;
    public final /* synthetic */ boolean A06;
    public final /* synthetic */ boolean A07;

    public A69(1Iw r302, 79H r303, 9Xf r304, GalleryMediaItem galleryMediaItem, 6wJ r306, int i, boolean z, boolean z2) {
        this.A05 = r306;
        this.A04 = galleryMediaItem;
        this.A01 = r302;
        this.A00 = i;
        this.A06 = z;
        this.A02 = r303;
        this.A03 = r304;
        this.A07 = z2;
    }

    @Override // X.AZk
    public void Bvl() {
        Uri uri;
        6wN r0;
        6wP r02;
        ImmutableList immutableList;
        Object obj;
        GalleryMediaItem galleryMediaItem;
        6wJ r03 = this.A05;
        GalleryMediaItem galleryMediaItem2 = this.A04;
        synchronized (r03) {
            uri = galleryMediaItem2.A06;
            11T.A0A(uri);
            r0 = r03.A03;
            if (r0.remove(uri) == null) {
                r0.put(uri, galleryMediaItem2);
                6wJ.A01(galleryMediaItem2, r03, true);
            } else {
                6wJ.A01(galleryMediaItem2, r03, false);
            }
            6wJ.A02(r03);
            r02 = r03.A00;
            immutableList = r03.A02;
            11T.A09(immutableList);
        }
        if (r02 != null) {
            r02.COn(immutableList);
        }
        GalleryMediaItem galleryMediaItem3 = (GalleryMediaItem) r0.get(uri);
        if (galleryMediaItem3 == null) {
            9hV r04 = new 9hV(galleryMediaItem2);
            r04.A0B = false;
            r04.A01 = -1;
            galleryMediaItem3 = new GalleryMediaItem(r04);
        }
        11T.A0D(galleryMediaItem3);
        synchronized (r03) {
            obj = r0.latestEvicted;
        }
        GalleryMediaItem galleryMediaItem4 = (GalleryMediaItem) obj;
        if (galleryMediaItem4 != null) {
            9hV r05 = new 9hV(galleryMediaItem4);
            r05.A0B = false;
            r05.A01 = -1;
            galleryMediaItem = new GalleryMediaItem(r05);
        } else {
            galleryMediaItem = null;
        }
        1Im A00 = 8oS.A00(this.A01);
        if (A00 != null) {
            int i = this.A00;
            boolean z = this.A06;
            if (galleryMediaItem3.A0B) {
                7zR.A1E(A00, 7Co.A00);
            }
            7zR.A1E(A00, new 7Cl(galleryMediaItem3, r03.A03(), i, z));
            if (galleryMediaItem != null) {
                7zR.A1E(A00, new 7Cl(galleryMediaItem, r03.A03(), -1, z));
            }
        }
    }

    @Override // X.AZk
    public void CVm(GalleryMediaItem galleryMediaItem) {
        1Iw r0 = this.A01;
        6wJ r02 = this.A05;
        9Xf r03 = this.A03;
        boolean z = this.A06;
        boolean z2 = this.A07;
        1Im A00 = 8oS.A00(r0);
        if (A00 != null) {
            C1pq.A08("galleryMediaItem", galleryMediaItem);
            7zR.A1E(A00, new 7Cm(galleryMediaItem, z, z2));
        }
        r03.A00();
        r02.A04();
    }
}
