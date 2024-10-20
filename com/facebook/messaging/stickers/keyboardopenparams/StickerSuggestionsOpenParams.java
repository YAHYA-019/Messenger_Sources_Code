package com.facebook.messaging.stickers.keyboardopenparams;

import X.11T;
import X.7zU;
import X.C1pq;
import X.CSU;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: StickerSuggestionsOpenParams.class */
public final class StickerSuggestionsOpenParams implements Parcelable {
    public static final Parcelable.Creator CREATOR = CSU.A00(71);
    public final String A00;

    public StickerSuggestionsOpenParams(Parcel parcel) {
        this.A00 = 7zU.A0l(parcel, this);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof StickerSuggestionsOpenParams) && 11T.A0O(this.A00, ((StickerSuggestionsOpenParams) obj).A00));
    }

    public int hashCode() {
        return C1pq.A03(this.A00);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A00);
    }
}
