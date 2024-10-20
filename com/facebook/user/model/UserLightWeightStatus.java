package com.facebook.user.model;

import X.11T;
import X.C1pq;
import X.FKe;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: UserLightWeightStatus.class */
public final class UserLightWeightStatus implements Parcelable {
    public static final Parcelable.Creator CREATOR = new FKe(98);
    public final Long A00;
    public final String A01;
    public final String A02;
    public final String A03;

    public UserLightWeightStatus(Parcel parcel) {
        getClass().getClassLoader();
        this.A01 = parcel.readString();
        this.A02 = parcel.readString();
        this.A00 = Long.valueOf(parcel.readLong());
        this.A03 = parcel.readString();
    }

    public UserLightWeightStatus(Long l, String str, String str2, String str3) {
        C1pq.A08("statusDescription", str);
        this.A01 = str;
        C1pq.A08("statusEmoji", str2);
        this.A02 = str2;
        C1pq.A08("statusExpiredTime", l);
        this.A00 = l;
        C1pq.A08("statusId", str3);
        this.A03 = str3;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof UserLightWeightStatus)) {
                return false;
            }
            UserLightWeightStatus userLightWeightStatus = (UserLightWeightStatus) obj;
            if (!11T.A0O(this.A01, userLightWeightStatus.A01) || !11T.A0O(this.A02, userLightWeightStatus.A02) || !11T.A0O(this.A00, userLightWeightStatus.A00) || !11T.A0O(this.A03, userLightWeightStatus.A03)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return C1pq.A04(this.A03, C1pq.A04(this.A00, C1pq.A04(this.A02, C1pq.A03(this.A01))));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A01);
        parcel.writeString(this.A02);
        parcel.writeLong(this.A00.longValue());
        parcel.writeString(this.A03);
    }
}
