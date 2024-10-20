package com.facebook.messaging.onetrace;

import X.02W;
import X.11T;
import X.1BL;
import X.C1pq;
import X.C3o5;
import X.CST;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: OneTraceInfo.class */
public final class OneTraceInfo implements Parcelable {
    public static final Parcelable.Creator CREATOR = CST.A00(96);
    public final String A00;
    public final String A01;
    public final String A02;

    public OneTraceInfo(Parcel parcel) {
        String str = null;
        if (C3o5.A01(parcel, this) == 0) {
            this.A00 = null;
        } else {
            this.A00 = parcel.readString();
        }
        this.A01 = parcel.readInt() != 0 ? parcel.readString() : str;
        this.A02 = C3o5.A0O(parcel);
    }

    public OneTraceInfo(String str, String str2, String str3) {
        this.A00 = str;
        this.A01 = str2;
        this.A02 = str3;
        02W.A04(((str3 == null || str == null) && str2 == null && (str3 == null || str != null)) ? false : true);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof OneTraceInfo)) {
                return false;
            }
            OneTraceInfo oneTraceInfo = (OneTraceInfo) obj;
            if (!11T.A0O(this.A00, oneTraceInfo.A00) || !11T.A0O(this.A01, oneTraceInfo.A01) || !11T.A0O(this.A02, oneTraceInfo.A02)) {
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
        1BL.A13(parcel, this.A00);
        1BL.A13(parcel, this.A01);
        1BL.A13(parcel, this.A02);
    }
}
