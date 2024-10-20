package com.facebook.account.recovery.common.model;

import X.LGo;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: AccountCandidateContactPoint.class */
public class AccountCandidateContactPoint implements Parcelable {
    public static final Parcelable.Creator CREATOR = LGo.A00(58);
    public String id = null;
    public String displayContactInfo = null;
    public String contactType = null;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.id);
        parcel.writeString(this.displayContactInfo);
        parcel.writeString(this.contactType);
    }
}
