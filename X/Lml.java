package X;

import androidx.work.multiprocess.IListenableWorkerImpl;

/* loaded from: Lml.class */
public final class Lml implements Runnable {
    public static final String __redex_internal_original_name = "ListenableWorkerImplClient$1$1";
    public final /* synthetic */ IListenableWorkerImpl A00;
    public final /* synthetic */ LqI A01;

    public Lml(IListenableWorkerImpl iListenableWorkerImpl, LqI lqI) {
        this.A01 = lqI;
        this.A00 = iListenableWorkerImpl;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            LqI lqI = this.A01;
            lqI.A02.ARH(lqI.A01, this.A00);
        } catch (Throwable th) {
            4IS.A00();
            android.util.Log.e(L2M.A04, "Unable to execute", th);
            Lrc.A00(this.A01.A01, th);
        }
    }
}
