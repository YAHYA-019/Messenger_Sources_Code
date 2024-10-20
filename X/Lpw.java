package X;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* loaded from: Lpw.class */
public final /* synthetic */ class Lpw implements Runnable {
    public static final String __redex_internal_original_name = "ListenerSet$$ExternalSyntheticLambda1";
    public final /* synthetic */ int A00;
    public final /* synthetic */ MG5 A01;
    public final /* synthetic */ CopyOnWriteArraySet A02;

    public /* synthetic */ Lpw(MG5 mg5, CopyOnWriteArraySet copyOnWriteArraySet, int i) {
        this.A02 = copyOnWriteArraySet;
        this.A00 = i;
        this.A01 = mg5;
    }

    @Override // java.lang.Runnable
    public final void run() {
        CopyOnWriteArraySet copyOnWriteArraySet = this.A02;
        int i = this.A00;
        MG5 mg5 = this.A01;
        Iterator it = copyOnWriteArraySet.iterator();
        while (it.hasNext()) {
            JTI jti = (JTI) it.next();
            if (!jti.A02) {
                if (i != -1) {
                    jti.A00.A01(i);
                }
                jti.A01 = true;
                mg5.BQ8(jti.A03);
            }
        }
    }
}
