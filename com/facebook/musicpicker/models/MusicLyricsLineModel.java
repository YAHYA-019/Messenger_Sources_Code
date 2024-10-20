package com.facebook.musicpicker.models;

import X.11T;
import X.1BL;
import X.1Du;
import X.4YV;
import X.4YW;
import X.AbI;
import X.C1pq;
import X.DKH;
import X.FKY;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.common.collect.ImmutableList;

/* loaded from: MusicLyricsLineModel.class */
public final class MusicLyricsLineModel implements Parcelable {
    public static final Parcelable.Creator CREATOR = FKY.A00(9);
    public final int A00;
    public final int A01;
    public final ImmutableList A02;
    public final String A03;

    public MusicLyricsLineModel(Parcel parcel) {
        ClassLoader A0e = 4YV.A0e(this);
        this.A00 = parcel.readInt();
        this.A01 = parcel.readInt();
        this.A03 = DKH.A0l(parcel);
        int readInt = parcel.readInt();
        MusicLyricsLineWordOffsetsModel[] musicLyricsLineWordOffsetsModelArr = new MusicLyricsLineWordOffsetsModel[readInt];
        int i = 0;
        while (i < readInt) {
            i = AbI.A01(parcel, A0e, musicLyricsLineWordOffsetsModelArr, i);
        }
        this.A02 = ImmutableList.copyOf(musicLyricsLineWordOffsetsModelArr);
    }

    public MusicLyricsLineModel(ImmutableList immutableList, String str, int i, int i2) {
        this.A00 = i;
        this.A01 = i2;
        this.A03 = str;
        C1pq.A08("wordOffsets", immutableList);
        this.A02 = immutableList;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof MusicLyricsLineModel)) {
                return false;
            }
            MusicLyricsLineModel musicLyricsLineModel = (MusicLyricsLineModel) obj;
            if (this.A00 != musicLyricsLineModel.A00 || this.A01 != musicLyricsLineModel.A01 || !11T.A0O(this.A03, musicLyricsLineModel.A03) || !11T.A0O(this.A02, musicLyricsLineModel.A02)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return C1pq.A04(this.A02, C1pq.A04(this.A03, ((this.A00 + 31) * 31) + this.A01));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.A00);
        parcel.writeInt(this.A01);
        4YW.A0E(parcel, this.A03);
        1Du A0b = 1BL.A0b(parcel, this.A02);
        while (A0b.hasNext()) {
            parcel.writeParcelable((MusicLyricsLineWordOffsetsModel) A0b.next(), i);
        }
    }
}
