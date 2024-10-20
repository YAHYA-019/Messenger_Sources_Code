package com.facebook.fos.headersv2.fb4aorca;

import X.2Go;
import X.82M;
import X.C53v;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* loaded from: HeadersV2ConfigurationRequestParams.class */
public final class HeadersV2ConfigurationRequestParams implements Parcelable {
    public static final Parcelable.Creator CREATOR = new 82M(2);
    public final int A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final boolean A09;
    public final boolean A0A;

    public HeadersV2ConfigurationRequestParams(Parcel parcel) {
        this.A03 = parcel.readString();
        this.A02 = parcel.readString();
        this.A07 = parcel.readString();
        this.A04 = parcel.readString();
        this.A08 = parcel.readString();
        this.A00 = parcel.readInt();
        this.A05 = parcel.readString();
        this.A09 = C53v.A0S(parcel);
        this.A0A = C53v.A0S(parcel);
        this.A01 = parcel.readString();
        this.A06 = parcel.readString();
    }

    public HeadersV2ConfigurationRequestParams(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, boolean z, boolean z2) {
        this.A03 = str;
        this.A02 = str2;
        this.A07 = str3;
        this.A04 = str4;
        this.A08 = str5;
        this.A00 = 4;
        this.A05 = str6;
        this.A09 = z;
        this.A0A = z2;
        this.A01 = str7;
        this.A06 = str8;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return hashCode();
    }

    public boolean equals(Object obj) {
        boolean z = false;
        if (obj instanceof HeadersV2ConfigurationRequestParams) {
            HeadersV2ConfigurationRequestParams headersV2ConfigurationRequestParams = (HeadersV2ConfigurationRequestParams) obj;
            if (this.A03.equals(headersV2ConfigurationRequestParams.A03) && 2Go.A00(this.A02, headersV2ConfigurationRequestParams.A02) && this.A07.equals(headersV2ConfigurationRequestParams.A07) && this.A04.equals(headersV2ConfigurationRequestParams.A04) && this.A08.equals(headersV2ConfigurationRequestParams.A08) && this.A00 == headersV2ConfigurationRequestParams.A00 && 2Go.A00(this.A05, headersV2ConfigurationRequestParams.A05) && this.A09 == headersV2ConfigurationRequestParams.A09 && this.A0A == headersV2ConfigurationRequestParams.A0A && 2Go.A00(this.A01, headersV2ConfigurationRequestParams.A01) && this.A06 == headersV2ConfigurationRequestParams.A06) {
                z = true;
            }
        }
        return z;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.A03, this.A02, this.A07, this.A04, this.A08, Integer.valueOf(this.A00), this.A05, Boolean.valueOf(this.A09), Boolean.valueOf(this.A0A), this.A01, this.A06});
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A03);
        parcel.writeString(this.A02);
        parcel.writeString(this.A07);
        parcel.writeString(this.A04);
        parcel.writeString(this.A08);
        parcel.writeInt(this.A00);
        parcel.writeString(this.A05);
        parcel.writeInt(this.A09 ? 1 : 0);
        parcel.writeInt(this.A0A ? 1 : 0);
        parcel.writeString(this.A01);
        parcel.writeString(this.A06);
    }
}
