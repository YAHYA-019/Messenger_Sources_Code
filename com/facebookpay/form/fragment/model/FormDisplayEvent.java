package com.facebookpay.form.fragment.model;

import X.11T;
import X.1BL;
import X.LGp;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: FormDisplayEvent.class */
public final class FormDisplayEvent implements Parcelable {
    public static final Parcelable.Creator CREATOR = LGp.A00(82);
    public final String A00;
    public final String A01;
    public final String A02;

    public FormDisplayEvent(String str, String str2, String str3) {
        1BL.A1F(str, str2);
        this.A01 = str;
        this.A02 = str2;
        this.A00 = str3;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        11T.A0F(parcel, 0);
        parcel.writeString(this.A01);
        parcel.writeString(this.A02);
        parcel.writeString(this.A00);
    }
}
