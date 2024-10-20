package X;

import java.util.Iterator;
import kotlin.jvm.functions.Function1;

/* renamed from: X.07u, reason: invalid class name */
/* loaded from: 07u.class */
public final class C07u implements C07v {
    public final C00m A00;
    public final Function1 A01;

    public C07u(C00m c00m, Function1 function1) {
        this.A00 = c00m;
        this.A01 = function1;
    }

    @Override // X.C07v
    public Iterator iterator() {
        return new C07x(this);
    }
}
