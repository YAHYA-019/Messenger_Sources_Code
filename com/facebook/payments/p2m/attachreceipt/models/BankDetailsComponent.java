package com.facebook.payments.p2m.attachreceipt.models;

import X.11T;
import X.1BL;
import X.1Du;
import X.4YV;
import X.AbI;
import X.C1pq;
import X.FKZ;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.common.collect.ImmutableList;

/* loaded from: BankDetailsComponent.class */
public final class BankDetailsComponent implements Parcelable {
    public static final Parcelable.Creator CREATOR = FKZ.A00(65);
    public final ImmutableList A00;
    public final String A01;
    public final String A02;

    public BankDetailsComponent(Parcel parcel) {
        ClassLoader A0e = 4YV.A0e(this);
        int readInt = parcel.readInt();
        BankAccountDetail[] bankAccountDetailArr = new BankAccountDetail[readInt];
        int i = 0;
        while (i < readInt) {
            i = AbI.A01(parcel, A0e, bankAccountDetailArr, i);
        }
        this.A00 = ImmutableList.copyOf(bankAccountDetailArr);
        this.A01 = parcel.readString();
        this.A02 = parcel.readString();
    }

    public BankDetailsComponent(ImmutableList immutableList, String str, String str2) {
        this.A00 = immutableList;
        C1pq.A08("componentSubTitle", str);
        this.A01 = str;
        this.A02 = str2;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof BankDetailsComponent)) {
                return false;
            }
            BankDetailsComponent bankDetailsComponent = (BankDetailsComponent) obj;
            if (!11T.A0O(this.A00, bankDetailsComponent.A00) || !11T.A0O(this.A01, bankDetailsComponent.A01) || !11T.A0O(this.A02, bankDetailsComponent.A02)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return C1pq.A04(this.A02, C1pq.A04(this.A01, C1pq.A03(this.A00)));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        1Du A0b = 1BL.A0b(parcel, this.A00);
        while (A0b.hasNext()) {
            parcel.writeParcelable((BankAccountDetail) A0b.next(), i);
        }
        parcel.writeString(this.A01);
        parcel.writeString(this.A02);
    }
}
