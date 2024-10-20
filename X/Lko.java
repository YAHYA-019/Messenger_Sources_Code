package X;

import java.lang.ref.Reference;
import java.util.Iterator;

/* loaded from: Lko.class */
public final class Lko implements Runnable {
    public static final String __redex_internal_original_name = "GeoApiLocationAppStateListener$1";
    public final /* synthetic */ C03623yk A00;

    public Lko(C03623yk c03623yk) {
        this.A00 = c03623yk;
    }

    @Override // java.lang.Runnable
    public void run() {
        C03623yk c03623yk = this.A00;
        Integer A01 = C03623yk.A01(c03623yk);
        if (A01 != 0S2.A00) {
            boolean A1W = AnonymousClass001.A1W(A01, 0S2.A01);
            0fH.A0j(AbstractC00603o4.A00(100), "App background triggered");
            Iterator it = c03623yk.A03.iterator();
            while (it.hasNext()) {
                LDH ldh = (LDH) ((Reference) it.next()).get();
                if (ldh != null) {
                    synchronized (ldh) {
                        KmL kmL = ldh.A02;
                        if (kmL == null || !kmL.A09 || !A1W) {
                            ldh.A09();
                        }
                    }
                }
            }
        }
    }
}
