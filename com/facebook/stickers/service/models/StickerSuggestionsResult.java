package com.facebook.stickers.service.models;

import X.4YU;
import X.DKI;
import X.FKe;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.stickers.model.Sticker;
import com.google.common.base.Objects;
import com.google.common.collect.ImmutableList;
import java.util.Collection;
import java.util.List;

/* loaded from: StickerSuggestionsResult.class */
public final class StickerSuggestionsResult implements Parcelable {
    public static final Parcelable.Creator CREATOR = FKe.A00(64);
    public final ImmutableList A00;
    public final String A01;
    public final String A02;

    public StickerSuggestionsResult(Parcel parcel) {
        this.A01 = parcel.readString();
        this.A02 = parcel.readString();
        this.A00 = DKI.A0H(parcel, Sticker.class);
    }

    public StickerSuggestionsResult(String str, String str2, List list) {
        this.A01 = str;
        this.A02 = str2;
        this.A00 = list != null ? ImmutableList.copyOf((Collection) list) : ImmutableList.of();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this != obj) {
            if (!(obj instanceof StickerSuggestionsResult)) {
                return false;
            }
            StickerSuggestionsResult stickerSuggestionsResult = (StickerSuggestionsResult) obj;
            if (Objects.equal(this.A01, stickerSuggestionsResult.A01) && Objects.equal(this.A02, stickerSuggestionsResult.A02) && Objects.equal(this.A00, stickerSuggestionsResult.A00)) {
                return true;
            }
            z = false;
        }
        return z;
    }

    public int hashCode() {
        return 4YU.A04(this.A01, this.A02, this.A00);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A01);
        parcel.writeString(this.A02);
        parcel.writeList(this.A00);
    }
}
