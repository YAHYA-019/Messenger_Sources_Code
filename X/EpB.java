package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* loaded from: EpB.class */
public final class EpB {
    public 02Q A00;
    public GJE A02;
    public FIm A03;
    public EZJ A04 = new Object();
    public FFQ A01 = new Object();

    /* JADX WARN: Type inference failed for: r0v1, types: [X.EZJ, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v35, types: [X.GJE, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v4, types: [X.FFQ, java.lang.Object] */
    public EpB() {
        List<C67d> list = F45.A03;
        ArrayList A1E = C1A3.A1E(list);
        for (C67d c67d : list) {
            7zU.A1Y(c67d.A01, c67d.A02, A1E);
        }
        LinkedHashMap A1C = 1BK.A1C();
        Iterator it = A1E.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            Object obj = ((03Y) next).first;
            Object obj2 = A1C.get(obj);
            if (obj2 == null) {
                obj2 = AnonymousClass001.A0s();
                A1C.put(obj, obj2);
            }
            ((List) obj2).add(next);
        }
        ArrayList A0t = AnonymousClass001.A0t(A1C.size());
        Iterator A0x = AnonymousClass001.A0x(A1C);
        while (A0x.hasNext()) {
            Map.Entry A0z = AnonymousClass001.A0z(A0x);
            Object key = A0z.getKey();
            Iterable iterable = (Iterable) A0z.getValue();
            ArrayList A1E2 = C1A3.A1E(iterable);
            Iterator it2 = iterable.iterator();
            while (it2.hasNext()) {
                A1E2.add(((03Y) it2.next()).second);
            }
            7zU.A1Y(key, 0QD.A0f(A1E2), A0t);
        }
        this.A00 = new 02Q(04R.A0B(A0t));
        this.A02 = new Object();
        this.A03 = new FIm();
    }
}
