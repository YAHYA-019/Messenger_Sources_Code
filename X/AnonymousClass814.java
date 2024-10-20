package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.814, reason: invalid class name */
/* loaded from: 814.class */
public final class AnonymousClass814 {
    public final 81G A00;
    public final String A01;

    public AnonymousClass814(81G r302, String str) {
        this.A00 = r302;
        this.A01 = str;
    }

    public List A00() {
        List list = this.A00.A06;
        ArrayList A0z = 1BL.A0z(list);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            A0z.add(((81E) it.next()).A01);
        }
        ArrayList A0s = AnonymousClass001.A0s();
        Iterator it2 = A0z.iterator();
        while (it2.hasNext()) {
            0QU.A0t(((DLt) it2.next()).A06, A0s);
        }
        return 9B9.A00(A0s, GBB.A00);
    }
}
