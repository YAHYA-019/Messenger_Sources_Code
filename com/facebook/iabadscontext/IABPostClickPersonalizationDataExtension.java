package com.facebook.iabadscontext;

import X.11T;
import X.4YW;
import X.C04v;
import X.FKf;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.List;

/* loaded from: IABPostClickPersonalizationDataExtension.class */
public final class IABPostClickPersonalizationDataExtension extends C04v implements Parcelable {
    public static final Parcelable.Creator CREATOR = FKf.A01(3);
    public final List A00;

    public IABPostClickPersonalizationDataExtension(List list) {
        this.A00 = list;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof IABPostClickPersonalizationDataExtension) && 11T.A0O(this.A00, ((IABPostClickPersonalizationDataExtension) obj).A00));
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        11T.A0F(parcel, 0);
        Iterator A09 = 4YW.A09(parcel, this.A00);
        while (A09.hasNext()) {
            IabAdCreativeOptimizationConfigByType iabAdCreativeOptimizationConfigByType = (IabAdCreativeOptimizationConfigByType) A09.next();
            if (iabAdCreativeOptimizationConfigByType == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                iabAdCreativeOptimizationConfigByType.writeToParcel(parcel, i);
            }
        }
    }
}
