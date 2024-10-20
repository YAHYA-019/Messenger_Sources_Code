package com.facebook.quicksilver.common.sharing;

import X.4YV;
import X.AbF;
import X.DKF;
import X.FKW;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.common.collect.ImmutableList;
import java.util.Collection;
import java.util.LinkedList;

/* loaded from: GamesContextPickerFilterParams.class */
public final class GamesContextPickerFilterParams implements Parcelable {
    public static final Parcelable.Creator CREATOR = FKW.A00(79);
    public final ImmutableList A00;
    public final Integer A01;
    public final Integer A02;
    public final String A03;

    public GamesContextPickerFilterParams(Parcel parcel) {
        this.A02 = (Integer) 4YV.A0l(parcel, Integer.class);
        this.A01 = (Integer) 4YV.A0l(parcel, Integer.class);
        LinkedList A1F = AbF.A1F();
        DKF.A1D(parcel, ImmutableList.class, A1F);
        this.A00 = ImmutableList.copyOf((Collection) A1F);
        this.A03 = parcel.readString();
    }

    public GamesContextPickerFilterParams(ImmutableList immutableList, Integer num, Integer num2, String str) {
        this.A02 = num;
        this.A01 = num2;
        this.A00 = immutableList;
        this.A03 = str;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeValue(this.A02);
        parcel.writeValue(this.A01);
        parcel.writeList(this.A00);
        parcel.writeString(this.A03);
    }
}
