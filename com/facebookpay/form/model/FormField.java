package com.facebookpay.form.model;

import X.11T;
import X.1BL;
import X.4YW;
import X.JR0;
import X.LGp;
import X.RVw;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.List;

/* loaded from: FormField.class */
public final class FormField implements Parcelable {
    public static final Parcelable.Creator CREATOR = LGp.A00(90);
    public final Integer A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final List A04;
    public final boolean A05;
    public final String A06;

    public FormField(Integer num, String str, String str2, String str3, String str4, List list, boolean z) {
        1BL.A1H(str, str2, str3);
        11T.A0F(num, 7);
        this.A02 = str;
        this.A03 = str2;
        this.A06 = str3;
        this.A01 = str4;
        this.A05 = z;
        this.A04 = list;
        this.A00 = num;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        11T.A0F(parcel, 0);
        parcel.writeString(this.A02);
        parcel.writeString(this.A03);
        parcel.writeString(this.A06);
        parcel.writeString(this.A01);
        parcel.writeInt(this.A05 ? 1 : 0);
        Iterator A09 = 4YW.A09(parcel, this.A04);
        while (A09.hasNext()) {
            JR0.A17(parcel, A09, i);
        }
        parcel.writeString(RVw.A01(this.A00));
    }
}
