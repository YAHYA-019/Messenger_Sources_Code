package com.facebook.inspiration.model.movableoverlay;

import X.11T;
import X.4YW;
import X.7zU;
import X.C1pq;
import X.DKH;
import X.FKc;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: InspirationEventInfo.class */
public final class InspirationEventInfo implements Parcelable {
    public static final Parcelable.Creator CREATOR = FKc.A00(10);
    public final String A00;
    public final String A01;
    public final String A02;

    public InspirationEventInfo(Parcel parcel) {
        this.A00 = 7zU.A0l(parcel, this);
        this.A01 = parcel.readString();
        this.A02 = DKH.A0l(parcel);
    }

    public InspirationEventInfo(String str, String str2, String str3) {
        C1pq.A08("eventId", str);
        this.A00 = str;
        C1pq.A08("eventName", str2);
        this.A01 = str2;
        this.A02 = str3;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof InspirationEventInfo)) {
                return false;
            }
            InspirationEventInfo inspirationEventInfo = (InspirationEventInfo) obj;
            if (!11T.A0O(this.A00, inspirationEventInfo.A00) || !11T.A0O(this.A01, inspirationEventInfo.A01) || !11T.A0O(this.A02, inspirationEventInfo.A02)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return C1pq.A04(this.A02, C1pq.A04(this.A01, C1pq.A03(this.A00)));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A00);
        parcel.writeString(this.A01);
        4YW.A0E(parcel, this.A02);
    }
}
