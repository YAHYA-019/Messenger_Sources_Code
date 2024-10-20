package com.facebook.messaging.model.messages;

import X.CSY;
import X.DJg;
import android.os.Parcel;

/* loaded from: PaymentsSupportCaseProperties.class */
public final class PaymentsSupportCaseProperties extends GenericAdminMessageExtensibleData {
    public static final DJg CREATOR = new CSY(15);
    public String A00;
    public String A01;
    public String A02;
    public String A03;
    public boolean A04;

    public PaymentsSupportCaseProperties(Boolean bool, String str, String str2, String str3, String str4) {
        this.A04 = bool != null ? bool.booleanValue() : false;
        this.A01 = str;
        this.A02 = str2;
        this.A03 = str3;
        this.A00 = str4;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(Boolean.toString(this.A04));
        parcel.writeString(this.A01);
        parcel.writeString(this.A02);
        parcel.writeString(this.A03);
        parcel.writeString(this.A00);
    }
}
