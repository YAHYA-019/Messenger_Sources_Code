package X;

import java.util.ArrayDeque;

/* renamed from: X.49s, reason: invalid class name */
/* loaded from: 49s.class */
public final class C49s implements C49p {
    public final int A00;
    public final C49p A01;
    public final /* synthetic */ 49P A02;

    public C49s(C49p c49p, 49P r303, int i) {
        this.A02 = r303;
        this.A00 = i;
        this.A01 = c49p;
    }

    @Override // X.C49p
    public void Bwz() {
        int i = this.A00;
        0fH.A0g(Integer.valueOf(i), "UploadJobHandlerManager", "onExit jobId: %d");
        49P r0 = this.A02;
        synchronized (r0) {
            C49r c49r = (C49r) r0.A05.get(i);
            if (c49r != null) {
                c49r.A00 = null;
                c49r.A00 = null;
                ArrayDeque arrayDeque = c49r.A01;
                if (arrayDeque != null) {
                    Runnable runnable = (Runnable) arrayDeque.poll();
                    if (runnable != null) {
                        runnable.run();
                    }
                }
            }
            this.A01.Bwz();
        }
    }

    @Override // X.C49p
    public void CUy(boolean z) {
        0fH.A0g(Integer.valueOf(this.A00), "UploadJobHandlerManager", "onVoluntaryCompletion jobId: %d");
        this.A01.CUy(z);
    }
}
