package X;

import android.os.Process;

/* renamed from: X.3qj, reason: invalid class name and case insensitive filesystem */
/* loaded from: 3qj.class */
public final class C01263qj {
    public final C00i A00 = new 1BQ(16772);

    /* JADX WARN: Type inference failed for: r0v48, types: [X.2J3, X.4P6] */
    public void A00(String str, long j, String str2) {
        synchronized (this) {
            0fH.A0V(str, C01263qj.class, "Waited for collection: %s %d ms", Long.valueOf(j));
            C1kw c1kw = (C1kw) this.A00.get();
            if (C4P6.A00 == null) {
                synchronized (C4P6.class) {
                    if (C4P6.A00 == null) {
                        C4P6.A00 = new C2J3(c1kw);
                    }
                }
            }
            AbstractC01593ro A3u = C4P6.A00.A00.A3u("contacts_waited_on_collection", false);
            if (A3u.A0B()) {
                A3u.A06("call_site", str);
                A3u.A05("wait_time_ms", j);
                A3u.A05("process_uptime_ms", Process.getElapsedCpuTime());
                A3u.A06("error", str2);
                A3u.A0A();
            }
        }
    }
}
