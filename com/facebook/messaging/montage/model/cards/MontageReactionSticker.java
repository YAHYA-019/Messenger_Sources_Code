package com.facebook.messaging.montage.model.cards;

import X.4YV;
import X.AnonymousClass001;
import X.C53v;
import X.CST;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import java.util.Collection;
import java.util.List;

/* loaded from: MontageReactionSticker.class */
public class MontageReactionSticker implements Parcelable {
    public static final Parcelable.Creator CREATOR = CST.A00(16);
    public final MontageStickerOverlayBounds A00;
    public final ImmutableList A01;
    public final ImmutableSet A02;
    public final String A03;
    public final String A04;
    public final String A05;

    /* loaded from: MontageReactionSticker$MontageReactionStickerBuilder.class */
    public class MontageReactionStickerBuilder {
        public MontageStickerOverlayBounds A00;
        public String A01;
        public String A02;
        public String A03;
        public List A04 = AnonymousClass001.A0s();

        public MontageReactionSticker A00() {
            String str = this.A01;
            String str2 = this.A03;
            return new MontageReactionSticker(this.A00, ImmutableList.copyOf((Collection) this.A04), null, str, str2, this.A02);
        }

        public MontageReactionStickerBuilder setId(String str) {
            this.A01 = str;
            return this;
        }

        public MontageReactionStickerBuilder setImageAssetUrl(String str) {
            this.A02 = str;
            return this;
        }

        public MontageReactionStickerBuilder setStickerAnimationAssetList(List list) {
            this.A04 = list;
            return this;
        }

        public MontageReactionStickerBuilder setStickerAssetId(String str) {
            this.A03 = str;
            return this;
        }

        public MontageReactionStickerBuilder setStickerBounds(MontageStickerOverlayBounds montageStickerOverlayBounds) {
            this.A00 = montageStickerOverlayBounds;
            return this;
        }
    }

    public MontageReactionSticker(Parcel parcel) {
        ImmutableList A01;
        this.A03 = parcel.readString();
        this.A05 = parcel.readString();
        this.A01 = C53v.A02(parcel, MontageStickerAnimationAsset.CREATOR);
        this.A04 = parcel.readString();
        this.A00 = (MontageStickerOverlayBounds) 4YV.A0l(parcel, MontageStickerOverlayBounds.class);
        this.A02 = (parcel.readInt() == 0 || (A01 = C53v.A01(parcel)) == null) ? null : ImmutableSet.A07(A01);
    }

    public MontageReactionSticker(MontageStickerOverlayBounds montageStickerOverlayBounds, ImmutableList immutableList, ImmutableSet immutableSet, String str, String str2, String str3) {
        this.A03 = str;
        this.A05 = str2;
        this.A01 = immutableList;
        this.A04 = str3;
        this.A00 = montageStickerOverlayBounds;
        this.A02 = immutableSet;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String getId() {
        return this.A03;
    }

    public String getImageAssetUrl() {
        return this.A04;
    }

    public ImmutableList getStickerAnimationAssetList() {
        return this.A01;
    }

    public String getStickerAssetId() {
        return this.A05;
    }

    public MontageStickerOverlayBounds getStickerBounds() {
        return this.A00;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A03);
        parcel.writeString(this.A05);
        C53v.A0D(parcel, this.A01);
        parcel.writeString(this.A04);
        parcel.writeValue(this.A00);
        ImmutableSet immutableSet = this.A02;
        C53v.A0M(parcel, immutableSet == null ? null : immutableSet.asList());
    }
}
