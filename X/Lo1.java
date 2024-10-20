package X;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* loaded from: Lo1.class */
public final class Lo1 implements Runnable {
    public static final String __redex_internal_original_name = "GooglePlayDownloaderV2$2";
    public final /* synthetic */ QV5 A00;
    public final /* synthetic */ C51j A01;

    public Lo1(QV5 qv5, C51j c51j) {
        this.A01 = c51j;
        this.A00 = qv5;
    }

    @Override // java.lang.Runnable
    public void run() {
        C51j c51j = this.A01;
        RQN rqn = c51j.A0B;
        QV5 qv5 = this.A00;
        2uE r0 = rqn.A00;
        List list = qv5.A00;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            r0.A0A(((C3Lx) it.next()).A02);
        }
        ArrayList A0s = AnonymousClass001.A0s();
        ArrayList A0s2 = AnonymousClass001.A0s();
        HashMap A0u = AnonymousClass001.A0u();
        Iterator it2 = list.iterator();
        boolean z = false;
        while (it2.hasNext()) {
            3QA r02 = ((C3Lx) it2.next()).A02;
            Integer valueOf = Integer.valueOf(r02.A00);
            List list2 = (List) A0u.get(valueOf);
            if (list2 == null) {
                list2 = AnonymousClass001.A0s();
            }
            Iterator it3 = r02.A02.iterator();
            while (it3.hasNext()) {
                String A0i = AnonymousClass001.A0i(it3);
                if (!00Y.A00().A0A(A0i)) {
                    A0s.add(A0i);
                    list2.add(A0i);
                    z = true;
                }
            }
            A0u.put(valueOf, list2);
        }
        0fH.A17("GooglePlayDownloaderV2", "hasModules: %b", new Object[]{Boolean.valueOf(z)});
        if (z) {
            Ldu ldu = new Ldu(qv5, c51j);
            KpZ kpZ = new KpZ(A0s, A0s2);
            Iterator A19 = 1BK.A19(A0u);
            while (A19.hasNext()) {
                Number number = (Number) A19.next();
                int intValue = number.intValue();
                List list3 = (List) A0u.get(number);
                if (list3 != null && !list3.isEmpty()) {
                    r0.A0H(list3, intValue);
                }
            }
            C0dr c0dr = c51j.A09;
            long now = c0dr.now() - c51j.A00;
            if (now < 0) {
                try {
                    Thread.sleep(-now);
                } catch (InterruptedException e) {
                    0fH.A0r("GooglePlayDownloaderV2", "Interrupted while waiting between subsequent download attempts", e);
                }
            }
            c51j.A00 = c0dr.now();
            C4Ez D1m = c51j.A0E.D1m(kpZ);
            CountDownLatch countDownLatch = new CountDownLatch(1);
            Executor executor = c51j.A0G;
            D1m.A09(ldu, executor);
            D1m.A09(new Lds(countDownLatch, this, 2), executor);
            int i = c51j.A08;
            if (i > 0) {
                try {
                    countDownLatch.await(i, TimeUnit.SECONDS);
                } catch (InterruptedException unused) {
                }
                if (!D1m.A0D()) {
                    synchronized (ldu.A02) {
                        ldu.A00 = true;
                    }
                    Exception exc = new Exception(0Pz.A0W("Never received a response from Google downloading modules: ", kpZ.toString()));
                    if (c51j.A0A != null) {
                        rqn.A00(qv5, 2, -5);
                    }
                    C51j.A03(qv5, exc);
                }
            }
        } else {
            rqn.A00(qv5, 1, 0);
            C51j.A02(qv5, new C3O1(null, null, 1));
        }
        synchronized (c51j) {
            c51j.A04 = false;
            C51j.A04(c51j);
        }
    }
}
