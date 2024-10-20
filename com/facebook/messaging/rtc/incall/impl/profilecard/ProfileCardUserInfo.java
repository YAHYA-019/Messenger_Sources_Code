package com.facebook.messaging.rtc.incall.impl.profilecard;

import X.11T;
import X.CSS;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.user.model.User;

/* loaded from: ProfileCardUserInfo.class */
public final class ProfileCardUserInfo implements Parcelable {
    public static final CSS CREATOR = CSS.A00(53);
    public final int A00;
    public final int A01;
    public final User A02;

    public ProfileCardUserInfo(User user, int i, int i2) {
        11T.A0F(user, 1);
        this.A02 = user;
        this.A00 = i;
        this.A01 = i2;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        11T.A0F(parcel, 0);
        parcel.writeParcelable(this.A02, i);
        parcel.writeInt(this.A00);
        parcel.writeInt(this.A01);
    }
}
