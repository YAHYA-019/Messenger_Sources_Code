package com.facebook.stickers.service.models;

import X.AbM;
import X.FKe;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.common.base.Objects;

/* loaded from: FetchStickerSuggestionsParams.class */
public final class FetchStickerSuggestionsParams implements Parcelable {
    public static final Parcelable.Creator CREATOR = FKe.A00(52);
    public final String A00;
    public final String A01;

    public FetchStickerSuggestionsParams(Parcel parcel) {
        this.A00 = parcel.readString();
        this.A01 = parcel.readString();
    }

    public FetchStickerSuggestionsParams(String str, String str2) {
        this.A00 = str;
        this.A01 = str2;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this != obj) {
            if (!(obj instanceof FetchStickerSuggestionsParams)) {
                return false;
            }
            FetchStickerSuggestionsParams fetchStickerSuggestionsParams = (FetchStickerSuggestionsParams) obj;
            if (Objects.equal(this.A00, fetchStickerSuggestionsParams.A00) && Objects.equal(this.A01, fetchStickerSuggestionsParams.A01)) {
                return true;
            }
            z = false;
        }
        return z;
    }

    public int hashCode() {
        return AbM.A05(this.A00, this.A01);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A00);
        parcel.writeString(this.A01);
    }
}
