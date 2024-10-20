package com.facebook.iabeventlogging.model;

import X.11T;
import X.AnonymousClass001;
import X.DKH;
import X.KOk;
import X.KPM;
import com.facebook.privacy.zone.api.ZonedValue;

/* loaded from: IABViewableEvent.class */
public final class IABViewableEvent extends IABEvent {
    public final long A00;
    public final long A01;
    public final long A02;
    public final KPM A03;
    public final ZonedValue A04;
    public final String A05;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IABViewableEvent(KPM kpm, ZonedValue zonedValue, String str, String str2, long j, long j2, long j3) {
        super(KOk.A0R, str, j, j2);
        11T.A0F(str, 1);
        this.A01 = j;
        this.A00 = j2;
        this.A04 = zonedValue;
        this.A02 = j3;
        this.A05 = str2;
        this.A03 = kpm;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o("IABViewableEvent{");
        A0o.append("userClickTs=");
        A0o.append(this.A02);
        DKH.A1I(this, ", type=", A0o);
        DKH.A1T(A0o, super.A03);
        A0o.append(this.A01);
        A0o.append(", createdAtTs=");
        A0o.append(this.A00);
        A0o.append(", clickId=");
        A0o.append(this.A05);
        A0o.append(", nvSource=");
        KPM kpm = this.A03;
        A0o.append(kpm != null ? Long.valueOf(kpm.mValue) : null);
        String A0f = AnonymousClass001.A0f(A0o);
        11T.A0A(A0f);
        return A0f;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0042, code lost:
    
        if (java.lang.Long.valueOf(r307) == null) goto L6;
     */
    @Override // com.facebook.iabeventlogging.model.IABEvent, android.os.Parcelable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void writeToParcel(android.os.Parcel r302, int r303) {
        /*
            r301 = this;
            r0 = r302
            r1 = 0
            X.11T.A0F(r0, r1)
            r0 = r301
            r1 = r302
            r2 = r303
            super.writeToParcel(r1, r2)
            r0 = r301
            com.facebook.privacy.zone.api.ZonedValue r0 = r0.A04
            r304 = r0
            r0 = r302
            r1 = r304
            r2 = r303
            r0.writeParcelable(r1, r2)
            r0 = r301
            long r0 = r0.A02
            r305 = r0
            r0 = r302
            r1 = r305
            r0.writeLong(r1)
            r0 = r301
            java.lang.String r0 = r0.A05
            r304 = r0
            r0 = r302
            r1 = r304
            r0.writeString(r1)
            r0 = r301
            X.KPM r0 = r0.A03
            r304 = r0
            r0 = r304
            if (r0 == 0) goto L45
            r0 = r304
            long r0 = r0.mValue
            r307 = r0
            r0 = r307
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r304 = r0
            r0 = r304
            if (r0 != 0) goto L49
        L45:
            r0 = -1
            long r0 = (long) r0
            r307 = r0
        L49:
            r0 = r302
            r1 = r307
            r0.writeLong(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.iabeventlogging.model.IABViewableEvent.writeToParcel(android.os.Parcel, int):void");
    }
}
