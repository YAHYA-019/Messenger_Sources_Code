package com.facebook.messaging.business.search.model;

import X.1BL;
import X.BL8;
import X.Brk;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.user.model.Name;
import com.facebook.user.profilepic.PicSquare;

/* loaded from: PlatformSearchData.class */
public abstract class PlatformSearchData implements Parcelable {
    public final BL8 A00;
    public final Name A01;
    public final PicSquare A02;
    public final String A03;

    public PlatformSearchData(Brk brk) {
        this.A01 = brk.A01;
        this.A02 = brk.A02;
        this.A00 = brk.A00;
        this.A03 = brk.A03;
    }

    public PlatformSearchData(Parcel parcel) {
        this.A01 = (Name) 1BL.A0C(parcel, Name.class);
        this.A02 = (PicSquare) 1BL.A0C(parcel, PicSquare.class);
        this.A00 = parcel.readSerializable();
        this.A03 = parcel.readString();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.A01, i);
        parcel.writeParcelable(this.A02, i);
        parcel.writeSerializable(this.A00);
        parcel.writeString(this.A03);
    }
}
