package com.facebook.stickers.service.models;

import X.1He;
import X.AbM;
import X.DKF;
import X.FKe;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.common.base.Objects;

/* loaded from: DownloadStickerSuggestionsRuleModelParams.class */
public final class DownloadStickerSuggestionsRuleModelParams implements Parcelable {
    public static final Parcelable.Creator CREATOR = FKe.A00(40);
    public final 1He A00;
    public final String A01;

    public DownloadStickerSuggestionsRuleModelParams(Parcel parcel) {
        String readString = parcel.readString();
        this.A00 = readString != null ? 1He.valueOf(readString) : 1He.A04;
        this.A01 = parcel.readString();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this != obj) {
            if (!(obj instanceof DownloadStickerSuggestionsRuleModelParams)) {
                return false;
            }
            DownloadStickerSuggestionsRuleModelParams downloadStickerSuggestionsRuleModelParams = (DownloadStickerSuggestionsRuleModelParams) obj;
            if (Objects.equal(this.A01, downloadStickerSuggestionsRuleModelParams.A01) && Objects.equal(this.A00, downloadStickerSuggestionsRuleModelParams.A00)) {
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
        DKF.A1E(parcel, this.A00);
        parcel.writeString(this.A01);
    }
}
