package X;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/* loaded from: Lqd.class */
public final class Lqd implements Runnable {
    public static final String __redex_internal_original_name = "OxygenInstaller$startInstall$1";
    public final /* synthetic */ 2vH A00;
    public final /* synthetic */ 3QA A01;
    public final /* synthetic */ L2V A02;
    public final /* synthetic */ boolean A03;

    public Lqd(2vH r302, 3QA r303, L2V l2v, boolean z) {
        this.A02 = l2v;
        this.A01 = r303;
        this.A00 = r302;
        this.A03 = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        L2V l2v = this.A02;
        3QA r0 = this.A01;
        2vH r02 = this.A00;
        boolean z = this.A03;
        Set set = r0.A02;
        ArrayList A0y = 7zO.A0y(set);
        for (Object obj : set) {
            if (00Y.A00().A03((String) obj) != null) {
                A0y.add(obj);
            }
        }
        List A0V = 0QD.A0V(A0y);
        if (A0V.isEmpty()) {
            0fH.A0n("OxygenInstaller", "Empty module names list in request. Returning success.");
            r02.A01(new C3O1(null, null, 1));
            return;
        }
        0fH.A0j("OxygenInstaller", "start to install.");
        try {
            l2v.A02.A00.markerPoint(11351645, r0.A00, "api_call_start");
            long A03 = l2v.A01.A03(A0V, z);
            if (A03 == -1) {
                r02.A00(AnonymousClass001.A0T("Installation failed. Oxygen returned INVALID_SESSION_ID."));
                return;
            }
            synchronized (l2v.A03) {
                l2v.A04.put(Long.valueOf(A03), new C3Lx(r02, r0));
            }
        } catch (Throwable th) {
            0fH.A0r("OxygenInstaller", "exception thrown while installing.", th);
            String message = th.getMessage();
            if (message == null) {
                message = "installation failed.";
            }
            r02.A00(AnonymousClass001.A0T(message));
        }
    }
}
