package com.facebook.payments.checkout.configuration.model;

import X.11T;
import X.1BL;
import X.1Du;
import X.4YV;
import X.AbI;
import X.AbL;
import X.C1pq;
import X.C3o5;
import X.DKH;
import X.FKY;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.payments.shipping.model.AddressFormConfig;
import com.facebook.payments.shipping.model.MailingAddress;
import com.google.common.collect.ImmutableList;

/* loaded from: ShippingAddressScreenComponent.class */
public final class ShippingAddressScreenComponent implements Parcelable {
    public static final Parcelable.Creator CREATOR = FKY.A00(91);
    public final AddressFormConfig A00;
    public final ImmutableList A01;
    public final String A02;
    public final boolean A03;
    public final String A04;

    public ShippingAddressScreenComponent(Parcel parcel) {
        ClassLoader A0e = 4YV.A0e(this);
        ImmutableList immutableList = null;
        if (parcel.readInt() == 0) {
            this.A00 = null;
        } else {
            this.A00 = (AddressFormConfig) AddressFormConfig.CREATOR.createFromParcel(parcel);
        }
        if (parcel.readInt() != 0) {
            int readInt = parcel.readInt();
            MailingAddress[] mailingAddressArr = new MailingAddress[readInt];
            int i = 0;
            while (i < readInt) {
                i = AbI.A01(parcel, A0e, mailingAddressArr, i);
            }
            immutableList = ImmutableList.copyOf(mailingAddressArr);
        }
        this.A01 = immutableList;
        this.A03 = DKH.A1W(parcel);
        this.A04 = parcel.readString();
        this.A02 = C3o5.A0O(parcel);
    }

    public ShippingAddressScreenComponent(AddressFormConfig addressFormConfig, ImmutableList immutableList, String str, String str2, boolean z) {
        this.A00 = addressFormConfig;
        this.A01 = immutableList;
        this.A03 = z;
        this.A04 = str;
        this.A02 = str2;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof ShippingAddressScreenComponent)) {
                return false;
            }
            ShippingAddressScreenComponent shippingAddressScreenComponent = (ShippingAddressScreenComponent) obj;
            if (!11T.A0O(this.A00, shippingAddressScreenComponent.A00) || !11T.A0O(this.A01, shippingAddressScreenComponent.A01) || this.A03 != shippingAddressScreenComponent.A03 || !11T.A0O(this.A04, shippingAddressScreenComponent.A04) || !11T.A0O(this.A02, shippingAddressScreenComponent.A02)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return C1pq.A04(this.A02, C1pq.A04(this.A04, C1pq.A02(C1pq.A04(this.A01, C1pq.A03(this.A00)), this.A03)));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        AddressFormConfig addressFormConfig = this.A00;
        if (addressFormConfig == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            addressFormConfig.writeToParcel(parcel, i);
        }
        ImmutableList immutableList = this.A01;
        if (immutableList == null) {
            parcel.writeInt(0);
        } else {
            1Du A0Y = AbL.A0Y(parcel, immutableList);
            while (A0Y.hasNext()) {
                parcel.writeParcelable((Parcelable) A0Y.next(), i);
            }
        }
        parcel.writeInt(this.A03 ? 1 : 0);
        parcel.writeString(this.A04);
        1BL.A13(parcel, this.A02);
    }
}
