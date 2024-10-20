package X;

import android.util.SparseArray;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Queue;

/* renamed from: X.2j0, reason: invalid class name */
/* loaded from: 2j0.class */
public final class C2j0 {
    public final ThreadLocal A03 = new ThreadLocal();
    public final ThreadLocal A02 = new ThreadLocal();
    public final SparseArray A00 = new SparseArray();
    public final C2j1 A01 = new C2j1();

    public static void A00(ArrayList arrayList) {
        int size = arrayList.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            Reference reference = (Reference) arrayList.get(i2);
            if (reference.get() != null) {
                arrayList.set(i, reference);
                i++;
            }
        }
        int size2 = arrayList.size();
        while (true) {
            size2--;
            if (size2 < i) {
                return;
            } else {
                arrayList.remove(size2);
            }
        }
    }

    public void A01(Object obj) {
        ThreadLocal threadLocal;
        if (!(obj instanceof C2mq)) {
            StringBuilder A0k = AnonymousClass001.A0k();
            A0k.append("Event ");
            A0k.append(obj);
            throw new ClassCastException(AnonymousClass001.A0d(" must be annotated with @BusEvent, it's also possible that a recent conversion to Kotlin in the module was done incorrectly and you must add the generated methods manually", A0k));
        }
        C2mq c2mq = (C2mq) obj;
        Boolean bool = Boolean.TRUE;
        ThreadLocal threadLocal2 = this.A03;
        if (bool.equals(threadLocal2.get())) {
            ThreadLocal threadLocal3 = this.A02;
            Queue queue = (Queue) threadLocal3.get();
            if (queue == null) {
                queue = new ArrayDeque();
                threadLocal3.set(queue);
            }
            queue.add(c2mq);
            return;
        }
        threadLocal2.set(true);
        do {
            int AU8 = c2mq.AU8();
            SparseArray sparseArray = this.A00;
            synchronized (sparseArray) {
                ArrayList arrayList = (ArrayList) sparseArray.get(AU8);
                if (arrayList != null) {
                    A00(arrayList);
                    ArrayList arrayList2 = new ArrayList(arrayList.size());
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        C2iz c2iz = (C2iz) ((WeakReference) it.next()).get();
                        if (c2iz != null) {
                            arrayList2.add(c2iz);
                        }
                    }
                    Iterator it2 = arrayList2.iterator();
                    while (it2.hasNext()) {
                        ((C2iz) it2.next()).AUA(c2mq);
                    }
                }
            }
            threadLocal = this.A02;
            if (threadLocal.get() == null) {
                break;
            } else {
                c2mq = (C2mq) ((Queue) threadLocal.get()).poll();
            }
        } while (c2mq != null);
        threadLocal.set(null);
        threadLocal2.set(false);
    }

    public void A02(Object obj) {
        if (!(obj instanceof C2iz)) {
            StringBuilder A0k = AnonymousClass001.A0k();
            A0k.append("Subscriber ");
            A0k.append(obj);
            throw new ClassCastException(AnonymousClass001.A0d(" must be annotated with @BusSubscriber, it's also possible that a recent conversion to Kotlin in the module was done incorrectly and you must add the generated methods manually", A0k));
        }
        C2iz c2iz = (C2iz) obj;
        C2j1 c2j1 = this.A01;
        synchronized (c2j1) {
            c2j1.A00 = 0;
            c2iz.AU9(c2j1);
            int i = c2j1.A00;
            for (int i2 = 0; i2 < i; i2++) {
                int i3 = c2j1.A01[i2];
                SparseArray sparseArray = this.A00;
                synchronized (sparseArray) {
                    ArrayList arrayList = (ArrayList) sparseArray.get(i3);
                    if (arrayList != null) {
                        A00(arrayList);
                        Iterator it = arrayList.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                if (((Reference) it.next()).get() == c2iz) {
                                    break;
                                }
                            } else {
                                arrayList.add(new WeakReference(c2iz));
                                break;
                            }
                        }
                    } else {
                        ArrayList arrayList2 = new ArrayList();
                        arrayList2.add(new WeakReference(c2iz));
                        sparseArray.put(i3, arrayList2);
                    }
                }
            }
        }
    }

    public void A03(Object obj) {
        if (!(obj instanceof C2iz)) {
            StringBuilder A0k = AnonymousClass001.A0k();
            A0k.append("Subscriber ");
            A0k.append(obj);
            throw new ClassCastException(AnonymousClass001.A0d(" must be annotated with @BusSubscriber, it's also possible that a recent conversion to Kotlin in the module was done incorrectly and you must add the generated methods manually", A0k));
        }
        C2iz c2iz = (C2iz) obj;
        C2j1 c2j1 = this.A01;
        synchronized (c2j1) {
            c2j1.A00 = 0;
            c2iz.AU9(c2j1);
            int i = c2j1.A00;
            for (int i2 = 0; i2 < i; i2++) {
                int i3 = c2j1.A01[i2];
                SparseArray sparseArray = this.A00;
                synchronized (sparseArray) {
                    ArrayList arrayList = (ArrayList) sparseArray.get(i3);
                    if (arrayList != null) {
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            Reference reference = (Reference) it.next();
                            if (reference.get() == c2iz) {
                                reference.clear();
                            }
                        }
                        A00(arrayList);
                        if (arrayList.isEmpty()) {
                            sparseArray.remove(i3);
                        }
                    }
                }
            }
        }
    }
}
