package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* loaded from: Lnz.class */
public final class Lnz implements Runnable {
    public static final String __redex_internal_original_name = "GooglePlayDownloader$2";
    public final /* synthetic */ C3Lx A00;
    public final /* synthetic */ C2uw A01;

    public Lnz(C3Lx c3Lx, C2uw c2uw) {
        this.A01 = c2uw;
        this.A00 = c3Lx;
    }

    @Override // java.lang.Runnable
    public void run() {
        C2uw c2uw = this.A01;
        2uE r0 = c2uw.A0D;
        if (r0 != null) {
            r0.A0A(this.A00.A02);
        }
        ArrayList A0s = AnonymousClass001.A0s();
        ArrayList A0s2 = AnonymousClass001.A0s();
        C3Lx c3Lx = this.A00;
        3QA r02 = c3Lx.A02;
        Iterator it = r02.A02.iterator();
        boolean z = false;
        while (it.hasNext()) {
            String A0i = AnonymousClass001.A0i(it);
            if (!00Y.A00().A0A(A0i)) {
                A0s.add(A0i);
                z = true;
            }
        }
        if (z) {
            Ldt ldt = new Ldt(c3Lx, c2uw);
            KpZ kpZ = new KpZ(A0s, A0s2);
            if (r0 != null) {
                r0.A0H(kpZ.A00, r02.A00);
            }
            C0dr c0dr = c2uw.A0C;
            long now = c0dr.now() - c2uw.A00;
            long j = c2uw.A0B;
            if (now < j) {
                try {
                    Thread.sleep(j - now);
                } catch (InterruptedException e) {
                    0fH.A0r(1BJ.A00(270), "Interrupted while waiting between subsequent download attempts", e);
                }
            }
            c2uw.A00 = c0dr.now();
            C4Ez D1m = c2uw.A0G.D1m(kpZ);
            CountDownLatch countDownLatch = new CountDownLatch(1);
            Executor executor = c2uw.A0K;
            D1m.A09(ldt, executor);
            D1m.A09(new Lds(countDownLatch, this, 1), executor);
            try {
                countDownLatch.await(30, TimeUnit.SECONDS);
            } catch (InterruptedException unused) {
            }
            if (!D1m.A0D()) {
                synchronized (ldt.A02) {
                    ldt.A00 = true;
                }
                Exception exc = new Exception(0Pz.A0W("Never received a response from Google downloading modules: ", kpZ.toString()));
                if (r0 != null) {
                    r0.A0F(r02, 2, -5);
                }
                c3Lx.A01.A00(exc);
            }
        } else {
            if (r0 != null) {
                r0.A0F(r02, 1, 0);
            }
            c3Lx.A01.A01(new C3O1(null, null, 1));
        }
        synchronized (c2uw) {
            c2uw.A06 = false;
            C2uw.A02(c2uw);
        }
    }
}
