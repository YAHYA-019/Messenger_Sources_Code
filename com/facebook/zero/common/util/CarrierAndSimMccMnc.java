package com.facebook.zero.common.util;

import X.0Pz;
import X.1BL;
import X.C4Ny;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.common.base.Objects;
import com.google.common.collect.ImmutableList;
import java.util.Arrays;

/* loaded from: CarrierAndSimMccMnc.class */
public final class CarrierAndSimMccMnc implements Parcelable {
    public static final CarrierAndSimMccMnc A02 = new CarrierAndSimMccMnc(null, null);
    public static final Parcelable.Creator CREATOR = new C4Ny(50);
    public final MccMncPair A00;
    public final MccMncPair A01;

    /* loaded from: CarrierAndSimMccMnc$MccMncPair.class */
    public final class MccMncPair implements Parcelable {
        public static final Parcelable.Creator CREATOR = new C4Ny(51);
        public final String A00;
        public final String A01;

        public MccMncPair(Parcel parcel) {
            this.A00 = parcel.readString();
            this.A01 = parcel.readString();
        }

        public MccMncPair(String str, String str2) {
            this.A00 = str;
            this.A01 = str2;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            boolean z = false;
            if (obj != null && (obj instanceof MccMncPair)) {
                MccMncPair mccMncPair = (MccMncPair) obj;
                if (this.A00.equals(mccMncPair.A00) && this.A01.equals(mccMncPair.A01)) {
                    z = true;
                }
            }
            return z;
        }

        public int hashCode() {
            return Arrays.hashCode(new Object[]{this.A00, this.A01});
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.A00);
            parcel.writeString(this.A01);
        }
    }

    public CarrierAndSimMccMnc(Parcel parcel) {
        this.A00 = (MccMncPair) 1BL.A0C(parcel, MccMncPair.class);
        this.A01 = (MccMncPair) 1BL.A0C(parcel, MccMncPair.class);
    }

    public CarrierAndSimMccMnc(MccMncPair mccMncPair, MccMncPair mccMncPair2) {
        this.A00 = mccMncPair;
        this.A01 = mccMncPair2;
    }

    public CarrierAndSimMccMnc(String str) {
        MccMncPair mccMncPair;
        ImmutableList copyOf = ImmutableList.copyOf(str.split(":"));
        if (copyOf.size() != 4) {
            mccMncPair = null;
            this.A00 = null;
        } else {
            this.A00 = new MccMncPair((String) copyOf.get(0), (String) copyOf.get(1));
            mccMncPair = new MccMncPair((String) copyOf.get(2), (String) copyOf.get(3));
        }
        this.A01 = mccMncPair;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        boolean z = false;
        if (obj != null && (obj instanceof CarrierAndSimMccMnc)) {
            CarrierAndSimMccMnc carrierAndSimMccMnc = (CarrierAndSimMccMnc) obj;
            if (Objects.equal(this.A00, carrierAndSimMccMnc.A00) && Objects.equal(this.A01, carrierAndSimMccMnc.A01)) {
                z = true;
            }
        }
        return z;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.A00, this.A01});
    }

    public String toString() {
        MccMncPair mccMncPair = this.A00;
        String str = mccMncPair.A00;
        String str2 = mccMncPair.A01;
        MccMncPair mccMncPair2 = this.A01;
        return 0Pz.A12(str, ":", str2, ":", mccMncPair2.A00, ":", mccMncPair2.A01);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.A00, i);
        parcel.writeParcelable(this.A01, i);
    }
}
