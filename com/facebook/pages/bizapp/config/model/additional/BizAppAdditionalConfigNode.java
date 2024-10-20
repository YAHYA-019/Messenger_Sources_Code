package com.facebook.pages.bizapp.config.model.additional;

import X.11T;
import X.1BL;
import X.1BM;
import X.AbJ;
import X.AbN;
import X.C1pq;
import X.C3o5;
import X.FKY;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: BizAppAdditionalConfigNode.class */
public final class BizAppAdditionalConfigNode implements Parcelable {
    public static final Parcelable.Creator CREATOR = FKY.A00(26);
    public final long A00;
    public final long A01;
    public final String A02;
    public final Boolean A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final String A09;
    public final String A0A;
    public final String A0B;
    public final String A0C;
    public final String A0D;
    public final String A0E;
    public final boolean A0F;

    public BizAppAdditionalConfigNode(Parcel parcel) {
        String str = null;
        if (C3o5.A01(parcel, this) == 0) {
            this.A04 = null;
        } else {
            this.A04 = parcel.readString();
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
            this.A03 = null;
        } else {
            this.A03 = Boolean.valueOf(1BM.A07(parcel));
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
        this.A00 = parcel.readLong();
        if (parcel.readInt() == 0) {
            this.A0A = null;
        } else {
            this.A0A = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A0B = null;
        } else {
            this.A0B = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A0C = null;
        } else {
            this.A0C = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A0D = null;
        } else {
            this.A0D = parcel.readString();
        }
        this.A02 = parcel.readInt() != 0 ? parcel.readString() : str;
        this.A01 = parcel.readLong();
        this.A0E = C3o5.A0O(parcel);
        this.A0F = AbJ.A1W(parcel);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof BizAppAdditionalConfigNode)) {
                return false;
            }
            BizAppAdditionalConfigNode bizAppAdditionalConfigNode = (BizAppAdditionalConfigNode) obj;
            if (!11T.A0O(this.A04, bizAppAdditionalConfigNode.A04) || !11T.A0O(this.A05, bizAppAdditionalConfigNode.A05) || !11T.A0O(this.A06, bizAppAdditionalConfigNode.A06) || !11T.A0O(this.A03, bizAppAdditionalConfigNode.A03) || !11T.A0O(this.A07, bizAppAdditionalConfigNode.A07) || !11T.A0O(this.A08, bizAppAdditionalConfigNode.A08) || !11T.A0O(this.A09, bizAppAdditionalConfigNode.A09) || this.A00 != bizAppAdditionalConfigNode.A00 || !11T.A0O(this.A0A, bizAppAdditionalConfigNode.A0A) || !11T.A0O(this.A0B, bizAppAdditionalConfigNode.A0B) || !11T.A0O(this.A0C, bizAppAdditionalConfigNode.A0C) || !11T.A0O(this.A0D, bizAppAdditionalConfigNode.A0D) || !11T.A0O(this.A02, bizAppAdditionalConfigNode.A02) || this.A01 != bizAppAdditionalConfigNode.A01 || !11T.A0O(this.A0E, bizAppAdditionalConfigNode.A0E) || this.A0F != bizAppAdditionalConfigNode.A0F) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return C1pq.A02(C1pq.A04(this.A0E, C1pq.A01(C1pq.A04(this.A02, C1pq.A04(this.A0D, C1pq.A04(this.A0C, C1pq.A04(this.A0B, C1pq.A04(this.A0A, C1pq.A01(C1pq.A04(this.A09, C1pq.A04(this.A08, C1pq.A04(this.A07, C1pq.A04(this.A03, C1pq.A04(this.A06, C1pq.A04(this.A05, C1pq.A03(this.A04))))))), this.A00)))))), this.A01)), this.A0F);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        1BL.A13(parcel, this.A04);
        1BL.A13(parcel, this.A05);
        1BL.A13(parcel, this.A06);
        AbN.A0s(parcel, this.A03);
        1BL.A13(parcel, this.A07);
        1BL.A13(parcel, this.A08);
        1BL.A13(parcel, this.A09);
        parcel.writeLong(this.A00);
        1BL.A13(parcel, this.A0A);
        1BL.A13(parcel, this.A0B);
        1BL.A13(parcel, this.A0C);
        1BL.A13(parcel, this.A0D);
        1BL.A13(parcel, this.A02);
        parcel.writeLong(this.A01);
        1BL.A13(parcel, this.A0E);
        parcel.writeInt(this.A0F ? 1 : 0);
    }
}
