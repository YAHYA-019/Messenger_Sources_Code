package com.facebook.account.twofac.protocol;

import X.LGo;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: LoginApprovalResendCodeParams.class */
public final class LoginApprovalResendCodeParams implements Parcelable {
    public static final Parcelable.Creator CREATOR = new LGo(85);
    public long A00;
    public String A01;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.A00);
        parcel.writeString(this.A01);
    }
}
