package X;

import java.util.Iterator;

/* renamed from: X.0nh, reason: invalid class name */
/* loaded from: 0nh.class */
public final class C0nh implements Iterator, AnonymousClass116 {
    public int A00;
    public final int A01 = 0;
    public final Object A02;

    public C0nh(0AE r302) {
        this.A02 = r302;
    }

    public C0nh(16S r302) {
        this.A00 = r302.A00;
        this.A02 = r302.A01.iterator();
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.A01 != 0 ? this.A00 > 0 && ((Iterator) this.A02).hasNext() : this.A00 < ((0AE) this.A02).A00();
    }

    @Override // java.util.Iterator
    public Object next() {
        if (this.A01 == 0) {
            0AE r0 = (0AE) this.A02;
            int i = this.A00;
            this.A00 = i + 1;
            return r0.A05(i);
        }
        int i2 = this.A00;
        if (i2 == 0) {
            throw AnonymousClass001.A10();
        }
        this.A00 = i2 - 1;
        return ((Iterator) this.A02).next();
    }

    @Override // java.util.Iterator
    public void remove() {
        int i = this.A01;
        throw AnonymousClass002.A0O();
    }
}
