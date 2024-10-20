package X;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: X.0re, reason: invalid class name */
/* loaded from: 0re.class */
public final class C0re implements Iterator, AnonymousClass116 {
    public int A00;
    public final byte[] A01;

    public C0re(byte[] bArr) {
        this.A01 = bArr;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return AnonymousClass001.A1R(this.A00, this.A01.length);
    }

    @Override // java.util.Iterator
    public /* bridge */ /* synthetic */ Object next() {
        int i = this.A00;
        byte[] bArr = this.A01;
        if (i >= bArr.length) {
            throw new NoSuchElementException(String.valueOf(i));
        }
        this.A00 = i + 1;
        return new 14E(bArr[i]);
    }

    @Override // java.util.Iterator
    public void remove() {
        throw AnonymousClass002.A0O();
    }
}
