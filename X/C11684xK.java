package X;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.concurrent.Future;

/* renamed from: X.4xK, reason: invalid class name and case insensitive filesystem */
/* loaded from: 4xK.class */
public final class C11684xK {
    public final 4xL A00;
    public final java.util.Map A01 = new HashMap();

    public C11684xK(4xJ r302) {
        this.A00 = new 4xL(r302);
    }

    public static final void A00(ISY isy, C11684xK c11684xK, 5DD r303) {
        java.util.Map map = c11684xK.A01;
        C7rO c7rO = (C7rO) map.get(isy);
        if (c7rO != null) {
            c7rO.A01 = null;
            c7rO.A00 = r303;
            c7rO.A02 = true;
            synchronized (c7rO) {
                c7rO.notify();
            }
            map.remove(isy);
        }
    }

    public C7rO A01(HkU hkU, IE4 ie4, JLb jLb) {
        String str;
        JIB jib;
        String str2 = ie4.A03;
        if ((str2 == null || str2.length() == 0) && ((str = hkU.A09) == null || str.length() == 0)) {
            java.util.Map emptyMap = Collections.emptyMap();
            11T.A0A(emptyMap);
            throw new 5DD((H9V) null, (Exception) null, "Empty file key", emptyMap, 0, 0L, false, false);
        }
        ISY isy = new ISY(this);
        ArrayList A0s = AnonymousClass001.A0s();
        A0s.add(isy);
        if (jLb != null) {
            A0s.add(jLb);
        }
        C7rO c7rO = new C7rO(new IEy(hkU, ie4, new ISc(A0s), this.A00.A00));
        this.A01.put(isy, c7rO);
        IEy iEy = c7rO.A03;
        if (!iEy.A0C && (jib = iEy.A05) != null) {
            jib.A6f(new Ipj(iEy));
            iEy.A0C = true;
        }
        iEy.A02.onStart();
        HkU hkU2 = iEy.A06;
        HdZ hdZ = hkU2.A08;
        hdZ.A01 = 0;
        hdZ.A00 = hdZ.A02.A02;
        if (hkU2.A0E) {
            IEy.A04(iEy);
            return c7rO;
        }
        IEy.A05(iEy, hkU2.A01, false);
        return c7rO;
    }

    public ICS A02(C7rO c7rO) {
        11T.A0F(c7rO, 0);
        while (!c7rO.A02) {
            synchronized (c7rO) {
                try {
                    c7rO.wait();
                } catch (InterruptedException unused) {
                    AnonymousClass001.A13();
                }
            }
        }
        IllegalStateException illegalStateException = c7rO.A00;
        if (illegalStateException == null) {
            ICS ics = c7rO.A01;
            if (ics != null) {
                return ics;
            }
            illegalStateException = 1BK.A0h();
        }
        throw illegalStateException;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r307v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r307v2 */
    /* JADX WARN: Type inference failed for: r307v4, types: [X.3OK] */
    public void A03(C7rO c7rO) {
        ?? r307;
        AnonymousClass409 anonymousClass409;
        11T.A0F(c7rO, 0);
        IEy iEy = c7rO.A03;
        if (iEy.A0B == null) {
            IEy.A03(iEy);
            iEy.A02.Bn2();
            return;
        }
        4xJ r0 = iEy.A09;
        7dD r02 = iEy.A0B;
        if (r02 == null) {
            throw 1BK.A0h();
        }
        if (r02 instanceof 7dD) {
            7dD r03 = r02;
            Future future = r03.A01;
            r307 = r03.A00;
            if (future != null && !future.isDone()) {
                future.cancel(true);
            }
            if (r307 != 0) {
                1Rl r04 = r0.A00;
                synchronized (r307) {
                    try {
                        anonymousClass409 = ((3OK) r307).A00;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (anonymousClass409 != null) {
                    ((C2tx) r04.A07.get()).A03(anonymousClass409);
                }
            }
        }
        r307 = iEy.A0A;
        synchronized (r307) {
            iEy.A04 = true;
            r307.notifyAll();
        }
    }
}
