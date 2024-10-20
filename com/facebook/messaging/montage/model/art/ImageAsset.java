package com.facebook.messaging.montage.model.art;

import X.2JX;
import X.H9a;
import android.os.Parcel;

/* loaded from: ImageAsset.class */
public final class ImageAsset extends LazyArtAsset {
    public final String A00;

    public ImageAsset(2JX r302) {
        super(H9a.IMAGE, r302);
        this.A00 = null;
    }

    public ImageAsset(Parcel parcel) {
        super(parcel, H9a.IMAGE);
        this.A00 = parcel.readString();
    }
}
