package X;

import java.util.ArrayList;
import java.util.List;

/* renamed from: X.Gcd, reason: case insensitive filesystem */
/* loaded from: Gcd.class */
public final class C2416Gcd extends Ic7 implements JPv, JEA, JPp {
    public final JJb A00;
    public final Hpz A01;
    public final ArrayList A02;

    public C2416Gcd(JJb jJb, Hpz hpz, JOW jow, JMy jMy) {
        7zR.A1O(jMy, jJb);
        super.A00 = jow;
        this.A00 = jJb;
        this.A01 = hpz;
        ArrayList A0t = AnonymousClass001.A0t(1);
        this.A02 = A0t;
        A0t.add(jMy);
    }

    public Iir AI0(Hpi hpi) {
        return this.A01.A00(hpi);
    }

    @Override // X.JPv
    public JEA AXQ() {
        return this;
    }

    @Override // X.JPv
    public JJb AlW() {
        return this.A00;
    }

    @Override // X.JPp
    public List B79() {
        return this.A02;
    }
}
