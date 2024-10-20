package com.facebook.payments.shipping.model;

import X.11T;
import X.1BL;
import X.4YV;
import X.AbF;
import X.AnonymousClass001;
import X.C1pq;
import X.C3o5;
import X.FKd;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.common.locale.Country;
import com.facebookpay.offsite.models.message.ServerW3CShippingAddressConstants;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* loaded from: ShippingAddressFormInput.class */
public final class ShippingAddressFormInput implements Parcelable {
    public static volatile Country A0B;
    public static final Parcelable.Creator CREATOR = FKd.A00(96);
    public final String A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final boolean A07;
    public final Country A08;
    public final String A09;
    public final Set A0A;

    public ShippingAddressFormInput(Parcel parcel) {
        ClassLoader A0e = 4YV.A0e(this);
        this.A00 = parcel.readString();
        Country country = null;
        if (parcel.readInt() == 0) {
            this.A01 = null;
        } else {
            this.A01 = parcel.readString();
        }
        this.A02 = parcel.readString();
        this.A03 = parcel.readString();
        this.A08 = parcel.readInt() != 0 ? (Country) parcel.readParcelable(A0e) : country;
        int i = 0;
        this.A07 = 4YV.A1U(parcel.readInt());
        this.A04 = parcel.readString();
        this.A05 = parcel.readString();
        this.A09 = C3o5.A0O(parcel);
        this.A06 = parcel.readString();
        HashSet A0v = AnonymousClass001.A0v();
        int readInt = parcel.readInt();
        while (i < readInt) {
            i = C3o5.A02(parcel, A0v, i);
        }
        this.A0A = Collections.unmodifiableSet(A0v);
    }

    public ShippingAddressFormInput(Country country, String str, String str2, String str3, String str4, String str5, String str6, String str7, Set set, boolean z) {
        C1pq.A08("address1", str);
        this.A00 = str;
        this.A01 = str2;
        C1pq.A08("billingZip", str3);
        this.A02 = str3;
        C1pq.A08(ServerW3CShippingAddressConstants.CITY, str4);
        this.A03 = str4;
        this.A08 = country;
        this.A07 = z;
        C1pq.A08("label", str5);
        this.A04 = str5;
        AbF.A1U(str6);
        this.A05 = str6;
        this.A09 = null;
        C1pq.A08("state", str7);
        this.A06 = str7;
        this.A0A = Collections.unmodifiableSet(set);
    }

    public Country A00() {
        if (this.A0A.contains("country")) {
            return this.A08;
        }
        if (A0B == null) {
            synchronized (this) {
                if (A0B == null) {
                    A0B = Country.A01;
                }
            }
        }
        return A0B;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof ShippingAddressFormInput)) {
                return false;
            }
            ShippingAddressFormInput shippingAddressFormInput = (ShippingAddressFormInput) obj;
            if (!11T.A0O(this.A00, shippingAddressFormInput.A00) || !11T.A0O(this.A01, shippingAddressFormInput.A01) || !11T.A0O(this.A02, shippingAddressFormInput.A02) || !11T.A0O(this.A03, shippingAddressFormInput.A03) || !11T.A0O(A00(), shippingAddressFormInput.A00()) || this.A07 != shippingAddressFormInput.A07 || !11T.A0O(this.A04, shippingAddressFormInput.A04) || !11T.A0O(this.A05, shippingAddressFormInput.A05) || !11T.A0O(this.A09, shippingAddressFormInput.A09) || !11T.A0O(this.A06, shippingAddressFormInput.A06)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return C1pq.A04(this.A06, C1pq.A04(this.A09, C1pq.A04(this.A05, C1pq.A04(this.A04, C1pq.A02(C1pq.A04(A00(), C1pq.A04(this.A03, C1pq.A04(this.A02, C1pq.A04(this.A01, C1pq.A03(this.A00))))), this.A07)))));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A00);
        1BL.A13(parcel, this.A01);
        parcel.writeString(this.A02);
        parcel.writeString(this.A03);
        C3o5.A0d(parcel, this.A08, i);
        parcel.writeInt(this.A07 ? 1 : 0);
        parcel.writeString(this.A04);
        parcel.writeString(this.A05);
        1BL.A13(parcel, this.A09);
        parcel.writeString(this.A06);
        Iterator A0S = C3o5.A0S(parcel, this.A0A);
        while (A0S.hasNext()) {
            C3o5.A0h(parcel, A0S);
        }
    }
}
