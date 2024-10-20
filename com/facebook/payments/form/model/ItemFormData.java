package com.facebook.payments.form.model;

import X.1BK;
import X.1BL;
import X.C53v;
import X.DKD;
import X.FKZ;
import X.QRk;
import X.Quo;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.payments.model.FormFieldProperty;
import com.facebook.payments.ui.MediaGridTextLayoutParams;
import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableMap;

/* loaded from: ItemFormData.class */
public final class ItemFormData implements PaymentsFormData {
    public static final Parcelable.Creator CREATOR = FKZ.A00(51);
    public final int A00;
    public final int A01;
    public final Parcelable A02;
    public final MediaGridTextLayoutParams A03;
    public final ImmutableMap A04;

    public ItemFormData(Parcel parcel) {
        this.A01 = parcel.readInt();
        this.A00 = parcel.readInt();
        this.A03 = (MediaGridTextLayoutParams) 1BL.A0C(parcel, QRk.class);
        this.A02 = 1BL.A0C(parcel, getClass());
        this.A04 = C53v.A05(parcel);
    }

    public ItemFormData(Parcelable parcelable, MediaGridTextLayoutParams mediaGridTextLayoutParams, ImmutableMap immutableMap, int i, int i2) {
        this.A01 = i2;
        this.A00 = i;
        this.A03 = mediaGridTextLayoutParams;
        this.A02 = parcelable;
        this.A04 = immutableMap;
        boolean z = true;
        Preconditions.checkArgument(DKD.A1V(i, i2));
        ImmutableMap immutableMap2 = this.A04;
        if (!immutableMap2.containsKey(Quo.A06) && this.A03 == null) {
            z = false;
        }
        Preconditions.checkArgument(z);
        FormFieldAttributes formFieldAttributes = (FormFieldAttributes) immutableMap2.get(Quo.A03);
        if (formFieldAttributes != null) {
            Preconditions.checkArgument(1BK.A1V(formFieldAttributes.A03, FormFieldProperty.A01));
        }
        FormFieldAttributes formFieldAttributes2 = (FormFieldAttributes) immutableMap2.get(Quo.A05);
        if (formFieldAttributes2 != null) {
            Preconditions.checkArgument(1BK.A1V(formFieldAttributes2.A03, FormFieldProperty.A01));
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.A01);
        parcel.writeInt(this.A00);
        parcel.writeParcelable(this.A03, i);
        parcel.writeParcelable(this.A02, i);
        parcel.writeMap(this.A04);
    }
}
