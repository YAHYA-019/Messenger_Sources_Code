package com.facebook.payments.form.model;

import X.C53v;
import X.Enu;
import X.FKZ;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: PaymentsFormDecoratorParams.class */
public class PaymentsFormDecoratorParams implements Parcelable {
    public static final Parcelable.Creator CREATOR = FKZ.A00(53);
    public final boolean shouldHideFooter;
    public final boolean shouldHideProgressSpinner;
    public final boolean shouldHideTitleBar;
    public final boolean shouldStripPadding;

    public PaymentsFormDecoratorParams() {
        this.shouldHideFooter = false;
        this.shouldHideProgressSpinner = false;
        this.shouldHideTitleBar = false;
        this.shouldStripPadding = false;
    }

    public PaymentsFormDecoratorParams(Enu enu) {
        this.shouldHideFooter = enu.A00;
        this.shouldHideProgressSpinner = enu.A01;
        this.shouldHideTitleBar = enu.A02;
        this.shouldStripPadding = enu.A03;
    }

    public PaymentsFormDecoratorParams(Parcel parcel) {
        this.shouldHideFooter = C53v.A0S(parcel);
        this.shouldHideProgressSpinner = C53v.A0S(parcel);
        this.shouldHideTitleBar = C53v.A0S(parcel);
        this.shouldStripPadding = C53v.A0S(parcel);
    }

    public PaymentsFormDecoratorParams(boolean z, boolean z2, boolean z3, boolean z4) {
        this.shouldHideFooter = z;
        this.shouldHideProgressSpinner = z2;
        this.shouldHideTitleBar = z3;
        this.shouldStripPadding = z4;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.shouldHideFooter ? 1 : 0);
        parcel.writeInt(this.shouldHideProgressSpinner ? 1 : 0);
        parcel.writeInt(this.shouldHideTitleBar ? 1 : 0);
        parcel.writeInt(this.shouldStripPadding ? 1 : 0);
    }
}
