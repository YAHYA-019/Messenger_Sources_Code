package X;

import com.google.common.base.Preconditions;
import com.google.common.collect.CompactHashMap;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: X.4eH, reason: invalid class name and case insensitive filesystem */
/* loaded from: 4eH.class */
public abstract class AbstractC05564eH implements Iterator {
    public int A00;
    public int A01;
    public int A02 = -1;
    public final /* synthetic */ CompactHashMap A03;

    public AbstractC05564eH(CompactHashMap compactHashMap) {
        this.A03 = compactHashMap;
        this.A01 = compactHashMap.A00;
        this.A00 = compactHashMap.A05();
    }

    public Object A00(int i) {
        if (this instanceof 4eG) {
            return new 4eJ(((4eG) this).A00, i);
        }
        Object[] objArr = ((6mX) this).A00.A05;
        objArr.getClass();
        return objArr[i];
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        boolean z = false;
        if (this.A00 >= 0) {
            z = true;
        }
        return z;
    }

    @Override // java.util.Iterator
    public Object next() {
        CompactHashMap compactHashMap = this.A03;
        if (compactHashMap.A00 != this.A01) {
            throw new ConcurrentModificationException();
        }
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i = this.A00;
        this.A02 = i;
        Object A00 = A00(i);
        this.A00 = compactHashMap.A06(this.A00);
        return A00;
    }

    @Override // java.util.Iterator
    public void remove() {
        CompactHashMap compactHashMap = this.A03;
        if (compactHashMap.A00 != this.A01) {
            throw new ConcurrentModificationException();
        }
        boolean z = false;
        if (this.A02 >= 0) {
            z = true;
        }
        Preconditions.checkState(z, "no calls to next() since the last call to remove()");
        this.A01 += 32;
        int i = this.A02;
        Object[] objArr = compactHashMap.A04;
        objArr.getClass();
        compactHashMap.remove(objArr[i]);
        this.A00 = compactHashMap.A07(this.A00, this.A02);
        this.A02 = -1;
    }
}
