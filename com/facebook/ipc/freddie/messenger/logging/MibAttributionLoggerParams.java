package com.facebook.ipc.freddie.messenger.logging;

import X.11T;
import X.1BL;
import X.AbG;
import X.AbN;
import X.C1pq;
import X.C3o5;
import X.CSR;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: MibAttributionLoggerParams.class */
public final class MibAttributionLoggerParams implements Parcelable {
    public static final Parcelable.Creator CREATOR = CSR.A00(26);
    public final long A00;
    public final long A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final boolean A08;

    public MibAttributionLoggerParams(Parcel parcel) {
        AbG.A1X(this);
        this.A00 = parcel.readLong();
        this.A02 = parcel.readString();
        this.A08 = AbN.A1U(parcel);
        String str = null;
        if (parcel.readInt() == 0) {
            this.A03 = null;
        } else {
            this.A03 = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A04 = null;
        } else {
            this.A04 = parcel.readString();
        }
        this.A01 = parcel.readLong();
        this.A05 = parcel.readString();
        this.A06 = parcel.readInt() != 0 ? parcel.readString() : str;
        this.A07 = C3o5.A0O(parcel);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof MibAttributionLoggerParams)) {
                return false;
            }
            MibAttributionLoggerParams mibAttributionLoggerParams = (MibAttributionLoggerParams) obj;
            if (this.A00 != mibAttributionLoggerParams.A00 || !11T.A0O(this.A02, mibAttributionLoggerParams.A02) || this.A08 != mibAttributionLoggerParams.A08 || !11T.A0O(this.A03, mibAttributionLoggerParams.A03) || !11T.A0O(this.A04, mibAttributionLoggerParams.A04) || this.A01 != mibAttributionLoggerParams.A01 || !11T.A0O(this.A05, mibAttributionLoggerParams.A05) || !11T.A0O(this.A06, mibAttributionLoggerParams.A06) || !11T.A0O(this.A07, mibAttributionLoggerParams.A07)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return C1pq.A04(this.A07, C1pq.A04(this.A06, C1pq.A04(this.A05, C1pq.A01(C1pq.A04(this.A04, C1pq.A04(this.A03, C1pq.A02(C1pq.A04(this.A02, 1BL.A01(this.A00) + 31), this.A08))), this.A01))));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.A00);
        parcel.writeString(this.A02);
        parcel.writeInt(this.A08 ? 1 : 0);
        1BL.A13(parcel, this.A03);
        1BL.A13(parcel, this.A04);
        parcel.writeLong(this.A01);
        parcel.writeString(this.A05);
        1BL.A13(parcel, this.A06);
        1BL.A13(parcel, this.A07);
    }
}
