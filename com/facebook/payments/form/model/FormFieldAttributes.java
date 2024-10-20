package com.facebook.payments.form.model;

import X.C53v;
import X.FKZ;
import X.Quo;
import X.Qup;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.payments.model.FormFieldProperty;

/* loaded from: FormFieldAttributes.class */
public final class FormFieldAttributes implements Parcelable {
    public static final Parcelable.Creator CREATOR = FKZ.A00(49);
    public final int A00;
    public final Quo A01;
    public final Qup A02;
    public final FormFieldProperty A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final String A08;

    public FormFieldAttributes(Quo quo, Qup qup, FormFieldProperty formFieldProperty, String str, String str2, String str3, String str4, String str5, int i) {
        this.A01 = quo;
        this.A05 = str2;
        this.A03 = formFieldProperty;
        this.A02 = qup;
        this.A00 = i;
        this.A08 = str5;
        this.A04 = str;
        this.A07 = str4;
        this.A06 = str3;
    }

    public FormFieldAttributes(Parcel parcel) {
        this.A01 = C53v.A07(parcel, Quo.class);
        this.A05 = parcel.readString();
        this.A03 = C53v.A07(parcel, FormFieldProperty.class);
        this.A02 = C53v.A07(parcel, Qup.class);
        this.A00 = parcel.readInt();
        this.A08 = parcel.readString();
        this.A04 = parcel.readString();
        this.A07 = parcel.readString();
        this.A06 = parcel.readString();
    }

    public FormFieldAttributes A00(String str) {
        Quo quo = this.A01;
        String str2 = this.A05;
        FormFieldProperty formFieldProperty = this.A03;
        return new FormFieldAttributes(quo, this.A02, formFieldProperty, this.A04, str2, str, this.A07, this.A08, this.A00);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C53v.A0J(parcel, this.A01);
        parcel.writeString(this.A05);
        C53v.A0J(parcel, this.A03);
        C53v.A0J(parcel, this.A02);
        parcel.writeInt(this.A00);
        parcel.writeString(this.A08);
        parcel.writeString(this.A04);
        parcel.writeString(this.A07);
        parcel.writeString(this.A06);
    }
}
