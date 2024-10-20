package com.facebook.iabeventlogging.model;

import X.AnonymousClass001;
import X.JR0;
import X.KOk;
import android.os.Parcel;

/* loaded from: IABRefreshEvent.class */
public final class IABRefreshEvent extends IABEvent {
    public final String A00;

    public IABRefreshEvent(long j, String str, long j2, String str2) {
        super(KOk.A0M, str, j, j2);
        this.A00 = str2;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o("IABRefreshEvent{");
        A0o.append("refreshFromType='");
        IABEvent.A01(this, A0o, JR0.A00(this.A00, A0o));
        A0o.append(super.A00);
        return AnonymousClass001.A0f(A0o);
    }

    @Override // com.facebook.iabeventlogging.model.IABEvent, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.A00);
    }
}
