package com.facebook.messaging.wellbeing.unknowncontact.reachabilitycontrols.model;

import X.11T;
import X.7zU;
import X.AbF;
import X.C1pq;
import X.CSU;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: DeliverySetting.class */
public final class DeliverySetting implements Parcelable {
    public static final Parcelable.Creator CREATOR = CSU.A00(97);
    public final String A00;
    public final String A01;

    public DeliverySetting(Parcel parcel) {
        this.A00 = 7zU.A0l(parcel, this);
        this.A01 = parcel.readString();
    }

    public DeliverySetting(String str, String str2) {
        this.A00 = str;
        AbF.A1V(str2);
        this.A01 = str2;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof DeliverySetting)) {
                return false;
            }
            DeliverySetting deliverySetting = (DeliverySetting) obj;
            if (!11T.A0O(this.A00, deliverySetting.A00) || !11T.A0O(this.A01, deliverySetting.A01)) {
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
        parcel.writeString(this.A00);
        parcel.writeString(this.A01);
    }
}
