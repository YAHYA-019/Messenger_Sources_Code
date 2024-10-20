package X;

import java.util.Iterator;

/* renamed from: X.351, reason: invalid class name */
/* loaded from: 351.class */
public final class AnonymousClass351 extends C2gl implements Iterator {
    public final /* synthetic */ C1qN A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnonymousClass351(C1qN c1qN) {
        super(c1qN);
        this.A00 = c1qN;
    }

    @Override // java.util.Iterator
    public Object next() {
        A00();
        return getKey();
    }
}
