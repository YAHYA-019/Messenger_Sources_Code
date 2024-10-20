package com.facebookpay.expresscheckout.models;

import X.11T;
import X.1BL;
import X.4YW;
import X.7zT;
import X.C3o5;
import X.EnumC3490Mfk;
import X.KNE;
import X.LGp;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebookpay.otc.models.OtcInput;
import com.facebookpay.shippingaddress.model.ShippingAddress;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* loaded from: ECPPaymentResponseParams.class */
public final class ECPPaymentResponseParams implements Parcelable {
    public static final Parcelable.Creator CREATOR = LGp.A00(43);
    public String A00;
    public final int A01;
    public final FulfillmentOption A02;
    public final ShippingOption A03;
    public final TransactionInfo A04;
    public final EnumC3490Mfk A05;
    public final OtcInput A06;
    public final ShippingAddress A07;
    public final ShippingAddress A08;
    public final Long A09;
    public final String A0A;
    public final String A0B;
    public final String A0C;
    public final String A0D;
    public final String A0E;
    public final String A0F;
    public final String A0G;
    public final String A0H;
    public final String A0I;
    public final String A0J;
    public final String A0K;
    public final String A0L;
    public final String A0M;
    public final String A0N;
    public final String A0O;
    public final String A0P;
    public final String A0Q;
    public final String A0R;
    public final String A0S;
    public final List A0T;
    public final Set A0U;
    public final boolean A0V;

    public ECPPaymentResponseParams(FulfillmentOption fulfillmentOption, ShippingOption shippingOption, TransactionInfo transactionInfo, EnumC3490Mfk enumC3490Mfk, OtcInput otcInput, ShippingAddress shippingAddress, ShippingAddress shippingAddress2, Long l, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, List list, Set set, int i, boolean z) {
        11T.A0F(str, 1);
        7zT.A11(3, str2, str3, str4, str5);
        11T.A0F(str7, 8);
        11T.A0F(str15, 21);
        11T.A0F(str16, 22);
        11T.A0F(str18, 24);
        11T.A0F(transactionInfo, 27);
        this.A0S = str;
        this.A01 = i;
        this.A0R = str2;
        this.A0B = str3;
        this.A0C = str4;
        this.A0A = str5;
        this.A0J = str6;
        this.A0K = str7;
        this.A0H = str8;
        this.A0G = str9;
        this.A0I = str10;
        this.A0M = str11;
        this.A0L = str12;
        this.A0O = str13;
        this.A0N = str14;
        this.A08 = shippingAddress;
        this.A07 = shippingAddress2;
        this.A03 = shippingOption;
        this.A02 = fulfillmentOption;
        this.A0U = set;
        this.A0F = str15;
        this.A0Q = str16;
        this.A0E = str17;
        this.A0P = str18;
        this.A06 = otcInput;
        this.A0T = list;
        this.A04 = transactionInfo;
        this.A0D = str19;
        this.A0V = z;
        this.A05 = enumC3490Mfk;
        this.A09 = l;
        this.A00 = str20;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        11T.A0F(parcel, 0);
        parcel.writeString(this.A0S);
        parcel.writeInt(this.A01);
        parcel.writeString(this.A0R);
        parcel.writeString(this.A0B);
        parcel.writeString(this.A0C);
        parcel.writeString(this.A0A);
        parcel.writeString(this.A0J);
        parcel.writeString(this.A0K);
        parcel.writeString(this.A0H);
        parcel.writeString(this.A0G);
        parcel.writeString(this.A0I);
        parcel.writeString(this.A0M);
        parcel.writeString(this.A0L);
        parcel.writeString(this.A0O);
        parcel.writeString(this.A0N);
        parcel.writeParcelable(this.A08, i);
        parcel.writeParcelable(this.A07, i);
        ShippingOption shippingOption = this.A03;
        if (shippingOption == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            shippingOption.writeToParcel(parcel, i);
        }
        parcel.writeParcelable(this.A02, i);
        Set set = this.A0U;
        if (set == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            Iterator A0S = C3o5.A0S(parcel, set);
            while (A0S.hasNext()) {
                1BL.A12(parcel, (KNE) A0S.next());
            }
        }
        parcel.writeString(this.A0F);
        parcel.writeString(this.A0Q);
        parcel.writeString(this.A0E);
        parcel.writeString(this.A0P);
        parcel.writeParcelable(this.A06, i);
        Iterator A09 = 4YW.A09(parcel, this.A0T);
        while (A09.hasNext()) {
            ((ECPOffer) A09.next()).writeToParcel(parcel, i);
        }
        this.A04.writeToParcel(parcel, i);
        parcel.writeString(this.A0D);
        parcel.writeInt(this.A0V ? 1 : 0);
        EnumC3490Mfk enumC3490Mfk = this.A05;
        if (enumC3490Mfk == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            1BL.A12(parcel, enumC3490Mfk);
        }
        Long l = this.A09;
        if (l == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l.longValue());
        }
        parcel.writeString(this.A00);
    }
}
