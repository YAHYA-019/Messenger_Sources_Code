package com.facebook.inspiration.model.movableoverlay;

import X.11T;
import X.7zK;
import X.7zU;
import X.C1pq;
import X.FKc;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.acra.constants.ActionId;

/* loaded from: InspirationGiphyInfo.class */
public final class InspirationGiphyInfo implements Parcelable {
    public static final Parcelable.Creator CREATOR = FKc.A00(15);
    public final String A00;

    public InspirationGiphyInfo(Parcel parcel) {
        this.A00 = 7zU.A0l(parcel, this);
    }

    public InspirationGiphyInfo(String str) {
        C1pq.A08(7zK.A00(ActionId.RTMP_CONNECTION_RELEASE), str);
        this.A00 = str;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof InspirationGiphyInfo) && 11T.A0O(this.A00, ((InspirationGiphyInfo) obj).A00));
    }

    public int hashCode() {
        return C1pq.A03(this.A00);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A00);
    }
}
