package X;

import androidx.work.multiprocess.IWorkManagerImpl;
import androidx.work.multiprocess.RemoteWorkManagerClient;

/* loaded from: Lmm.class */
public final class Lmm implements Runnable {
    public static final String __redex_internal_original_name = "RemoteWorkManagerClient$11$1";
    public final /* synthetic */ IWorkManagerImpl A00;
    public final /* synthetic */ LqJ A01;

    public Lmm(IWorkManagerImpl iWorkManagerImpl, LqJ lqJ) {
        this.A01 = lqJ;
        this.A00 = iWorkManagerImpl;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            LqJ lqJ = this.A01;
            lqJ.A01.ARH(lqJ.A00, this.A00);
        } catch (Throwable th) {
            4IS.A00();
            android.util.Log.e(RemoteWorkManagerClient.A09, "Unable to execute", th);
            Lrc.A00(this.A01.A00, th);
        }
    }
}
