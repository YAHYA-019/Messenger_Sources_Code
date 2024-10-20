package com.facebookpay.fulfillmentoption.model;

import X.11T;
import X.1BL;
import X.4YV;
import X.AnonymousClass002;
import X.LGp;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebookpay.common.models.CurrencyAmount;

/* loaded from: FulfillmentOptionComponent.class */
public class FulfillmentOptionComponent implements Parcelable {
    public static final Parcelable.Creator CREATOR = LGp.A00(91);
    public final CurrencyAmount A00;
    public final String A01;
    public final String A02;
    public final String A03;

    public FulfillmentOptionComponent(CurrencyAmount currencyAmount, String str, String str2, String str3) {
        1BL.A1F(str, str2);
        this.A02 = str;
        this.A03 = str2;
        this.A00 = currencyAmount;
        this.A01 = str3;
    }

    public CurrencyAmount A00() {
        return this instanceof ShippingFulfillmentOptionComponent ? ((ShippingFulfillmentOptionComponent) this).A00 : this instanceof PickupFulfillmentOptionComponent ? ((PickupFulfillmentOptionComponent) this).A00 : this.A00;
    }

    public String A01() {
        return this instanceof ShippingFulfillmentOptionComponent ? ((ShippingFulfillmentOptionComponent) this).A01 : this instanceof PickupFulfillmentOptionComponent ? ((PickupFulfillmentOptionComponent) this).A04 : this.A01;
    }

    public String A02() {
        return this instanceof ShippingFulfillmentOptionComponent ? ((ShippingFulfillmentOptionComponent) this).A02 : this instanceof PickupFulfillmentOptionComponent ? ((PickupFulfillmentOptionComponent) this).A05 : this.A02;
    }

    public String A03() {
        return this instanceof ShippingFulfillmentOptionComponent ? ((ShippingFulfillmentOptionComponent) this).A03 : this instanceof PickupFulfillmentOptionComponent ? ((PickupFulfillmentOptionComponent) this).A06 : this.A03;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0067, code lost:
    
        if (X.11T.A0O(A01(), r0.A01()) == false) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean equals(java.lang.Object r302) {
        /*
            r301 = this;
            r0 = r302
            boolean r0 = r0 instanceof com.facebookpay.fulfillmentoption.model.FulfillmentOptionComponent
            r303 = r0
            r0 = r303
            if (r0 == 0) goto L6a
            r0 = r301
            java.lang.String r0 = r0.A02()
            r304 = r0
            r0 = r302
            com.facebookpay.fulfillmentoption.model.FulfillmentOptionComponent r0 = (com.facebookpay.fulfillmentoption.model.FulfillmentOptionComponent) r0
            r302 = r0
            r0 = r302
            java.lang.String r0 = r0.A02()
            r305 = r0
            r0 = r304
            r1 = r305
            boolean r0 = X.11T.A0O(r0, r1)
            r303 = r0
            r0 = r303
            if (r0 == 0) goto L6a
            r0 = r301
            java.lang.String r0 = r0.A03()
            r304 = r0
            r0 = r302
            java.lang.String r0 = r0.A03()
            r305 = r0
            r0 = r304
            r1 = r305
            boolean r0 = X.11T.A0O(r0, r1)
            r303 = r0
            r0 = r303
            if (r0 == 0) goto L6a
            r0 = r301
            com.facebookpay.common.models.CurrencyAmount r0 = r0.A00()
            r304 = r0
            r0 = r302
            com.facebookpay.common.models.CurrencyAmount r0 = r0.A00()
            r305 = r0
            r0 = r304
            r1 = r305
            boolean r0 = X.11T.A0O(r0, r1)
            r303 = r0
            r0 = r303
            if (r0 == 0) goto L6a
            r0 = r301
            java.lang.String r0 = r0.A01()
            r304 = r0
            r0 = r302
            java.lang.String r0 = r0.A01()
            r305 = r0
            r0 = r304
            r1 = r305
            boolean r0 = X.11T.A0O(r0, r1)
            r306 = r0
            r0 = 1
            r303 = r0
            r0 = r306
            if (r0 != 0) goto L6f
        L6a:
            r0 = 0
            r303 = r0
            r0 = 0
            r305 = r0
        L6f:
            r0 = r303
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebookpay.fulfillmentoption.model.FulfillmentOptionComponent.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        int i = 0;
        int A07 = (AnonymousClass002.A07(A03(), 4YV.A02(A02())) + AnonymousClass002.A04(A00())) * 31;
        String A01 = A01();
        if (A01 != null) {
            i = A01.hashCode();
        }
        return A07 + i;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        boolean booleanValue;
        if (this instanceof ShippingFulfillmentOptionComponent) {
            ShippingFulfillmentOptionComponent shippingFulfillmentOptionComponent = (ShippingFulfillmentOptionComponent) this;
            11T.A0F(parcel, 0);
            parcel.writeString(shippingFulfillmentOptionComponent.A02);
            parcel.writeString(shippingFulfillmentOptionComponent.A03);
            parcel.writeParcelable(shippingFulfillmentOptionComponent.A00, i);
            parcel.writeString(shippingFulfillmentOptionComponent.A01);
            parcel.writeSerializable(shippingFulfillmentOptionComponent.A05);
            parcel.writeSerializable(shippingFulfillmentOptionComponent.A04);
            return;
        }
        if (!(this instanceof PickupFulfillmentOptionComponent)) {
            11T.A0F(parcel, 0);
            parcel.writeString(this.A02);
            parcel.writeString(this.A03);
            parcel.writeParcelable(this.A00, i);
            parcel.writeString(this.A01);
            return;
        }
        PickupFulfillmentOptionComponent pickupFulfillmentOptionComponent = (PickupFulfillmentOptionComponent) this;
        11T.A0F(parcel, 0);
        parcel.writeString(pickupFulfillmentOptionComponent.A05);
        parcel.writeString(pickupFulfillmentOptionComponent.A06);
        parcel.writeParcelable(pickupFulfillmentOptionComponent.A00, i);
        parcel.writeString(pickupFulfillmentOptionComponent.A04);
        parcel.writeSerializable(pickupFulfillmentOptionComponent.A08);
        parcel.writeSerializable(pickupFulfillmentOptionComponent.A07);
        Boolean bool = pickupFulfillmentOptionComponent.A03;
        if (bool == null) {
            booleanValue = false;
        } else {
            parcel.writeInt(1);
            booleanValue = bool.booleanValue();
        }
        parcel.writeInt(booleanValue ? 1 : 0);
        parcel.writeParcelable(pickupFulfillmentOptionComponent.A02, i);
        parcel.writeParcelable(pickupFulfillmentOptionComponent.A01, i);
        parcel.writeInt(pickupFulfillmentOptionComponent.A09 ? 1 : 0);
    }
}
