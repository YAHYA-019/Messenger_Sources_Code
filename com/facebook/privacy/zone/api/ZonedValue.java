package com.facebook.privacy.zone.api;

import X.11T;
import X.AnonymousClass001;
import X.C4Ny;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.privacy.zone.policy.ZonePolicy;
import com.facebookpay.offsite.models.message.OffsiteInitAvailabilityRequestKt;

/* loaded from: ZonedValue.class */
public final class ZonedValue implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C4Ny(41);
    public final ZonePolicy A00;
    public final Object A01;
    public final String A02;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ZonedValue(ZonePolicy zonePolicy, Object obj) {
        this(zonePolicy, obj, OffsiteInitAvailabilityRequestKt.DEFAULT_PARTNER_ID);
        11T.A0F(zonePolicy, 2);
    }

    public ZonedValue(ZonePolicy zonePolicy, Object obj, String str) {
        11T.A0F(zonePolicy, 2);
        11T.A0F(str, 3);
        this.A01 = obj;
        this.A00 = zonePolicy;
        this.A02 = str;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        11T.A0F(parcel, 0);
        Object obj = this.A01;
        parcel.writeString(obj == null ? "NULL" : AnonymousClass001.A0Y(obj));
        parcel.writeValue(obj);
        parcel.writeParcelable(this.A00, i);
        parcel.writeString(this.A02);
    }
}
