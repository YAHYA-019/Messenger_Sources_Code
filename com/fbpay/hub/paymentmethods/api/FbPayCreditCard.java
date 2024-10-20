package com.fbpay.hub.paymentmethods.api;

import X.11T;
import X.1BL;
import X.1BM;
import X.1Du;
import X.4YV;
import X.7zN;
import X.AbF;
import X.AbH;
import X.AbJ;
import X.AbL;
import X.AbN;
import X.C1pq;
import X.C3o5;
import X.KOm;
import X.LGn;
import android.os.Parcel;
import android.os.Parcelable;
import com.fbpay.hub.contactinfo.address.api.FBPayAddress;
import com.google.common.collect.ImmutableList;

/* loaded from: FbPayCreditCard.class */
public final class FbPayCreditCard implements Parcelable {
    public static final Parcelable.Creator CREATOR = new LGn(16);
    public final KOm A00;
    public final ImmutableList A01;
    public final Boolean A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final String A09;
    public final String A0A;
    public final String A0B;
    public final boolean A0C;
    public final FBPayAddress A0D;
    public final FbPayPaymentDefaultInfo A0E;
    public final String A0F;
    public final String A0G;
    public final String A0H;
    public final boolean A0I;
    public final boolean A0J;

    public FbPayCreditCard(Parcel parcel) {
        ClassLoader A0e = 4YV.A0e(this);
        FbPayPaymentDefaultInfo fbPayPaymentDefaultInfo = null;
        if (parcel.readInt() == 0) {
            this.A0D = null;
        } else {
            this.A0D = (FBPayAddress) FBPayAddress.CREATOR.createFromParcel(parcel);
        }
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
            this.A0F = null;
        } else {
            this.A0F = parcel.readString();
        }
        this.A00 = KOm.values()[parcel.readInt()];
        if (parcel.readInt() == 0) {
            this.A0G = null;
        } else {
            this.A0G = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A03 = null;
        } else {
            this.A03 = parcel.readString();
        }
        this.A04 = parcel.readString();
        this.A05 = parcel.readString();
        this.A06 = parcel.readString();
        this.A0H = parcel.readString();
        if (parcel.readInt() == 0) {
            this.A02 = null;
        } else {
            this.A02 = Boolean.valueOf(1BM.A07(parcel));
        }
        this.A0I = 1BM.A07(parcel);
        this.A0C = 1BM.A07(parcel);
        this.A0J = AbJ.A1W(parcel);
        this.A07 = parcel.readString();
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
            this.A0A = null;
        } else {
            this.A0A = parcel.readString();
        }
        this.A0E = parcel.readInt() != 0 ? (FbPayPaymentDefaultInfo) parcel.readParcelable(A0e) : fbPayPaymentDefaultInfo;
        this.A0B = C3o5.A0O(parcel);
    }

    public FbPayCreditCard(FBPayAddress fBPayAddress, KOm kOm, ImmutableList immutableList, Boolean bool, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, boolean z, boolean z2) {
        this.A0D = fBPayAddress;
        this.A01 = immutableList;
        this.A0F = null;
        C1pq.A08("cardType", kOm);
        this.A00 = kOm;
        this.A0G = str;
        this.A03 = str2;
        this.A04 = str3;
        this.A05 = str4;
        this.A06 = str5;
        AbF.A1T(str6);
        this.A0H = str6;
        this.A02 = bool;
        this.A0I = false;
        this.A0C = z;
        this.A0J = z2;
        this.A07 = str7;
        this.A08 = str8;
        this.A09 = str9;
        this.A0A = str10;
        this.A0E = null;
        this.A0B = str11;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof FbPayCreditCard)) {
                return false;
            }
            FbPayCreditCard fbPayCreditCard = (FbPayCreditCard) obj;
            if (!11T.A0O(this.A0D, fbPayCreditCard.A0D) || !11T.A0O(this.A01, fbPayCreditCard.A01) || !11T.A0O(this.A0F, fbPayCreditCard.A0F) || this.A00 != fbPayCreditCard.A00 || !11T.A0O(this.A0G, fbPayCreditCard.A0G) || !11T.A0O(this.A03, fbPayCreditCard.A03) || !11T.A0O(this.A04, fbPayCreditCard.A04) || !11T.A0O(this.A05, fbPayCreditCard.A05) || !11T.A0O(this.A06, fbPayCreditCard.A06) || !11T.A0O(this.A0H, fbPayCreditCard.A0H) || !11T.A0O(this.A02, fbPayCreditCard.A02) || this.A0I != fbPayCreditCard.A0I || this.A0C != fbPayCreditCard.A0C || this.A0J != fbPayCreditCard.A0J || !11T.A0O(this.A07, fbPayCreditCard.A07) || !11T.A0O(this.A08, fbPayCreditCard.A08) || !11T.A0O(this.A09, fbPayCreditCard.A09) || !11T.A0O(this.A0A, fbPayCreditCard.A0A) || !11T.A0O(this.A0E, fbPayCreditCard.A0E) || !11T.A0O(this.A0B, fbPayCreditCard.A0B)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int A04 = C1pq.A04(this.A0F, C1pq.A04(this.A01, C1pq.A03(this.A0D)));
        return C1pq.A04(this.A0B, C1pq.A04(this.A0E, C1pq.A04(this.A0A, C1pq.A04(this.A09, C1pq.A04(this.A08, C1pq.A04(this.A07, C1pq.A02(C1pq.A02(C1pq.A02(C1pq.A04(this.A02, C1pq.A04(this.A0H, C1pq.A04(this.A06, C1pq.A04(this.A05, C1pq.A04(this.A04, C1pq.A04(this.A03, C1pq.A04(this.A0G, (A04 * 31) + C3o5.A03(this.A00)))))))), this.A0I), this.A0C), this.A0J)))))));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        FBPayAddress fBPayAddress = this.A0D;
        if (fBPayAddress == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            fBPayAddress.writeToParcel(parcel, i);
        }
        ImmutableList immutableList = this.A01;
        if (immutableList == null) {
            parcel.writeInt(0);
        } else {
            1Du A0Y = AbL.A0Y(parcel, immutableList);
            while (A0Y.hasNext()) {
                C3o5.A0h(parcel, A0Y);
            }
        }
        1BL.A13(parcel, this.A0F);
        7zN.A0z(parcel, this.A00);
        1BL.A13(parcel, this.A0G);
        1BL.A13(parcel, this.A03);
        parcel.writeString(this.A04);
        parcel.writeString(this.A05);
        parcel.writeString(this.A06);
        parcel.writeString(this.A0H);
        AbN.A0s(parcel, this.A02);
        parcel.writeInt(this.A0I ? 1 : 0);
        parcel.writeInt(this.A0C ? 1 : 0);
        parcel.writeInt(this.A0J ? 1 : 0);
        parcel.writeString(this.A07);
        1BL.A13(parcel, this.A08);
        1BL.A13(parcel, this.A09);
        1BL.A13(parcel, this.A0A);
        C3o5.A0d(parcel, this.A0E, i);
        1BL.A13(parcel, this.A0B);
    }
}
