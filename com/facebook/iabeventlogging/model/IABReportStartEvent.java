package com.facebook.iabeventlogging.model;

import X.AnonymousClass001;
import X.JR0;
import X.KOk;
import android.os.Parcel;
import com.facebook.privacy.zone.api.ZonedValue;

/* loaded from: IABReportStartEvent.class */
public final class IABReportStartEvent extends IABEvent {
    public final ZonedValue A00;
    public final String A01;
    public final String A02;

    public IABReportStartEvent(ZonedValue zonedValue, String str, String str2, String str3, long j, long j2) {
        super(KOk.A0N, str, j, j2);
        this.A01 = str2;
        this.A00 = zonedValue;
        this.A02 = str3;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o("IABReportStartEvent{");
        A0o.append("targetUrl='");
        char A00 = JR0.A00(this.A02, A0o);
        A0o.append(", clickSource='");
        A0o.append(this.A01);
        A0o.append(A00);
        IABEvent.A01(this, A0o, A00);
        A0o.append(super.A00);
        return AnonymousClass001.A0f(A0o);
    }

    @Override // com.facebook.iabeventlogging.model.IABEvent, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.A01);
        parcel.writeParcelable(this.A00, i);
        parcel.writeString(this.A02);
    }
}
