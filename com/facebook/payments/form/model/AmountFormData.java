package com.facebook.payments.form.model;

import X.11T;
import X.1BL;
import X.1BM;
import X.4YV;
import X.AbJ;
import X.AnonymousClass001;
import X.C1pq;
import X.C3o5;
import X.DKF;
import X.FKZ;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.payments.currency.CurrencyAmount;

/* loaded from: AmountFormData.class */
public final class AmountFormData implements Parcelable, PaymentsFormData {
    public static final Parcelable.Creator CREATOR = FKZ.A00(47);
    public final CurrencyAmount A00;
    public final CurrencyAmount A01;
    public final FormFieldAttributes A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final boolean A07;
    public final boolean A08;
    public final boolean A09;

    public AmountFormData(Parcel parcel) {
        ClassLoader A0e = 4YV.A0e(this);
        this.A03 = parcel.readString();
        String str = null;
        if (parcel.readInt() == 0) {
            this.A02 = null;
        } else {
            this.A02 = (FormFieldAttributes) parcel.readParcelable(A0e);
        }
        if (parcel.readInt() == 0) {
            this.A04 = null;
        } else {
            this.A04 = parcel.readString();
        }
        this.A07 = AnonymousClass001.A1Q(parcel.readInt(), 1);
        if (parcel.readInt() == 0) {
            this.A00 = null;
        } else {
            this.A00 = (CurrencyAmount) parcel.readParcelable(A0e);
        }
        if (parcel.readInt() == 0) {
            this.A01 = null;
        } else {
            this.A01 = (CurrencyAmount) parcel.readParcelable(A0e);
        }
        this.A05 = parcel.readInt() != 0 ? parcel.readString() : str;
        this.A08 = 1BM.A07(parcel);
        this.A09 = AbJ.A1W(parcel);
        this.A06 = C3o5.A0O(parcel);
    }

    public AmountFormData(CurrencyAmount currencyAmount, CurrencyAmount currencyAmount2, FormFieldAttributes formFieldAttributes, String str, String str2, String str3, String str4, boolean z, boolean z2, boolean z3) {
        C1pq.A08("currency", str);
        this.A03 = str;
        this.A02 = formFieldAttributes;
        this.A04 = str2;
        this.A07 = z;
        this.A00 = currencyAmount;
        this.A01 = currencyAmount2;
        this.A05 = str3;
        this.A08 = z2;
        this.A09 = z3;
        this.A06 = str4;
        formFieldAttributes.getClass();
        String str5 = this.A03;
        CurrencyAmount currencyAmount3 = this.A01;
        CurrencyAmount currencyAmount4 = this.A00;
        if (currencyAmount3 != null) {
            DKF.A1X(str5, currencyAmount3.A00);
        }
        if (currencyAmount4 != null) {
            DKF.A1X(str5, currencyAmount4.A00);
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof AmountFormData)) {
                return false;
            }
            AmountFormData amountFormData = (AmountFormData) obj;
            if (!11T.A0O(this.A03, amountFormData.A03) || !11T.A0O(this.A02, amountFormData.A02) || !11T.A0O(this.A04, amountFormData.A04) || this.A07 != amountFormData.A07 || !11T.A0O(this.A00, amountFormData.A00) || !11T.A0O(this.A01, amountFormData.A01) || !11T.A0O(this.A05, amountFormData.A05) || this.A08 != amountFormData.A08 || this.A09 != amountFormData.A09 || !11T.A0O(this.A06, amountFormData.A06)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return C1pq.A04(this.A06, C1pq.A02(C1pq.A02(C1pq.A04(this.A05, C1pq.A04(this.A01, C1pq.A04(this.A00, C1pq.A02(C1pq.A04(this.A04, C1pq.A04(this.A02, C1pq.A03(this.A03))), this.A07)))), this.A08), this.A09));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A03);
        C3o5.A0d(parcel, this.A02, i);
        1BL.A13(parcel, this.A04);
        parcel.writeInt(this.A07 ? 1 : 0);
        C3o5.A0d(parcel, this.A00, i);
        C3o5.A0d(parcel, this.A01, i);
        1BL.A13(parcel, this.A05);
        parcel.writeInt(this.A08 ? 1 : 0);
        parcel.writeInt(this.A09 ? 1 : 0);
        1BL.A13(parcel, this.A06);
    }
}
