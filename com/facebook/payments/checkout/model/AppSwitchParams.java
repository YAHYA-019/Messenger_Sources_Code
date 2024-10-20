package com.facebook.payments.checkout.model;

import X.11T;
import X.1BL;
import X.4YV;
import X.C1pq;
import X.C3o5;
import X.DKG;
import X.FKY;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.payments.model.PaymentItemType;

/* loaded from: AppSwitchParams.class */
public final class AppSwitchParams implements Parcelable {
    public static final Parcelable.Creator CREATOR = FKY.A00(99);
    public final int A00;
    public final int A01;
    public final CheckoutAnalyticsParams A02;
    public final PaymentItemType A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final String A09;
    public final String A0A;
    public final String A0B;
    public final String A0C;
    public final String A0D;
    public final String A0E;
    public final String A0F;
    public final String A0G;

    public AppSwitchParams(Parcel parcel) {
        ClassLoader A0e = 4YV.A0e(this);
        String str = null;
        if (parcel.readInt() == 0) {
            this.A04 = null;
        } else {
            this.A04 = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A05 = null;
        } else {
            this.A05 = parcel.readString();
        }
        this.A06 = parcel.readString();
        this.A07 = parcel.readString();
        if (parcel.readInt() == 0) {
            this.A08 = null;
        } else {
            this.A08 = parcel.readString();
        }
        this.A00 = parcel.readInt();
        if (parcel.readInt() == 0) {
            this.A09 = null;
        } else {
            this.A09 = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A0A = null;
        } else {
            this.A0A = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A0B = null;
        } else {
            this.A0B = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A02 = null;
        } else {
            this.A02 = (CheckoutAnalyticsParams) parcel.readParcelable(A0e);
        }
        if (parcel.readInt() == 0) {
            this.A0C = null;
        } else {
            this.A0C = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A0D = null;
        } else {
            this.A0D = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A0E = null;
        } else {
            this.A0E = parcel.readString();
        }
        this.A01 = parcel.readInt();
        if (parcel.readInt() == 0) {
            this.A03 = null;
        } else {
            this.A03 = DKG.A0l(parcel);
        }
        this.A0F = parcel.readInt() != 0 ? parcel.readString() : str;
        this.A0G = C3o5.A0O(parcel);
    }

    public AppSwitchParams(CheckoutAnalyticsParams checkoutAnalyticsParams, PaymentItemType paymentItemType, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, int i, int i2) {
        this.A04 = str;
        this.A05 = str2;
        C1pq.A08("appPackageName", str3);
        this.A06 = str3;
        C1pq.A08("appSwitchUri", str4);
        this.A07 = str4;
        this.A08 = str5;
        this.A00 = i;
        this.A09 = str6;
        this.A0A = str7;
        this.A0B = str8;
        this.A02 = checkoutAnalyticsParams;
        this.A0C = str9;
        this.A0D = str10;
        this.A0E = str11;
        this.A01 = i2;
        this.A03 = paymentItemType;
        this.A0F = str12;
        this.A0G = str13;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof AppSwitchParams)) {
                return false;
            }
            AppSwitchParams appSwitchParams = (AppSwitchParams) obj;
            if (!11T.A0O(this.A04, appSwitchParams.A04) || !11T.A0O(this.A05, appSwitchParams.A05) || !11T.A0O(this.A06, appSwitchParams.A06) || !11T.A0O(this.A07, appSwitchParams.A07) || !11T.A0O(this.A08, appSwitchParams.A08) || this.A00 != appSwitchParams.A00 || !11T.A0O(this.A09, appSwitchParams.A09) || !11T.A0O(this.A0A, appSwitchParams.A0A) || !11T.A0O(this.A0B, appSwitchParams.A0B) || !11T.A0O(this.A02, appSwitchParams.A02) || !11T.A0O(this.A0C, appSwitchParams.A0C) || !11T.A0O(this.A0D, appSwitchParams.A0D) || !11T.A0O(this.A0E, appSwitchParams.A0E) || this.A01 != appSwitchParams.A01 || this.A03 != appSwitchParams.A03 || !11T.A0O(this.A0F, appSwitchParams.A0F) || !11T.A0O(this.A0G, appSwitchParams.A0G)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int A04 = (C1pq.A04(this.A0E, C1pq.A04(this.A0D, C1pq.A04(this.A0C, C1pq.A04(this.A02, C1pq.A04(this.A0B, C1pq.A04(this.A0A, C1pq.A04(this.A09, (C1pq.A04(this.A08, C1pq.A04(this.A07, C1pq.A04(this.A06, C1pq.A04(this.A05, C1pq.A03(this.A04))))) * 31) + this.A00))))))) * 31) + this.A01;
        return C1pq.A04(this.A0G, C1pq.A04(this.A0F, (A04 * 31) + C3o5.A03(this.A03)));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        1BL.A13(parcel, this.A04);
        1BL.A13(parcel, this.A05);
        parcel.writeString(this.A06);
        parcel.writeString(this.A07);
        1BL.A13(parcel, this.A08);
        parcel.writeInt(this.A00);
        1BL.A13(parcel, this.A09);
        1BL.A13(parcel, this.A0A);
        1BL.A13(parcel, this.A0B);
        C3o5.A0d(parcel, this.A02, i);
        1BL.A13(parcel, this.A0C);
        1BL.A13(parcel, this.A0D);
        1BL.A13(parcel, this.A0E);
        parcel.writeInt(this.A01);
        C3o5.A0e(parcel, this.A03);
        1BL.A13(parcel, this.A0F);
        1BL.A13(parcel, this.A0G);
    }
}
