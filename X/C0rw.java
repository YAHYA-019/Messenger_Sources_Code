package X;

import java.util.Iterator;

/* renamed from: X.0rw, reason: invalid class name */
/* loaded from: 0rw.class */
public final class C0rw implements Iterable, AnonymousClass116 {
    public final /* synthetic */ Object[] A00;

    public C0rw(Object[] objArr) {
        this.A00 = objArr;
    }

    @Override // java.lang.Iterable
    public Iterator iterator() {
        return new 0AR(this.A00);
    }
}
