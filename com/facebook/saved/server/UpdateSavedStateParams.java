package com.facebook.saved.server;

import X.4YT;
import X.BLx;
import X.BRt;
import X.FKW;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.common.base.Optional;
import com.google.common.collect.ImmutableList;

/* loaded from: UpdateSavedStateParams.class */
public final class UpdateSavedStateParams implements Parcelable {
    public static final Parcelable.Creator CREATOR = new FKW(98);
    public final BLx A00;
    public final Optional A01;
    public final Optional A02;
    public final Optional A03;
    public final Optional A04;
    public final Optional A05;
    public final Optional A06;
    public final String A07;
    public final String A08;
    public final ImmutableList A09;

    public UpdateSavedStateParams(BLx bLx, Optional optional, Optional optional2, Optional optional3, Optional optional4, Optional optional5, Optional optional6, ImmutableList immutableList) {
        String A00 = 4YT.A00(322);
        this.A04 = optional4;
        this.A03 = optional3;
        this.A01 = optional;
        this.A06 = optional6;
        this.A00 = bLx;
        this.A08 = "native_messenger_message";
        this.A07 = A00;
        this.A09 = immutableList;
        this.A05 = optional5;
        this.A02 = optional2;
    }

    public UpdateSavedStateParams(Parcel parcel) {
        this.A04 = Optional.fromNullable(parcel.readString());
        this.A03 = Optional.fromNullable(parcel.readString());
        this.A01 = Optional.fromNullable(parcel.readString());
        this.A06 = Optional.fromNullable(parcel.readString());
        this.A05 = Optional.fromNullable(parcel.readString());
        this.A00 = parcel.readSerializable();
        this.A08 = parcel.readString();
        this.A07 = parcel.readString();
        this.A09 = BRt.A00(parcel.createStringArrayList());
        this.A02 = Optional.fromNullable(parcel.readString());
    }

    public static void A00(Parcel parcel, Optional optional) {
        parcel.writeString((String) optional.orNull());
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        A00(parcel, this.A04);
        A00(parcel, this.A03);
        A00(parcel, this.A01);
        A00(parcel, this.A06);
        A00(parcel, this.A05);
        parcel.writeSerializable(this.A00);
        parcel.writeString(this.A08);
        parcel.writeString(this.A07);
        parcel.writeStringList(this.A09);
        A00(parcel, this.A02);
    }
}
