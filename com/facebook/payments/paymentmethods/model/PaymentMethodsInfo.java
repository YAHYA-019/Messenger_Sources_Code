package com.facebook.payments.paymentmethods.model;

import X.1BL;
import X.1Du;
import X.4YU;
import X.AbN;
import X.ERI;
import X.FKd;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.common.locale.Country;
import com.google.common.collect.ImmutableList;

/* loaded from: PaymentMethodsInfo.class */
public final class PaymentMethodsInfo implements Parcelable {
    public static final Parcelable.Creator CREATOR = FKd.A00(65);
    public final Country A00;
    public final ImmutableList A01;
    public final ImmutableList A02;
    public final ImmutableList A03;
    public final String A04;
    public final String A05;

    public PaymentMethodsInfo(Parcel parcel) {
        this.A00 = (Country) 1BL.A0C(parcel, Country.class);
        this.A04 = parcel.readString();
        this.A05 = parcel.readString();
        this.A03 = AbN.A0e(parcel, PaymentMethod.class);
        this.A02 = AbN.A0e(parcel, NewPaymentOption.class);
        this.A01 = AbN.A0e(parcel, PaymentMethod.class);
    }

    public PaymentMethodsInfo(Country country, ImmutableList immutableList, ImmutableList immutableList2, ImmutableList immutableList3, String str, String str2) {
        this.A00 = country;
        this.A04 = str;
        this.A05 = str2;
        this.A03 = immutableList;
        this.A02 = immutableList2;
        this.A01 = immutableList3;
    }

    public PaymentMethod A00(String str) {
        1Du it = this.A03.iterator();
        while (it.hasNext()) {
            PaymentMethod paymentMethod = (PaymentMethod) it.next();
            if (paymentMethod.getId().equals(str)) {
                return paymentMethod;
            }
        }
        return null;
    }

    public ImmutableList A01() {
        ImmutableList.Builder A0h = 4YU.A0h();
        1Du it = this.A03.iterator();
        while (it.hasNext()) {
            PaymentMethod paymentMethod = (PaymentMethod) it.next();
            if (ERI.A03.equals(paymentMethod.BHR()) && (paymentMethod instanceof CreditCard) && !((CreditCard) paymentMethod).A01) {
                A0h.m11011add((Object) paymentMethod);
            }
        }
        return A0h.build();
    }

    public ImmutableList A02() {
        ImmutableList.Builder A0h = 4YU.A0h();
        1Du it = this.A03.iterator();
        while (it.hasNext()) {
            PaymentMethod paymentMethod = (PaymentMethod) it.next();
            if (!ERI.A03.equals(paymentMethod.BHR()) || !(paymentMethod instanceof CreditCard) || ((CreditCard) paymentMethod).A01) {
                A0h.m11011add((Object) paymentMethod);
            }
        }
        return A0h.build();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.A00, i);
        parcel.writeString(this.A04);
        parcel.writeString(this.A05);
        parcel.writeList(this.A03);
        parcel.writeList(this.A02);
        parcel.writeList(this.A01);
    }
}
