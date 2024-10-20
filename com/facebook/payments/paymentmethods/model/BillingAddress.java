package com.facebook.payments.paymentmethods.model;

import X.1BL;
import X.FKd;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.common.locale.Country;

/* loaded from: BillingAddress.class */
public class BillingAddress implements Parcelable {
    public static final Parcelable.Creator CREATOR = FKd.A00(53);
    public Country A00;
    public String A01;
    public String A02;
    public String A03;
    public String A04;
    public String A05;
    public final String mZip;

    public BillingAddress() {
        this.mZip = "";
        this.A00 = null;
        this.A01 = null;
        this.A04 = null;
        this.A05 = null;
        this.A02 = null;
        this.A03 = null;
    }

    public BillingAddress(Parcel parcel) {
        this.mZip = parcel.readString();
        this.A00 = (Country) 1BL.A0C(parcel, Country.class);
        this.A01 = parcel.readString();
        this.A04 = parcel.readString();
        this.A05 = parcel.readString();
        this.A02 = parcel.readString();
        this.A03 = parcel.readString();
    }

    public BillingAddress(Country country, String str) {
        this.mZip = str;
        this.A00 = country;
        this.A01 = null;
        this.A04 = null;
        this.A05 = null;
        this.A02 = null;
        this.A03 = null;
    }

    private void setCardHolderName(String str) {
        if (str != null) {
            this.A01 = str;
        }
    }

    private void setCity(String str) {
        if (this.A02 != null) {
            this.A02 = str;
        }
    }

    private void setCountry(String str) {
        if (str != null) {
            this.A00 = Country.A00(null, str);
        }
    }

    private void setState(String str) {
        if (this.A03 != null) {
            this.A03 = str;
        }
    }

    private void setStreet1(String str) {
        if (this.A04 != null) {
            this.A04 = str;
        }
    }

    private void setStreet2(String str) {
        if (this.A05 != null) {
            this.A05 = str;
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.mZip);
        parcel.writeParcelable(this.A00, i);
        parcel.writeString(this.A01);
        parcel.writeString(this.A04);
        parcel.writeString(this.A05);
        parcel.writeString(this.A02);
        parcel.writeString(this.A03);
    }
}
