package X;

import android.view.Choreographer;

/* renamed from: X.3Tf, reason: invalid class name */
/* loaded from: 3Tf.class */
public final class C3Tf {
    public static final void hookDoFrame(Choreographer choreographer, long j, int i) {
        0QE.A01(262144L, "doFrame", 1052786259);
        throw AnonymousClass001.A0T("Stub!");
    }

    public static final void hookRun(Object obj, long j) {
        0QE.A01(262144L, "CallbackRun", -410036786);
        originalRun(obj, j);
        throw 0Q8.createAndThrow();
    }

    public static final void hookScheduleVsyncLocked(Choreographer choreographer) {
        0QE.A01(262144L, "scheduleVsyncLocked", -933549441);
        originalScheduleVsyncLocked(choreographer);
        throw 0Q8.createAndThrow();
    }

    public static final void originalDoFrame(Choreographer choreographer, long j, int i) {
        throw AnonymousClass001.A0T("Stub!");
    }

    public static final void originalRun(Object obj, long j) {
        throw AnonymousClass001.A0T("Stub!");
    }

    public static final void originalScheduleVsyncLocked(Choreographer choreographer) {
        throw AnonymousClass001.A0T("Stub!");
    }
}
