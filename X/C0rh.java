package X;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: X.0rh, reason: invalid class name */
/* loaded from: 0rh.class */
public final class C0rh implements Iterator, AnonymousClass116 {
    public int A00;
    public final int[] A01;

    public C0rh(int[] iArr) {
        this.A01 = iArr;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return AnonymousClass001.A1R(this.A00, this.A01.length);
    }

    @Override // java.util.Iterator
    public /* bridge */ /* synthetic */ Object next() {
        int i = this.A00;
        int[] iArr = this.A01;
        if (i >= iArr.length) {
            throw new NoSuchElementException(String.valueOf(i));
        }
        this.A00 = i + 1;
        return new AnonymousClass147(iArr[i]);
    }

    @Override // java.util.Iterator
    public void remove() {
        throw AnonymousClass002.A0O();
    }
}
