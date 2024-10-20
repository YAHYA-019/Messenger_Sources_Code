package com.facebook.messaging.wellbeing.harmfulcontent.forward.ratelimit.common.data;

import X.11T;
import X.4YV;
import X.7zM;
import X.7zR;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.C04v;
import X.CSU;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: ForwardRateLimitInfo.class */
public final class ForwardRateLimitInfo extends C04v implements Parcelable {
    public static final Parcelable.Creator CREATOR = CSU.A00(91);
    public final int A00;
    public final String A01;
    public final String A02;

    public ForwardRateLimitInfo(int i, String str, String str2) {
        7zR.A1O(str, str2);
        this.A00 = i;
        this.A01 = str;
        this.A02 = str2;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof ForwardRateLimitInfo)) {
                return false;
            }
            ForwardRateLimitInfo forwardRateLimitInfo = (ForwardRateLimitInfo) obj;
            if (this.A00 != forwardRateLimitInfo.A00 || !11T.A0O(this.A01, forwardRateLimitInfo.A01) || !11T.A0O(this.A02, forwardRateLimitInfo.A02)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return 7zM.A05(this.A02, AnonymousClass002.A07(this.A01, this.A00 * 31));
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("ForwardRateLimitInfo(forwardLimit=");
        A0k.append(this.A00);
        A0k.append(", dialogDescription=");
        A0k.append(this.A01);
        A0k.append(", dialogLearnMoreUrl=");
        A0k.append(this.A02);
        return 4YV.A0x(A0k);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        11T.A0F(parcel, 0);
        parcel.writeInt(this.A00);
        parcel.writeString(this.A01);
        parcel.writeString(this.A02);
    }
}
