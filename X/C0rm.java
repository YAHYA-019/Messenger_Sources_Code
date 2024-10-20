package X;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: X.0rm, reason: invalid class name */
/* loaded from: 0rm.class */
public final class C0rm implements Iterator, AnonymousClass116 {
    public int A00;
    public final short[] A01;

    public C0rm(short[] sArr) {
        this.A01 = sArr;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return AnonymousClass001.A1R(this.A00, this.A01.length);
    }

    @Override // java.util.Iterator
    public /* bridge */ /* synthetic */ Object next() {
        int i = this.A00;
        short[] sArr = this.A01;
        if (i >= sArr.length) {
            throw new NoSuchElementException(String.valueOf(i));
        }
        this.A00 = i + 1;
        return new C13v(sArr[i]);
    }

    @Override // java.util.Iterator
    public void remove() {
        throw AnonymousClass002.A0O();
    }
}
