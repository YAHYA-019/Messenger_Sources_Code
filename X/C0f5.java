package X;

import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* renamed from: X.0f5, reason: invalid class name */
/* loaded from: 0f5.class */
public final class C0f5 extends C00v {
    public final List A00;

    public C0f5(List list) {
        this.A00 = list;
    }

    @Override // X.C00w
    public int A08() {
        return this.A00.size();
    }

    @Override // X.C00v, java.util.List
    public Object get(int i) {
        List list = this.A00;
        if (i >= 0 && i <= AnonymousClass001.A04(this)) {
            return list.get(AnonymousClass001.A04(this) - i);
        }
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("Element index ");
        A0k.append(i);
        A0k.append(" must be in range [");
        A0k.append(new 07E(0, AnonymousClass001.A04(this)));
        throw new IndexOutOfBoundsException(AnonymousClass001.A0d("].", A0k));
    }

    @Override // X.C00v, X.C00w, java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator iterator() {
        return listIterator(0);
    }

    @Override // X.C00v, java.util.List
    public ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // X.C00v, java.util.List
    public ListIterator listIterator(int i) {
        return new 0wX(this, i);
    }
}
