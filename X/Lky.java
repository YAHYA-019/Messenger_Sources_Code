package X;

import java.util.Iterator;

/* loaded from: Lky.class */
public final class Lky implements Runnable {
    public static final String __redex_internal_original_name = "FbLocationSource$3";
    public final /* synthetic */ Lgl A00;

    public Lky(Lgl lgl) {
        this.A00 = lgl;
    }

    @Override // java.lang.Runnable
    public void run() {
        Iterator A1A = 1BK.A1A(this.A00.mRequests);
        while (A1A.hasNext()) {
            KSq kSq = (KSq) A1A.next();
            LDH ldh = kSq.A02;
            LBf.A03(kSq.A00, kSq.A01, ldh, kSq.A03, 1734199366);
        }
    }
}
