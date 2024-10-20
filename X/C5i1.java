package X;

import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.5i1, reason: invalid class name */
/* loaded from: 5i1.class */
public final class C5i1 {
    public static C5i1 A02 = new C5i1();
    public Choreographer A00;
    public final Handler A01;

    public C5i1() {
        if (2JB.A03()) {
            this.A00 = Choreographer.getInstance();
            return;
        }
        Handler handler = new Handler(Looper.getMainLooper());
        this.A01 = handler;
        handler.post(new Runnable() { // from class: X.323
            public static final String __redex_internal_original_name = "ChoreographerCompatImpl$1";

            @Override // java.lang.Runnable
            public void run() {
                C5i1 c5i1 = C5i1.this;
                C5i1 c5i12 = C5i1.A02;
                c5i1.A00 = Choreographer.getInstance();
            }
        });
    }

    public static C5i1 A00() {
        return A02;
    }

    public void A01(2XX r302) {
        AtomicReference atomicReference = r302.A02;
        1N5 r0 = 1N9.A00;
        atomicReference.set(r0 == null ? null : AnonymousClass018.A03("ChoreographerCompat_postFrameCallback", ((1N6) r0).A00));
        Choreographer choreographer = this.A00;
        if (choreographer != null) {
            JRT jrt = r302.A00;
            if (jrt == null) {
                jrt = new JRT(r302, 1);
                r302.A00 = jrt;
            }
            choreographer.postFrameCallback(jrt);
            return;
        }
        Handler handler = this.A01;
        Runnable runnable = r302.A01;
        if (runnable == null) {
            runnable = new AnonymousClass324(r302);
            r302.A01 = runnable;
        }
        handler.postDelayed(runnable, 0L);
    }

    public void A02(2XX r302, long j) {
        AtomicReference atomicReference = r302.A02;
        1N5 r0 = 1N9.A00;
        atomicReference.set(r0 == null ? null : AnonymousClass018.A03("ChoreographerCompat_postFrameCallbackDelayed", ((1N6) r0).A00));
        Choreographer choreographer = this.A00;
        if (choreographer != null) {
            JRT jrt = r302.A00;
            if (jrt == null) {
                jrt = new JRT(r302, 1);
                r302.A00 = jrt;
            }
            choreographer.postFrameCallbackDelayed(jrt, j);
            return;
        }
        Handler handler = this.A01;
        Runnable runnable = r302.A01;
        if (runnable == null) {
            runnable = new AnonymousClass324(r302);
            r302.A01 = runnable;
        }
        handler.postDelayed(runnable, j + 17);
    }
}
