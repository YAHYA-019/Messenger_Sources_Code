package com.facebook.composer.mediaeffect.model;

import X.11T;
import X.1BL;
import X.4YV;
import X.AbN;
import X.C1pq;
import X.C3o5;
import X.FKX;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: ComposerMediaTemplate.class */
public final class ComposerMediaTemplate implements Parcelable {
    public static final Parcelable.Creator CREATOR = FKX.A00(3);
    public final int A00;
    public final int A01;
    public final ComposerSparkARData A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final String A09;
    public final String A0A;
    public final boolean A0B;

    public ComposerMediaTemplate(Parcel parcel) {
        ClassLoader A0e = 4YV.A0e(this);
        this.A03 = parcel.readString();
        this.A0B = AbN.A1U(parcel);
        String str = null;
        if (parcel.readInt() == 0) {
            this.A02 = null;
        } else {
            this.A02 = (ComposerSparkARData) parcel.readParcelable(A0e);
        }
        if (parcel.readInt() == 0) {
            this.A04 = null;
        } else {
            this.A04 = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A05 = null;
        } else {
            this.A05 = parcel.readString();
        }
        this.A00 = parcel.readInt();
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
        this.A01 = parcel.readInt();
        this.A09 = parcel.readInt() != 0 ? parcel.readString() : str;
        this.A0A = C3o5.A0O(parcel);
    }

    public ComposerMediaTemplate(ComposerSparkARData composerSparkARData, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, int i, int i2, boolean z) {
        C1pq.A08("accessibilityText", str);
        this.A03 = str;
        this.A0B = z;
        this.A02 = composerSparkARData;
        this.A04 = str2;
        this.A05 = str3;
        this.A00 = i;
        this.A06 = str4;
        this.A07 = str5;
        this.A08 = str6;
        this.A01 = i2;
        this.A09 = str7;
        this.A0A = str8;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof ComposerMediaTemplate)) {
                return false;
            }
            ComposerMediaTemplate composerMediaTemplate = (ComposerMediaTemplate) obj;
            if (!11T.A0O(this.A03, composerMediaTemplate.A03) || this.A0B != composerMediaTemplate.A0B || !11T.A0O(this.A02, composerMediaTemplate.A02) || !11T.A0O(this.A04, composerMediaTemplate.A04) || !11T.A0O(this.A05, composerMediaTemplate.A05) || this.A00 != composerMediaTemplate.A00 || !11T.A0O(this.A06, composerMediaTemplate.A06) || !11T.A0O(this.A07, composerMediaTemplate.A07) || !11T.A0O(this.A08, composerMediaTemplate.A08) || this.A01 != composerMediaTemplate.A01 || !11T.A0O(this.A09, composerMediaTemplate.A09) || !11T.A0O(this.A0A, composerMediaTemplate.A0A)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return C1pq.A04(this.A0A, C1pq.A04(this.A09, (C1pq.A04(this.A08, C1pq.A04(this.A07, C1pq.A04(this.A06, (C1pq.A04(this.A05, C1pq.A04(this.A04, C1pq.A04(this.A02, C1pq.A02(C1pq.A03(this.A03), this.A0B)))) * 31) + this.A00))) * 31) + this.A01));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A03);
        parcel.writeInt(this.A0B ? 1 : 0);
        C3o5.A0d(parcel, this.A02, i);
        1BL.A13(parcel, this.A04);
        1BL.A13(parcel, this.A05);
        parcel.writeInt(this.A00);
        1BL.A13(parcel, this.A06);
        1BL.A13(parcel, this.A07);
        1BL.A13(parcel, this.A08);
        parcel.writeInt(this.A01);
        1BL.A13(parcel, this.A09);
        1BL.A13(parcel, this.A0A);
    }
}
