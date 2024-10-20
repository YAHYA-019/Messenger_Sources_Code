package X;

import android.util.Pair;
import java.util.Iterator;

/* renamed from: X.4bj, reason: invalid class name and case insensitive filesystem */
/* loaded from: 4bj.class */
public final class C04634bj extends AbstractC04434ay {
    public final /* synthetic */ C04584be A00;

    public C04634bj(C04584be c04584be) {
        this.A00 = c04584be;
    }

    @Override // X.AbstractC04434ay
    public void A04(float f) {
        try {
            if (2D9.A00().BWo()) {
                2D9.A02("MultiplexProducer#onProgressUpdate");
            }
            C04584be c04584be = this.A00;
            synchronized (c04584be) {
                try {
                    if (c04584be.A03 == this) {
                        c04584be.A00 = f;
                        Iterator it = c04584be.A06.iterator();
                        while (it.hasNext()) {
                            Pair pair = (Pair) it.next();
                            synchronized (pair) {
                                try {
                                    ((InterfaceC04444az) pair.first).CEP(f);
                                } catch (Throwable th) {
                                    th = th;
                                    throw th;
                                }
                            }
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            }
            if (2D9.A00().BWo()) {
                2D9.A01();
            }
        } catch (Throwable th3) {
            4YV.A14();
            throw th3;
        }
    }
}
