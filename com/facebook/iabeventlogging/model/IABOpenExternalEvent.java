package com.facebook.iabeventlogging.model;

import X.AnonymousClass001;
import X.JR0;
import X.KOk;
import android.os.Parcel;

/* loaded from: IABOpenExternalEvent.class */
public final class IABOpenExternalEvent extends IABEvent {
    public final String A00;
    public final String A01;

    public IABOpenExternalEvent(String str, String str2, String str3, long j, long j2) {
        super(KOk.A0I, str, j, j2);
        this.A00 = str2;
        this.A01 = str3;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o("IABOpenExternalEvent{");
        A0o.append("reason='");
        char A00 = JR0.A00(this.A00, A0o);
        A0o.append(", targetUrl='");
        A0o.append(this.A01);
        A0o.append(A00);
        IABEvent.A01(this, A0o, A00);
        A0o.append(super.A00);
        return AnonymousClass001.A0f(A0o);
    }

    @Override // com.facebook.iabeventlogging.model.IABEvent, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.A00);
        parcel.writeString(this.A01);
    }
}
