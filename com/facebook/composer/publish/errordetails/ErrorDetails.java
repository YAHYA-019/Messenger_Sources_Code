package com.facebook.composer.publish.errordetails;

import X.11T;
import X.1BL;
import X.1BM;
import X.7zO;
import X.AbI;
import X.AbJ;
import X.AbN;
import X.AnonymousClass001;
import X.C1pq;
import X.C3o5;
import X.FKX;
import X.N2m;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: ErrorDetails.class */
public final class ErrorDetails implements Parcelable {
    public static final Parcelable.Creator CREATOR = new FKX(8);
    public final int A00;
    public final Boolean A01;
    public final Integer A02;
    public final Long A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final String A09;
    public final boolean A0A;
    public final boolean A0B;
    public final boolean A0C;
    public final boolean A0D;
    public final boolean A0E;

    public ErrorDetails(N2m n2m) {
        this.A00 = n2m.A00;
        this.A02 = n2m.A02;
        this.A0A = n2m.A0A;
        this.A03 = n2m.A03;
        this.A0B = n2m.A0B;
        this.A0C = n2m.A0C;
        this.A0D = n2m.A0D;
        this.A0E = n2m.A0E;
        this.A01 = n2m.A01;
        String str = n2m.A04;
        C1pq.A08("logMessage", str);
        this.A04 = str;
        this.A05 = n2m.A05;
        this.A06 = n2m.A06;
        this.A07 = n2m.A07;
        String str2 = n2m.A08;
        C1pq.A08("userMessage", str2);
        this.A08 = str2;
        this.A09 = n2m.A09;
    }

    public ErrorDetails(Parcel parcel) {
        this.A00 = C3o5.A01(parcel, this);
        String str = null;
        if (parcel.readInt() == 0) {
            this.A02 = null;
        } else {
            this.A02 = AbI.A0z(parcel);
        }
        this.A0A = AnonymousClass001.A1Q(parcel.readInt(), 1);
        if (parcel.readInt() == 0) {
            this.A03 = null;
        } else {
            this.A03 = 7zO.A0j(parcel);
        }
        this.A0B = 1BM.A07(parcel);
        this.A0C = 1BM.A07(parcel);
        this.A0D = 1BM.A07(parcel);
        this.A0E = 1BM.A07(parcel);
        if (parcel.readInt() == 0) {
            this.A01 = null;
        } else {
            this.A01 = Boolean.valueOf(AbJ.A1W(parcel));
        }
        this.A04 = parcel.readString();
        if (parcel.readInt() == 0) {
            this.A05 = null;
        } else {
            this.A05 = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A06 = null;
        } else {
            this.A06 = parcel.readString();
        }
        this.A07 = parcel.readInt() != 0 ? parcel.readString() : str;
        this.A08 = parcel.readString();
        this.A09 = C3o5.A0O(parcel);
    }

    public ErrorDetails(String str, String str2, boolean z, boolean z2, boolean z3) {
        this.A00 = 0;
        this.A02 = null;
        this.A0A = false;
        this.A03 = null;
        this.A0B = z;
        this.A0C = z2;
        this.A0D = z3;
        this.A0E = false;
        this.A01 = null;
        C1pq.A08("logMessage", str);
        this.A04 = str;
        this.A05 = str2;
        this.A06 = null;
        this.A07 = null;
        this.A08 = "";
        this.A09 = null;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof ErrorDetails)) {
                return false;
            }
            ErrorDetails errorDetails = (ErrorDetails) obj;
            if (this.A00 != errorDetails.A00 || !11T.A0O(this.A02, errorDetails.A02) || this.A0A != errorDetails.A0A || !11T.A0O(this.A03, errorDetails.A03) || this.A0B != errorDetails.A0B || this.A0C != errorDetails.A0C || this.A0D != errorDetails.A0D || this.A0E != errorDetails.A0E || !11T.A0O(this.A01, errorDetails.A01) || !11T.A0O(this.A04, errorDetails.A04) || !11T.A0O(this.A05, errorDetails.A05) || !11T.A0O(this.A06, errorDetails.A06) || !11T.A0O(this.A07, errorDetails.A07) || !11T.A0O(this.A08, errorDetails.A08) || !11T.A0O(this.A09, errorDetails.A09)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return C1pq.A04(this.A09, C1pq.A04(this.A08, C1pq.A04(this.A07, C1pq.A04(this.A06, C1pq.A04(this.A05, C1pq.A04(this.A04, C1pq.A04(this.A01, C1pq.A02(C1pq.A02(C1pq.A02(C1pq.A02(C1pq.A04(this.A03, C1pq.A02(C1pq.A04(this.A02, this.A00 + 31), this.A0A)), this.A0B), this.A0C), this.A0D), this.A0E))))))));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.A00);
        C3o5.A0f(parcel, this.A02);
        parcel.writeInt(this.A0A ? 1 : 0);
        C3o5.A0g(parcel, this.A03);
        parcel.writeInt(this.A0B ? 1 : 0);
        parcel.writeInt(this.A0C ? 1 : 0);
        parcel.writeInt(this.A0D ? 1 : 0);
        parcel.writeInt(this.A0E ? 1 : 0);
        AbN.A0s(parcel, this.A01);
        parcel.writeString(this.A04);
        1BL.A13(parcel, this.A05);
        1BL.A13(parcel, this.A06);
        1BL.A13(parcel, this.A07);
        parcel.writeString(this.A08);
        1BL.A13(parcel, this.A09);
    }
}
