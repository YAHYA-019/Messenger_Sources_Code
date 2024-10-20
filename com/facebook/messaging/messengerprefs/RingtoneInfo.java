package com.facebook.messaging.messengerprefs;

import X.11T;
import X.7zU;
import X.C1pq;
import X.CSV;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;

/* loaded from: RingtoneInfo.class */
public final class RingtoneInfo implements Parcelable {
    public static final Parcelable.Creator CREATOR = new CSV(42);
    public final String A00;
    public final String A01;
    public final String A02;

    public RingtoneInfo(Parcel parcel) {
        this.A00 = 7zU.A0l(parcel, this);
        this.A01 = parcel.readString();
        this.A02 = parcel.readString();
    }

    public RingtoneInfo(String str, String str2, String str3) {
        C1pq.A08(PublicKeyCredentialControllerUtility.JSON_KEY_DISPLAY_NAME, str);
        this.A00 = str;
        this.A01 = str2;
        this.A02 = str3;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof RingtoneInfo)) {
                return false;
            }
            RingtoneInfo ringtoneInfo = (RingtoneInfo) obj;
            if (!11T.A0O(this.A00, ringtoneInfo.A00) || !11T.A0O(this.A01, ringtoneInfo.A01) || !11T.A0O(this.A02, ringtoneInfo.A02)) {
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
        parcel.writeString(this.A00);
        parcel.writeString(this.A01);
        parcel.writeString(this.A02);
    }
}
