package com.facebook.photos.creativeediting.model;

import X.11T;
import X.4YW;
import X.AbK;
import X.C1pq;
import X.C3o5;
import X.FKW;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: MusicSaveParams.class */
public final class MusicSaveParams implements Parcelable {
    public static final Parcelable.Creator CREATOR = FKW.A00(17);
    public final int A00;
    public final String A01;

    public MusicSaveParams(Parcel parcel) {
        this.A01 = AbK.A15(parcel, C3o5.A01(parcel, this));
        this.A00 = parcel.readInt();
    }

    public MusicSaveParams(String str, int i) {
        this.A01 = str;
        this.A00 = i;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof MusicSaveParams)) {
                return false;
            }
            MusicSaveParams musicSaveParams = (MusicSaveParams) obj;
            if (!11T.A0O(this.A01, musicSaveParams.A01) || this.A00 != musicSaveParams.A00) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return (C1pq.A03(this.A01) * 31) + this.A00;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        4YW.A0E(parcel, this.A01);
        parcel.writeInt(this.A00);
    }
}
