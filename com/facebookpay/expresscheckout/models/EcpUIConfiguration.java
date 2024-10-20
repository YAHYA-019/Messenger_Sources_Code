package com.facebookpay.expresscheckout.models;

import X.11T;
import X.1BL;
import X.7zT;
import X.KOY;
import X.LGp;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: EcpUIConfiguration.class */
public final class EcpUIConfiguration implements Parcelable {
    public static final Parcelable.Creator CREATOR = LGp.A00(46);
    public final AuthScreenStyle A00;
    public final KOY A01;
    public final KOY A02;
    public final KOY A03;
    public final KOY A04;
    public final KOY A05;
    public final KOY A06;
    public final KOY A07;
    public final EcpNuxLearnMoreScreenStyle A08;
    public final ItemDetails A09;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public EcpUIConfiguration() {
        /*
            r301 = this;
            X.KOY r0 = X.KOY.A05
            r302 = r0
            X.KOY r0 = X.KOY.A03
            r303 = r0
            X.KOY r0 = X.KOY.A06
            r304 = r0
            X.KOY r0 = X.KOY.A07
            r305 = r0
            X.KOY r0 = X.KOY.A02
            r306 = r0
            X.KOY r0 = X.KOY.A0U
            r307 = r0
            java.lang.Integer r0 = X.0S2.A00
            r308 = r0
            com.facebookpay.expresscheckout.models.ItemDetails r0 = new com.facebookpay.expresscheckout.models.ItemDetails
            r309 = r0
            r0 = r309
            r1 = r308
            r2 = 0
            r0.<init>(r1, r2)
            r0 = r301
            r308 = r0
            r0 = r301
            r1 = 0
            r2 = r302
            r3 = r303
            r4 = r304
            r5 = r305
            r6 = r306
            r7 = r307
            r8 = r302
            r9 = 0
            r10 = r309
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebookpay.expresscheckout.models.EcpUIConfiguration.<init>():void");
    }

    public EcpUIConfiguration(AuthScreenStyle authScreenStyle, KOY koy, KOY koy2, KOY koy3, KOY koy4, KOY koy5, KOY koy6, KOY koy7, EcpNuxLearnMoreScreenStyle ecpNuxLearnMoreScreenStyle, ItemDetails itemDetails) {
        7zT.A1W(koy, koy2, koy3, koy4);
        1BL.A1G(koy5, koy6);
        11T.A0F(itemDetails, 7);
        11T.A0F(koy7, 10);
        this.A04 = koy;
        this.A02 = koy2;
        this.A05 = koy3;
        this.A06 = koy4;
        this.A01 = koy5;
        this.A07 = koy6;
        this.A09 = itemDetails;
        this.A00 = authScreenStyle;
        this.A08 = ecpNuxLearnMoreScreenStyle;
        this.A03 = koy7;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        11T.A0F(parcel, 0);
        1BL.A12(parcel, this.A04);
        1BL.A12(parcel, this.A02);
        1BL.A12(parcel, this.A05);
        1BL.A12(parcel, this.A06);
        1BL.A12(parcel, this.A01);
        1BL.A12(parcel, this.A07);
        this.A09.writeToParcel(parcel, i);
        AuthScreenStyle authScreenStyle = this.A00;
        if (authScreenStyle == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            authScreenStyle.writeToParcel(parcel, i);
        }
        EcpNuxLearnMoreScreenStyle ecpNuxLearnMoreScreenStyle = this.A08;
        if (ecpNuxLearnMoreScreenStyle == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            ecpNuxLearnMoreScreenStyle.writeToParcel(parcel, i);
        }
        1BL.A12(parcel, this.A03);
    }
}
