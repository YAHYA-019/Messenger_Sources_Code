package X;

import java.util.Iterator;

/* loaded from: Lso.class */
public final class Lso implements Iterator, AnonymousClass116 {
    public int A00 = -1;
    public boolean A01;
    public final /* synthetic */ C3047JhG A02;

    public Lso(C3047JhG c3047JhG) {
        this.A02 = c3047JhG;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        boolean z = true;
        if (this.A00 + 1 >= this.A02.A02.A00()) {
            z = false;
        }
        return z;
    }

    @Override // java.util.Iterator
    public /* bridge */ /* synthetic */ Object next() {
        if (!hasNext()) {
            throw AnonymousClass001.A10();
        }
        this.A01 = true;
        0AE r0 = this.A02.A02;
        int i = this.A00 + 1;
        this.A00 = i;
        Object A05 = r0.A05(i);
        11T.A0A(A05);
        return A05;
    }

    @Override // java.util.Iterator
    public void remove() {
        if (!this.A01) {
            throw AnonymousClass001.A0N("You must call next() before you can remove an element");
        }
        0AE r0 = this.A02.A02;
        int i = this.A00;
        ((L94) r0.A05(i)).A01 = null;
        Object[] objArr = r0.A03;
        Object obj = objArr[i];
        Object obj2 = C0Ak.A00;
        if (obj != obj2) {
            objArr[i] = obj2;
            r0.A01 = true;
        }
        this.A00 = i - 1;
        this.A01 = false;
    }
}
