package com.facebookpay.paymentmethod.model;

import X.11T;
import X.1BL;
import X.7zR;
import X.EnumC3490Mfk;
import X.LGn;
import X.MQ8;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: APMCredential.class */
public final class APMCredential implements PaymentMethod {
    public static final Parcelable.Creator CREATOR = LGn.A00(5);
    public final MQ8 A00;
    public final EnumC3490Mfk A01;
    public final boolean A02;

    public APMCredential(MQ8 mq8, EnumC3490Mfk enumC3490Mfk, boolean z) {
        7zR.A1N(mq8, enumC3490Mfk);
        this.A00 = mq8;
        this.A02 = z;
        this.A01 = enumC3490Mfk;
    }

    @Override // com.facebookpay.paymentmethod.model.PaymentMethod
    public String Aez() {
        String Aez = this.A00.Aez();
        if (Aez == null) {
            Aez = "";
        }
        return Aez;
    }

    @Override // com.facebookpay.paymentmethod.model.PaymentMethod
    public EnumC3490Mfk Af1() {
        return this.A01;
    }

    @Override // com.facebookpay.paymentmethod.model.PaymentMethod
    public String Apl() {
        String Apl = this.A00.Apl();
        if (Apl == null) {
            Apl = "";
        }
        return Apl;
    }

    @Override // com.facebookpay.paymentmethod.model.PaymentMethod
    public String BDT() {
        String AjH = this.A00.AjH();
        if (AjH == null) {
            AjH = "";
        }
        return AjH;
    }

    @Override // com.facebookpay.paymentmethod.model.PaymentMethod
    public String BG6() {
        String Aey = this.A00.Aey();
        if (Aey == null) {
            Aey = "";
        }
        return Aey;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        11T.A0F(parcel, 0);
        parcel.writeValue(this.A00);
        parcel.writeInt(this.A02 ? 1 : 0);
        1BL.A12(parcel, this.A01);
    }
}
