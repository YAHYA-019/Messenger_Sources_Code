package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.2jy, reason: invalid class name */
/* loaded from: 2jy.class */
public final class C2jy implements Iterator {
    public int A00;
    public int A01;
    public final List A02;
    public final boolean A03;

    public C2jy(List list, int i, int i2, boolean z) {
        this.A02 = new ArrayList(list);
        this.A00 = z ? i - 1 : i + 1;
        this.A01 = i2;
        this.A03 = z;
    }

    @Override // java.util.Iterator
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    public 2iK next() {
        2iK r304;
        synchronized (this) {
            if (hasNext()) {
                r304 = (2iK) this.A02.get(this.A00);
                boolean z = this.A03;
                int i = this.A00;
                int i2 = i + 1;
                if (z) {
                    i2 = i - 1;
                }
                this.A00 = i2;
                this.A01--;
            } else {
                r304 = null;
            }
        }
        return r304;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        int i;
        while (this.A01 > 0 && (i = this.A00) >= 0) {
            List list = this.A02;
            if (i >= list.size()) {
                return false;
            }
            2iK r0 = (2iK) list.get(this.A00);
            if (r0.A02().Cfi() && !r0.A09()) {
                return true;
            }
            boolean z = this.A03;
            int i2 = this.A00;
            int i3 = i2 + 1;
            if (z) {
                i3 = i2 - 1;
            }
            this.A00 = i3;
        }
        return false;
    }

    @Override // java.util.Iterator
    public void remove() {
    }
}
