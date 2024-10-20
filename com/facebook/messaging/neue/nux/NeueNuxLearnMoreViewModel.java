package com.facebook.messaging.neue.nux;

import X.0S2;
import X.4YW;
import X.AnonymousClass001;
import X.CST;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: NeueNuxLearnMoreViewModel.class */
public final class NeueNuxLearnMoreViewModel implements Parcelable {
    public static final Parcelable.Creator CREATOR = new CST(58);
    public final Integer A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final boolean A04;

    public NeueNuxLearnMoreViewModel(Parcel parcel) {
        this.A03 = parcel.readString();
        this.A02 = parcel.readString();
        this.A04 = 4YW.A0K(parcel);
        String readString = parcel.readString();
        if (!readString.equals("CONTACT_IMPORT")) {
            throw AnonymousClass001.A0L(readString);
        }
        this.A00 = 0S2.A00;
        this.A01 = parcel.readString();
    }

    public NeueNuxLearnMoreViewModel(Integer num, String str, String str2, String str3) {
        this.A03 = str;
        this.A02 = str2;
        this.A04 = true;
        this.A00 = num;
        this.A01 = str3;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A03);
        parcel.writeString(this.A02);
        parcel.writeByte(this.A04 ? (byte) 1 : (byte) 0);
        parcel.writeString("CONTACT_IMPORT");
        parcel.writeString(this.A01);
    }
}
