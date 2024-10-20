package com.facebook.iabeventlogging.model;

import X.AnonymousClass001;
import X.JR0;
import X.KOk;
import android.os.Parcel;

/* loaded from: IABShareEvent.class */
public final class IABShareEvent extends IABEvent {
    public final String A00;
    public final String A01;

    public IABShareEvent(String str, String str2, String str3, long j, long j2) {
        super(KOk.A0P, str, j, j2);
        this.A01 = str2;
        this.A00 = str3;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o("IABShareEvent{");
        A0o.append("targetUrl='");
        char A00 = JR0.A00(this.A01, A0o);
        A0o.append(", sharingType='");
        A0o.append(this.A00);
        A0o.append(A00);
        IABEvent.A01(this, A0o, A00);
        A0o.append(super.A00);
        return AnonymousClass001.A0f(A0o);
    }

    @Override // com.facebook.iabeventlogging.model.IABEvent, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.A01);
        parcel.writeString(this.A00);
    }
}
