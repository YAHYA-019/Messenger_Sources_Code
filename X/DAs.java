package X;

import com.google.common.collect.ImmutableList;
import java.io.Closeable;
import java.util.Iterator;

/* loaded from: DAs.class */
public final class DAs implements Iterator, Closeable {
    public int A00 = -1;
    public final ImmutableList A01;

    public DAs(ImmutableList immutableList) {
        this.A01 = immutableList;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        boolean z = true;
        if (this.A00 + 1 >= this.A01.size()) {
            z = false;
        }
        return z;
    }

    @Override // java.util.Iterator
    public /* bridge */ /* synthetic */ Object next() {
        if (!hasNext()) {
            throw AnonymousClass001.A0T("User Ids exhausted");
        }
        int i = this.A00 + 1;
        this.A00 = i;
        return 4YU.A0q(this.A01, i);
    }

    @Override // java.util.Iterator
    public void remove() {
        throw AnonymousClass001.A0q("UserIdOmnistoreIterator does not support remove()");
    }
}