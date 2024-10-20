package X;

import com.facebook.memory.surfacemetrics.SurfaceLifecycleTracker;

/* renamed from: X.5qj, reason: invalid class name */
/* loaded from: 5qj.class */
public final class C5qj {
    public final int A00;
    public final String A01;
    public final String A02;

    public C5qj(String str) {
        this.A01 = str;
        int andIncrement = SurfaceLifecycleTracker.A06.getAndIncrement();
        this.A00 = andIncrement;
        this.A02 = AnonymousClass001.A0e(":", AnonymousClass001.A0n(str), andIncrement);
    }

    public String toString() {
        return this.A02;
    }
}
