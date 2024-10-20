package com.facebookpay.common.models;

import X.11T;
import X.1BL;
import X.C3o5;
import X.FKb;
import X.KOE;
import X.Kfo;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: ErrorDialogContent.class */
public final class ErrorDialogContent implements Parcelable {
    public static final Parcelable.Creator CREATOR = FKb.A00(92);
    public final Kfo A00;
    public final Kfo A01;
    public final Integer A02;
    public final Integer A03;
    public final KOE A04;
    public final KOE A05;
    public final Integer A06;
    public final Integer A07;
    public final String A08;
    public final String A09;

    public ErrorDialogContent() {
        this(null, null, null, null, null, null, null, null, null, null);
    }

    public ErrorDialogContent(KOE koe, KOE koe2, Kfo kfo, Kfo kfo2, Integer num, Integer num2, Integer num3, Integer num4, String str, String str2) {
        this.A09 = str;
        this.A08 = str2;
        this.A00 = kfo;
        this.A01 = kfo2;
        this.A07 = num;
        this.A06 = num2;
        this.A04 = koe;
        this.A05 = koe2;
        this.A02 = num3;
        this.A03 = num4;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        String str;
        11T.A0F(parcel, 0);
        parcel.writeString(this.A09);
        parcel.writeString(this.A08);
        parcel.writeValue(this.A00);
        parcel.writeValue(this.A01);
        C3o5.A0f(parcel, this.A07);
        C3o5.A0f(parcel, this.A06);
        KOE koe = this.A04;
        if (koe == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            1BL.A12(parcel, koe);
        }
        KOE koe2 = this.A05;
        if (koe2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            1BL.A12(parcel, koe2);
        }
        C3o5.A0f(parcel, this.A02);
        Integer num = this.A03;
        if (num == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        switch (num.intValue()) {
            case 1:
                str = "SYSTEM_ERROR";
                break;
            case 2:
                str = "CHECKOUT_ERROR_RISK";
                break;
            case 3:
                str = "PAYMENT_REQUEST_CANCELLED";
                break;
            case 4:
                str = "USER_OPTIONALITY_SELECTION";
                break;
            case 5:
                str = "INTERNAL_ERROR";
                break;
            default:
                str = "USER_CANCELLATION";
                break;
        }
        parcel.writeString(str);
    }
}
