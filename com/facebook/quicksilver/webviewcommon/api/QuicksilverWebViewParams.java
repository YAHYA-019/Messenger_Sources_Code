package com.facebook.quicksilver.webviewcommon.api;

import X.11T;
import X.FKW;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* loaded from: QuicksilverWebViewParams.class */
public final class QuicksilverWebViewParams implements Parcelable {
    public static final Parcelable.Creator CREATOR = FKW.A00(85);
    public int A00 = 1;
    public String A01;
    public String A02;
    public String A03;
    public String A04;
    public String A05;
    public String A06;
    public String A07;
    public String A08;
    public String A09;
    public String A0A;
    public String A0B;
    public List A0C;
    public List A0D;
    public List A0E;
    public boolean A0F;
    public boolean A0G;
    public boolean A0H;
    public boolean A0I;
    public boolean A0J;
    public boolean A0K;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        11T.A0F(parcel, 0);
        parcel.writeString(this.A08);
        parcel.writeList(this.A0D);
        parcel.writeList(this.A0E);
        parcel.writeList(this.A0C);
        parcel.writeString(this.A09);
        parcel.writeInt(this.A0I ? 1 : 0);
        parcel.writeString(this.A03);
        parcel.writeString(this.A02);
        parcel.writeString(this.A04);
        parcel.writeString(this.A05);
        parcel.writeInt(this.A00);
        parcel.writeInt(this.A0F ? 1 : 0);
        parcel.writeInt(this.A0J ? 1 : 0);
        parcel.writeInt(this.A0H ? 1 : 0);
        parcel.writeInt(this.A0G ? 1 : 0);
        parcel.writeString(this.A01);
        parcel.writeString(this.A06);
        parcel.writeString(this.A07);
        parcel.writeString(this.A0A);
        parcel.writeString(this.A0B);
        parcel.writeInt(this.A0K ? 1 : 0);
    }
}
