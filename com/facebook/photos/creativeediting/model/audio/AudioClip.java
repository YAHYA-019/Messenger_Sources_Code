package com.facebook.photos.creativeediting.model.audio;

import X.11T;
import X.1BL;
import X.AnonymousClass001;
import X.C1pq;
import X.C3o5;
import X.FKW;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: AudioClip.class */
public final class AudioClip implements Parcelable {
    public static final Parcelable.Creator CREATOR = FKW.A00(27);
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final String A04;
    public final String A05;

    public AudioClip(Parcel parcel) {
        this.A00 = C3o5.A01(parcel, this);
        this.A04 = parcel.readString();
        this.A01 = parcel.readInt();
        this.A02 = parcel.readInt();
        this.A03 = parcel.readInt();
        this.A05 = parcel.readString();
    }

    public AudioClip(String str, String str2, int i, int i2, int i3, int i4) {
        this.A00 = i;
        C1pq.A08("filePath", str);
        this.A04 = str;
        this.A01 = i2;
        this.A02 = i3;
        this.A03 = i4;
        C1pq.A08("uniqueId", str2);
        this.A05 = str2;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof AudioClip)) {
                return false;
            }
            AudioClip audioClip = (AudioClip) obj;
            if (this.A00 != audioClip.A00 || !11T.A0O(this.A04, audioClip.A04) || this.A01 != audioClip.A01 || this.A02 != audioClip.A02 || this.A03 != audioClip.A03 || !11T.A0O(this.A05, audioClip.A05)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return C1pq.A04(this.A05, (((((C1pq.A04(this.A04, this.A00 + 31) * 31) + this.A01) * 31) + this.A02) * 31) + this.A03);
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("AudioClip{endTimeMs=");
        A0k.append(this.A00);
        A0k.append(", filePath=");
        A0k.append(this.A04);
        A0k.append(", startTimeMs=");
        A0k.append(this.A01);
        A0k.append(", trimmedEndTimeMs=");
        A0k.append(this.A02);
        A0k.append(", trimmedStartTimeMs=");
        A0k.append(this.A03);
        A0k.append(", uniqueId=");
        A0k.append(this.A05);
        return 1BL.A0v(A0k);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.A00);
        parcel.writeString(this.A04);
        parcel.writeInt(this.A01);
        parcel.writeInt(this.A02);
        parcel.writeInt(this.A03);
        parcel.writeString(this.A05);
    }
}
