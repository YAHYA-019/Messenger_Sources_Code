package com.facebook.iabeventlogging.model;

import X.11T;
import X.AnonymousClass001;
import X.JR0;
import X.KOk;
import android.os.Parcel;
import com.facebook.privacy.zone.api.ZonedValue;

/* loaded from: IABLandingPageInteractiveEvent.class */
public final class IABLandingPageInteractiveEvent extends IABEvent {
    public final int A00;
    public final int A01;
    public final ZonedValue A02;
    public final long A03;
    public final long A04;
    public final String A05;
    public final String A06;
    public final boolean A07;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IABLandingPageInteractiveEvent(ZonedValue zonedValue, String str, String str2, String str3, int i, int i2, long j, long j2, long j3, boolean z) {
        super(KOk.A0D, str, j, j2);
        11T.A0F(str, 1);
        this.A03 = j2;
        this.A02 = zonedValue;
        this.A06 = str2;
        this.A01 = i;
        this.A00 = i2;
        this.A07 = z;
        this.A05 = str3;
        this.A04 = j3;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o("IABLandingPageInteractiveEvent{");
        A0o.append(", initialLandUrl='");
        char A00 = JR0.A00(this.A06, A0o);
        A0o.append(", screenWidth=");
        A0o.append(this.A01);
        A0o.append(", pageContentWidth=");
        A0o.append(this.A00);
        A0o.append(", isCookieLoadComplete=");
        A0o.append(this.A07);
        IABEvent.A01(this, A0o, A00);
        A0o.append(this.A03);
        A0o.append(", clickSource=");
        A0o.append(this.A05);
        A0o.append(", userClickTs=");
        A0o.append(this.A04);
        String A0f = AnonymousClass001.A0f(A0o);
        11T.A0A(A0f);
        return A0f;
    }

    @Override // com.facebook.iabeventlogging.model.IABEvent, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        11T.A0F(parcel, 0);
        super.writeToParcel(parcel, i);
        parcel.writeParcelable(this.A02, i);
        parcel.writeString(this.A06);
        parcel.writeInt(this.A01);
        parcel.writeInt(this.A00);
        parcel.writeByte(this.A07 ? (byte) 1 : (byte) 0);
        parcel.writeString(this.A05);
        parcel.writeLong(this.A04);
    }
}
