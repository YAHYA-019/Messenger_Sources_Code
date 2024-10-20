package X;

import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.quicklog.QuickPerformanceLogger;
import com.google.common.util.concurrent.SettableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;

/* loaded from: Izk.class */
public final class Izk implements Runnable {
    public static final String __redex_internal_original_name = "MessengerWithoutMsysARDeliveryFacadeFactory$getARDeliveryFacadeAsync$1";
    public final /* synthetic */ FbUserSession A00;
    public final /* synthetic */ JDz A01;
    public final /* synthetic */ HqD A02;

    public Izk(FbUserSession fbUserSession, JDz jDz, HqD hqD) {
        this.A02 = hqD;
        this.A01 = jDz;
        this.A00 = fbUserSession;
    }

    /* JADX WARN: Type inference failed for: r0v95, types: [java.lang.Object, X.HfW] */
    @Override // java.lang.Runnable
    public final void run() {
        IllegalStateException A0h;
        HqD hqD = this.A02;
        if (hqD.A07 == null) {
            FbUserSession fbUserSession = this.A00;
            synchronized (hqD) {
                if (hqD.A07 == null) {
                    SettableFuture A0j = 4YU.A0j();
                    1BY r0 = hqD.A00.A00;
                    ((Fbs) 1Lm.A07(fbUserSession, r0, 100284)).Aiu(new IMl(A0j));
                    SettableFuture A0j2 = 4YU.A0j();
                    Context A09 = 7zL.A09();
                    CxL cxL = (CxL) 1Br.A0B(hqD.A01);
                    1Vd A00 = ((DKN) 1Bn.A0E((Context) null, r0, 68643)).A00();
                    ExecutorService A1G = GOp.A1G(hqD.A02);
                    IQg iQg = IQg.A00;
                    C00i c00i = hqD.A03.A00;
                    A0j2.set(new EvZ(A09, (C2051Daa) c00i.get(), iQg, A00, cxL, A1G));
                    try {
                        Object obj = A0j2.get();
                        if (obj != null) {
                            EvZ evZ = (EvZ) obj;
                            Object obj2 = A0j.get();
                            if (obj2 != null) {
                                Fcf fcf = (Fcf) obj2;
                                QuickPerformanceLogger A0e = 7zP.A0e(hqD.A04);
                                C2051Daa c2051Daa = (C2051Daa) c00i.get();
                                ?? obj3 = new Object();
                                ((HfW) obj3).A00 = evZ;
                                ((HfW) obj3).A02 = fcf;
                                ((HfW) obj3).A03 = A0e;
                                ((HfW) obj3).A01 = c2051Daa;
                                hqD.A07 = obj3;
                            } else {
                                A0h = 1BK.A0h();
                            }
                        } else {
                            A0h = 1BK.A0h();
                        }
                        throw A0h;
                    } catch (InterruptedException e) {
                        0fH.A0w("MessengerWithoutMsysARDeliveryFacadeFactory", "error constructing underlying components", e);
                    } catch (ExecutionException e2) {
                        0fH.A0w("MessengerWithoutMsysARDeliveryFacadeFactory", "error constructing underlying components", e2);
                    }
                }
            }
            if (hqD.A07 == null) {
                return;
            }
        }
        this.A01.Bq3(hqD.A07);
    }
}
