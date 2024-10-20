package com.facebook.inspiration.audiosharing.model;

import X.11T;
import X.1BL;
import X.1Du;
import X.4YV;
import X.AbI;
import X.C1pq;
import X.FKf;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.common.collect.ImmutableList;

/* loaded from: AudioTranscriptionParam.class */
public final class AudioTranscriptionParam implements Parcelable {
    public static final Parcelable.Creator CREATOR = FKf.A01(19);
    public final ImmutableList A00;
    public final ImmutableList A01;
    public final String A02;
    public final boolean A03;

    public AudioTranscriptionParam(Parcel parcel) {
        ClassLoader A0e = 4YV.A0e(this);
        int i = 0;
        this.A03 = 4YV.A1U(parcel.readInt());
        int readInt = parcel.readInt();
        AudioTranscriptionTokenParam[] audioTranscriptionTokenParamArr = new AudioTranscriptionTokenParam[readInt];
        int i2 = 0;
        while (i2 < readInt) {
            i2 = AbI.A01(parcel, A0e, audioTranscriptionTokenParamArr, i2);
        }
        this.A00 = ImmutableList.copyOf(audioTranscriptionTokenParamArr);
        int readInt2 = parcel.readInt();
        AudioTranscriptionTokenParam[] audioTranscriptionTokenParamArr2 = new AudioTranscriptionTokenParam[readInt2];
        while (i < readInt2) {
            i = AbI.A01(parcel, A0e, audioTranscriptionTokenParamArr2, i);
        }
        this.A01 = ImmutableList.copyOf(audioTranscriptionTokenParamArr2);
        this.A02 = parcel.readString();
    }

    public AudioTranscriptionParam(ImmutableList immutableList, ImmutableList immutableList2, String str, boolean z) {
        this.A03 = z;
        C1pq.A08("detailedTranscriptions", immutableList);
        this.A00 = immutableList;
        C1pq.A08("originalTranscriptions", immutableList2);
        this.A01 = immutableList2;
        C1pq.A08("shortwaveId", str);
        this.A02 = str;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof AudioTranscriptionParam)) {
                return false;
            }
            AudioTranscriptionParam audioTranscriptionParam = (AudioTranscriptionParam) obj;
            if (this.A03 != audioTranscriptionParam.A03 || !11T.A0O(this.A00, audioTranscriptionParam.A00) || !11T.A0O(this.A01, audioTranscriptionParam.A01) || !11T.A0O(this.A02, audioTranscriptionParam.A02)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return C1pq.A04(this.A02, C1pq.A04(this.A01, C1pq.A04(this.A00, C1pq.A05(this.A03))));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.A03 ? 1 : 0);
        1Du A0b = 1BL.A0b(parcel, this.A00);
        while (A0b.hasNext()) {
            parcel.writeParcelable((AudioTranscriptionTokenParam) A0b.next(), i);
        }
        1Du A0b2 = 1BL.A0b(parcel, this.A01);
        while (A0b2.hasNext()) {
            parcel.writeParcelable((AudioTranscriptionTokenParam) A0b2.next(), i);
        }
        parcel.writeString(this.A02);
    }
}
