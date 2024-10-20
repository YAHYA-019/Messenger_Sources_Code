package com.facebook.messaging.stickers.keyboardopenparams;

import X.7zU;
import X.C1pq;
import X.C3o5;
import X.CSU;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: StickerLSKeyboardOpenParams.class */
public final class StickerLSKeyboardOpenParams implements Parcelable {
    public static final Parcelable.Creator CREATOR = new CSU(69);
    public final Integer A00;

    public StickerLSKeyboardOpenParams(Parcel parcel) {
        getClass().getClassLoader();
        this.A00 = 7zU.A0e(parcel, 6);
    }

    public StickerLSKeyboardOpenParams(Integer num) {
        C1pq.A08("openTab", num);
        this.A00 = num;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof StickerLSKeyboardOpenParams) && this.A00 == ((StickerLSKeyboardOpenParams) obj).A00);
    }

    public int hashCode() {
        return C3o5.A04(this.A00) + 31;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.A00.intValue());
    }
}
