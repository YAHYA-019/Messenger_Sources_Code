package X;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: Iv8.class */
public final class Iv8 implements Runnable {
    public static final String __redex_internal_original_name = "AsyncListDiffer$1$2";
    public final /* synthetic */ J2U A00;
    public final /* synthetic */ C2hy A01;

    public Iv8(J2U j2u, C2hy c2hy) {
        this.A00 = j2u;
        this.A01 = c2hy;
    }

    @Override // java.lang.Runnable
    public void run() {
        J2U j2u = this.A00;
        I2Z i2z = j2u.A01;
        if (i2z.A00 == j2u.A00) {
            List list = j2u.A03;
            C2hy c2hy = this.A01;
            Runnable runnable = j2u.A02;
            i2z.A01 = list;
            i2z.A02 = Collections.unmodifiableList(list);
            c2hy.A01(i2z.A05);
            Iterator it = i2z.A06.iterator();
            while (it.hasNext()) {
                it.next();
            }
            if (runnable != null) {
                runnable.run();
            }
        }
    }
}
