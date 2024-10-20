package com.facebookpay.form.fragment.model;

import X.11T;
import X.LGp;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: FeatureConfiguration.class */
public final class FeatureConfiguration implements Parcelable {
    public static final Parcelable.Creator CREATOR = LGp.A00(80);
    public final boolean A00;
    public final boolean A01;
    public final boolean A02;

    public FeatureConfiguration() {
        this(false, false, false);
    }

    public FeatureConfiguration(boolean z, boolean z2, boolean z3) {
        this.A01 = z;
        this.A02 = z2;
        this.A00 = z3;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        11T.A0F(parcel, 0);
        parcel.writeInt(this.A01 ? 1 : 0);
        parcel.writeInt(this.A02 ? 1 : 0);
        parcel.writeInt(this.A00 ? 1 : 0);
    }
}
