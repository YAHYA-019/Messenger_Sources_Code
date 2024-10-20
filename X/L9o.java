package X;

import java.util.Set;
import java.util.concurrent.ExecutorService;

/* loaded from: L9o.class */
public abstract class L9o {
    public static final byte[] A04 = new byte[0];
    public static final Object A05 = AnonymousClass001.A0R();
    public final java.util.Map A00;
    public final java.util.Map A01;
    public final Kq4 A02;
    public final Set A03;

    public L9o(Kq4 kq4) {
        this.A02 = kq4;
        kq4.A00(new LXR());
        this.A00 = JQx.A13();
        this.A01 = JQx.A13();
        this.A03 = AnonymousClass001.A0v();
    }

    public static final void A00(L9o l9o, AZ9 az9, String str) {
        java.util.Map map = l9o.A00;
        if (!map.containsKey(str)) {
            JpY jpY = (JpY) l9o;
            1Ve r0 = jpY.A01;
            ExecutorService executorService = jpY.A02;
            4CZ r02 = new 4CZ(r0, executorService);
            map.put(str, new C4Cc(jpY.A00, new C4QN(r0, str, executorService), r02, str));
        }
        l9o.A02.A00(new Rt9(l9o, az9, str));
    }

    public static final void A01(L9o l9o, String str) {
        boolean contains;
        synchronized (A05) {
            contains = l9o.A03.contains(str);
        }
        if (contains) {
            return;
        }
        l9o.A01.get(str);
    }
}
