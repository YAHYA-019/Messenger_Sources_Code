package com.facebook.messaging.search.capsection;

import X.11T;
import X.1BJ;
import X.1BM;
import X.AbJ;
import X.AnonymousClass001;
import X.C1pq;
import X.C3o5;
import X.CSS;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: CapSectionParam.class */
public final class CapSectionParam implements Parcelable {
    public static final Parcelable.Creator CREATOR = CSS.A00(64);
    public final int A00;
    public final int A01;
    public final int A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final boolean A07;
    public final boolean A08;
    public final boolean A09;
    public final boolean A0A;

    public CapSectionParam(Parcel parcel) {
        this.A00 = C3o5.A01(parcel, this);
        this.A01 = parcel.readInt();
        this.A03 = parcel.readString();
        this.A04 = parcel.readString();
        this.A05 = parcel.readString();
        this.A07 = AnonymousClass001.A1Q(parcel.readInt(), 1);
        this.A08 = 1BM.A07(parcel);
        this.A09 = 1BM.A07(parcel);
        this.A0A = AbJ.A1W(parcel);
        this.A02 = parcel.readInt();
        this.A06 = parcel.readString();
    }

    public CapSectionParam(String str, String str2, String str3, String str4, int i, boolean z, boolean z2) {
        this.A00 = 0;
        this.A01 = 0;
        C1pq.A08(1BJ.A00(1591), str);
        this.A03 = str;
        C1pq.A08("searchQuery", str2);
        this.A04 = str2;
        C1pq.A08(1BJ.A00(2022), str3);
        this.A05 = str3;
        this.A07 = z;
        this.A08 = false;
        this.A09 = z2;
        this.A0A = true;
        this.A02 = i;
        C1pq.A08(1BJ.A00(2098), str4);
        this.A06 = str4;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof CapSectionParam)) {
                return false;
            }
            CapSectionParam capSectionParam = (CapSectionParam) obj;
            if (this.A00 != capSectionParam.A00 || this.A01 != capSectionParam.A01 || !11T.A0O(this.A03, capSectionParam.A03) || !11T.A0O(this.A04, capSectionParam.A04) || !11T.A0O(this.A05, capSectionParam.A05) || this.A07 != capSectionParam.A07 || this.A08 != capSectionParam.A08 || this.A09 != capSectionParam.A09 || this.A0A != capSectionParam.A0A || this.A02 != capSectionParam.A02 || !11T.A0O(this.A06, capSectionParam.A06)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return C1pq.A04(this.A06, (C1pq.A02(C1pq.A02(C1pq.A02(C1pq.A02(C1pq.A04(this.A05, C1pq.A04(this.A04, C1pq.A04(this.A03, ((this.A00 + 31) * 31) + this.A01))), this.A07), this.A08), this.A09), this.A0A) * 31) + this.A02);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.A00);
        parcel.writeInt(this.A01);
        parcel.writeString(this.A03);
        parcel.writeString(this.A04);
        parcel.writeString(this.A05);
        parcel.writeInt(this.A07 ? 1 : 0);
        parcel.writeInt(this.A08 ? 1 : 0);
        parcel.writeInt(this.A09 ? 1 : 0);
        parcel.writeInt(this.A0A ? 1 : 0);
        parcel.writeInt(this.A02);
        parcel.writeString(this.A06);
    }
}
