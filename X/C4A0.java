package X;

import java.io.File;
import java.io.FileFilter;
import java.util.ArrayDeque;
import java.util.Comparator;
import java.util.Iterator;

/* renamed from: X.4A0, reason: invalid class name */
/* loaded from: 4A0.class */
public final class C4A0 implements Iterator {
    public 4AT A00;
    public boolean A01;
    public final ArrayDeque A02 = new ArrayDeque();
    public static final FileFilter A03 = new 31X(1);
    public static final Comparator A05 = new 4XY(0);
    public static final Comparator A04 = new 4XY(1);

    public C4A0(File file, boolean z) {
        C4A2 c4a2 = new C4A2(file, z);
        c4a2.A00 = A03;
        Iterator A00 = c4a2.A00();
        while (A00.hasNext()) {
            this.A02.addLast(new 4AK((C4A3) A00.next()));
        }
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        4AT r306;
        C4A3 c4a3;
        int i;
        boolean z = true;
        if (!this.A01) {
            this.A01 = true;
            while (true) {
                ArrayDeque arrayDeque = this.A02;
                r306 = null;
                if (arrayDeque.isEmpty()) {
                    break;
                }
                4AK r0 = (4AK) arrayDeque.getFirst();
                c4a3 = r0.A02;
                Iterator it = r0.A01;
                if (it == null) {
                    it = c4a3.A00();
                    r0.A01 = it;
                }
                if (it.hasNext()) {
                    r0.A00++;
                    Iterator it2 = r0.A01;
                    if (it2 == null) {
                        it2 = c4a3.A00();
                        r0.A01 = it2;
                    }
                    arrayDeque.addFirst(new 4AK((C4A3) it2.next()));
                    if (r0.A00 == 1) {
                        i = 1;
                        break;
                    }
                } else {
                    arrayDeque.removeFirst();
                    i = 3;
                    if (c4a3 instanceof C4A2) {
                        i = 2;
                    }
                }
            }
            r306 = new 4AT(c4a3, i);
            this.A00 = r306;
        }
        if (this.A00 == null) {
            z = false;
        }
        return z;
    }

    @Override // java.util.Iterator
    public /* bridge */ /* synthetic */ Object next() {
        if (!hasNext()) {
            throw new IllegalStateException();
        }
        4AT r0 = this.A00;
        this.A00 = null;
        this.A01 = false;
        return r0;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw AnonymousClass001.A0p();
    }
}
