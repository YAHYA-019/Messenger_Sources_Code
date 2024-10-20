package X;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: X.7wi, reason: invalid class name */
/* loaded from: 7wi.class */
public final class C7wi implements Iterator {
    public AnonymousClass689 A00;

    @Override // java.util.Iterator
    public boolean hasNext() {
        return AnonymousClass001.A1T(this.A00);
    }

    @Override // java.util.Iterator
    public /* bridge */ /* synthetic */ Object next() {
        AnonymousClass689 anonymousClass689 = this.A00;
        if (anonymousClass689 == null) {
            throw new NoSuchElementException();
        }
        Object obj = anonymousClass689.A02;
        this.A00 = anonymousClass689.A01;
        return obj;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw AnonymousClass001.A0p();
    }
}
