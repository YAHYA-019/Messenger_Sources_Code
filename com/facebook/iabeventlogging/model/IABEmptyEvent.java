package com.facebook.iabeventlogging.model;

import X.AnonymousClass001;
import X.DKH;

/* loaded from: IABEmptyEvent.class */
public final class IABEmptyEvent extends IABEvent {
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public IABEmptyEvent() {
        /*
            r301 = this;
            X.KOk r0 = X.KOk.A02
            r302 = r0
            r0 = -1
            long r0 = (long) r0
            r303 = r0
            r0 = r301
            r1 = r302
            java.lang.String r2 = ""
            r3 = r303
            r4 = r303
            r0.<init>(r1, r2, r3, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.iabeventlogging.model.IABEmptyEvent.<init>():void");
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o("IABEmptyEvent{");
        DKH.A1I(this, "type=", A0o);
        DKH.A1T(A0o, this.A03);
        A0o.append(this.A01);
        A0o.append(", createdAtTs=");
        A0o.append(this.A00);
        return AnonymousClass001.A0f(A0o);
    }
}
