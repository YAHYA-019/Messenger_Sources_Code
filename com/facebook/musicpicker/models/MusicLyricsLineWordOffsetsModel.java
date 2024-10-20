package com.facebook.musicpicker.models;

import X.C3o5;
import X.FKY;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: MusicLyricsLineWordOffsetsModel.class */
public final class MusicLyricsLineWordOffsetsModel implements Parcelable {
    public static final Parcelable.Creator CREATOR = FKY.A00(10);
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final int A04;

    public MusicLyricsLineWordOffsetsModel(int i, int i2, int i3, int i4, int i5) {
        this.A00 = i;
        this.A01 = i2;
        this.A02 = i3;
        this.A03 = i4;
        this.A04 = i5;
    }

    public MusicLyricsLineWordOffsetsModel(Parcel parcel) {
        this.A00 = C3o5.A01(parcel, this);
        this.A01 = parcel.readInt();
        this.A02 = parcel.readInt();
        this.A03 = parcel.readInt();
        this.A04 = parcel.readInt();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof MusicLyricsLineWordOffsetsModel)) {
                return false;
            }
            MusicLyricsLineWordOffsetsModel musicLyricsLineWordOffsetsModel = (MusicLyricsLineWordOffsetsModel) obj;
            if (this.A00 != musicLyricsLineWordOffsetsModel.A00 || this.A01 != musicLyricsLineWordOffsetsModel.A01 || this.A02 != musicLyricsLineWordOffsetsModel.A02 || this.A03 != musicLyricsLineWordOffsetsModel.A03 || this.A04 != musicLyricsLineWordOffsetsModel.A04) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return ((((((((this.A00 + 31) * 31) + this.A01) * 31) + this.A02) * 31) + this.A03) * 31) + this.A04;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.A00);
        parcel.writeInt(this.A01);
        parcel.writeInt(this.A02);
        parcel.writeInt(this.A03);
        parcel.writeInt(this.A04);
    }
}
