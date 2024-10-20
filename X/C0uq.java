package X;

import android.os.Looper;
import android.os.Message;
import android.os.Process;

/* renamed from: X.0uq, reason: invalid class name */
/* loaded from: 0uq.class */
public final class C0uq implements 0Wr {
    public final 0Lz A01;
    public final C01i A02 = C01g.A00(C03i.A02, new 0kZ(this));
    public final int A00 = -14;

    public C0uq(0Lz r302) {
        this.A01 = r302;
    }

    public void AT4(Message message) {
    }

    public void AT7() {
    }

    public void D1b(Message message) {
        Process.setThreadPriority(this.A00);
    }

    public void D1n(Looper looper, String str) {
    }

    public void D1x() {
    }
}
