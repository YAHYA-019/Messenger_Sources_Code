package X;

import com.facebook.debug.activitytracer.ActivityTracer;

/* renamed from: X.4Fh, reason: invalid class name */
/* loaded from: 4Fh.class */
public final class C4Fh implements Runnable {
    public static final String __redex_internal_original_name = "ActivityTracer$2";
    public final /* synthetic */ ActivityTracer A00;

    public C4Fh(ActivityTracer activityTracer) {
        this.A00 = activityTracer;
    }

    @Override // java.lang.Runnable
    public void run() {
        ActivityTracer activityTracer = this.A00;
        C4Dv c4Dv = activityTracer.A00;
        if (c4Dv != null) {
            0JQ r0 = c4Dv.A08;
            long j = r0.A00;
            if (j == -1) {
                j = System.nanoTime();
            }
            c4Dv.A00 = (j - r0.A02) / 1000000;
            ActivityTracer.A02(activityTracer, "draw");
        }
    }
}
