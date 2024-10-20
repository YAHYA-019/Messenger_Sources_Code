package com.facebook.messaging.model.threads;

import X.11T;
import X.1BL;
import X.AbJ;
import X.AbM;
import X.AnonymousClass001;
import X.C1pq;
import X.C3o5;
import X.CSV;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: MarketplaceThreadUserData.class */
public final class MarketplaceThreadUserData implements Parcelable {
    public static final Parcelable.Creator CREATOR = CSV.A00(64);
    public final float A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final long A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final boolean A09;
    public final boolean A0A;

    public MarketplaceThreadUserData(Parcel parcel) {
        this.A09 = AnonymousClass001.A1Q(C3o5.A01(parcel, this), 1);
        this.A0A = AbJ.A1W(parcel);
        this.A01 = parcel.readInt();
        String str = null;
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
        this.A00 = parcel.readFloat();
        this.A02 = parcel.readInt();
        this.A03 = parcel.readInt();
        this.A08 = C3o5.A0O(parcel);
        this.A04 = parcel.readLong();
    }

    public MarketplaceThreadUserData(String str, String str2, String str3, String str4, float f, int i, int i2, int i3, long j, boolean z, boolean z2) {
        this.A09 = z;
        this.A0A = z2;
        this.A01 = i;
        this.A05 = str;
        this.A06 = str2;
        this.A07 = str3;
        this.A00 = f;
        this.A02 = i2;
        this.A03 = i3;
        this.A08 = str4;
        this.A04 = j;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof MarketplaceThreadUserData)) {
                return false;
            }
            MarketplaceThreadUserData marketplaceThreadUserData = (MarketplaceThreadUserData) obj;
            if (this.A09 != marketplaceThreadUserData.A09 || this.A0A != marketplaceThreadUserData.A0A || this.A01 != marketplaceThreadUserData.A01 || !11T.A0O(this.A05, marketplaceThreadUserData.A05) || !11T.A0O(this.A06, marketplaceThreadUserData.A06) || !11T.A0O(this.A07, marketplaceThreadUserData.A07) || this.A00 != marketplaceThreadUserData.A00 || this.A02 != marketplaceThreadUserData.A02 || this.A03 != marketplaceThreadUserData.A03 || !11T.A0O(this.A08, marketplaceThreadUserData.A08) || this.A04 != marketplaceThreadUserData.A04) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return C1pq.A01(C1pq.A04(this.A08, (((AbM.A00(C1pq.A04(this.A07, C1pq.A04(this.A06, C1pq.A04(this.A05, (C1pq.A02(C1pq.A05(this.A09), this.A0A) * 31) + this.A01))), this.A00) * 31) + this.A02) * 31) + this.A03), this.A04);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.A09 ? 1 : 0);
        parcel.writeInt(this.A0A ? 1 : 0);
        parcel.writeInt(this.A01);
        1BL.A13(parcel, this.A05);
        1BL.A13(parcel, this.A06);
        1BL.A13(parcel, this.A07);
        parcel.writeFloat(this.A00);
        parcel.writeInt(this.A02);
        parcel.writeInt(this.A03);
        1BL.A13(parcel, this.A08);
        parcel.writeLong(this.A04);
    }
}
