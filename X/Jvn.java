package X;

import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: Jvn.class */
public final class Jvn extends 5Tm {
    public Object A00;
    public final 5Tn A01;
    public final 5iP A02;
    public final 1cP A03;
    public final Runnable A04;
    public final AtomicBoolean A05;
    public final MFf A06;

    public Jvn(5Tn r302, 5iJ r303, 5iP r304, 1cP r305, MFf mFf) {
        super(r303, r304, r305);
        this.A04 = new LlT(this);
        this.A05 = new AtomicBoolean();
        this.A01 = r302;
        this.A06 = mFf;
        this.A02 = r304;
        this.A03 = r305;
        r302.Crj(new LYT(this));
    }

    public static Jvn A00(5Tn r301, 5iJ r302, MFf mFf) {
        return new Jvn(r301, r302, new 5iP(), 1NF.A02(), mFf);
    }

    public static void A02(Jvn jvn) {
        Object obj;
        boolean z = false;
        jvn.A05.set(false);
        synchronized (jvn) {
            obj = jvn.A00;
        }
        if (obj != null) {
            5iH.A00();
            try {
                Object D4x = jvn.A06.D4x(obj);
                synchronized (jvn) {
                    if (obj == jvn.A00) {
                        z = true;
                    }
                }
                if (z) {
                    jvn.A02.A08(D4x);
                }
            } finally {
                5iH.A00();
            }
        }
    }

    public void A04() {
        synchronized (this) {
            this.A00 = null;
        }
        this.A02.A03();
    }

    public boolean ARw(int i) {
        Object obj;
        boolean z;
        if (i != 0) {
            if (i == 1) {
                this.A02.A05();
                synchronized (this) {
                    this.A00 = null;
                }
            } else {
                if (i == 2) {
                    synchronized (this) {
                        obj = this.A00;
                    }
                    5iP r0 = this.A02;
                    Object A02 = r0.A02();
                    if (!this.A01.ARw(2)) {
                        return false;
                    }
                    synchronized (this) {
                        if (obj == this.A00) {
                            this.A00 = null;
                            z = true;
                        } else {
                            z = false;
                        }
                    }
                    if (!z) {
                        return false;
                    }
                    r0.A09(A02);
                    return true;
                }
                if (i != 3 && i != 4) {
                    return false;
                }
            }
        }
        return this.A01.ARw(i);
    }

    public void Ce2() {
        this.A02.A04();
    }

    public void Ceh(5To r302) {
        this.A02.A06(r302);
    }

    public void Crj(5To r302) {
        this.A02.A07(r302);
    }

    public boolean D6l(Object obj, String str) {
        return this.A01.D6l(obj, str);
    }
}
