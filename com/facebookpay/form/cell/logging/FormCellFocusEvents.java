package com.facebookpay.form.cell.logging;

import X.11T;
import X.7zT;
import X.LGp;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: FormCellFocusEvents.class */
public final class FormCellFocusEvents implements Parcelable {
    public static final Parcelable.Creator CREATOR = LGp.A00(68);
    public final String A00;
    public final String A01;
    public final String A02;
    public final String A03;

    public FormCellFocusEvents(String str, String str2, String str3, String str4) {
        7zT.A1W(str, str2, str3, str4);
        this.A02 = str;
        this.A00 = str2;
        this.A01 = str3;
        this.A03 = str4;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        11T.A0F(parcel, 0);
        parcel.writeString(this.A02);
        parcel.writeString(this.A00);
        parcel.writeString(this.A01);
        parcel.writeString(this.A03);
    }
}
