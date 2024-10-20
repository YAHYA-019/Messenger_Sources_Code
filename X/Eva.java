package X;

import android.app.Application;
import com.meta.metaai.imagine.creation.impl.data.EmuFlashRepository;
import com.meta.metaai.imagine.service.ImagineNetworkService;
import java.util.concurrent.ConcurrentLinkedQueue;

/* loaded from: Eva.class */
public final class Eva {
    public int A00;
    public final Application A01;
    public final EmuFlashRepository A02;
    public final RKU A03;
    public final ConcurrentLinkedQueue A04;
    public final 2aI A05;
    public final 0Xs A06;
    public final C15t A07;
    public final FHP A08;
    public final ImagineNetworkService A09;

    public Eva(Application application, FHP fhp, EMg eMg, EPN epn, ImagineNetworkService imagineNetworkService, 2aI r307) {
        7zP.A1L(eMg, 4, epn);
        this.A01 = application;
        this.A09 = imagineNetworkService;
        this.A05 = r307;
        this.A08 = fhp;
        this.A02 = new EmuFlashRepository(application, fhp, eMg, imagineNetworkService);
        this.A03 = new RKU();
        this.A00 = 07C.A03(C07y.A00, 07C.A07(0, (-1) >>> 1));
        0Ro A00 = 0Du.A00((Object) null);
        this.A06 = A00;
        this.A07 = A00;
        this.A04 = new ConcurrentLinkedQueue();
    }

    public final void A00() {
        while (true) {
            ConcurrentLinkedQueue concurrentLinkedQueue = this.A04;
            if (!7zM.A1b(concurrentLinkedQueue)) {
                this.A00 = 07C.A03(C07y.A00, 07C.A07(0, (-1) >>> 1));
                this.A06.Cvx((Object) null);
                this.A02.A02.A00.evictAll();
                return;
            }
            Object remove = concurrentLinkedQueue.remove();
            11T.A0A(remove);
            ((C2a2) remove).AE0(null);
        }
    }
}
