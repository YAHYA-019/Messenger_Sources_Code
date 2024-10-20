package com.facebook.messaging.wellbeing.unknowncontact.reachabilitycontrols.model;

import X.11T;
import X.1BL;
import X.C1pq;
import X.CSU;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: MultiIgSetting.class */
public final class MultiIgSetting implements Parcelable {
    public static final Parcelable.Creator CREATOR = CSU.A00(98);
    public final DeliverySetting A00;
    public final String A01;

    public MultiIgSetting(Parcel parcel) {
        this.A00 = (DeliverySetting) 1BL.A0C(parcel, getClass());
        this.A01 = parcel.readString();
    }

    public MultiIgSetting(DeliverySetting deliverySetting, String str) {
        this.A00 = deliverySetting;
        this.A01 = str;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof MultiIgSetting)) {
                return false;
            }
            MultiIgSetting multiIgSetting = (MultiIgSetting) obj;
            if (!11T.A0O(this.A00, multiIgSetting.A00) || !11T.A0O(this.A01, multiIgSetting.A01)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return C1pq.A04(this.A01, C1pq.A03(this.A00));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.A00, i);
        parcel.writeString(this.A01);
    }
}
