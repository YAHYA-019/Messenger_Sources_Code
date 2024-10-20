package X;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.functions.Function1;

/* loaded from: HuG.class */
public abstract class HuG {
    public final HashMap A00 = AnonymousClass001.A0u();

    public final int A00(Object obj) {
        int size;
        synchronized (this) {
            List A1I = GOn.A1I(obj, this.A00);
            size = A1I != null ? A1I.size() : 0;
        }
        return size;
    }

    public final void A01(Object obj, Object obj2) {
        synchronized (this) {
            HashMap hashMap = this.A00;
            List A1I = GOn.A1I(obj, hashMap);
            if (A1I == null) {
                CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
                copyOnWriteArrayList.add(obj2);
                hashMap.put(obj, copyOnWriteArrayList);
            } else {
                A1I.add(obj2);
            }
        }
    }

    public final void A02(Function1 function1, Object obj) {
        synchronized (this) {
            A03(function1, obj);
            this.A00.remove(obj);
        }
    }

    public final void A03(Function1 function1, Object obj) {
        synchronized (this) {
            List A1I = GOn.A1I(obj, this.A00);
            if (A1I != null) {
                Iterator it = A1I.iterator();
                while (it.hasNext()) {
                    function1.invoke(it.next());
                }
            }
        }
    }
}
