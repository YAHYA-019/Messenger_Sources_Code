package com.facebook.messaging.wellbeing.selfremediation.block.group.groupwarning;

import X.11T;
import X.7zT;
import X.C04v;
import X.CSU;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: WarningBottomSheetParam.class */
public final class WarningBottomSheetParam extends C04v implements Parcelable {
    public static final Parcelable.Creator CREATOR = CSU.A00(93);
    public final String A00;
    public final String A01;
    public final String A02;
    public final String A03;

    public WarningBottomSheetParam(String str, String str2, String str3, String str4) {
        7zT.A1W(str, str2, str3, str4);
        this.A03 = str;
        this.A00 = str2;
        this.A01 = str3;
        this.A02 = str4;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        11T.A0F(parcel, 0);
        parcel.writeString(this.A03);
        parcel.writeString(this.A00);
        parcel.writeString(this.A01);
        parcel.writeString(this.A02);
    }
}
