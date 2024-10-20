package com.facebook.inspiration.audiosharing.model;

import X.11T;
import X.AbN;
import X.C1pq;
import X.C3o5;
import X.FKf;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: AudioTranscriptionTokenParam.class */
public final class AudioTranscriptionTokenParam implements Parcelable {
    public static final Parcelable.Creator CREATOR = FKf.A01(20);
    public final int A00;
    public final int A01;
    public final String A02;
    public final boolean A03;

    public AudioTranscriptionTokenParam(int i, int i2, String str, boolean z) {
        this.A00 = i;
        this.A03 = z;
        this.A01 = i2;
        C1pq.A08("word", str);
        this.A02 = str;
    }

    public AudioTranscriptionTokenParam(Parcel parcel) {
        this.A00 = C3o5.A01(parcel, this);
        this.A03 = AbN.A1U(parcel);
        this.A01 = parcel.readInt();
        this.A02 = parcel.readString();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof AudioTranscriptionTokenParam)) {
                return false;
            }
            AudioTranscriptionTokenParam audioTranscriptionTokenParam = (AudioTranscriptionTokenParam) obj;
            if (this.A00 != audioTranscriptionTokenParam.A00 || this.A03 != audioTranscriptionTokenParam.A03 || this.A01 != audioTranscriptionTokenParam.A01 || !11T.A0O(this.A02, audioTranscriptionTokenParam.A02)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return C1pq.A04(this.A02, (C1pq.A02(this.A00 + 31, this.A03) * 31) + this.A01);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.A00);
        parcel.writeInt(this.A03 ? 1 : 0);
        parcel.writeInt(this.A01);
        parcel.writeString(this.A02);
    }
}
