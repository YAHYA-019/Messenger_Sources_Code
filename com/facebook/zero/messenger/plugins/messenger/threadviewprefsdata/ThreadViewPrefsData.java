package com.facebook.zero.messenger.plugins.messenger.threadviewprefsdata;

import X.11T;
import X.1BK;
import X.1Bn;
import X.1Br;
import X.1G2;
import X.1HN;
import X.1Ky;
import X.6iB;
import X.A1u;

/* loaded from: ThreadViewPrefsData.class */
public final class ThreadViewPrefsData {
    public final 1Br A00;
    public final 1HN A01;
    public final 6iB A02;

    public ThreadViewPrefsData(6iB r302) {
        11T.A0F(r302, 1);
        this.A01 = new A1u(this, 3);
        this.A00 = 1BK.A0E();
        this.A02 = r302;
    }

    public static final void A00(ThreadViewPrefsData threadViewPrefsData) {
        6iB r0 = threadViewPrefsData.A02;
        String BD0 = 1Br.A09(threadViewPrefsData.A00).BD0((1G2) ((1Ky) 1Bn.A0A(98565)).A0Z.getValue());
        if (BD0 == null) {
            BD0 = "";
        }
        r0.A03(BD0, "zero_upgrade_message_id");
    }
}
