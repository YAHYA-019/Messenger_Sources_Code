package com.facebook.messaging.fxcal.identity.model;

import X.11T;
import X.1BL;
import X.1BM;
import X.AbJ;
import X.AnonymousClass001;
import X.C1pq;
import X.C3o5;
import X.CSQ;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: FxImScreenContentModel.class */
public final class FxImScreenContentModel implements Parcelable {
    public static final Parcelable.Creator CREATOR = new CSQ(62);
    public final String A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final String A09;
    public final String A0A;
    public final boolean A0B;
    public final boolean A0C;
    public final boolean A0D;

    public FxImScreenContentModel(Parcel parcel) {
        this.A0B = AnonymousClass001.A1Q(C3o5.A01(parcel, this), 1);
        this.A0C = 1BM.A07(parcel);
        String str = null;
        if (parcel.readInt() == 0) {
            this.A00 = null;
        } else {
            this.A00 = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A01 = null;
        } else {
            this.A01 = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A02 = null;
        } else {
            this.A02 = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A03 = null;
        } else {
            this.A03 = parcel.readString();
        }
        this.A0D = AbJ.A1W(parcel);
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
        this.A09 = parcel.readInt() != 0 ? parcel.readString() : str;
        this.A0A = C3o5.A0O(parcel);
    }

    public FxImScreenContentModel(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, boolean z, boolean z2, boolean z3) {
        this.A0B = z;
        this.A0C = z2;
        this.A00 = str;
        this.A01 = str2;
        this.A02 = str3;
        this.A03 = str4;
        this.A0D = z3;
        this.A04 = str5;
        this.A05 = str6;
        this.A06 = str7;
        this.A07 = str8;
        this.A08 = str9;
        this.A09 = str10;
        this.A0A = str11;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof FxImScreenContentModel)) {
                return false;
            }
            FxImScreenContentModel fxImScreenContentModel = (FxImScreenContentModel) obj;
            if (this.A0B != fxImScreenContentModel.A0B || this.A0C != fxImScreenContentModel.A0C || !11T.A0O(this.A00, fxImScreenContentModel.A00) || !11T.A0O(this.A01, fxImScreenContentModel.A01) || !11T.A0O(this.A02, fxImScreenContentModel.A02) || !11T.A0O(this.A03, fxImScreenContentModel.A03) || this.A0D != fxImScreenContentModel.A0D || !11T.A0O(this.A04, fxImScreenContentModel.A04) || !11T.A0O(this.A05, fxImScreenContentModel.A05) || !11T.A0O(this.A06, fxImScreenContentModel.A06) || !11T.A0O(this.A07, fxImScreenContentModel.A07) || !11T.A0O(this.A08, fxImScreenContentModel.A08) || !11T.A0O(this.A09, fxImScreenContentModel.A09) || !11T.A0O(this.A0A, fxImScreenContentModel.A0A)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return C1pq.A04(this.A0A, C1pq.A04(this.A09, C1pq.A04(this.A08, C1pq.A04(this.A07, C1pq.A04(this.A06, C1pq.A04(this.A05, C1pq.A04(this.A04, C1pq.A02(C1pq.A04(this.A03, C1pq.A04(this.A02, C1pq.A04(this.A01, C1pq.A04(this.A00, C1pq.A02(C1pq.A05(this.A0B), this.A0C))))), this.A0D))))))));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.A0B ? 1 : 0);
        parcel.writeInt(this.A0C ? 1 : 0);
        1BL.A13(parcel, this.A00);
        1BL.A13(parcel, this.A01);
        1BL.A13(parcel, this.A02);
        1BL.A13(parcel, this.A03);
        parcel.writeInt(this.A0D ? 1 : 0);
        1BL.A13(parcel, this.A04);
        1BL.A13(parcel, this.A05);
        1BL.A13(parcel, this.A06);
        1BL.A13(parcel, this.A07);
        1BL.A13(parcel, this.A08);
        1BL.A13(parcel, this.A09);
        1BL.A13(parcel, this.A0A);
    }
}
