package com.facebook.messaging.phoneconfirmation.protocol;

import X.1BL;
import X.1BM;
import X.AbE;
import X.AbJ;
import X.AnonymousClass001;
import X.CSS;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.auth.protocol.InstagramUserInfo;

/* loaded from: RequestConfirmationCodeParams.class */
public final class RequestConfirmationCodeParams implements Parcelable {
    public static final Parcelable.Creator CREATOR = new CSS(6);
    public final int A00;
    public final InstagramUserInfo A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final boolean A08;
    public final boolean A09;
    public final boolean A0A;
    public final boolean A0B;

    public RequestConfirmationCodeParams(Parcel parcel) {
        this.A0B = AnonymousClass001.A1Q(parcel.readInt(), 1);
        this.A08 = 1BM.A07(parcel);
        this.A04 = parcel.readString();
        this.A05 = parcel.readString();
        this.A03 = parcel.readString();
        this.A02 = parcel.readString();
        this.A07 = parcel.readString();
        this.A06 = parcel.readString();
        this.A01 = (InstagramUserInfo) 1BL.A0C(parcel, InstagramUserInfo.class);
        this.A00 = parcel.readInt();
        this.A0A = 1BM.A07(parcel);
        this.A09 = AbJ.A1W(parcel);
    }

    public RequestConfirmationCodeParams(InstagramUserInfo instagramUserInfo, String str, String str2, String str3, String str4, String str5, String str6, int i, boolean z, boolean z2) {
        this.A04 = str;
        this.A05 = str2;
        this.A03 = str3;
        this.A02 = str4;
        this.A07 = str5;
        this.A06 = str6;
        this.A01 = instagramUserInfo;
        this.A00 = i;
        this.A0B = z;
        this.A08 = z2;
        this.A0A = false;
        this.A09 = false;
    }

    public static RequestConfirmationCodeParams A00(String str, String str2, String str3, String str4, String str5, int i) {
        return new RequestConfirmationCodeParams(null, str, "", str2, str3, (AbE.A00(184).equals(str4) || "messenger_android_pna".equals(str4) || "messenger_android_pna_device_prefill".equals(str4)) ? "messenger_android_promotion" : "messenger_android_nux", str5, i, false, true);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.A0B ? 1 : 0);
        parcel.writeInt(this.A08 ? 1 : 0);
        parcel.writeString(this.A04);
        parcel.writeString(this.A05);
        parcel.writeString(this.A03);
        parcel.writeString(this.A02);
        parcel.writeString(this.A07);
        parcel.writeString(this.A06);
        parcel.writeParcelable(this.A01, i);
        parcel.writeInt(this.A00);
        parcel.writeInt(this.A0A ? 1 : 0);
        parcel.writeInt(this.A09 ? 1 : 0);
    }
}
