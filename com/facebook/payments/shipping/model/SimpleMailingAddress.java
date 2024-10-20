package com.facebook.payments.shipping.model;

import X.1BL;
import X.C53v;
import X.FKd;
import X.R30;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.common.locale.Country;
import com.facebook.common.locale.LocaleMember;

/* loaded from: SimpleMailingAddress.class */
public class SimpleMailingAddress implements MailingAddress {
    public static final Parcelable.Creator CREATOR = FKd.A00(98);
    public Country A00;
    public final String A01;
    public final String mAddressee;
    public final String mBuilding;
    public final String mCity;
    public final String mCityName;
    public final String mId;
    public final boolean mIsDefault;
    public final String mLabel;
    public final String mPostalCode;
    public final String mRegionName;
    public final String mStreet;

    public SimpleMailingAddress() {
        this.mId = null;
        this.mAddressee = null;
        this.mStreet = null;
        this.mBuilding = null;
        this.mCity = null;
        this.mPostalCode = null;
        this.A00 = null;
        this.mLabel = null;
        this.mCityName = null;
        this.mRegionName = null;
        this.mIsDefault = false;
        this.A01 = null;
    }

    public SimpleMailingAddress(Parcel parcel) {
        this.mId = parcel.readString();
        this.mAddressee = parcel.readString();
        this.mStreet = parcel.readString();
        this.mBuilding = parcel.readString();
        this.mCity = parcel.readString();
        this.mPostalCode = parcel.readString();
        this.A00 = (Country) 1BL.A0C(parcel, Country.class);
        this.mLabel = parcel.readString();
        this.mCityName = parcel.readString();
        this.mRegionName = parcel.readString();
        this.mIsDefault = C53v.A0S(parcel);
        this.A01 = parcel.readString();
    }

    public SimpleMailingAddress(Country country, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, boolean z) {
        this.mId = str5;
        this.mAddressee = str;
        this.mStreet = str10;
        this.mBuilding = str2;
        this.mCity = str3;
        this.mPostalCode = str7;
        this.A00 = country;
        this.mLabel = str6;
        this.mCityName = str4;
        this.mRegionName = str8;
        this.mIsDefault = z;
        this.A01 = str9;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.facebook.payments.shipping.model.MailingAddress
    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            MailingAddress mailingAddress = (MailingAddress) obj;
            SimpleMailingAddress simpleMailingAddress = (SimpleMailingAddress) mailingAddress;
            if (!this.mId.equals(simpleMailingAddress.mId) || !LocaleMember.A02(this, this.mAddressee, this.mStreet, R30.A00(this)).equals(LocaleMember.A02(simpleMailingAddress, simpleMailingAddress.mAddressee, simpleMailingAddress.mStreet, R30.A00(mailingAddress)))) {
                return false;
            }
        }
        return true;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.mId);
        parcel.writeString(this.mAddressee);
        parcel.writeString(this.mStreet);
        parcel.writeString(this.mBuilding);
        parcel.writeString(this.mCity);
        parcel.writeString(this.mPostalCode);
        parcel.writeParcelable(this.A00, i);
        parcel.writeString(this.mLabel);
        parcel.writeString(this.mCityName);
        parcel.writeString(this.mRegionName);
        parcel.writeInt(this.mIsDefault ? 1 : 0);
        parcel.writeString(this.A01);
    }
}
