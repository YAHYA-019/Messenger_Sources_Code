package com.facebook.payments.p2m.attachreceipt.models;

import X.11T;
import X.1BL;
import X.C1pq;
import X.C3o5;
import X.FKZ;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: BankAccountDetail.class */
public final class BankAccountDetail implements Parcelable {
    public static final Parcelable.Creator CREATOR = FKZ.A00(64);
    public final String A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;

    public BankAccountDetail(Parcel parcel) {
        this.A00 = C3o5.A01(parcel, this) != 0 ? parcel.readString() : null;
        this.A01 = parcel.readString();
        this.A02 = C3o5.A0O(parcel);
        this.A03 = parcel.readString();
        this.A04 = parcel.readString();
    }

    public BankAccountDetail(String str, String str2, String str3, String str4, String str5) {
        this.A00 = str;
        this.A01 = str2;
        this.A02 = str3;
        this.A03 = str4;
        this.A04 = str5;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof BankAccountDetail)) {
                return false;
            }
            BankAccountDetail bankAccountDetail = (BankAccountDetail) obj;
            if (!11T.A0O(this.A00, bankAccountDetail.A00) || !11T.A0O(this.A01, bankAccountDetail.A01) || !11T.A0O(this.A02, bankAccountDetail.A02) || !11T.A0O(this.A03, bankAccountDetail.A03) || !11T.A0O(this.A04, bankAccountDetail.A04)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return C1pq.A04(this.A04, C1pq.A04(this.A03, C1pq.A04(this.A02, C1pq.A04(this.A01, C1pq.A03(this.A00)))));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        1BL.A13(parcel, this.A00);
        parcel.writeString(this.A01);
        1BL.A13(parcel, this.A02);
        parcel.writeString(this.A03);
        parcel.writeString(this.A04);
    }
}
