package com.facebook.fbavatar.logging;

import X.11T;
import X.1BL;
import X.FIl;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* loaded from: AvatarScubaLoggerParams.class */
public final class AvatarScubaLoggerParams implements Parcelable {
    public String A00;
    public String A01;
    public String A02;
    public String A03;

    public AvatarScubaLoggerParams(String str, String str2, String str3, String str4) {
        this.A01 = str2;
        this.A00 = str;
        this.A03 = str4;
        this.A02 = str3;
    }

    public static void A00(FIl fIl, String str, String str2) {
        AvatarScubaLoggerParams avatarScubaLoggerParams = fIl.A00;
        FIl.A05(fIl, str, str2, avatarScubaLoggerParams.A01, avatarScubaLoggerParams.A00);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || !1BL.A1V(this, obj)) {
                return false;
            }
            AvatarScubaLoggerParams avatarScubaLoggerParams = (AvatarScubaLoggerParams) obj;
            if (!11T.A0O(this.A01, avatarScubaLoggerParams.A01) || !11T.A0O(this.A00, avatarScubaLoggerParams.A00) || !11T.A0O(this.A03, avatarScubaLoggerParams.A03) || !11T.A0O(this.A02, avatarScubaLoggerParams.A02)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.A01, this.A00, this.A03, this.A02});
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        11T.A0F(parcel, 0);
        parcel.writeString(this.A01);
        parcel.writeString(this.A00);
        parcel.writeString(this.A03);
        parcel.writeString(this.A02);
    }
}
