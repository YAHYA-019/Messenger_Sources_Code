package com.facebook.messaging.model.attribution;

import X.C53v;
import X.CSV;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: AttributionVisibility.class */
public final class AttributionVisibility implements Parcelable {
    public final boolean A00;
    public final boolean A01;
    public final boolean A02;
    public final boolean A03;
    public final boolean A04;
    public static final AttributionVisibility A06 = new AttributionVisibility(false, false, false, false, false);
    public static final AttributionVisibility A05 = new AttributionVisibility(true, true, true, true, true);
    public static final Parcelable.Creator CREATOR = CSV.A00(45);

    public AttributionVisibility(Parcel parcel) {
        this.A01 = C53v.A0S(parcel);
        this.A02 = C53v.A0S(parcel);
        this.A03 = C53v.A0S(parcel);
        this.A04 = C53v.A0S(parcel);
        this.A00 = C53v.A0S(parcel);
    }

    public AttributionVisibility(boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        this.A01 = z2;
        this.A02 = z3;
        this.A03 = z4;
        this.A04 = z5;
        this.A00 = z;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.A01 ? 1 : 0);
        parcel.writeInt(this.A02 ? 1 : 0);
        parcel.writeInt(this.A03 ? 1 : 0);
        parcel.writeInt(this.A04 ? 1 : 0);
        parcel.writeInt(this.A00 ? 1 : 0);
    }
}
