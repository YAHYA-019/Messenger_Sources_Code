package com.facebook.account.login.model;

import X.11T;
import X.LGo;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: DeviceEmailSoftMatchData.class */
public final class DeviceEmailSoftMatchData implements Parcelable {
    public static final Parcelable.Creator CREATOR = LGo.A00(56);
    public int designTestGroup;
    public String matchedDeviceEmail = "";
    public String accountName = "";
    public String accountFirstName = "";
    public String profilePicUrl = "";

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        11T.A0F(parcel, 0);
        parcel.writeString(this.matchedDeviceEmail);
        parcel.writeString(this.accountName);
        parcel.writeString(this.accountFirstName);
        parcel.writeString(this.profilePicUrl);
        parcel.writeInt(this.designTestGroup);
    }
}
