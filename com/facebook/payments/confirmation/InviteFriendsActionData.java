package com.facebook.payments.confirmation;

import X.11T;
import X.7zU;
import X.C1pq;
import X.FKZ;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: InviteFriendsActionData.class */
public final class InviteFriendsActionData implements Parcelable, PostPurchaseActionSpec$PostPurchaseActionData {
    public static final Parcelable.Creator CREATOR = FKZ.A00(28);
    public final String A00;

    public InviteFriendsActionData(Parcel parcel) {
        this.A00 = 7zU.A0l(parcel, this);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof InviteFriendsActionData) && 11T.A0O(this.A00, ((InviteFriendsActionData) obj).A00));
    }

    public int hashCode() {
        return C1pq.A03(this.A00);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A00);
    }
}
