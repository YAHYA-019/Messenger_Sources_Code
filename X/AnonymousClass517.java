package X;

import com.google.common.collect.ImmutableList;
import java.io.Closeable;
import java.util.Iterator;

/* renamed from: X.517, reason: invalid class name */
/* loaded from: 517.class */
public final class AnonymousClass517 implements Iterator, Closeable {
    public int A00;
    public final ImmutableList A01;

    public AnonymousClass517(ImmutableList immutableList) {
        this.A01 = immutableList;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        boolean z = false;
        if (this.A00 < this.A01.size()) {
            z = true;
        }
        return z;
    }

    @Override // java.util.Iterator
    public /* bridge */ /* synthetic */ Object next() {
        ImmutableList immutableList = this.A01;
        int i = this.A00;
        this.A00 = i + 1;
        Object obj = immutableList.get(i);
        11T.A0A(obj);
        return obj;
    }

    @Override // java.util.Iterator
    public void remove() {
    }
}
