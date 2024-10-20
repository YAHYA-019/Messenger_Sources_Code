package com.facebook.iorg.common.upsell.server;

import X.1BL;
import X.4YW;
import X.AnonymousClass001;
import X.FKc;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.Collection;

/* loaded from: ZeroRecommendedPromoResult.class */
public final class ZeroRecommendedPromoResult implements Parcelable {
    public static final Parcelable.Creator CREATOR = FKc.A00(82);
    public final ZeroSmartUpsellResult A00;
    public final ImmutableList A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final String A09;
    public final String A0A;
    public final String A0B;
    public final boolean A0C;

    public ZeroRecommendedPromoResult() {
        ImmutableList of = ImmutableList.of();
        this.A09 = null;
        this.A0A = null;
        this.A03 = "";
        this.A07 = null;
        this.A01 = of;
        this.A02 = null;
        this.A04 = null;
        this.A08 = null;
        this.A06 = null;
        this.A0C = false;
        this.A05 = null;
        this.A00 = null;
        this.A0B = null;
    }

    public ZeroRecommendedPromoResult(Parcel parcel) {
        this.A09 = parcel.readString();
        this.A0A = parcel.readString();
        this.A03 = parcel.readString();
        this.A07 = parcel.readString();
        ArrayList A0s = AnonymousClass001.A0s();
        parcel.readTypedList(A0s, UpsellPromo.CREATOR);
        this.A01 = ImmutableList.copyOf((Collection) A0s);
        this.A02 = parcel.readString();
        this.A04 = parcel.readString();
        this.A08 = parcel.readString();
        this.A06 = parcel.readString();
        this.A0C = 4YW.A0K(parcel);
        this.A05 = parcel.readString();
        this.A00 = (ZeroSmartUpsellResult) 1BL.A0C(parcel, ZeroSmartUpsellResult.class);
        this.A0B = parcel.readString();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A09);
        parcel.writeString(this.A0A);
        parcel.writeString(this.A03);
        parcel.writeString(this.A07);
        parcel.writeTypedList(this.A01);
        parcel.writeString(this.A02);
        parcel.writeString(this.A04);
        parcel.writeString(this.A08);
        parcel.writeString(this.A06);
        parcel.writeByte(this.A0C ? (byte) 1 : (byte) 0);
        parcel.writeString(this.A05);
        parcel.writeParcelable(this.A00, 1);
        parcel.writeString(this.A0B);
    }
}
