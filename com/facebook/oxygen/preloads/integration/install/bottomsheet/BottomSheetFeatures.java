package com.facebook.oxygen.preloads.integration.install.bottomsheet;

import X.11T;
import X.C04v;
import X.EaE;
import X.FKY;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: BottomSheetFeatures.class */
public final class BottomSheetFeatures extends C04v implements Parcelable {
    public final Integer A00;
    public static final Parcelable.Creator CREATOR = FKY.A00(16);
    public static final BottomSheetFeatures A01 = new BottomSheetFeatures(EaE.A00);

    public BottomSheetFeatures(Integer num) {
        11T.A0F(num, 1);
        this.A00 = num;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        11T.A0F(parcel, 0);
        parcel.writeString(1 - this.A00.intValue() != 0 ? "SHOW_ALWAYS" : "SHOW_NO_WIFI");
    }
}
