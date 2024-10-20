package org.whispersystems.curve25519;

import X.LxG;
import X.MDs;

/* loaded from: OpportunisticCurve25519Provider.class */
public class OpportunisticCurve25519Provider implements MDs {
    public MDs A00;

    /* JADX WARN: Type inference failed for: r0v1, types: [X.MDs, java.lang.Object] */
    public OpportunisticCurve25519Provider() {
        try {
            this.A00 = new NativeCurve25519Provider();
        } catch (LxG unused) {
            this.A00 = new Object();
        }
    }
}
