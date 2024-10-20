package com.facebook.messaging.business.common.calltoaction.model;

import X.11T;
import X.1BL;
import X.CSW;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.messaging.business.informationidentify.model.PIISinglePage;

/* loaded from: CTAInformationIdentify.class */
public final class CTAInformationIdentify implements Parcelable {
    public static final Parcelable.Creator CREATOR = new CSW(26);
    public final PIISinglePage A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;

    public CTAInformationIdentify(Parcel parcel) {
        this.A05 = parcel.readString();
        this.A03 = parcel.readString();
        this.A04 = parcel.readString();
        this.A02 = parcel.readString();
        this.A01 = parcel.readString();
        this.A00 = (PIISinglePage) 1BL.A0C(parcel, PIISinglePage.class);
    }

    public CTAInformationIdentify(PIISinglePage pIISinglePage, String str, String str2, String str3, String str4, String str5) {
        this.A05 = str5;
        this.A03 = str3;
        this.A04 = str4;
        this.A02 = str2;
        this.A01 = str;
        this.A00 = pIISinglePage;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        11T.A0F(parcel, 0);
        parcel.writeString(this.A05);
        parcel.writeString(this.A03);
        parcel.writeString(this.A04);
        parcel.writeString(this.A02);
        parcel.writeString(this.A01);
        parcel.writeParcelable(this.A00, i);
    }
}
