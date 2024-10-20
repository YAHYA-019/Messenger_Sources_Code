package X;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* loaded from: I8j.class */
public final class I8j {
    public int A00;
    public final 1De A02;
    public final 1Br A05;
    public final 1Br A04 = GOn.A0P();
    public final 1Br A03 = 7zM.A0Q();
    public final 2QY A06 = Gys.A00(this, 20);
    public final 0AE A01 = new 0AE(10);

    public I8j(1De r302) {
        this.A02 = r302;
        this.A05 = GOp.A0J(r302);
    }

    public static final void A00(I8j i8j, int i, boolean z) {
        0AE r0 = i8j.A01;
        HeU heU = (HeU) C0Ak.A00(r0, i);
        if (heU != null) {
            r0.A08(i);
            if (z) {
                heU.A02.cancel(false);
            }
            heU.A00.run();
            if (r0.A00() == 0) {
                ((2QT) 4YU.A0n(1Br.A03(i8j.A05), i8j.A02, 99981)).CeZ(i8j.A06);
            }
        }
    }

    public static final boolean A01(List list) {
        boolean z = false;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                String A00 = I6L.A00(GOn.A13(it));
                if (A00 == null) {
                    break;
                }
                if (A00.length() == 0) {
                    return false;
                }
            }
        }
        z = true;
        return z;
    }

    public final void A02() {
        7zS.A1H(this.A03);
        0AE r0 = this.A01;
        int A00 = r0.A00();
        for (int i = 0; i < A00; i++) {
            HeU heU = (HeU) r0.A05(i);
            if (heU != null) {
                heU.A02.cancel(false);
            }
        }
        r0.A06();
        ((2QT) 4YU.A0n(1Br.A03(this.A05), this.A02, 99981)).CeZ(this.A06);
    }

    public final void A03(Runnable runnable, List list) {
        7zS.A1H(this.A03);
        if (A01(list)) {
            runnable.run();
            return;
        }
        int i = this.A00;
        this.A00 = i + 1;
        ScheduledFuture<?> schedule = GOp.A1H(this.A04).schedule(new Iwz(this, i), 2000L, TimeUnit.MILLISECONDS);
        0AE r0 = this.A01;
        if (r0.A00() == 0) {
            ((2QT) 4YU.A0n(1Br.A03(this.A05), this.A02, 99981)).A67(this.A06);
        }
        ArrayList A0z = 1BL.A0z(list);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            A0z.add(I9O.A01(it));
        }
        Set A0f = 0QD.A0f(A0z);
        11T.A0D(schedule);
        r0.A09(i, new HeU(runnable, A0f, schedule));
    }
}
