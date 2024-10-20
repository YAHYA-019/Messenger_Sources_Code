package com.facebook.messaging.encryptedbackups.onetimecode.restoreflow.model;

import X.11T;
import X.1BK;
import X.4YV;
import X.7zL;
import X.7zM;
import X.7zN;
import X.7zV;
import X.AnonymousClass001;
import X.C04v;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: DeviceInfo.class */
public final class DeviceInfo extends C04v implements Parcelable {
    public static final Parcelable.Creator CREATOR = 7zL.A0v(51);
    public final String A00;
    public final Long A01;
    public final String A02;
    public final String A03;

    public DeviceInfo(Long l, String str, String str2, String str3) {
        1BK.A1K(str, 1, str3);
        this.A00 = str;
        this.A01 = l;
        this.A03 = str2;
        this.A02 = str3;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof DeviceInfo)) {
                return false;
            }
            DeviceInfo deviceInfo = (DeviceInfo) obj;
            if (!11T.A0O(this.A00, deviceInfo.A00) || !11T.A0O(this.A01, deviceInfo.A01) || !11T.A0O(this.A03, deviceInfo.A03) || !11T.A0O(this.A02, deviceInfo.A02)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return 7zM.A05(this.A02, (((4YV.A02(this.A00) + AnonymousClass001.A02(this.A01)) * 31) + 7zN.A05(this.A03)) * 31);
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("DeviceInfo(name=");
        A0k.append(this.A00);
        A0k.append(", lastTimeSeenMillis=");
        A0k.append(this.A01);
        A0k.append(", location=");
        A0k.append(this.A03);
        A0k.append(", deviceId=");
        A0k.append(this.A02);
        return 4YV.A0x(A0k);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        11T.A0F(parcel, 0);
        parcel.writeString(this.A00);
        7zV.A0m(parcel, this.A01);
        parcel.writeString(this.A03);
        parcel.writeString(this.A02);
    }
}
