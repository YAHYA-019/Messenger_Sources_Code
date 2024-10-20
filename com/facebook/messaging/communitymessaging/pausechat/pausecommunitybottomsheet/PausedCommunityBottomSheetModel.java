package com.facebook.messaging.communitymessaging.pausechat.pausecommunitybottomsheet;

import X.11T;
import X.7zL;
import X.7zU;
import X.C1pq;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: PausedCommunityBottomSheetModel.class */
public final class PausedCommunityBottomSheetModel implements Parcelable {
    public static final Parcelable.Creator CREATOR = 7zL.A0v(8);
    public final String A00;

    public PausedCommunityBottomSheetModel(Parcel parcel) {
        this.A00 = 7zU.A0l(parcel, this);
    }

    public PausedCommunityBottomSheetModel(String str) {
        C1pq.A08("groupId", str);
        this.A00 = str;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof PausedCommunityBottomSheetModel) && 11T.A0O(this.A00, ((PausedCommunityBottomSheetModel) obj).A00));
    }

    public int hashCode() {
        return C1pq.A03(this.A00);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A00);
    }
}
