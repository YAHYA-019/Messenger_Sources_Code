package X;

import java.util.Iterator;

/* renamed from: X.2gk, reason: invalid class name */
/* loaded from: 2gk.class */
public final class C2gk extends C2gl implements Iterator {
    public final /* synthetic */ C1qN A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2gk(C1qN c1qN) {
        super(c1qN);
        this.A00 = c1qN;
    }

    @Override // java.util.Iterator
    public Object next() {
        A00();
        return getValue();
    }
}
