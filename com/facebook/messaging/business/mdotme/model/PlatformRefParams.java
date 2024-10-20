package com.facebook.messaging.business.mdotme.model;

import X.11T;
import X.1BL;
import X.82M;
import X.Brh;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* loaded from: PlatformRefParams.class */
public final class PlatformRefParams implements Parcelable {
    public static final Parcelable.Creator CREATOR = new 82M(22);
    public String A00;
    public String A01;
    public String A02;
    public String A03;

    public PlatformRefParams(Brh brh) {
        this.A00 = brh.A00;
        this.A01 = brh.A01;
        this.A02 = brh.A02;
        this.A03 = brh.A03;
    }

    public PlatformRefParams(String str, String str2) {
        this.A00 = str;
        this.A01 = str2;
        this.A02 = null;
        this.A03 = null;
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
            PlatformRefParams platformRefParams = (PlatformRefParams) obj;
            if (!11T.A0O(this.A00, platformRefParams.A00) || !11T.A0O(this.A01, platformRefParams.A01) || !11T.A0O(this.A02, platformRefParams.A02) || !11T.A0O(this.A03, platformRefParams.A03)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.A00, this.A01, this.A02, this.A03});
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        11T.A0F(parcel, 0);
        parcel.writeString(this.A00);
        parcel.writeString(this.A01);
        parcel.writeString(this.A02);
        parcel.writeString(this.A03);
    }
}
