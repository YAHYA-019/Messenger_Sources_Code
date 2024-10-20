package X;

import java.util.Collection;
import java.util.Iterator;

/* renamed from: X.1n9, reason: invalid class name */
/* loaded from: 1n9.class */
public final class C1n9 extends C1nA {
    public final /* synthetic */ C1n1 A00;

    public C1n9(C1n1 c1n1) {
        this.A00 = c1n1;
    }

    public /* bridge */ /* synthetic */ Collection A02() {
        return this.A00.A00;
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public Iterator iterator() {
        return new 3Cn(this, this.A00.A00.iterator(), 1);
    }
}
