package com.facebook.iabadscontext;

import X.11T;
import X.1BL;
import X.4YV;
import X.7zM;
import X.C04v;
import X.FKf;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: IabAdCreativeOptimizationConfigByType.class */
public final class IabAdCreativeOptimizationConfigByType extends C04v implements Parcelable {
    public static final Parcelable.Creator CREATOR = FKf.A01(5);
    public final String A00;
    public final String A01;

    public IabAdCreativeOptimizationConfigByType(String str, String str2) {
        1BL.A1F(str, str2);
        this.A00 = str;
        this.A01 = str2;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof IabAdCreativeOptimizationConfigByType)) {
                return false;
            }
            IabAdCreativeOptimizationConfigByType iabAdCreativeOptimizationConfigByType = (IabAdCreativeOptimizationConfigByType) obj;
            if (!11T.A0O(this.A00, iabAdCreativeOptimizationConfigByType.A00) || !11T.A0O(this.A01, iabAdCreativeOptimizationConfigByType.A01)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return 7zM.A05(this.A01, 4YV.A02(this.A00));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        11T.A0F(parcel, 0);
        parcel.writeString(this.A00);
        parcel.writeString(this.A01);
    }
}
