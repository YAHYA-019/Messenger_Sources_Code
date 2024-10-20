package X;

import com.facebook.quicklog.QuickEventFilter;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.3wu, reason: invalid class name and case insensitive filesystem */
/* loaded from: 3wu.class */
public final class C03013wu implements 1KC {
    public final 1K6 A00;
    public final InterfaceC03003wt A01;

    public C03013wu(1K6 r302, InterfaceC03003wt interfaceC03003wt) {
        this.A01 = interfaceC03003wt;
        this.A00 = r302;
    }

    public void ATX(1LL r302) {
        1K6 r0 = this.A00;
        r0.D4e((0El) null, 1);
        try {
            InterfaceC03003wt interfaceC03003wt = this.A01;
            int size = interfaceC03003wt.size();
            int i = 0;
            while (true) {
                int i2 = i;
                if (i2 >= size) {
                    return;
                }
                r302.ARE((1Qb) interfaceC03003wt.valueAt(i2));
                i = i2 + 1;
            }
        } finally {
            r0.D4f((0El) null, 1);
        }
    }

    public 1Qb AUp(0El r302, long j) {
        1K6 r0 = this.A00;
        r0.D4e(r302, 0);
        try {
            return (1Qb) this.A01.get(j);
        } finally {
            r0.D4f(r302, 0);
        }
    }

    public void CZy(0El r302, 1Qb r303, long j) {
        1K6 r0 = this.A00;
        r0.D4e((0El) null, 1);
        try {
            this.A01.put(j, r303);
        } finally {
            r0.D4f((0El) null, 1);
        }
    }

    public 1Qb Cdq(0El r302, long j) {
        1K6 r0 = this.A00;
        r0.D4e((0El) null, 1);
        try {
            InterfaceC03003wt interfaceC03003wt = this.A01;
            1Qb r02 = (1Qb) interfaceC03003wt.get(j);
            interfaceC03003wt.remove(j);
            return r02;
        } finally {
            r0.D4f((0El) null, 1);
        }
    }

    public ArrayList Ce6(0El r302, QuickEventFilter quickEventFilter) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        1K6 r0 = this.A00;
        try {
            InterfaceC03003wt interfaceC03003wt = this.A01;
            int size = interfaceC03003wt.size();
            for (int i = 0; i < size; i++) {
                1Qb r02 = (1Qb) interfaceC03003wt.valueAt(i);
                if (quickEventFilter.shouldRemove(r02)) {
                    arrayList2.add(r02);
                } else {
                    arrayList.add(r02);
                }
            }
            r0.D4e((0El) null, 1);
            try {
                interfaceC03003wt.clear();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    1Qb r03 = (1Qb) it.next();
                    interfaceC03003wt.put(1KI.A00(r03.A03, r03.A02), r03);
                }
                return arrayList2;
            } finally {
                r0.D4f((0El) null, 1);
            }
        } finally {
            r0.D4f((0El) null, 1);
        }
    }

    public int D0e(0El r302) {
        1K6 r0 = this.A00;
        r0.D4e((0El) null, 1);
        try {
            return this.A01.size();
        } finally {
            r0.D4f((0El) null, 1);
        }
    }
}
