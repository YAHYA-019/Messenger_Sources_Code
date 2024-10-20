package com.google.android.exoplayer2.source.dash;

import X.5LT;
import X.6Cl;
import X.6DB;
import X.6WC;
import X.6XP;
import X.6ZF;
import X.6ZG;
import X.JTA;
import X.KjC;
import X.KpI;
import X.MCl;
import X.MG2;
import X.MG4;

/* loaded from: DashMediaSource$Factory.class */
public final class DashMediaSource$Factory implements JTA {
    public long A00;
    public 6WC A02;
    public MG4 A05;
    public boolean A06;
    public final KpI A07;
    public final 6DB A08;
    public final 6XP A09;
    public final KjC A0A;
    public final MG2 A0B;
    public final 6Cl A0C;
    public 5LT A01 = null;
    public 6ZG A04 = new 6ZF(-1);
    public MCl A03 = new Object();

    /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, X.MCl] */
    public DashMediaSource$Factory(KpI kpI, 6DB r303, 6XP r304, KjC kjC, 6WC r306, MG2 mg2, 6Cl r308) {
        this.A0B = mg2;
        this.A0C = r308;
        this.A09 = r304;
        this.A07 = kpI;
        this.A08 = r303;
        this.A0A = kjC;
        this.A02 = r306 == null ? 6WC.A00 : r306;
        this.A00 = -1;
    }
}
