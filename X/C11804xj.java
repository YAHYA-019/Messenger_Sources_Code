package X;

import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.4xj, reason: invalid class name and case insensitive filesystem */
/* loaded from: 4xj.class */
public final class C11804xj {
    public final Set A03 = Collections.newSetFromMap(new ConcurrentHashMap());
    public final 1Br A00 = 1Bq.A00(33026);
    public final 1Br A02 = 1Bq.A00(16504);
    public final 1Br A01 = 1Bq.A00(16511);

    public final void A00(InterfaceC09644qs interfaceC09644qs) {
        11T.A0F(interfaceC09644qs, 0);
        Class<?> cls = interfaceC09644qs.getClass();
        Set set = this.A03;
        Iterator it = set.iterator();
        while (it.hasNext()) {
            Class<?> cls2 = it.next().getClass();
            if (11T.A0O(cls2, cls)) {
                C00i c00i = this.A01.A00;
                ((C01s) c00i.get()).D11("LocaleChangeController", 0Pz.A0W("Unregistered LocaleChangeListener. This shouldn't need to happen: ", cls2.getName()));
                ((C01s) c00i.get()).D11("LocaleChangeController", 0Pz.A0W("Registered LocaleChangeListener unexpected again: ", cls.getName()));
            }
        }
        set.add(interfaceC09644qs);
    }
}
