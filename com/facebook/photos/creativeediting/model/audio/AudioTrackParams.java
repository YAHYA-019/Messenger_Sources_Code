package com.facebook.photos.creativeediting.model.audio;

import X.11T;
import X.1BL;
import X.1Du;
import X.4YV;
import X.4YW;
import X.AbI;
import X.AbM;
import X.C1pq;
import X.DKH;
import X.FKW;
import X.RaF;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.common.collect.ImmutableList;

/* loaded from: AudioTrackParams.class */
public final class AudioTrackParams implements Parcelable {
    public static final Parcelable.Creator CREATOR = FKW.A00(28);
    public final float A00;
    public final int A01;
    public final int A02;
    public final ImmutableList A03;
    public final String A04;
    public final boolean A05;

    public AudioTrackParams(RaF raF) {
        ImmutableList immutableList = raF.A03;
        C1pq.A08("audioClips", immutableList);
        this.A03 = immutableList;
        this.A01 = raF.A01;
        this.A02 = raF.A02;
        this.A05 = raF.A05;
        this.A04 = raF.A04;
        this.A00 = raF.A00;
    }

    public AudioTrackParams(Parcel parcel) {
        ClassLoader A0e = 4YV.A0e(this);
        int readInt = parcel.readInt();
        AudioClip[] audioClipArr = new AudioClip[readInt];
        int i = 0;
        while (i < readInt) {
            i = AbI.A01(parcel, A0e, audioClipArr, i);
        }
        this.A03 = ImmutableList.copyOf(audioClipArr);
        this.A01 = parcel.readInt();
        this.A02 = parcel.readInt();
        this.A05 = DKH.A1W(parcel);
        this.A04 = DKH.A0l(parcel);
        this.A00 = parcel.readFloat();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof AudioTrackParams)) {
                return false;
            }
            AudioTrackParams audioTrackParams = (AudioTrackParams) obj;
            if (!11T.A0O(this.A03, audioTrackParams.A03) || this.A01 != audioTrackParams.A01 || this.A02 != audioTrackParams.A02 || this.A05 != audioTrackParams.A05 || !11T.A0O(this.A04, audioTrackParams.A04) || this.A00 != audioTrackParams.A00) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return AbM.A00(C1pq.A04(this.A04, C1pq.A02((((C1pq.A03(this.A03) * 31) + this.A01) * 31) + this.A02, this.A05)), this.A00);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        1Du A0b = 1BL.A0b(parcel, this.A03);
        while (A0b.hasNext()) {
            parcel.writeParcelable((AudioClip) A0b.next(), i);
        }
        parcel.writeInt(this.A01);
        parcel.writeInt(this.A02);
        parcel.writeInt(this.A05 ? 1 : 0);
        4YW.A0E(parcel, this.A04);
        parcel.writeFloat(this.A00);
    }
}
