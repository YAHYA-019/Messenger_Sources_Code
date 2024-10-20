package com.facebook.messaging.business.common.calltoaction.model;

import X.11T;
import X.1BK;
import X.1BL;
import X.CiM;
import X.DJe;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* loaded from: CallToActionSimpleTarget.class */
public final class CallToActionSimpleTarget implements Parcelable {
    public static final DJe CREATOR = new CiM();
    public final String A00;

    public CallToActionSimpleTarget(Parcel parcel) {
        String readString = parcel.readString();
        this.A00 = readString == null ? "" : readString;
    }

    public CallToActionSimpleTarget(String str) {
        if (str == null) {
            throw 1BK.A0h();
        }
        this.A00 = str;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !1BL.A1V(this, obj)) {
            return false;
        }
        return 11T.A0O(this.A00, ((CallToActionSimpleTarget) obj).A00);
    }

    public int hashCode() {
        return Arrays.deepHashCode(new Object[]{this.A00});
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        11T.A0F(parcel, 0);
        parcel.writeString(this.A00);
    }
}
