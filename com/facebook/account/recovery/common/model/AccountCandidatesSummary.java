package com.facebook.account.recovery.common.model;

import X.LGo;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: AccountCandidatesSummary.class */
public class AccountCandidatesSummary implements Parcelable {
    public static final Parcelable.Creator CREATOR = new LGo(61);
    public int totalCount = 0;
    public boolean isSharedPhoneNoSignal = false;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.totalCount);
        parcel.writeInt(this.isSharedPhoneNoSignal ? 1 : 0);
    }
}
