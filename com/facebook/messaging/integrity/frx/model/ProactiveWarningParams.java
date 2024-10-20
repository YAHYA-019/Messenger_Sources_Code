package com.facebook.messaging.integrity.frx.model;

import X.11T;
import X.4YW;
import X.AbK;
import X.C1pq;
import X.C3o5;
import X.CSV;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: ProactiveWarningParams.class */
public final class ProactiveWarningParams implements Parcelable {
    public static final Parcelable.Creator CREATOR = CSV.A00(3);
    public final String A00;
    public final String A01;
    public final String A02;

    public ProactiveWarningParams(Parcel parcel) {
        this.A00 = AbK.A15(parcel, C3o5.A01(parcel, this));
        this.A01 = parcel.readString();
        this.A02 = parcel.readString();
    }

    public ProactiveWarningParams(String str, String str2, String str3) {
        this.A00 = str;
        C1pq.A08("preSelectedTag", str2);
        this.A01 = str2;
        C1pq.A08("promptTokenId", str3);
        this.A02 = str3;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof ProactiveWarningParams)) {
                return false;
            }
            ProactiveWarningParams proactiveWarningParams = (ProactiveWarningParams) obj;
            if (!11T.A0O(this.A00, proactiveWarningParams.A00) || !11T.A0O(this.A01, proactiveWarningParams.A01) || !11T.A0O(this.A02, proactiveWarningParams.A02)) {
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
        4YW.A0E(parcel, this.A00);
        parcel.writeString(this.A01);
        parcel.writeString(this.A02);
    }
}
