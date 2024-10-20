package com.facebookpay.paymentmethod.model;

import X.11T;
import X.EnumC3490Mfk;
import X.LGn;
import X.MQC;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: PayPalCredential.class */
public final class PayPalCredential implements PaymentMethod {
    public static final Parcelable.Creator CREATOR = LGn.A00(7);
    public final MQC A00;
    public final String A01;
    public final boolean A02;

    public PayPalCredential() {
        this(null, null, false);
    }

    public PayPalCredential(MQC mqc, String str, boolean z) {
        this.A00 = mqc;
        this.A02 = z;
        this.A01 = str;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0011, code lost:
    
        if (r302 == null) goto L6;
     */
    @Override // com.facebookpay.paymentmethod.model.PaymentMethod
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.String Aez() {
        /*
            r301 = this;
            r0 = r301
            X.MQC r0 = r0.A00
            r302 = r0
            r0 = r302
            if (r0 == 0) goto L14
            r0 = r302
            java.lang.String r0 = r0.Aez()
            r302 = r0
            r0 = r302
            if (r0 != 0) goto L20
        L14:
            r0 = r301
            java.lang.String r0 = r0.A01
            r302 = r0
            r0 = r302
            if (r0 != 0) goto L20
            java.lang.String r0 = ""
            r302 = r0
        L20:
            r0 = r302
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebookpay.paymentmethod.model.PayPalCredential.Aez():java.lang.String");
    }

    @Override // com.facebookpay.paymentmethod.model.PaymentMethod
    public EnumC3490Mfk Af1() {
        return EnumC3490Mfk.A06;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0011, code lost:
    
        if (r302 == null) goto L6;
     */
    @Override // com.facebookpay.paymentmethod.model.PaymentMethod
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.String Apl() {
        /*
            r301 = this;
            r0 = r301
            X.MQC r0 = r0.A00
            r302 = r0
            r0 = r302
            if (r0 == 0) goto L14
            r0 = r302
            java.lang.String r0 = r0.Apl()
            r302 = r0
            r0 = r302
            if (r0 != 0) goto L17
        L14:
            java.lang.String r0 = ""
            r302 = r0
        L17:
            r0 = r302
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebookpay.paymentmethod.model.PayPalCredential.Apl():java.lang.String");
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0011, code lost:
    
        if (r302 == null) goto L6;
     */
    @Override // com.facebookpay.paymentmethod.model.PaymentMethod
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.String BDT() {
        /*
            r301 = this;
            r0 = r301
            X.MQC r0 = r0.A00
            r302 = r0
            r0 = r302
            if (r0 == 0) goto L14
            r0 = r302
            java.lang.String r0 = r0.B44()
            r302 = r0
            r0 = r302
            if (r0 != 0) goto L17
        L14:
            java.lang.String r0 = ""
            r302 = r0
        L17:
            r0 = r302
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebookpay.paymentmethod.model.PayPalCredential.BDT():java.lang.String");
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0011, code lost:
    
        if (r302 == null) goto L6;
     */
    @Override // com.facebookpay.paymentmethod.model.PaymentMethod
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.String BG6() {
        /*
            r301 = this;
            r0 = r301
            X.MQC r0 = r0.A00
            r302 = r0
            r0 = r302
            if (r0 == 0) goto L14
            r0 = r302
            java.lang.String r0 = r0.B45()
            r302 = r0
            r0 = r302
            if (r0 != 0) goto L17
        L14:
            java.lang.String r0 = ""
            r302 = r0
        L17:
            r0 = r302
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebookpay.paymentmethod.model.PayPalCredential.BG6():java.lang.String");
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
        parcel.writeString(this.A01);
    }
}
