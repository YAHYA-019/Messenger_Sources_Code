package com.facebook.bugreporter.activity.chooser;

import X.0Pz;
import X.4YW;
import X.C1ic;
import X.DKf;
import X.ENN;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: ChooserOption.class */
public final class ChooserOption implements Parcelable {
    public static final String A06;
    public static final String A07;
    public static final String A08;
    public static final String A09;
    public static final Parcelable.Creator CREATOR;
    public final int A00;
    public final int A01;
    public final ENN A02;
    public final String A03;
    public final boolean A04;
    public final int A05;

    static {
        String str = C1ic.A18;
        A09 = 0Pz.A0W(str, "m4a_learn_to_report_chat");
        A07 = 0Pz.A0W(str, "bugreport");
        A08 = 0Pz.A0W(str, "internsettings");
        A06 = 0Pz.A0W(str, "adhocqueries");
        CREATOR = DKf.A00(65);
    }

    public ChooserOption(ENN enn, String str, int i, int i2) {
        this.A01 = i;
        this.A00 = i2;
        this.A03 = str;
        this.A02 = enn;
        this.A04 = false;
        this.A05 = 0;
    }

    public ChooserOption(Parcel parcel) {
        this.A01 = parcel.readInt();
        this.A00 = parcel.readInt();
        this.A03 = parcel.readString();
        this.A02 = parcel.readSerializable();
        this.A04 = 4YW.A0K(parcel);
        this.A05 = parcel.readInt();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.A01);
        parcel.writeInt(this.A00);
        parcel.writeString(this.A03);
        parcel.writeSerializable(this.A02);
        parcel.writeByte(this.A04 ? (byte) 1 : (byte) 0);
        parcel.writeInt(this.A05);
    }
}
