package com.facebook.payments.form.model;

import X.AbN;
import X.FKZ;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.common.collect.ImmutableList;

/* loaded from: FormRowDefinition.class */
public final class FormRowDefinition implements Parcelable {
    public static final Parcelable.Creator CREATOR = FKZ.A00(50);
    public final ImmutableList A00;

    public FormRowDefinition(Parcel parcel) {
        this.A00 = AbN.A0e(parcel, FormFieldAttributes.class);
    }

    public FormRowDefinition(ImmutableList immutableList) {
        this.A00 = immutableList;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeList(this.A00);
    }
}
