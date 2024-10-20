package com.facebook.messaging.montage.model.cards;

import X.4YV;
import X.CST;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: MontageStickerAnimationAsset.class */
public class MontageStickerAnimationAsset implements Parcelable {
    public static final Parcelable.Creator CREATOR = CST.A00(20);
    public final MontageStickerOverlayBounds A00;
    public final String A01;
    public final String A02;
    public final String A03;

    /* loaded from: MontageStickerAnimationAsset$StickerAnimationAssetBuilder.class */
    public class StickerAnimationAssetBuilder {
        public MontageStickerOverlayBounds A00;
        public String A01;
        public String A02;
        public String A03;

        public StickerAnimationAssetBuilder setAssetId(String str) {
            this.A01 = str;
            return this;
        }

        public StickerAnimationAssetBuilder setKeyframeUri(String str) {
            this.A02 = str;
            return this;
        }

        public StickerAnimationAssetBuilder setStickerBounds(MontageStickerOverlayBounds montageStickerOverlayBounds) {
            this.A00 = montageStickerOverlayBounds;
            return this;
        }

        public StickerAnimationAssetBuilder setType(String str) {
            this.A03 = str;
            return this;
        }
    }

    public MontageStickerAnimationAsset(Parcel parcel) {
        this.A03 = parcel.readString();
        this.A01 = parcel.readString();
        this.A02 = parcel.readString();
        this.A00 = (MontageStickerOverlayBounds) 4YV.A0l(parcel, MontageStickerOverlayBounds.class);
    }

    public MontageStickerAnimationAsset(MontageStickerOverlayBounds montageStickerOverlayBounds, String str, String str2, String str3) {
        this.A03 = str;
        this.A01 = str2;
        this.A02 = str3;
        this.A00 = montageStickerOverlayBounds;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String getAssetId() {
        return this.A01;
    }

    public String getKeyframeUri() {
        return this.A02;
    }

    public MontageStickerOverlayBounds getStickerBounds() {
        return this.A00;
    }

    public String getType() {
        return this.A03;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A03);
        parcel.writeString(this.A01);
        parcel.writeString(this.A02);
        parcel.writeValue(this.A00);
    }
}
