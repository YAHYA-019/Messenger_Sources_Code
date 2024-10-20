package com.facebook.messaging.photos.editing;

import X.0fH;
import X.Hav;
import X.Hg3;
import android.net.Uri;
import com.facebook.messaging.photos.editing.layer.Layer;
import com.google.common.collect.ImmutableList;

/* loaded from: MontageStickerLayer.class */
public final class MontageStickerLayer extends Layer {
    public int A00 = 0;
    public final Hav A01;

    public MontageStickerLayer(Hav hav) {
        this.A01 = hav;
    }

    @Override // com.facebook.messaging.photos.editing.layer.Layer
    public boolean A09() {
        ImmutableList immutableList = this.A01.A01;
        return immutableList != null && immutableList.size() > 1;
    }

    public Uri A0A() {
        Uri uri;
        Hav hav = this.A01;
        ImmutableList immutableList = hav.A01;
        if (immutableList == null || immutableList.size() == 0) {
            0fH.A0j("MontageStickerLayer", "getMontageStickerUri: getStickerStyles is null or Empty, using thumbnailUri");
            uri = hav.A00;
            if (uri == null) {
                0fH.A0k("MontageStickerLayer", "getMontageStickerUri: thumbnailUri is null");
                return null;
            }
        } else {
            uri = ((Hg3) immutableList.get(this.A00)).A02;
        }
        return uri;
    }
}
