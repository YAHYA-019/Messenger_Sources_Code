package com.fbpay.w3c;

import X.11T;
import X.1BL;
import X.AbJ;
import X.AbN;
import X.AnonymousClass001;
import X.C1pq;
import X.C3o5;
import X.LGn;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: W3CCardDetail.class */
public final class W3CCardDetail implements Parcelable {
    public static final Parcelable.Creator CREATOR = LGn.A00(29);
    public final CardDetails A00;
    public final Boolean A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final boolean A05;

    public W3CCardDetail(Parcel parcel) {
        this.A00 = (CardDetails) 1BL.A0C(parcel, getClass());
        this.A05 = AnonymousClass001.A1Q(parcel.readInt(), 1);
        String str = null;
        if (parcel.readInt() == 0) {
            this.A01 = null;
        } else {
            this.A01 = Boolean.valueOf(AbJ.A1W(parcel));
        }
        this.A02 = parcel.readString();
        this.A03 = parcel.readInt() != 0 ? parcel.readString() : str;
        this.A04 = C3o5.A0O(parcel);
    }

    public W3CCardDetail(CardDetails cardDetails, Boolean bool, String str, String str2, String str3, boolean z) {
        this.A00 = cardDetails;
        this.A05 = z;
        this.A01 = bool;
        C1pq.A08("latestBoundDevice", str);
        this.A02 = str;
        this.A03 = str2;
        this.A04 = str3;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof W3CCardDetail)) {
                return false;
            }
            W3CCardDetail w3CCardDetail = (W3CCardDetail) obj;
            if (!11T.A0O(this.A00, w3CCardDetail.A00) || this.A05 != w3CCardDetail.A05 || !11T.A0O(this.A01, w3CCardDetail.A01) || !11T.A0O(this.A02, w3CCardDetail.A02) || !11T.A0O(this.A03, w3CCardDetail.A03) || !11T.A0O(this.A04, w3CCardDetail.A04)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return C1pq.A04(this.A04, C1pq.A04(this.A03, C1pq.A04(this.A02, C1pq.A04(this.A01, C1pq.A02(C1pq.A03(this.A00), this.A05)))));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.A00, i);
        parcel.writeInt(this.A05 ? 1 : 0);
        AbN.A0s(parcel, this.A01);
        parcel.writeString(this.A02);
        1BL.A13(parcel, this.A03);
        1BL.A13(parcel, this.A04);
    }
}
