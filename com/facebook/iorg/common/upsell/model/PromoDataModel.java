package com.facebook.iorg.common.upsell.model;

import X.0S2;
import X.EM6;
import X.EW8;
import X.FKc;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: PromoDataModel.class */
public final class PromoDataModel implements Parcelable {
    public static final Parcelable.Creator CREATOR = FKc.A00(76);
    public EM6 A00 = null;
    public String A05 = null;
    public String A08 = null;
    public String A09 = null;
    public String A03 = null;
    public String A07 = null;
    public String A06 = null;
    public String A02 = null;
    public String A04 = null;
    public Integer A01 = 0S2.A00;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A05);
        parcel.writeString(this.A08);
        parcel.writeString(this.A09);
        parcel.writeString(this.A03);
        parcel.writeString(this.A07);
        parcel.writeString(this.A06);
        parcel.writeString(this.A02);
        parcel.writeString(this.A04);
        parcel.writeString(EW8.A00(this.A01));
    }
}
