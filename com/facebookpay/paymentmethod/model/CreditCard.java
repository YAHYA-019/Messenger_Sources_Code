package com.facebookpay.paymentmethod.model;

import X.0CU;
import X.0Pz;
import X.11T;
import X.1BK;
import X.7zM;
import X.AnonymousClass001;
import X.EnumC3490Mfk;
import X.KOm;
import X.LGn;
import X.MP0;
import X.MP1;
import X.MPh;
import X.MQH;
import X.MQV;
import X.QtD;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: CreditCard.class */
public class CreditCard implements PaymentMethod {
    public static final Parcelable.Creator CREATOR = LGn.A00(6);
    public MQH A00;
    public final MPh A01;
    public final MQV A02;
    public final String A03;
    public final boolean A04;
    public final boolean A05;

    public CreditCard(MQV mqv, boolean z, boolean z2) {
        11T.A0F(mqv, 1);
        this.A02 = mqv;
        this.A04 = z;
        this.A05 = z2;
        MP0 AZ8 = mqv.AZ8();
        if (AZ8 == null) {
            throw 1BK.A0h();
        }
        MQH A9Q = AZ8.A9Q();
        11T.A0A(A9Q);
        this.A00 = A9Q;
        String Abs = mqv.Abs();
        this.A03 = Abs == null ? "" : Abs;
        MP1 AmN = mqv.AmN();
        this.A01 = AmN != null ? AmN.A9S() : null;
    }

    public final KOm A00() {
        QtD Abn = this.A02.Abn();
        if (Abn != null) {
            switch (Abn.ordinal()) {
                case 1:
                    return KOm.A05;
                case 4:
                    return KOm.A07;
                case 7:
                    return KOm.A0B;
                case 9:
                    return KOm.A0C;
                case 11:
                    return KOm.A0D;
                case 13:
                    return KOm.A0G;
            }
        }
        return KOm.A0F;
    }

    public final String A01() {
        String AlA;
        MQV mqv = this.A02;
        String Al9 = mqv.Al9();
        if (Al9 == null || 0CU.A0O(Al9) || (AlA = mqv.AlA()) == null || 0CU.A0O(AlA)) {
            return "";
        }
        String Al92 = mqv.Al9();
        if (Al92 == null) {
            throw AnonymousClass001.A0N("Required value was null.");
        }
        if (Al92.length() != 2) {
            return "";
        }
        String AlA2 = mqv.AlA();
        if (AlA2 == null) {
            throw AnonymousClass001.A0N("Required value was null.");
        }
        if (AlA2.length() < 4) {
            return "";
        }
        String Al93 = mqv.Al9();
        String AlA3 = mqv.AlA();
        if (AlA3 != null) {
            return 0Pz.A0W(Al93, 7zM.A1C(2, 4, AlA3));
        }
        throw AnonymousClass001.A0N("Required value was null.");
    }

    public boolean A02() {
        return this instanceof TokenizedCard ? ((TokenizedCard) this).A04 : this.A05;
    }

    @Override // com.facebookpay.paymentmethod.model.PaymentMethod
    public String Aez() {
        String Aez = this.A02.Aez();
        if (Aez == null) {
            Aez = "";
        }
        return Aez;
    }

    @Override // com.facebookpay.paymentmethod.model.PaymentMethod
    public EnumC3490Mfk Af1() {
        EnumC3490Mfk Af1 = this.A02.Af1();
        if (Af1 == null) {
            Af1 = EnumC3490Mfk.A02;
        }
        return Af1;
    }

    @Override // com.facebookpay.paymentmethod.model.PaymentMethod
    public String Apl() {
        String Abo = this.A02.Abo();
        if (Abo == null) {
            Abo = "";
        }
        return Abo;
    }

    @Override // com.facebookpay.paymentmethod.model.PaymentMethod
    public String BDT() {
        String Abx = this.A02.Abx();
        if (Abx == null) {
            Abx = "";
        }
        return Abx;
    }

    @Override // com.facebookpay.paymentmethod.model.PaymentMethod
    public String BG6() {
        String Aby = this.A02.Aby();
        if (Aby == null) {
            Aby = "";
        }
        return Aby;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        boolean z;
        if (this instanceof TokenizedCard) {
            TokenizedCard tokenizedCard = (TokenizedCard) this;
            11T.A0F(parcel, 0);
            parcel.writeValue(tokenizedCard.A00);
            parcel.writeValue(tokenizedCard.A01);
            parcel.writeInt(tokenizedCard.A05 ? 1 : 0);
            z = tokenizedCard.A04;
        } else {
            11T.A0F(parcel, 0);
            parcel.writeValue(this.A02);
            parcel.writeInt(this.A04 ? 1 : 0);
            z = this.A05;
        }
        parcel.writeInt(z ? 1 : 0);
    }
}
