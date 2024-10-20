package com.facebook.ui.emoji.model;

import X.C2xc;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: BasicEmoji.class */
public final class BasicEmoji extends Emoji {
    public static final Parcelable.Creator CREATOR = new C2xc(52);
    public final String A00;

    public BasicEmoji(Parcel parcel) {
        this.A00 = parcel.readString();
    }

    public BasicEmoji(String str) {
        this.A00 = str;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof BasicEmoji) && this.A00.equals(((BasicEmoji) obj).A00));
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A00);
    }
}
