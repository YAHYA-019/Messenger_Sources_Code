package X;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;

/* loaded from: I2Z.class */
public final class I2Z {
    public static final Executor A07 = new J5W();
    public int A00;
    public List A01;
    public final HZR A04;
    public final C2i1 A05;
    public final List A06 = new CopyOnWriteArrayList();
    public List A02 = Collections.emptyList();
    public Executor A03 = A07;

    public I2Z(HZR hzr, C2i1 c2i1) {
        this.A05 = c2i1;
        this.A04 = hzr;
    }

    public void A00(Runnable runnable, List list) {
        int i = this.A00 + 1;
        this.A00 = i;
        List list2 = this.A01;
        if (list != list2) {
            if (list == null) {
                int size = list2.size();
                this.A01 = null;
                this.A02 = Collections.emptyList();
                this.A05.CGT(0, size);
            } else if (list2 != null) {
                this.A04.A01.execute(new J2U(this, runnable, list2, list, i));
                return;
            } else {
                this.A01 = list;
                this.A02 = Collections.unmodifiableList(list);
                this.A05.C1x(0, list.size());
            }
            Iterator it = this.A06.iterator();
            while (it.hasNext()) {
                it.next();
            }
        }
        if (runnable != null) {
            runnable.run();
        }
    }
}
