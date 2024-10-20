package X;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: X.0rk, reason: invalid class name */
/* loaded from: 0rk.class */
public final class C0rk implements Iterator, AnonymousClass116 {
    public int A00;
    public final long[] A01;

    public C0rk(long[] jArr) {
        this.A01 = jArr;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return AnonymousClass001.A1R(this.A00, this.A01.length);
    }

    @Override // java.util.Iterator
    public /* bridge */ /* synthetic */ Object next() {
        int i = this.A00;
        long[] jArr = this.A01;
        if (i >= jArr.length) {
            throw new NoSuchElementException(String.valueOf(i));
        }
        this.A00 = i + 1;
        return new AnonymousClass141(jArr[i]);
    }

    @Override // java.util.Iterator
    public void remove() {
        throw AnonymousClass002.A0O();
    }
}
