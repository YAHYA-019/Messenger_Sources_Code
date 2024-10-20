package com.facebook.presence.plugins.threadlist.supplier;

import X.11T;
import X.1Bq;
import X.1Br;
import X.1XZ;
import X.2Si;
import X.39T;
import X.C00j;
import com.google.common.collect.ImmutableList;

/* loaded from: ThreadListPresenceSupplier.class */
public final class ThreadListPresenceSupplier {
    public final 1Br A00;
    public final 2Si A01;
    public final 39T A02;

    public ThreadListPresenceSupplier(2Si r302) {
        11T.A0F(r302, 1);
        this.A01 = r302;
        this.A00 = 1Bq.A00(65723);
        this.A02 = new 39T(this, 1);
    }

    public static final ImmutableList A00() {
        C00j.A05("ThreadListPresenceSupplier.<get-inboxItems>", -1422894140);
        try {
            ImmutableList of = ImmutableList.of();
            11T.A0A(of);
            C00j.A01(390124130);
            return of;
        } catch (Throwable th) {
            C00j.A01(1368341868);
            throw th;
        }
    }

    public final void A01() {
        C00j.A05("ThreadListPresenceSupplier.onSubscribe", 157317816);
        try {
            ((1XZ) this.A00.A00.get()).A77(this.A02);
            C00j.A01(327208368);
        } catch (Throwable th) {
            C00j.A01(-509268047);
            throw th;
        }
    }

    public final void A02() {
        C00j.A05("ThreadListPresenceSupplier.onUnsubscribe", -2117058993);
        try {
            ((1XZ) this.A00.A00.get()).Cez(this.A02);
            C00j.A01(2037670855);
        } catch (Throwable th) {
            C00j.A01(-1933017080);
            throw th;
        }
    }
}
