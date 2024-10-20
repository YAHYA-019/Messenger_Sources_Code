package com.facebook.ipc.inspiration.config;

import X.11T;
import X.1BL;
import X.4YV;
import X.AnonymousClass001;
import X.C1pq;
import X.C3o5;
import X.CSR;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: InspirationNUXConfiguration.class */
public final class InspirationNUXConfiguration implements Parcelable {
    public static final Parcelable.Creator CREATOR = CSR.A00(32);
    public final String A00;
    public final String A01;
    public final String A02;
    public final boolean A03;

    public InspirationNUXConfiguration(Parcel parcel) {
        this.A03 = 4YV.A1U(C3o5.A01(parcel, this));
        String str = null;
        if (parcel.readInt() == 0) {
            this.A00 = null;
        } else {
            this.A00 = parcel.readString();
        }
        this.A01 = parcel.readInt() != 0 ? parcel.readString() : str;
        this.A02 = C3o5.A0O(parcel);
    }

    public InspirationNUXConfiguration(boolean z, String str, String str2, String str3) {
        this.A03 = z;
        this.A00 = str;
        this.A01 = str2;
        this.A02 = str3;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof InspirationNUXConfiguration)) {
                return false;
            }
            InspirationNUXConfiguration inspirationNUXConfiguration = (InspirationNUXConfiguration) obj;
            if (this.A03 != inspirationNUXConfiguration.A03 || !11T.A0O(this.A00, inspirationNUXConfiguration.A00) || !11T.A0O(this.A01, inspirationNUXConfiguration.A01) || !11T.A0O(this.A02, inspirationNUXConfiguration.A02)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return C1pq.A04(this.A02, C1pq.A04(this.A01, C1pq.A04(this.A00, C1pq.A05(this.A03))));
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("InspirationNUXConfiguration{isNewDesignEnabled=");
        A0k.append(this.A03);
        A0k.append(", nuxSubtitle2Text=");
        A0k.append(this.A00);
        A0k.append(", nuxSubtitleText=");
        A0k.append(this.A01);
        A0k.append(", nuxTitleText=");
        A0k.append(this.A02);
        return 1BL.A0v(A0k);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.A03 ? 1 : 0);
        1BL.A13(parcel, this.A00);
        1BL.A13(parcel, this.A01);
        1BL.A13(parcel, this.A02);
    }
}
