package com.facebook.messaging.business.commerce.model.retail;

import X.11T;
import X.1BK;
import X.1BL;
import X.AnonymousClass001;
import X.C7kk;
import X.CSW;
import X.HvM;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: ShipmentTrackingEvent.class */
public final class ShipmentTrackingEvent implements CommerceBubbleModel {
    public static final Parcelable.Creator CREATOR = new CSW(23);
    public final long A00;
    public final RetailAddress A01;
    public final Shipment A02;
    public final Integer A03;
    public final String A04;
    public final String A05;
    public final String A06;

    public ShipmentTrackingEvent(Parcel parcel) {
        this.A03 = HvM.A00(parcel.readInt());
        String readString = parcel.readString();
        if (readString == null) {
            throw 1BK.A0h();
        }
        this.A06 = readString;
        this.A04 = parcel.readString();
        this.A00 = parcel.readLong();
        this.A05 = parcel.readString();
        this.A01 = (RetailAddress) 1BL.A0C(parcel, RetailAddress.class);
        this.A02 = (Shipment) 1BL.A0C(parcel, Shipment.class);
    }

    public ShipmentTrackingEvent(RetailAddress retailAddress, Shipment shipment, Integer num, String str, String str2, String str3, long j) {
        this.A03 = num;
        if (str3 == null) {
            throw AnonymousClass001.A0N("Required value was null.");
        }
        this.A06 = str3;
        this.A04 = str;
        this.A00 = j;
        this.A05 = str2;
        this.A01 = retailAddress;
        this.A02 = shipment;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x000f, code lost:
    
        if (r302 != null) goto L6;
     */
    @Override // com.facebook.messaging.business.commerce.model.retail.CommerceBubbleModel
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.google.common.collect.ImmutableList AsZ() {
        /*
            r301 = this;
            r0 = r301
            com.facebook.messaging.business.commerce.model.retail.Shipment r0 = r0.A02
            r302 = r0
            r0 = r302
            if (r0 == 0) goto L17
            r0 = r302
            com.google.common.collect.ImmutableList r0 = r0.A08
            r302 = r0
            r0 = r302
            if (r0 == 0) goto L17
        L12:
            r0 = r302
            com.google.common.collect.ImmutableList r0 = X.1BL.A0a(r0)
            return r0
        L17:
            X.0ty r0 = X.C0ty.A00
            r302 = r0
            goto L12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.messaging.business.commerce.model.retail.ShipmentTrackingEvent.AsZ():com.google.common.collect.ImmutableList");
    }

    @Override // com.facebook.messaging.business.commerce.model.retail.CommerceBubbleModel
    public Integer BHe() {
        return this.A03;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.facebook.messaging.business.commerce.model.retail.CommerceBubbleModel
    public String getId() {
        return this.A06;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        11T.A0F(parcel, 0);
        parcel.writeInt(C7kk.A00(this.A03));
        parcel.writeString(this.A06);
        parcel.writeString(this.A04);
        parcel.writeLong(this.A00);
        parcel.writeString(this.A05);
        parcel.writeParcelable(this.A01, i);
        parcel.writeParcelable(this.A02, i);
    }
}
