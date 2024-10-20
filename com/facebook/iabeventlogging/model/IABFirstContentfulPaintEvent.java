package com.facebook.iabeventlogging.model;

import X.11T;
import X.AnonymousClass001;
import X.DKH;
import X.KOk;

/* loaded from: IABFirstContentfulPaintEvent.class */
public final class IABFirstContentfulPaintEvent extends IABEvent {
    public final long A00;

    public IABFirstContentfulPaintEvent(String str, long j, long j2) {
        super(KOk.A06, str, j, j2);
        this.A00 = j2;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o("IABFirstContentfulPaintEvent{");
        A0o.append(", iabSessionId='");
        DKH.A1T(A0o, this.A03);
        A0o.append(this.A01);
        A0o.append(", createdAtTs=");
        A0o.append(this.A00);
        String A0f = AnonymousClass001.A0f(A0o);
        11T.A0A(A0f);
        return A0f;
    }
}
