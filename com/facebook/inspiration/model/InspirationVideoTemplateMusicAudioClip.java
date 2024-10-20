package com.facebook.inspiration.model;

import X.11T;
import X.C1pq;
import X.C3o5;
import X.FKf;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: InspirationVideoTemplateMusicAudioClip.class */
public final class InspirationVideoTemplateMusicAudioClip implements Parcelable {
    public static final Parcelable.Creator CREATOR = FKf.A01(77);
    public final int A00;
    public final int A01;
    public final String A02;
    public final String A03;

    public InspirationVideoTemplateMusicAudioClip(int i, String str, String str2, int i2) {
        this.A00 = i;
        C1pq.A08("mediaID", str);
        this.A02 = str;
        C1pq.A08("mediaURL", str2);
        this.A03 = str2;
        this.A01 = i2;
    }

    public InspirationVideoTemplateMusicAudioClip(Parcel parcel) {
        this.A00 = C3o5.A01(parcel, this);
        this.A02 = parcel.readString();
        this.A03 = parcel.readString();
        this.A01 = parcel.readInt();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof InspirationVideoTemplateMusicAudioClip)) {
                return false;
            }
            InspirationVideoTemplateMusicAudioClip inspirationVideoTemplateMusicAudioClip = (InspirationVideoTemplateMusicAudioClip) obj;
            if (this.A00 != inspirationVideoTemplateMusicAudioClip.A00 || !11T.A0O(this.A02, inspirationVideoTemplateMusicAudioClip.A02) || !11T.A0O(this.A03, inspirationVideoTemplateMusicAudioClip.A03) || this.A01 != inspirationVideoTemplateMusicAudioClip.A01) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return (C1pq.A04(this.A03, C1pq.A04(this.A02, this.A00 + 31)) * 31) + this.A01;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.A00);
        parcel.writeString(this.A02);
        parcel.writeString(this.A03);
        parcel.writeInt(this.A01);
    }
}
