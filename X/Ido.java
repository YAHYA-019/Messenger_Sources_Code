package X;

import java.util.concurrent.locks.ReentrantLock;

/* loaded from: Ido.class */
public final /* synthetic */ class Ido implements JGC {
    public final /* synthetic */ IeR A00;

    public /* synthetic */ Ido(IeR ieR) {
        this.A00 = ieR;
    }

    public final void CDf(I40 i40) {
        IeR ieR = this.A00;
        JGC jgc = ieR.A04;
        if (jgc == null) {
            jgc = new Ido(ieR);
            ieR.A04 = jgc;
        }
        ieR.Cep(jgc);
        Hp6 hp6 = ieR.A0J;
        Hrg hrg = hp6.A00;
        ReentrantLock reentrantLock = hrg.A01;
        reentrantLock.lock();
        try {
            boolean A00 = hrg.A00();
            reentrantLock.lock();
            if (!hrg.A01()) {
                hrg.A00 = (hrg.A00 | 2) & (-2);
            }
            reentrantLock.unlock();
            if (A00) {
                GOp.A1I(18);
                HrO hrO = hp6.A03;
                if (hrO != null) {
                    hrO.A00();
                }
                I4V i4v = hp6.A01;
                if (i4v.A00.isEmpty()) {
                    return;
                }
                I9z.A00(new Ixe(hp6, i4v.A00));
            }
        } catch (Throwable th) {
            throw th;
        } finally {
            reentrantLock.unlock();
        }
    }
}
