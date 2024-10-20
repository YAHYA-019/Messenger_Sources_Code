package com.facebook.messaging.communitymessaging.adminonboarding.hintcard;

import X.0Pz;
import X.11T;
import X.1BL;
import X.4YV;
import X.7zM;
import X.C04v;
import X.CSW;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: HintCardParams.class */
public final class HintCardParams extends C04v implements Parcelable {
    public static final Parcelable.Creator CREATOR = CSW.A00(55);
    public final String A00;
    public final String A01;

    public HintCardParams(String str, String str2) {
        1BL.A1F(str, str2);
        this.A01 = str;
        this.A00 = str2;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof HintCardParams)) {
                return false;
            }
            HintCardParams hintCardParams = (HintCardParams) obj;
            if (!11T.A0O(this.A01, hintCardParams.A01) || !11T.A0O(this.A00, hintCardParams.A00)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return 7zM.A05(this.A00, 4YV.A02(this.A01));
    }

    public String toString() {
        return 0Pz.A0w("HintCardParams(title=", this.A01, ", subtitle=", this.A00, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        11T.A0F(parcel, 0);
        parcel.writeString(this.A01);
        parcel.writeString(this.A00);
    }
}
