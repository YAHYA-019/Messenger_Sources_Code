package com.facebook.musicpicker.models;

import X.1BM;
import X.AbJ;
import X.AnonymousClass001;
import X.C1pq;
import X.C3o5;
import X.FKY;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: MusicBeatModel.class */
public final class MusicBeatModel implements Parcelable {
    public static final Parcelable.Creator CREATOR = FKY.A00(8);
    public final int A00;
    public final boolean A01;
    public final boolean A02;
    public final boolean A03;
    public final boolean A04;

    public MusicBeatModel(Parcel parcel) {
        this.A01 = AnonymousClass001.A1Q(C3o5.A01(parcel, this), 1);
        this.A02 = 1BM.A07(parcel);
        this.A03 = 1BM.A07(parcel);
        this.A04 = AbJ.A1W(parcel);
        this.A00 = parcel.readInt();
    }

    public MusicBeatModel(boolean z, int i, boolean z2, boolean z3, boolean z4) {
        this.A01 = z;
        this.A02 = z2;
        this.A03 = z3;
        this.A04 = z4;
        this.A00 = i;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof MusicBeatModel)) {
                return false;
            }
            MusicBeatModel musicBeatModel = (MusicBeatModel) obj;
            if (this.A01 != musicBeatModel.A01 || this.A02 != musicBeatModel.A02 || this.A03 != musicBeatModel.A03 || this.A04 != musicBeatModel.A04 || this.A00 != musicBeatModel.A00) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return (C1pq.A02(C1pq.A02(C1pq.A02(C1pq.A05(this.A01), this.A02), this.A03), this.A04) * 31) + this.A00;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.A01 ? 1 : 0);
        parcel.writeInt(this.A02 ? 1 : 0);
        parcel.writeInt(this.A03 ? 1 : 0);
        parcel.writeInt(this.A04 ? 1 : 0);
        parcel.writeInt(this.A00);
    }
}
