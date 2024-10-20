package com.facebook.messaging.integrity.frx.messagepicker.model;

import X.0Pz;
import X.11T;
import X.1BL;
import X.4YV;
import X.7zL;
import X.7zN;
import X.7zR;
import X.AnonymousClass002;
import X.C04v;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: MessagePickerPageData.class */
public final class MessagePickerPageData extends C04v implements Parcelable {
    public final String A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public static final Parcelable.Creator CREATOR = 7zL.A0v(85);
    public static final MessagePickerPageData A04 = new MessagePickerPageData("", null, "", null);

    public MessagePickerPageData(String str, String str2, String str3, String str4) {
        7zR.A1N(str, str3);
        this.A02 = str;
        this.A03 = str2;
        this.A01 = str3;
        this.A00 = str4;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof MessagePickerPageData)) {
                return false;
            }
            MessagePickerPageData messagePickerPageData = (MessagePickerPageData) obj;
            if (!11T.A0O(this.A02, messagePickerPageData.A02) || !11T.A0O(this.A03, messagePickerPageData.A03) || !11T.A0O(this.A01, messagePickerPageData.A01) || !11T.A0O(this.A00, messagePickerPageData.A00)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass002.A07(this.A01, (4YV.A02(this.A02) + 1BL.A05(this.A03)) * 31) + 7zN.A05(this.A00);
    }

    public String toString() {
        return 0Pz.A14("MessagePickerPageData(headerTitle=", this.A02, ", titleActionText=", this.A03, ", buttonText=", this.A01, ", adminText=", this.A00, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        11T.A0F(parcel, 0);
        parcel.writeString(this.A02);
        parcel.writeString(this.A03);
        parcel.writeString(this.A01);
        parcel.writeString(this.A00);
    }
}
