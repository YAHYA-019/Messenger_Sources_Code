package com.facebook.iabeventlogging.model;

import X.AnonymousClass001;
import X.DKH;

/* loaded from: IABOpenMenuEvent.class */
public final class IABOpenMenuEvent extends IABEvent {
    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o("IABOpenMenuEvent{");
        DKH.A1I(this, "type=", A0o);
        DKH.A1T(A0o, this.A03);
        A0o.append(this.A01);
        A0o.append(", createdAtTs=");
        A0o.append(this.A00);
        return AnonymousClass001.A0f(A0o);
    }
}
