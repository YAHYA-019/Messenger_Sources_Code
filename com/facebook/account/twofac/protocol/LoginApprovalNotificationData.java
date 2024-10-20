package com.facebook.account.twofac.protocol;

import X.LGo;
import X.Qq5;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: LoginApprovalNotificationData.class */
public final class LoginApprovalNotificationData implements Parcelable {
    public static final Parcelable.Creator CREATOR = LGo.A00(84);
    public Qq5 A00;
    public String A01;
    public String A02;
    public String A03;
    public String A04;
    public String A05;
    public String A06;
    public String A07;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A05);
        parcel.writeString(this.A01);
        parcel.writeString(this.A03);
        parcel.writeString(this.A02);
        parcel.writeSerializable(this.A00);
        parcel.writeString(this.A06);
        parcel.writeString(this.A04);
        parcel.writeString(this.A07);
    }
}
