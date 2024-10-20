package com.facebook.messaging.montage.model.art;

import X.1BL;
import X.2JX;
import X.2JY;
import X.CST;
import X.J4h;
import android.os.Parcelable;
import java.util.Comparator;

/* loaded from: ArtAsset.class */
public abstract class ArtAsset implements Parcelable {
    public static final Comparator A00 = new J4h(5);
    public static final Parcelable.Creator CREATOR = CST.A00(1);

    public ArtAssetDimensions A00() {
        LazyArtAsset lazyArtAsset = (LazyArtAsset) this;
        if (!lazyArtAsset.A04) {
            return lazyArtAsset.A01;
        }
        Object obj = lazyArtAsset.A03;
        if (lazyArtAsset instanceof TextAsset) {
            2JY r0 = (2JY) obj;
            return ArtAssetDimensions.A00(1BL.A0L(r0, 1730945797, -215960785), 1BL.A0L(r0, -655902163, 620638590), 1BL.A0L(r0, -607069047, 579769526));
        }
        2JX r02 = (2JX) obj;
        return ArtAssetDimensions.A00(1BL.A0L(r02, 1730945797, -215960785), 1BL.A0L(r02, -655902163, 620638590), 1BL.A0L(r02, -607069047, 579769526));
    }

    public ArtAssetDimensions A01() {
        LazyArtAsset lazyArtAsset = (LazyArtAsset) this;
        if (!lazyArtAsset.A04) {
            return lazyArtAsset.A02;
        }
        Object obj = lazyArtAsset.A03;
        if (lazyArtAsset instanceof TextAsset) {
            2JY r0 = (2JY) obj;
            return ArtAssetDimensions.A00(1BL.A0L(r0, -1894455771, -215960785), 1BL.A0L(r0, -1971720883, 620638590), 1BL.A0L(r0, 1552223593, 579769526));
        }
        2JX r02 = (2JX) obj;
        return ArtAssetDimensions.A00(1BL.A0L(r02, -1894455771, -215960785), 1BL.A0L(r02, -1971720883, 620638590), 1BL.A0L(r02, 1552223593, 579769526));
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return ((LazyArtAsset) this).A00.ordinal();
    }
}
