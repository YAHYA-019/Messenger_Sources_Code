package com.facebook.zero.sdk.fb4a.statusupdate.notifyserver;

import X.DKD;
import X.FKb;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: NotifyServerUserAckedParams.class */
public final class NotifyServerUserAckedParams implements Parcelable {
    public static final Parcelable.Creator CREATOR = FKb.A00(88);
    public final String A00;

    public NotifyServerUserAckedParams(Parcel parcel) {
        this.A00 = parcel.readString();
    }

    public NotifyServerUserAckedParams(String str) {
        this.A00 = str;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return hashCode();
    }

    public boolean equals(Object obj) {
        if (obj instanceof NotifyServerUserAckedParams) {
            return this.A00.equals(((NotifyServerUserAckedParams) obj).A00);
        }
        return false;
    }

    public int hashCode() {
        return DKD.A04(this.A00);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A00);
    }
}
