package com.encryptedbackups.storagemanagers.otc.model;

import X.11T;
import X.1BL;
import X.4YV;
import X.7zN;
import X.AnonymousClass001;
import X.LGo;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: OneTimeCodeDevice.class */
public final class OneTimeCodeDevice implements Parcelable {
    public static final Parcelable.Creator CREATOR = new LGo(47);
    public final String A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;

    public OneTimeCodeDevice(String str, String str2, String str3, String str4, String str5) {
        11T.A0F(str, 1);
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
            if (!(obj instanceof OneTimeCodeDevice)) {
                return false;
            }
            OneTimeCodeDevice oneTimeCodeDevice = (OneTimeCodeDevice) obj;
            if (!11T.A0O(this.A00, oneTimeCodeDevice.A00) || !11T.A0O(this.A01, oneTimeCodeDevice.A01) || !11T.A0O(this.A02, oneTimeCodeDevice.A02) || !11T.A0O(this.A03, oneTimeCodeDevice.A03) || !11T.A0O(this.A04, oneTimeCodeDevice.A04)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return ((((((4YV.A02(this.A00) + 1BL.A05(this.A01)) * 31) + 1BL.A05(this.A02)) * 31) + 1BL.A05(this.A03)) * 31) + 7zN.A05(this.A04);
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("OneTimeCodeDevice(deviceId=");
        A0k.append(this.A00);
        A0k.append(", deviceManufacturer=");
        A0k.append(this.A01);
        A0k.append(", deviceModel=");
        A0k.append(this.A02);
        A0k.append(", lastLoginLocation=");
        A0k.append(this.A03);
        A0k.append(", lastLoginDate=");
        A0k.append(this.A04);
        return 4YV.A0x(A0k);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        11T.A0F(parcel, 0);
        parcel.writeString(this.A00);
        parcel.writeString(this.A01);
        parcel.writeString(this.A02);
        parcel.writeString(this.A03);
        parcel.writeString(this.A04);
    }
}
