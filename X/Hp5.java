package X;

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: Hp5.class */
public final class Hp5 {
    public final /* synthetic */ JN8 A00;
    public final /* synthetic */ JG8 A01;
    public final /* synthetic */ I9S A02;
    public final /* synthetic */ AtomicInteger A03;

    public Hp5(JN8 jn8, JG8 jg8, I9S i9s, AtomicInteger atomicInteger) {
        this.A02 = i9s;
        this.A00 = jn8;
        this.A03 = atomicInteger;
        this.A01 = jg8;
    }

    public void A00() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("Track ");
        A0k.append(this.A00.BHQ());
        GOp.A1S(" has data", "RecordingThreadController", A0k);
        if (this.A03.decrementAndGet() == 0) {
            I9S i9s = this.A02;
            ICM icm = i9s.A03;
            icm.A0H = true;
            icm.A09.postDelayed(icm.A0C, icm.A0A.AeY(1007));
            java.util.Map map = i9s.A05;
            Iterator A1A = 1BK.A1A(map);
            while (A1A.hasNext()) {
                A1A.next();
            }
            Iterator A1A2 = 1BK.A1A(map);
            while (A1A2.hasNext()) {
                ((JN8) A1A2.next()).D1e(new HWq(i9s));
            }
        }
    }
}
