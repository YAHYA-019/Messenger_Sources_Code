package com.facebook.inspiration.magicmod.model;

import X.11T;
import X.7zU;
import X.C1pq;
import X.FKf;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.proxygen.TraceFieldType;

/* loaded from: MagicModImage.class */
public final class MagicModImage implements Parcelable {
    public static final Parcelable.Creator CREATOR = FKf.A01(38);
    public final String A00;
    public final String A01;

    public MagicModImage(Parcel parcel) {
        this.A00 = 7zU.A0l(parcel, this);
        this.A01 = parcel.readString();
    }

    public MagicModImage(String str, String str2) {
        C1pq.A08("prompt", str);
        this.A00 = str;
        C1pq.A08(TraceFieldType.Uri, str2);
        this.A01 = str2;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof MagicModImage)) {
                return false;
            }
            MagicModImage magicModImage = (MagicModImage) obj;
            if (!11T.A0O(this.A00, magicModImage.A00) || !11T.A0O(this.A01, magicModImage.A01)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return C1pq.A04(this.A01, C1pq.A03(this.A00));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A00);
        parcel.writeString(this.A01);
    }
}
