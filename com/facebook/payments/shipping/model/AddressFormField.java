package com.facebook.payments.shipping.model;

import X.11T;
import X.1BL;
import X.1Du;
import X.4YV;
import X.AbI;
import X.AbL;
import X.C1pq;
import X.C3o5;
import X.FKd;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.common.collect.ImmutableList;

/* loaded from: AddressFormField.class */
public final class AddressFormField implements Parcelable {
    public static final Parcelable.Creator CREATOR = FKd.A00(92);
    public final String A00;
    public final String A01;
    public final ImmutableList A02;
    public final ImmutableList A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final boolean A09;

    public AddressFormField(Parcel parcel) {
        ClassLoader A0e = 4YV.A0e(this);
        String str = null;
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
            this.A00 = null;
        } else {
            this.A00 = parcel.readString();
        }
        int i = 0;
        this.A09 = 4YV.A1U(parcel.readInt());
        if (parcel.readInt() == 0) {
            this.A01 = null;
        } else {
            this.A01 = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A06 = null;
        } else {
            this.A06 = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A02 = null;
        } else {
            int readInt = parcel.readInt();
            PaymentsFormSelectFieldItem[] paymentsFormSelectFieldItemArr = new PaymentsFormSelectFieldItem[readInt];
            int i2 = 0;
            while (i2 < readInt) {
                i2 = AbI.A01(parcel, A0e, paymentsFormSelectFieldItemArr, i2);
            }
            this.A02 = ImmutableList.copyOf(paymentsFormSelectFieldItemArr);
        }
        if (parcel.readInt() == 0) {
            this.A03 = null;
        } else {
            int readInt2 = parcel.readInt();
            PaymentsFormValidationRule[] paymentsFormValidationRuleArr = new PaymentsFormValidationRule[readInt2];
            while (i < readInt2) {
                i = AbI.A01(parcel, A0e, paymentsFormValidationRuleArr, i);
            }
            this.A03 = ImmutableList.copyOf(paymentsFormValidationRuleArr);
        }
        this.A07 = parcel.readInt() != 0 ? parcel.readString() : str;
        this.A08 = C3o5.A0O(parcel);
    }

    public AddressFormField(ImmutableList immutableList, ImmutableList immutableList2, String str, String str2, String str3, String str4, String str5, String str6, String str7, boolean z) {
        this.A04 = str;
        this.A05 = str2;
        this.A00 = str3;
        this.A09 = z;
        this.A01 = str4;
        this.A06 = str5;
        this.A02 = immutableList;
        this.A03 = immutableList2;
        this.A07 = str6;
        this.A08 = str7;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof AddressFormField)) {
                return false;
            }
            AddressFormField addressFormField = (AddressFormField) obj;
            if (!11T.A0O(this.A04, addressFormField.A04) || !11T.A0O(this.A05, addressFormField.A05) || !11T.A0O(this.A00, addressFormField.A00) || this.A09 != addressFormField.A09 || !11T.A0O(this.A01, addressFormField.A01) || !11T.A0O(this.A06, addressFormField.A06) || !11T.A0O(this.A02, addressFormField.A02) || !11T.A0O(this.A03, addressFormField.A03) || !11T.A0O(this.A07, addressFormField.A07) || !11T.A0O(this.A08, addressFormField.A08)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return C1pq.A04(this.A08, C1pq.A04(this.A07, C1pq.A04(this.A03, C1pq.A04(this.A02, C1pq.A04(this.A06, C1pq.A04(this.A01, C1pq.A02(C1pq.A04(this.A00, C1pq.A04(this.A05, C1pq.A03(this.A04))), this.A09)))))));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        1BL.A13(parcel, this.A04);
        1BL.A13(parcel, this.A05);
        1BL.A13(parcel, this.A00);
        parcel.writeInt(this.A09 ? 1 : 0);
        1BL.A13(parcel, this.A01);
        1BL.A13(parcel, this.A06);
        ImmutableList immutableList = this.A02;
        if (immutableList == null) {
            parcel.writeInt(0);
        } else {
            1Du A0Y = AbL.A0Y(parcel, immutableList);
            while (A0Y.hasNext()) {
                parcel.writeParcelable((PaymentsFormSelectFieldItem) A0Y.next(), i);
            }
        }
        ImmutableList immutableList2 = this.A03;
        if (immutableList2 == null) {
            parcel.writeInt(0);
        } else {
            1Du A0Y2 = AbL.A0Y(parcel, immutableList2);
            while (A0Y2.hasNext()) {
                parcel.writeParcelable((PaymentsFormValidationRule) A0Y2.next(), i);
            }
        }
        1BL.A13(parcel, this.A07);
        1BL.A13(parcel, this.A08);
    }
}
