package X;

import java.io.IOException;
import java.util.ConcurrentModificationException;

/* loaded from: Lbd.class */
public final class Lbd implements 6ZQ {
    public final MG7 A00;

    public Lbd(MG7 mg7) {
        this.A00 = mg7;
    }

    public void C3r(C6a9 c6a9, long j, long j2, boolean z) {
    }

    public void C3v(C6a9 c6a9, long j, long j2) {
        boolean z;
        MG7 mg7 = this.A00;
        synchronized (I6w.A03) {
            z = I6w.A01;
        }
        if (z) {
            mg7.C1j();
        } else {
            6ZY.A05(((Lc0) mg7).A00, new IOException(new ConcurrentModificationException()));
        }
    }

    public C6a0 C41(C6a9 c6a9, IOException iOException, int i, long j, long j2) {
        6ZY.A05(((Lc0) this.A00).A00, iOException);
        return 6Zy.A09;
    }

    public void C4M(C6a9 c6a9, IOException iOException, int i, long j, long j2, boolean z) {
    }

    public /* synthetic */ void C4R(C6a9 c6a9, int i, long j, long j2) {
    }
}
