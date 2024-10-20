package com.facebook.inspiration.model.attribution;

import X.11T;
import X.1BL;
import X.1Du;
import X.4YV;
import X.AbI;
import X.C1pq;
import X.FKf;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.common.collect.ImmutableList;

/* loaded from: InspirationEffectAttribution.class */
public final class InspirationEffectAttribution implements Parcelable {
    public static final Parcelable.Creator CREATOR = FKf.A01(96);
    public final ImmutableList A00;

    public InspirationEffectAttribution(Parcel parcel) {
        ClassLoader A0e = 4YV.A0e(this);
        int readInt = parcel.readInt();
        License[] licenseArr = new License[readInt];
        int i = 0;
        while (i < readInt) {
            i = AbI.A01(parcel, A0e, licenseArr, i);
        }
        this.A00 = ImmutableList.copyOf(licenseArr);
    }

    public InspirationEffectAttribution(ImmutableList immutableList) {
        C1pq.A08("licenses", immutableList);
        this.A00 = immutableList;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof InspirationEffectAttribution) && 11T.A0O(this.A00, ((InspirationEffectAttribution) obj).A00));
    }

    public int hashCode() {
        return C1pq.A03(this.A00);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        1Du A0b = 1BL.A0b(parcel, this.A00);
        while (A0b.hasNext()) {
            parcel.writeParcelable((License) A0b.next(), i);
        }
    }
}
