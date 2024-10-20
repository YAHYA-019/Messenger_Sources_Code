package com.facebook.messaging.notify;

import X.1BJ;
import X.1BL;
import X.24X;
import X.AbH;
import X.AbM;
import X.BKz;
import X.C53v;
import X.C5ap;
import X.CIu;
import X.CST;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.graphql.enums.GraphQLPeerToPeerPaymentRequestStatus;
import com.facebook.messaging.notify.type.MessagingNotification;
import com.facebook.messaging.notify.type.ProductExtras;
import com.facebook.push.constants.PushProperty;

/* loaded from: PaymentNotification.class */
public final class PaymentNotification extends MessagingNotification {
    public static final Parcelable.Creator CREATOR = CST.A00(82);
    public ProductExtras A00;
    public boolean A01;
    public final int A02;
    public final BKz A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final String A09;

    public PaymentNotification(BKz bKz, ProductExtras productExtras, PushProperty pushProperty, String str, String str2, String str3, String str4, String str5, String str6, int i) {
        super(C5ap.A2T, pushProperty);
        this.A06 = str3;
        this.A03 = bKz;
        this.A05 = str2;
        this.A07 = str4;
        this.A09 = str6;
        this.A04 = str;
        this.A08 = str5;
        this.A02 = i;
        this.A00 = productExtras;
    }

    public PaymentNotification(Parcel parcel) {
        super(parcel);
        this.A06 = parcel.readString();
        this.A03 = parcel.readSerializable();
        this.A05 = parcel.readString();
        this.A07 = parcel.readString();
        this.A09 = parcel.readString();
        this.A04 = parcel.readString();
        this.A08 = parcel.readString();
        this.A01 = C53v.A0S(parcel);
        this.A02 = parcel.readInt();
        this.A00 = (ProductExtras) 1BL.A0C(parcel, ProductExtras.class);
    }

    public static Uri A00(PaymentNotification paymentNotification) {
        String str;
        String str2;
        BKz bKz = paymentNotification.A03;
        if (bKz == BKz.A02) {
            int i = paymentNotification.A02;
            GraphQLPeerToPeerPaymentRequestStatus[] graphQLPeerToPeerPaymentRequestStatusArr = CIu.A02;
            int i2 = 0;
            while (i != graphQLPeerToPeerPaymentRequestStatusArr[i2].ordinal()) {
                i2++;
                if (i2 >= 3) {
                    String str3 = paymentNotification.A07;
                    return (str3 != null ? AbM.A08(1BJ.A00(1283)).appendPath(str3) : AbM.A08(1BJ.A00(180)).appendPath(paymentNotification.A05)).build();
                }
            }
            str = paymentNotification.A06;
            str2 = "requests";
        } else {
            if (bKz != BKz.A03) {
                return null;
            }
            str = paymentNotification.A06;
            str2 = "transfers";
        }
        return AbM.A09(AbM.A08("fb-messenger://payments/").appendPath(str2), str);
    }

    public static String A01(24X r301, String str) {
        if (r301.A0D(str) == null) {
            return null;
        }
        return AbH.A1A(r301, str);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.facebook.messaging.notify.type.MessagingNotification, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.A06);
        parcel.writeSerializable(this.A03);
        parcel.writeString(this.A05);
        parcel.writeString(this.A07);
        parcel.writeString(this.A09);
        parcel.writeString(this.A04);
        parcel.writeString(this.A08);
        parcel.writeInt(this.A01 ? 1 : 0);
        parcel.writeInt(this.A02);
        parcel.writeParcelable(this.A00, i);
    }
}
