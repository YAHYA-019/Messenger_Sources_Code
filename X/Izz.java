package X;

import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.graphql.executor.OfflineMutationsManager;
import com.facebook.inject.FbInjector;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: Izz.class */
public final class Izz implements Runnable {
    public static final String __redex_internal_original_name = "OfflineMutationsRetryJobLogic$1";
    public final /* synthetic */ FbUserSession A00;
    public final /* synthetic */ C49f A01;
    public final /* synthetic */ C2490Gel A02;

    public Izz(FbUserSession fbUserSession, C49f c49f, C2490Gel c2490Gel) {
        this.A02 = c2490Gel;
        this.A00 = fbUserSession;
        this.A01 = c49f;
    }

    @Override // java.lang.Runnable
    public void run() {
        OfflineMutationsManager offlineMutationsManager = (OfflineMutationsManager) this.A02.A00.get();
        FbUserSession fbUserSession = this.A00;
        C49f c49f = this.A01;
        Context A00 = FbInjector.A00();
        synchronized (offlineMutationsManager) {
            0fH.A0A(OfflineMutationsManager.class, "Retry stashed mutations from JS");
            AtomicBoolean atomicBoolean = offlineMutationsManager.A0A;
            atomicBoolean.set(true);
            1XD r0 = offlineMutationsManager.A06;
            22U A03 = r0.A03(A00, fbUserSession, 0S2.A0C);
            if (A03 == null) {
                atomicBoolean.set(false);
                c49f.C2v(7zM.A1b(r0.A02()));
                0fH.A0F(OfflineMutationsManager.class, "Queue already in use");
            } else {
                1Kd.A0D(offlineMutationsManager.A07, Inf.A00(c49f, offlineMutationsManager, 2), A03);
            }
        }
    }
}
