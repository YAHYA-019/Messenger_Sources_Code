package com.facebook.messaging.montage.model.art;

import X.0Pz;
import X.1BL;
import X.2JY;
import X.AbF;
import X.C53v;
import X.H9J;
import X.H9a;
import android.graphics.Color;
import android.os.Parcel;
import com.facebook.graphservice.tree.TreeJNI;

/* loaded from: LazyArtAsset.class */
public abstract class LazyArtAsset extends ArtAsset {
    public final H9a A00;
    public final ArtAssetDimensions A01;
    public final ArtAssetDimensions A02;
    public final Object A03;
    public final boolean A04;
    public final float A05;
    public final float A06;
    public final String A07;

    public LazyArtAsset(H9a h9a, Object obj) {
        this.A04 = true;
        this.A00 = h9a;
        this.A03 = obj;
        this.A05 = 1.0f;
        this.A06 = 0.0f;
        this.A01 = null;
        this.A02 = null;
        this.A07 = null;
    }

    public LazyArtAsset(Parcel parcel, H9a h9a) {
        this.A04 = false;
        this.A00 = h9a;
        this.A03 = null;
        this.A05 = parcel.readFloat();
        this.A06 = parcel.readFloat();
        this.A01 = (ArtAssetDimensions) 1BL.A0C(parcel, ArtAssetDimensions.class);
        this.A02 = (ArtAssetDimensions) 1BL.A0C(parcel, ArtAssetDimensions.class);
        this.A07 = parcel.readString();
    }

    public float A02() {
        return this.A04 ? (float) ((TreeJNI) this.A03).getDoubleValue(-1267206133) : this.A05;
    }

    public float A03() {
        return this.A04 ? ((float) ((TreeJNI) this.A03).getDoubleValue(-40300674)) * 180.0f : this.A06;
    }

    public String A04() {
        return this.A04 ? ((2JY) this.A03).A0r(506361563) : this.A07;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str;
        C53v.A0J(parcel, this.A00);
        parcel.writeFloat(A02());
        parcel.writeFloat(A03());
        parcel.writeParcelable(A00(), i);
        parcel.writeParcelable(A01(), i);
        parcel.writeString(A04());
        if (this instanceof TextAsset) {
            TextAsset textAsset = (TextAsset) this;
            boolean z = ((LazyArtAsset) textAsset).A04;
            parcel.writeInt(z ? Color.parseColor(0Pz.A0W("#", ((2JY) ((LazyArtAsset) textAsset).A03).A0r(94842723))) : textAsset.A00);
            C53v.A0J(parcel, z ? "dominant_color_of_sticker".equalsIgnoreCase(((2JY) ((LazyArtAsset) textAsset).A03).A0r(2051717984)) ? H9J.A02 : H9J.A01 : textAsset.A01);
            parcel.writeParcelable(textAsset.A05(), i);
            parcel.writeString(z ? ((2JY) ((LazyArtAsset) textAsset).A03).A0r(951530617) : textAsset.A02);
            C53v.A0J(parcel, textAsset.A06());
            return;
        }
        if (this instanceof StickerAsset) {
            parcel.writeParcelable(((StickerAsset) this).A00, i);
            return;
        }
        ImageAsset imageAsset = (ImageAsset) this;
        if (imageAsset.A04) {
            2JY A0I = AbF.A0I((2JY) imageAsset.A03, -102393834);
            str = A0I == null ? null : A0I.A0l();
        } else {
            str = imageAsset.A00;
        }
        parcel.writeString(str);
    }
}
