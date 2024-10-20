package X;

import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: X.9kz, reason: invalid class name */
/* loaded from: 9kz.class */
public final class C9kz {
    public 82V A00 = new 82V((DefaultConstructorMarker) null, 15, 1, false, false, false, false);
    public C5jn A01;
    public boolean A02;
    public boolean A03;
    public boolean A04;
    public final Set A05;

    public C9kz() {
        Set newSetFromMap = Collections.newSetFromMap(new ConcurrentHashMap());
        11T.A0A(newSetFromMap);
        this.A05 = newSetFromMap;
    }

    public static final void A00(C9kz c9kz) {
        C5jn c5jn = c9kz.A01;
        if (c5jn != null) {
            c5jn.A00(c9kz.A00);
        }
        Iterator it = c9kz.A05.iterator();
        while (it.hasNext()) {
            ((C6s7) it.next()).A00(c9kz.A00.A00());
        }
    }

    public static final void A01(C9kz c9kz, boolean z) {
        if (c9kz.A03 != z) {
            c9kz.A03 = z;
            Iterator it = c9kz.A05.iterator();
            while (it.hasNext()) {
                ((C6s7) it.next()).A01(c9kz.A03);
            }
        }
    }

    public final void A02(boolean z) {
        82V r0 = this.A00;
        this.A00 = new 82V(r0.A00, 1, r0.A03, z, r0.A01);
        A00(this);
    }
}
