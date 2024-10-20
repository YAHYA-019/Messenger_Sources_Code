package X;

import java.lang.ref.WeakReference;
import java.util.Iterator;

/* loaded from: Ij1.class */
public final class Ij1 implements JLR {
    public final WeakReference A00;

    public Ij1(IFR ifr) {
        this.A00 = 7zL.A14(ifr);
    }

    public void CZQ(JJD jjd) {
        IFR ifr = (IFR) this.A00.get();
        if (ifr == null || jjd.BHT() != HC9.A06) {
            return;
        }
        ifr.A0K = ((Iip) jjd).A00;
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x015b, code lost:
    
        if (r309 != null) goto L56;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:28:0x0096. Please report as an issue. */
    /* JADX WARN: Type inference failed for: r309v4, types: [java.lang.Object, X.Iig] */
    /* JADX WARN: Type inference failed for: r309v5, types: [java.lang.Object, X.Iij] */
    /* JADX WARN: Type inference failed for: r309v6, types: [java.lang.Object, X.Iii] */
    /* JADX WARN: Type inference failed for: r309v8, types: [java.lang.Object, X.Iih] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void CcL(X.JJE r302, X.HC9 r303) {
        /*
            Method dump skipped, instructions count: 505
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Ij1.CcL(X.JJE, X.HC9):void");
    }

    public void D5x(JJE jje) {
        IFR ifr = (IFR) this.A00.get();
        if (ifr != null) {
            I4T i4t = ifr.A0c;
            java.util.Map map = i4t.A00;
            synchronized (map) {
                Iterator A1B = 1BK.A1B(map);
                while (A1B.hasNext()) {
                    i4t.A02(jje, (HC9) A1B.next());
                }
            }
            IFR.A03(ifr);
        }
    }

    public void D5y(JJE jje, HC9 hc9) {
        IFR ifr = (IFR) this.A00.get();
        if (ifr != null) {
            02W.A06(AnonymousClass001.A1T(jje), "Null listener unregistered");
            ifr.A0c.A02(jje, hc9);
            IFR.A03(ifr);
        }
    }
}
