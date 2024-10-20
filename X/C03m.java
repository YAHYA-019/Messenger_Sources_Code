package X;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: X.03m, reason: invalid class name */
/* loaded from: 03m.class */
public final class C03m {
    public int A00;
    public ArrayList A01;
    public List A02;

    public C03m() {
        ArrayList arrayList = new ArrayList();
        this.A01 = arrayList;
        this.A02 = Collections.unmodifiableList(arrayList);
    }

    public List A00() {
        List list;
        synchronized (this) {
            list = this.A02;
            this.A00++;
        }
        return list;
    }

    public void A01() {
        synchronized (this) {
            this.A00--;
        }
    }

    public void A02(Object obj) {
        synchronized (this) {
            if (this.A00 > 0) {
                ArrayList arrayList = this.A01;
                int size = arrayList.size();
                ArrayList A0t = AnonymousClass001.A0t(size + 1);
                this.A01 = A0t;
                this.A02 = Collections.unmodifiableList(A0t);
                int i = 0;
                while (true) {
                    int i2 = i;
                    if (i2 >= size) {
                        break;
                    }
                    this.A01.add(arrayList.get(i2));
                    i = i2 + 1;
                }
            }
            this.A01.add(obj);
        }
    }

    public void A03(Object obj) {
        synchronized (this) {
            if (!this.A01.contains(obj)) {
                A02(obj);
            }
        }
    }

    public void A04(Object obj) {
        synchronized (this) {
            if (this.A00 <= 0) {
                this.A01.remove(obj);
            } else {
                int indexOf = this.A01.indexOf(obj);
                if (indexOf >= 0) {
                    ArrayList arrayList = this.A01;
                    int size = arrayList.size();
                    ArrayList arrayList2 = new ArrayList(size - 1);
                    this.A01 = arrayList2;
                    this.A02 = Collections.unmodifiableList(arrayList2);
                    for (int i = 0; i < size; i++) {
                        if (i != indexOf) {
                            this.A01.add(arrayList.get(i));
                        }
                    }
                }
            }
        }
    }
}
