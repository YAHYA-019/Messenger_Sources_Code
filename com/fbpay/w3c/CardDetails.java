package com.fbpay.w3c;

import X.11T;
import X.1BL;
import X.1Du;
import X.4YV;
import X.AbH;
import X.AbI;
import X.AbL;
import X.AbN;
import X.C1pq;
import X.C3o5;
import X.LGn;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.common.collect.ImmutableList;

/* loaded from: CardDetails.class */
public final class CardDetails implements Parcelable {
    public static final Parcelable.Creator CREATOR = LGn.A00(25);
    public final Address A00;
    public final ImmutableList A01;
    public final Boolean A02;
    public final Integer A03;
    public final Integer A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final String A09;
    public final String A0A;

    public CardDetails(Parcel parcel) {
        ClassLoader A0e = 4YV.A0e(this);
        Boolean bool = null;
        if (parcel.readInt() == 0) {
            this.A00 = null;
        } else {
            this.A00 = (Address) parcel.readParcelable(A0e);
        }
        boolean z = false;
        if (parcel.readInt() == 0) {
            this.A01 = null;
        } else {
            int readInt = parcel.readInt();
            String[] strArr = new String[readInt];
            int i = 0;
            while (i < readInt) {
                i = AbH.A00(parcel, strArr, i);
            }
            this.A01 = ImmutableList.copyOf(strArr);
        }
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
        if (parcel.readInt() == 0) {
            this.A07 = null;
        } else {
            this.A07 = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A08 = null;
        } else {
            this.A08 = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A09 = null;
        } else {
            this.A09 = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A03 = null;
        } else {
            this.A03 = AbI.A0z(parcel);
        }
        if (parcel.readInt() == 0) {
            this.A04 = null;
        } else {
            this.A04 = AbI.A0z(parcel);
        }
        if (parcel.readInt() != 0) {
            bool = Boolean.valueOf(parcel.readInt() == 1 ? true : z);
        }
        this.A02 = bool;
        this.A0A = C3o5.A0O(parcel);
    }

    public CardDetails(Address address, ImmutableList immutableList, Boolean bool, Integer num, Integer num2, String str, String str2, String str3, String str4, String str5, String str6) {
        this.A00 = address;
        this.A01 = immutableList;
        this.A05 = str;
        this.A06 = str2;
        this.A07 = str3;
        this.A08 = str4;
        this.A09 = str5;
        this.A03 = num;
        this.A04 = num2;
        this.A02 = bool;
        this.A0A = str6;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof CardDetails)) {
                return false;
            }
            CardDetails cardDetails = (CardDetails) obj;
            if (!11T.A0O(this.A00, cardDetails.A00) || !11T.A0O(this.A01, cardDetails.A01) || !11T.A0O(this.A05, cardDetails.A05) || !11T.A0O(this.A06, cardDetails.A06) || !11T.A0O(this.A07, cardDetails.A07) || !11T.A0O(this.A08, cardDetails.A08) || !11T.A0O(this.A09, cardDetails.A09) || !11T.A0O(this.A03, cardDetails.A03) || !11T.A0O(this.A04, cardDetails.A04) || !11T.A0O(this.A02, cardDetails.A02) || !11T.A0O(this.A0A, cardDetails.A0A)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return C1pq.A04(this.A0A, C1pq.A04(this.A02, C1pq.A04(this.A04, C1pq.A04(this.A03, C1pq.A04(this.A09, C1pq.A04(this.A08, C1pq.A04(this.A07, C1pq.A04(this.A06, C1pq.A04(this.A05, C1pq.A04(this.A01, C1pq.A03(this.A00)))))))))));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C3o5.A0d(parcel, this.A00, i);
        ImmutableList immutableList = this.A01;
        if (immutableList == null) {
            parcel.writeInt(0);
        } else {
            1Du A0Y = AbL.A0Y(parcel, immutableList);
            while (A0Y.hasNext()) {
                C3o5.A0h(parcel, A0Y);
            }
        }
        1BL.A13(parcel, this.A05);
        1BL.A13(parcel, this.A06);
        1BL.A13(parcel, this.A07);
        1BL.A13(parcel, this.A08);
        1BL.A13(parcel, this.A09);
        C3o5.A0f(parcel, this.A03);
        C3o5.A0f(parcel, this.A04);
        AbN.A0s(parcel, this.A02);
        1BL.A13(parcel, this.A0A);
    }
}
