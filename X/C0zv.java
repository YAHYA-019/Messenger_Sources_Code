package X;

import java.util.Iterator;

/* renamed from: X.0zv, reason: invalid class name */
/* loaded from: 0zv.class */
public abstract class C0zv implements Iterable, AnonymousClass116 {
    public final char A00;
    public final char A01;
    public final int A02 = 1;

    public C0zv(char c, char c2) {
        this.A00 = c;
        this.A01 = (char) 07G.A00(c, c2, 1);
    }

    @Override // java.lang.Iterable
    public /* bridge */ /* synthetic */ Iterator iterator() {
        return new 17A(this.A00, this.A01);
    }
}
