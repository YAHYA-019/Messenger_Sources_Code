package com.facebook.bugreporter.activity.categorylist;

import X.DKf;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: CategoryInfo.class */
public final class CategoryInfo implements Parcelable {
    public static final Parcelable.Creator CREATOR = DKf.A00(64);
    public final long A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final boolean A04;

    public CategoryInfo(Parcel parcel) {
        this.A01 = parcel.readString();
        this.A03 = parcel.readString();
        this.A00 = parcel.readLong();
        boolean[] zArr = new boolean[1];
        parcel.readBooleanArray(zArr);
        this.A04 = zArr[0];
        this.A02 = parcel.readString();
    }

    public CategoryInfo(String str) {
        this.A01 = str;
        this.A03 = str;
        this.A00 = 113186105514995L;
        this.A04 = true;
        this.A02 = "";
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A01);
        parcel.writeString(this.A03);
        parcel.writeLong(this.A00);
        parcel.writeBooleanArray(new boolean[]{this.A04});
        parcel.writeString(this.A02);
    }
}
