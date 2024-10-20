package com.facebook.fblibraries.fblogin;

import X.1BL;
import X.AnonymousClass001;
import X.C4Ny;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.HashMap;
import java.util.Map;

/* loaded from: FirstPartySsoSessionInfo.class */
public final class FirstPartySsoSessionInfo implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C4Ny(1);
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public final SsoSource A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final String A09;
    public final Map A0A;

    public FirstPartySsoSessionInfo(Parcel parcel) {
        this.A04 = (SsoSource) 1BL.A0C(parcel, SsoSource.class);
        this.A08 = parcel.readString();
        this.A06 = parcel.readString();
        this.A05 = parcel.readString();
        this.A09 = parcel.readString();
        this.A07 = parcel.readString();
        HashMap A0u = AnonymousClass001.A0u();
        this.A0A = A0u;
        parcel.readMap(A0u, Map.class.getClassLoader());
    }

    public FirstPartySsoSessionInfo(SsoSource ssoSource, String str, String str2, String str3, String str4, String str5, Map map) {
        this.A04 = ssoSource;
        this.A08 = str;
        this.A06 = str2;
        this.A05 = str3;
        this.A09 = str4;
        this.A07 = str5;
        this.A0A = map;
    }

    public String A00(String str) {
        Map map = this.A0A;
        if (map == null) {
            return null;
        }
        return (String) map.get(str);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.A04, i);
        parcel.writeString(this.A08);
        parcel.writeString(this.A06);
        parcel.writeString(this.A05);
        parcel.writeString(this.A09);
        parcel.writeString(this.A07);
        parcel.writeMap(this.A0A);
    }
}
