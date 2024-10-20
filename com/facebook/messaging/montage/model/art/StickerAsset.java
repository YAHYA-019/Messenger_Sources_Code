package com.facebook.messaging.montage.model.art;

import X.1BL;
import X.2JX;
import X.H9a;
import android.os.Parcel;
import com.facebook.stickers.model.Sticker;

/* loaded from: StickerAsset.class */
public final class StickerAsset extends LazyArtAsset {
    public final Sticker A00;

    public StickerAsset(2JX r302, Sticker sticker) {
        super(H9a.STICKER, r302);
        this.A00 = sticker;
    }

    public StickerAsset(Parcel parcel) {
        super(parcel, H9a.STICKER);
        this.A00 = (Sticker) 1BL.A0C(parcel, Sticker.class);
    }
}
