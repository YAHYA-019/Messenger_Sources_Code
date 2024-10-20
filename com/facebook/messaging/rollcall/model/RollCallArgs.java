package com.facebook.messaging.rollcall.model;

import X.11T;
import X.1BK;
import X.1BL;
import X.4YV;
import X.7zR;
import X.C04v;
import X.CSS;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.messaging.model.threadkey.ThreadKey;

/* loaded from: RollCallArgs.class */
public final class RollCallArgs extends C04v implements Parcelable {
    public static final Parcelable.Creator CREATOR = new CSS(44);
    public final ThreadKey A00;
    public final String A01;
    public final String A02;

    public RollCallArgs(ThreadKey threadKey, String str, String str2) {
        7zR.A1N(str, threadKey);
        this.A01 = str;
        this.A02 = str2;
        this.A00 = threadKey;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof RollCallArgs)) {
                return false;
            }
            RollCallArgs rollCallArgs = (RollCallArgs) obj;
            if (!11T.A0O(this.A01, rollCallArgs.A01) || !11T.A0O(this.A02, rollCallArgs.A02) || !11T.A0O(this.A00, rollCallArgs.A00)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return 1BK.A03(this.A00, (4YV.A02(this.A01) + 1BL.A05(this.A02)) * 31);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        11T.A0F(parcel, 0);
        parcel.writeString(this.A01);
        parcel.writeString(this.A02);
        parcel.writeParcelable(this.A00, i);
    }
}
