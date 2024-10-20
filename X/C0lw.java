package X;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* renamed from: X.0lw, reason: invalid class name */
/* loaded from: 0lw.class */
public final class C0lw {
    public int A00 = 0;
    public final ArrayList A01 = AnonymousClass001.A0s();

    public int A00(Iterable iterable) {
        int i = 0;
        if (iterable == null) {
            return 0;
        }
        synchronized (this.A01) {
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                i |= A01(it.next());
            }
        }
        return i;
    }

    public int A01(Object obj) {
        int i;
        ArrayList arrayList = this.A01;
        synchronized (arrayList) {
            Iterator it = arrayList.iterator();
            i = 0;
            int i2 = 0;
            while (true) {
                int i3 = i2;
                if (it.hasNext()) {
                    if (it.next().equals(obj)) {
                        i |= 1 << i3;
                    }
                    i2 = i3 + 1;
                }
            }
        }
        return i;
    }

    public int A02(Object obj) {
        int i;
        ArrayList arrayList = this.A01;
        synchronized (arrayList) {
            int i2 = this.A00;
            if (i2 >= 32) {
                throw AnonymousClass001.A0N("Attempting to newEntry more than 32 entries.");
            }
            arrayList.add(obj);
            i = 1 << i2;
            this.A00 = i2 + 1;
        }
        return i;
    }

    public HashSet A03(int i) {
        HashSet A0v = AnonymousClass001.A0v();
        ArrayList arrayList = this.A01;
        synchronized (arrayList) {
            Iterator it = arrayList.iterator();
            int i2 = 1;
            while (true) {
                int i3 = i2;
                if (it.hasNext()) {
                    Object next = it.next();
                    if ((i3 & i) != 0) {
                        A0v.add(next);
                    }
                    i2 = i3 << 1;
                }
            }
        }
        return A0v;
    }
}
