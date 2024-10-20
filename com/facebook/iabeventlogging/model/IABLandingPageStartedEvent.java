package com.facebook.iabeventlogging.model;

import X.11T;
import X.AnonymousClass001;
import X.DKH;
import X.KOk;
import android.os.Parcel;
import com.facebook.privacy.zone.api.ZonedValue;

/* loaded from: IABLandingPageStartedEvent.class */
public final class IABLandingPageStartedEvent extends IABEvent {
    public final ZonedValue A00;
    public final long A01;
    public final boolean A02;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IABLandingPageStartedEvent(ZonedValue zonedValue, String str, long j, long j2, boolean z) {
        super(KOk.A0E, str, j, j2);
        11T.A0F(str, 1);
        this.A01 = j2;
        this.A00 = zonedValue;
        this.A02 = z;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o("IABLandingPageStartedEvent{");
        A0o.append("isCookieLoadComplete=");
        A0o.append(this.A02);
        DKH.A1I(this, ", type=", A0o);
        DKH.A1T(A0o, this.A03);
        A0o.append(super.A01);
        A0o.append(", createdAtTs=");
        A0o.append(this.A01);
        String A0f = AnonymousClass001.A0f(A0o);
        11T.A0A(A0f);
        return A0f;
    }

    @Override // com.facebook.iabeventlogging.model.IABEvent, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        11T.A0F(parcel, 0);
        super.writeToParcel(parcel, i);
        parcel.writeParcelable(this.A00, i);
        parcel.writeByte(this.A02 ? (byte) 1 : (byte) 0);
    }
}
