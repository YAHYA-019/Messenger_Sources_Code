package com.facebook.zero.common;

import X.4YV;
import X.FKb;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.common.base.MoreObjects;
import java.util.Arrays;

/* loaded from: ZeroIndicatorData.class */
public final class ZeroIndicatorData implements Parcelable {
    public static final Parcelable.Creator CREATOR = FKb.A00(75);
    public final String A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;

    public ZeroIndicatorData() {
        this(null, null, null, null, null);
    }

    public ZeroIndicatorData(Parcel parcel) {
        this.A03 = parcel.readString();
        this.A04 = parcel.readString();
        this.A02 = parcel.readString();
        this.A00 = parcel.readString();
        this.A01 = parcel.readString();
    }

    public ZeroIndicatorData(String str, String str2, String str3, String str4, String str5) {
        this.A03 = str;
        this.A04 = str2;
        this.A02 = str3;
        this.A00 = str4;
        this.A01 = str5;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        boolean z = false;
        if (obj instanceof ZeroIndicatorData) {
            ZeroIndicatorData zeroIndicatorData = (ZeroIndicatorData) obj;
            if (this.A03.equals(zeroIndicatorData.A03) && this.A04.equals(zeroIndicatorData.A04) && this.A02.equals(zeroIndicatorData.A02) && this.A00.equals(zeroIndicatorData.A00) && this.A01.equals(zeroIndicatorData.A01)) {
                z = true;
            }
        }
        return z;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.A04, this.A02, this.A00, this.A01});
    }

    public String toString() {
        MoreObjects.ToStringHelper stringHelper = MoreObjects.toStringHelper(this);
        stringHelper.add("title", this.A04);
        stringHelper.add("content", this.A02);
        stringHelper.add("actionTitle", this.A00);
        return 4YV.A0s(stringHelper, this.A01, "actionUrl");
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A03);
        parcel.writeString(this.A04);
        parcel.writeString(this.A02);
        parcel.writeString(this.A00);
        parcel.writeString(this.A01);
    }
}
