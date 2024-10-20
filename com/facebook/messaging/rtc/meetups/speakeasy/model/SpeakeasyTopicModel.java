package com.facebook.messaging.rtc.meetups.speakeasy.model;

import X.11T;
import X.7zU;
import X.AbF;
import X.AbN;
import X.C1pq;
import X.CSS;
import X.RTC;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: SpeakeasyTopicModel.class */
public final class SpeakeasyTopicModel implements Parcelable {
    public static final Parcelable.Creator CREATOR = CSS.A00(62);
    public final int A00;
    public final String A01;
    public final String A02;
    public final boolean A03;

    public SpeakeasyTopicModel(RTC rtc) {
        String str = rtc.A01;
        C1pq.A08("emoji", str);
        this.A01 = str;
        this.A03 = rtc.A03;
        String str2 = rtc.A02;
        AbF.A1U(str2);
        this.A02 = str2;
        this.A00 = rtc.A00;
    }

    public SpeakeasyTopicModel(Parcel parcel) {
        this.A01 = 7zU.A0l(parcel, this);
        this.A03 = AbN.A1U(parcel);
        this.A02 = parcel.readString();
        this.A00 = parcel.readInt();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof SpeakeasyTopicModel)) {
                return false;
            }
            SpeakeasyTopicModel speakeasyTopicModel = (SpeakeasyTopicModel) obj;
            if (!11T.A0O(this.A01, speakeasyTopicModel.A01) || this.A03 != speakeasyTopicModel.A03 || !11T.A0O(this.A02, speakeasyTopicModel.A02) || this.A00 != speakeasyTopicModel.A00) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return (C1pq.A04(this.A02, C1pq.A02(C1pq.A03(this.A01), this.A03)) * 31) + this.A00;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A01);
        parcel.writeInt(this.A03 ? 1 : 0);
        parcel.writeString(this.A02);
        parcel.writeInt(this.A00);
    }
}
