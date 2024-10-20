package X;

import com.facebook.graphservice.interfaces.GraphQLService;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: L0i.class */
public final class L0i {
    public GraphQLService.OperationCallbacks A00;
    public 1BY A01;
    public final AtomicReference A06 = new AtomicReference();
    public final AtomicReference A05 = new AtomicReference();
    public final C00i A03 = 1BQ.A02(16449);
    public final C00i A04 = 7zN.A0D(131351);
    public ELK A02 = ELK.A04;

    public L0i(1BO r302) {
        this.A01 = 7zL.A0Q(r302);
    }

    public static void A00(ELK elk, L0i l0i, Throwable th) {
        synchronized (l0i) {
            l0i.A02 = elk;
        }
        KSl kSl = (KSl) l0i.A06.get();
        if (kSl != null) {
            synchronized (kSl) {
                if (elk == kSl.A01 && th == kSl.A02) {
                    return;
                }
                C1qb c1qb = kSl.A00;
                if (c1qb == null || c1qb.A0J() == null) {
                    return;
                }
                c1qb.A0H(new C2l4(new Object[]{elk, th}, 0), "updateState:BaseInternalPaginableListSection.updateState");
            }
        }
    }
}
