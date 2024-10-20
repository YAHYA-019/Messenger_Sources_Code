package X;

import java.util.Iterator;
import kotlin.jvm.functions.Function1;

/* renamed from: X.07x, reason: invalid class name */
/* loaded from: 07x.class */
public final class C07x implements Iterator, AnonymousClass116 {
    public int A00 = -2;
    public Object A01;
    public final /* synthetic */ C07u A02;

    public C07x(C07u c07u) {
        this.A02 = c07u;
    }

    private final void A00() {
        Object invoke;
        int i = this.A00;
        C07u c07u = this.A02;
        if (i == -2) {
            invoke = c07u.A00.invoke();
        } else {
            Function1 function1 = c07u.A01;
            Object obj = this.A01;
            11T.A0D(obj);
            invoke = function1.invoke(obj);
        }
        this.A01 = invoke;
        int i2 = 1;
        if (invoke == null) {
            i2 = 0;
        }
        this.A00 = i2;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        if (this.A00 < 0) {
            A00();
        }
        boolean z = true;
        if (this.A00 != 1) {
            z = false;
        }
        return z;
    }

    @Override // java.util.Iterator
    public Object next() {
        if (this.A00 < 0) {
            A00();
        }
        if (this.A00 == 0) {
            throw AnonymousClass001.A10();
        }
        Object obj = this.A01;
        11T.A0I(obj, "null cannot be cast to non-null type T of kotlin.sequences.GeneratorSequence");
        this.A00 = -1;
        return obj;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw AnonymousClass002.A0O();
    }
}
