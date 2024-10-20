package com.facebook.graphql.model;

import X.4YV;
import X.AnonymousClass001;
import X.C53v;
import X.FKX;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;

/* loaded from: SponsoredImpression.class */
public final class SponsoredImpression implements Parcelable {
    public static final SponsoredImpression A09 = new SponsoredImpression();
    public static final Parcelable.Creator CREATOR = FKX.A00(84);
    public int A00;
    public int A01;
    public boolean A02;
    public boolean A03;
    public int A04;
    public boolean A05;
    public boolean A06;
    public boolean A07;
    public final List A08;

    public SponsoredImpression() {
        this(0);
        this.A08 = AnonymousClass001.A0s();
        this.A05 = false;
        this.A06 = false;
        this.A04 = 0;
        this.A07 = false;
    }

    public SponsoredImpression(int i) {
        this.A02 = false;
        this.A03 = false;
        this.A01 = 0;
        this.A00 = 0;
    }

    public SponsoredImpression(Parcel parcel) {
        this.A02 = C53v.A0S(parcel);
        this.A03 = C53v.A0S(parcel);
        this.A01 = parcel.readInt();
        this.A00 = parcel.readInt();
        ArrayList A0y = 4YV.A0y(parcel, String.class);
        A0y.getClass();
        this.A08 = A0y;
        this.A05 = C53v.A0S(parcel);
        this.A04 = parcel.readInt();
        this.A06 = C53v.A0S(parcel);
        this.A07 = C53v.A0S(parcel);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.A02 ? 1 : 0);
        parcel.writeInt(this.A03 ? 1 : 0);
        parcel.writeInt(this.A01);
        parcel.writeInt(this.A00);
        parcel.writeList(this.A08);
        parcel.writeInt(this.A05 ? 1 : 0);
        parcel.writeInt(this.A04);
        parcel.writeInt(this.A06 ? 1 : 0);
        parcel.writeInt(this.A07 ? 1 : 0);
    }
}
