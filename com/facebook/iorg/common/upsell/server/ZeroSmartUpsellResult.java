package com.facebook.iorg.common.upsell.server;

import X.4YW;
import X.AnonymousClass001;
import X.FKc;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.Collection;

/* loaded from: ZeroSmartUpsellResult.class */
public final class ZeroSmartUpsellResult implements Parcelable {
    public static final Parcelable.Creator CREATOR = FKc.A00(84);
    public final ImmutableList A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final boolean A04;

    public ZeroSmartUpsellResult() {
        ImmutableList of = ImmutableList.of();
        this.A03 = "";
        this.A01 = "";
        this.A02 = "";
        this.A04 = false;
        this.A00 = of;
    }

    public ZeroSmartUpsellResult(Parcel parcel) {
        this.A03 = parcel.readString();
        this.A01 = parcel.readString();
        this.A02 = parcel.readString();
        this.A04 = 4YW.A0K(parcel);
        ArrayList A0s = AnonymousClass001.A0s();
        parcel.readTypedList(A0s, ZeroSmartUpsellButton.CREATOR);
        this.A00 = ImmutableList.copyOf((Collection) A0s);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A03);
        parcel.writeString(this.A01);
        parcel.writeString(this.A02);
        parcel.writeByte(this.A04 ? (byte) 1 : (byte) 0);
        parcel.writeTypedList(this.A00);
    }
}
