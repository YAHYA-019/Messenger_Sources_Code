package X;

import android.view.Choreographer;

/* renamed from: X.0G5, reason: invalid class name */
/* loaded from: 0G5.class */
public final class C0G5 implements Choreographer.FrameCallback {
    public final /* synthetic */ 0ZT A00;

    public C0G5(0ZT r302) {
        this.A00 = r302;
    }

    @Override // android.view.Choreographer.FrameCallback
    public void doFrame(long j) {
        0ZT r0 = this.A00;
        synchronized (r0) {
            r0.A07(j);
        }
    }
}
