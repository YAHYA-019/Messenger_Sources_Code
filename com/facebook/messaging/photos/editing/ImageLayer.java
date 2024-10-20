package com.facebook.messaging.photos.editing;

import X.C0A2;
import X.Hiu;
import android.net.Uri;
import com.facebook.messaging.montage.model.art.ArtItem;
import com.facebook.messaging.photos.editing.layer.Layer;

/* loaded from: ImageLayer.class */
public final class ImageLayer extends Layer {
    public final Uri A00;
    public final boolean A01;
    public final boolean A02;
    public final boolean A03;

    public ImageLayer(ArtItem artItem, Hiu hiu, Hiu hiu2, String str, String str2, float f, float f2, boolean z, boolean z2, boolean z3) {
        super(artItem, hiu, hiu2, str2, f, f2);
        str.getClass();
        Uri uri = null;
        try {
            uri = C0A2.A03(str);
        } catch (SecurityException unused) {
        }
        uri.getClass();
        this.A00 = uri;
        this.A02 = z;
        this.A01 = z2;
        this.A03 = z3;
    }

    @Override // com.facebook.messaging.photos.editing.layer.Layer
    public boolean A07() {
        return false;
    }
}
