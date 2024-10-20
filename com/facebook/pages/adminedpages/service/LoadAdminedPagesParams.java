package com.facebook.pages.adminedpages.service;

import X.1He;
import X.FKY;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: LoadAdminedPagesParams.class */
public final class LoadAdminedPagesParams implements Parcelable {
    public static final Parcelable.Creator CREATOR = new FKY(19);
    public final 1He A00;

    public LoadAdminedPagesParams(1He r302) {
        this.A00 = r302;
    }

    public LoadAdminedPagesParams(Parcel parcel) {
        this.A00 = 1He.valueOf(parcel.readString());
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A00.toString());
    }
}
