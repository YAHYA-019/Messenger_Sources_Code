package com.facebook.payments.checkout.configuration.model;

import X.11T;
import X.1BL;
import X.4YV;
import X.AbN;
import X.C1pq;
import X.C3o5;
import X.FKY;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.payments.currency.CurrencyAmount;

/* loaded from: FreeTrialScreenComponent.class */
public final class FreeTrialScreenComponent implements Parcelable {
    public static final Parcelable.Creator CREATOR = FKY.A00(76);
    public final String A00;
    public final String A01;
    public final int A02;
    public final CurrencyAmount A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final boolean A09;

    public FreeTrialScreenComponent(Parcel parcel) {
        ClassLoader A0e = 4YV.A0e(this);
        String str = null;
        if (parcel.readInt() == 0) {
            this.A00 = null;
        } else {
            this.A00 = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A04 = null;
        } else {
            this.A04 = parcel.readString();
        }
        this.A09 = AbN.A1U(parcel);
        this.A05 = parcel.readString();
        this.A06 = parcel.readString();
        if (parcel.readInt() == 0) {
            this.A07 = null;
        } else {
            this.A07 = parcel.readString();
        }
        this.A03 = (CurrencyAmount) parcel.readParcelable(A0e);
        this.A08 = parcel.readInt() != 0 ? parcel.readString() : str;
        this.A02 = parcel.readInt();
        this.A01 = C3o5.A0O(parcel);
    }

    public FreeTrialScreenComponent(CurrencyAmount currencyAmount, String str, String str2, String str3, String str4, String str5, String str6, String str7, int i, boolean z) {
        this.A00 = str;
        this.A04 = str2;
        this.A09 = z;
        C1pq.A08("screenComponentStyle", str3);
        this.A05 = str3;
        this.A06 = str4;
        this.A07 = str5;
        this.A03 = currencyAmount;
        this.A08 = str6;
        this.A02 = i;
        this.A01 = str7;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof FreeTrialScreenComponent)) {
                return false;
            }
            FreeTrialScreenComponent freeTrialScreenComponent = (FreeTrialScreenComponent) obj;
            if (!11T.A0O(this.A00, freeTrialScreenComponent.A00) || !11T.A0O(this.A04, freeTrialScreenComponent.A04) || this.A09 != freeTrialScreenComponent.A09 || !11T.A0O(this.A05, freeTrialScreenComponent.A05) || !11T.A0O(this.A06, freeTrialScreenComponent.A06) || !11T.A0O(this.A07, freeTrialScreenComponent.A07) || !11T.A0O(this.A03, freeTrialScreenComponent.A03) || !11T.A0O(this.A08, freeTrialScreenComponent.A08) || this.A02 != freeTrialScreenComponent.A02 || !11T.A0O(this.A01, freeTrialScreenComponent.A01)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return C1pq.A04(this.A01, (C1pq.A04(this.A08, C1pq.A04(this.A03, C1pq.A04(this.A07, C1pq.A04(this.A06, C1pq.A04(this.A05, C1pq.A02(C1pq.A04(this.A04, C1pq.A03(this.A00)), this.A09)))))) * 31) + this.A02);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        1BL.A13(parcel, this.A00);
        1BL.A13(parcel, this.A04);
        parcel.writeInt(this.A09 ? 1 : 0);
        parcel.writeString(this.A05);
        parcel.writeString(this.A06);
        1BL.A13(parcel, this.A07);
        parcel.writeParcelable(this.A03, i);
        1BL.A13(parcel, this.A08);
        parcel.writeInt(this.A02);
        1BL.A13(parcel, this.A01);
    }
}
