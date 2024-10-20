package com.facebook.ipc.composer.model;

import X.11T;
import X.1BL;
import X.AbN;
import X.C1pq;
import X.C3o5;
import X.CSR;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: PlatformConfiguration.class */
public final class PlatformConfiguration implements Parcelable {
    public static final Parcelable.Creator CREATOR = new CSR(3);
    public final String A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final boolean A06;

    public PlatformConfiguration(Parcel parcel) {
        String str = null;
        if (C3o5.A01(parcel, this) == 0) {
            this.A00 = null;
        } else {
            this.A00 = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A01 = null;
        } else {
            this.A01 = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A02 = null;
        } else {
            this.A02 = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A03 = null;
        } else {
            this.A03 = parcel.readString();
        }
        this.A06 = AbN.A1U(parcel);
        this.A04 = parcel.readInt() != 0 ? parcel.readString() : str;
        this.A05 = C3o5.A0O(parcel);
    }

    public PlatformConfiguration(String str, String str2, String str3, String str4, String str5, String str6, boolean z) {
        this.A00 = str;
        this.A01 = str2;
        this.A02 = str3;
        this.A03 = str4;
        this.A06 = z;
        this.A04 = str5;
        this.A05 = str6;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof PlatformConfiguration)) {
                return false;
            }
            PlatformConfiguration platformConfiguration = (PlatformConfiguration) obj;
            if (!11T.A0O(this.A00, platformConfiguration.A00) || !11T.A0O(this.A01, platformConfiguration.A01) || !11T.A0O(this.A02, platformConfiguration.A02) || !11T.A0O(this.A03, platformConfiguration.A03) || this.A06 != platformConfiguration.A06 || !11T.A0O(this.A04, platformConfiguration.A04) || !11T.A0O(this.A05, platformConfiguration.A05)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return C1pq.A04(this.A05, C1pq.A04(this.A04, C1pq.A02(C1pq.A04(this.A03, C1pq.A04(this.A02, C1pq.A04(this.A01, C1pq.A03(this.A00)))), this.A06)));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        1BL.A13(parcel, this.A00);
        1BL.A13(parcel, this.A01);
        1BL.A13(parcel, this.A02);
        1BL.A13(parcel, this.A03);
        parcel.writeInt(this.A06 ? 1 : 0);
        1BL.A13(parcel, this.A04);
        1BL.A13(parcel, this.A05);
    }
}
