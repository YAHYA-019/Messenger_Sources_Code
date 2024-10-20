package com.fbpay.hub.common.link;

import X.11T;
import X.AbN;
import X.C1pq;
import X.C3o5;
import X.EoH;
import X.LGn;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: LinkParams.class */
public final class LinkParams implements Parcelable {
    public static final Parcelable.Creator CREATOR = new LGn(12);
    public final int A00;
    public final int A01;
    public final int A02;
    public final String A03;
    public final String A04;
    public final boolean A05;

    public LinkParams(EoH eoH) {
        this.A00 = 0;
        this.A01 = eoH.A00;
        this.A02 = 0;
        String str = eoH.A01;
        C1pq.A08("token", str);
        this.A03 = str;
        String str2 = eoH.A02;
        C1pq.A08("url", str2);
        this.A04 = str2;
        this.A05 = eoH.A03;
    }

    public LinkParams(Parcel parcel) {
        this.A00 = C3o5.A01(parcel, this);
        this.A01 = parcel.readInt();
        this.A02 = parcel.readInt();
        this.A03 = parcel.readString();
        this.A04 = parcel.readString();
        this.A05 = AbN.A1U(parcel);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof LinkParams)) {
                return false;
            }
            LinkParams linkParams = (LinkParams) obj;
            if (this.A00 != linkParams.A00 || this.A01 != linkParams.A01 || this.A02 != linkParams.A02 || !11T.A0O(this.A03, linkParams.A03) || !11T.A0O(this.A04, linkParams.A04) || this.A05 != linkParams.A05) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return C1pq.A02(C1pq.A04(this.A04, C1pq.A04(this.A03, ((((this.A00 + 31) * 31) + this.A01) * 31) + this.A02)), this.A05);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.A00);
        parcel.writeInt(this.A01);
        parcel.writeInt(this.A02);
        parcel.writeString(this.A03);
        parcel.writeString(this.A04);
        parcel.writeInt(this.A05 ? 1 : 0);
    }
}
