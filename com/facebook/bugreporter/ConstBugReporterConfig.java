package com.facebook.bugreporter;

import X.4YW;
import X.AnonymousClass001;
import X.DKf;
import X.GKR;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.bugreporter.activity.categorylist.CategoryInfo;
import com.facebook.bugreporter.activity.chooser.ChooserOption;
import com.google.common.collect.ImmutableList;
import java.util.Collection;

/* loaded from: ConstBugReporterConfig.class */
public final class ConstBugReporterConfig implements GKR, Parcelable {
    public static final Parcelable.Creator CREATOR = DKf.A00(63);
    public final ImmutableList A00;
    public final Boolean A01;
    public final String A02;
    public final String A03;
    public final ImmutableList A04;
    public final Boolean A05;
    public final String A06;
    public final boolean A07;
    public final boolean A08;

    public ConstBugReporterConfig(GKR gkr) {
        this.A00 = gkr.AWI();
        this.A04 = gkr.AcZ();
        this.A02 = gkr.Adg();
        this.A03 = gkr.AgY();
        this.A01 = gkr.BRc();
        this.A06 = gkr.B7E();
        this.A05 = gkr.BTz();
        this.A08 = gkr.BAx();
        this.A07 = gkr.B7W();
    }

    public ConstBugReporterConfig(Parcel parcel) {
        this.A00 = ImmutableList.copyOf((Collection) parcel.createTypedArrayList(CategoryInfo.CREATOR));
        this.A04 = ImmutableList.copyOf(parcel.createTypedArray(ChooserOption.CREATOR));
        this.A02 = parcel.readString();
        this.A03 = parcel.readString();
        boolean z = true;
        this.A01 = Boolean.valueOf(AnonymousClass001.A1N(parcel.readByte()));
        this.A06 = parcel.readString();
        this.A05 = Boolean.valueOf(4YW.A0K(parcel));
        this.A08 = 4YW.A0K(parcel);
        this.A07 = parcel.readByte() == 0 ? false : z;
    }

    public ImmutableList AWI() {
        return this.A00;
    }

    public ImmutableList AcZ() {
        return this.A04;
    }

    public String Adg() {
        return this.A02;
    }

    public String AgY() {
        return this.A03;
    }

    public String B7E() {
        return this.A06;
    }

    public boolean B7W() {
        return this.A07;
    }

    public boolean BAx() {
        return this.A08;
    }

    public Boolean BRc() {
        return this.A01;
    }

    public Boolean BTz() {
        return this.A05;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeTypedList(this.A00);
        parcel.writeTypedList(this.A04);
        parcel.writeString(this.A02);
        parcel.writeString(this.A03);
        parcel.writeByte(this.A01.booleanValue() ? (byte) 1 : (byte) 0);
        parcel.writeString(this.A06);
        parcel.writeByte(this.A05.booleanValue() ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.A08 ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.A07 ? (byte) 1 : (byte) 0);
    }
}
