package X;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;

/* renamed from: X.0f3, reason: invalid class name */
/* loaded from: 0f3.class */
public final class C0f3 {
    public static final void A00(final String str, final boolean z) {
        if (11T.A0O(Thread.currentThread(), Looper.getMainLooper().getThread())) {
            final Handler handler = C0ej.A02;
            handler.post(new Runnable(handler, str, z) { // from class: X.0em
                public static final String __redex_internal_original_name = "SlowAppComponentTracker$MainThreadPing";
                public long A00;
                public int A01;
                public final long A02;
                public final Handler A03;
                public final String A04;
                public final boolean A05;

                {
                    11T.A0F(handler, 2);
                    this.A04 = str;
                    this.A03 = handler;
                    this.A05 = z;
                    this.A02 = SystemClock.elapsedRealtime();
                    C0ej.A00++;
                }

                /* JADX WARN: Code restructure failed: missing block: B:16:0x00bf, code lost:
                
                    if (com.facebook.perf.background.BackgroundStartupDetector.A0D.A04() == false) goto L17;
                 */
                @Override // java.lang.Runnable
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public void run() {
                    /*
                        Method dump skipped, instructions count: 840
                        To view this dump change 'Code comments level' option to 'DEBUG'
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C0em.run():void");
                }
            });
        }
    }
}
