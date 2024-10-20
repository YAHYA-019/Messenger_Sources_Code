package X;

import com.facebook.auth.usersession.FbUserSession;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: N2E.class */
public final class N2E {
    public N1G A00;
    public boolean A01;
    public boolean A02;
    public final 1Br A05 = 1Bq.A00(33013);
    public final 1Br A08 = 1Bq.A00(99390);
    public final 1Br A04 = 1Bq.A00(16511);
    public final 1Br A0C = 1Bq.A00(16385);
    public final 1Br A06 = 1Bu.A00(16428);
    public final 1Br A03 = 1Bu.A00(16452);
    public final 1Br A0A = 1Bq.A00(83869);
    public final 1Br A0B = 1Bq.A00(83870);
    public final 1Br A09 = 1Bq.A00(148048);
    public final Runnable A07 = new N92(this);

    public static final boolean A00(N2E n2e) {
        boolean z;
        int i;
        synchronized (n2e) {
            C00j.A05("MessagingInBlueInteractionStore.hasInitiated", -1539966129);
            try {
                z = true;
                if (n2e.A02) {
                    i = 1703601497;
                } else {
                    n2e.A02 = true;
                    FbUserSession A04 = 1Fw.A04((1EZ) 1Br.A0B(n2e.A06));
                    C00j.A05("MessagingInBlueInteractionStore.createStoreData", 562648701);
                    try {
                        N1G n1g = new N1G(n2e.A05, new C00y(new J5u(A04, 69)), new C00y(new N93(n2e, 3)));
                        C00j.A01(1605167247);
                        try {
                            C00j.A05("MessagingInBlueInteractionStore.initStoreData", 1457139336);
                            try {
                                n2e.A00 = n1g;
                                C00j.A01(30265425);
                                ((ScheduledExecutorService) 1Br.A0B(n2e.A03)).execute(new N91(n2e));
                                z = false;
                                i = 1783674314;
                            } catch (Throwable th) {
                                C00j.A01(1158646265);
                                throw th;
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            throw th;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        C00j.A01(-994404806);
                    }
                }
                C00j.A01(i);
            } catch (Throwable th4) {
                C00j.A01(-1456782499);
                throw th4;
            }
        }
        return z;
    }
}
