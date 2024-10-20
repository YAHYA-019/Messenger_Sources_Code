package X;

import android.content.Context;
import android.content.ContextWrapper;
import android.os.Handler;
import androidx.fragment.app.Fragment;

/* renamed from: X.3i1, reason: invalid class name */
/* loaded from: 3i1.class */
public final class C3i1 implements Runnable {
    public static final String __redex_internal_original_name = "CDSBloksBottomSheetController$performFragmentTask$1";
    public Throwable A00;
    public final /* synthetic */ Handler A01;
    public final /* synthetic */ Fragment A02;
    public final /* synthetic */ Runnable A03;

    public C3i1(Handler handler, Fragment fragment, Runnable runnable) {
        this.A02 = fragment;
        this.A01 = handler;
        this.A03 = runnable;
        Thread currentThread = Thread.currentThread();
        this.A00 = new Throwable(0Pz.A0t("Runnable instantiated on thread id: ", ", name: ", currentThread.getName(), currentThread.getId()));
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            Fragment fragment = this.A02;
            Context context = fragment.getContext();
            boolean z = true;
            boolean A1T = AnonymousClass001.A1T(fragment.mView);
            boolean A1U = AnonymousClass001.A1U(context);
            if (!(context instanceof ContextWrapper) || ((ContextWrapper) context).getBaseContext() != null) {
                z = false;
            }
            if (!A1T || A1U || z) {
                this.A01.post(this);
            } else {
                this.A03.run();
            }
        } catch (Throwable th) {
            Throwable th2 = this.A00;
            0fH.A0n("CDSThreadTracing", "--- start debug trace");
            0fH.A0u("CDSThreadTracing", "Thread tracing stacktrace", th2);
            0fH.A0n("CDSThreadTracing", "--- end debug trace");
            throw th;
        }
    }
}
