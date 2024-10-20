package com.facebook.businessextension.core;

import X.11T;
import X.1JW;
import X.DKf;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.common.collect.ImmutableSet;

/* loaded from: BusinessExtensionParameters.class */
public final class BusinessExtensionParameters implements Parcelable {
    public static final Parcelable.Creator CREATOR = DKf.A00(69);
    public long A00;
    public Uri A01;
    public ImmutableSet A02;
    public String A03;
    public String A04;
    public String A05;
    public boolean A06;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        11T.A0F(parcel, 0);
        parcel.writeLong(this.A00);
        parcel.writeInt(this.A06 ? 1 : 0);
        parcel.writeStringList(1JW.A02(this.A02));
        parcel.writeString(this.A04);
        parcel.writeString(this.A05);
        parcel.writeString(this.A03);
        parcel.writeParcelable(this.A01, i);
    }
}
